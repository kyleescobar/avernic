package dev.avernic.server.util

import org.bouncycastle.jce.provider.BouncyCastleProvider
import org.bouncycastle.util.io.pem.PemObject
import org.bouncycastle.util.io.pem.PemReader
import org.bouncycastle.util.io.pem.PemWriter
import org.tinylog.kotlin.Logger
import java.math.BigInteger
import java.nio.file.Files
import java.nio.file.Path
import java.nio.file.Paths
import java.security.KeyFactory
import java.security.KeyPairGenerator
import java.security.Security
import java.security.interfaces.RSAPrivateKey
import java.security.interfaces.RSAPublicKey
import java.security.spec.PKCS8EncodedKeySpec
import kotlin.system.exitProcess

class RSA(private val directory: Path) {

    lateinit var privateExponent: BigInteger private set
    lateinit var privateModulus: BigInteger private set

    fun load() {
        val privateKeyFile = directory.resolve("private.pem")

        if(!Files.exists(privateKeyFile)) {
            Logger.error("Could not find the RSA private key file. Be sure to run the 'setup server' gradle task before starting the server.")
            exitProcess(0)
        }

        PemReader(Files.newBufferedReader(privateKeyFile)).use { reader ->
            val pem = reader.readPemObject()
            val keySpec = PKCS8EncodedKeySpec(pem.content)

            Security.addProvider(BouncyCastleProvider())

            val factory = KeyFactory.getInstance("RSA", "BC")
            val privateKey = factory.generatePrivate(keySpec) as RSAPrivateKey

            privateExponent = privateKey.privateExponent
            privateModulus = privateKey.modulus
        }
    }

    companion object {

        private const val KEY_SIZE = 2048
        private const val RADIX = 16

        fun generateKeyPair(directory: Path) {
            Logger.info("Generating new RSA key-pair...")

            Security.addProvider(BouncyCastleProvider())

            val generator = KeyPairGenerator.getInstance("RSA", "BC")
            generator.initialize(KEY_SIZE)

            val keyPair = generator.generateKeyPair()
            val privateKey = keyPair.private as RSAPrivateKey
            val publicKey = keyPair.public as RSAPublicKey

            Logger.info("Saving RSA private key to file: 'private.pem'.")
            PemWriter(Files.newBufferedWriter(directory.resolve("private.pem"))).use { writer ->
                writer.writeObject(PemObject("RSA PRIVATE KEY", privateKey.encoded))
            }

            Logger.info("Saving RSA public key to file: 'public.pem'.")
            PemWriter(Files.newBufferedWriter(directory.resolve("public.pem"))).use { writer ->
                writer.writeObject(PemObject("RSA PUBLIC KEY", publicKey.encoded))
            }

            Logger.info("Saving RSA public moudlus to file: 'modulus.txt'.")
            Files.newBufferedWriter(directory.resolve("modulus.txt")).use { writer ->
                writer.write(publicKey.modulus.toString(RADIX))
            }

            /*
             * Copy the public modulus to the client resources directory.
             */
            Files.newBufferedWriter(Paths.get("client/src/main/resources/modulus.txt")).use { writer ->
                writer.write(publicKey.modulus.toString(RADIX))
            }

            Logger.info("Successfully generated and saved RSA private/public key-pair.")
        }
    }
}