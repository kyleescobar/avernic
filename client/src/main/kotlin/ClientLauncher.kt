@file:Suppress("UNCHECKED_CAST")

import com.formdev.flatlaf.intellijthemes.materialthemeuilite.FlatAtomOneDarkContrastIJTheme
import java.applet.Applet
import java.applet.AppletContext
import java.applet.AppletStub
import java.awt.Color
import java.awt.Dimension
import java.awt.GridLayout
import java.net.URL
import javax.swing.*

object ClientLauncher {

    /**
     * ==============================
     * IMPORTANT CLIENT SETTINGS
     * ==============================
     *
     * NOTE* These need to be changed to the correct value to match your Avernic installation.
     * Please run the Avernic Server installer and follow the instructions after it completes for more information.
     */

    private const val TITLE = "Avernic"
    internal const val CODEBASE = "127.0.0.1"
    internal var MODULUS = ""
    internal const val CACHE_DIR = "avernic"
    private const val DEFAULT_WORLD = "1"

    @JvmStatic
    fun main(args: Array<String>) {
        loadModulus()
        launch()
    }

    /**
     * ===========================================================
     * = CLIENT STUFF
     * ===========================================================
     */

    /**
     * Client startup parameters.
     */
    private val params = mapOf(
        "title" to TITLE,
        "codebase" to "http://$CODEBASE/",
        "cachedir" to CACHE_DIR,
        "storebase" to "0",
        "initial_class" to "client.class",
        "window_preferredwidth" to "800",
        "window_preferredheight" to "600",
        "applet_minwidth" to "765",
        "applet_minheight" to "503",
        "applet_maxwidth" to "5760",
        "applet_maxheight" to "2160",
        "1" to "1",
        "2" to "https://payments.jagex.com/",
        "3" to "true",
        "4" to "51305", // Client Type (Odd = Desktop, Even = Mobile)
        "5" to "1",
        "6" to "0",
        "7" to "0",
        "8" to "true",
        "9" to "ElZAIrq5NpKN6D3mDdihco3oPeYN2KFy2DCquj7JMmECPmLrDP3Bnw",
        "10" to "5",
        "11" to "https://auth.jagex.com/",
        "12" to DEFAULT_WORLD, // Selected World Number
        "13" to ".runescape.com",
        "14" to "0",
        "15" to "0",
        "16" to "false",
        "17" to "http://${CODEBASE}/", // World HTTP Server
        "18" to "",
        "19" to "196515767263-1oo20deqm6edn7ujlihl6rpadk9drhva.apps.googleusercontent.com",
        "20" to "https://token-auth.production.jxp.aws.jagex.com/"
    )

    private lateinit var applet: Applet
    private lateinit var frame: JFrame

    private val icons = listOf(
        "/logo-256.png",
        "/logo-128.png",
        "/logo-64.png"
    ).map { ClientLauncher::class.java.getResource(it) }
        .map { ImageIcon(it).image }

    private fun loadModulus() {
        val url = ClientLauncher::class.java.getResource("/modulus.txt") ?: return
        MODULUS = url.readText(Charsets.UTF_8)
    }

    private fun launch() {
        /*
         * Load the client applet.
         */
        applet = client()

        /*
         * Style and initialize the client applet.
         */
        applet.background = Color.BLACK
        applet.preferredSize = Dimension(params["applet_minwidth"]!!.toInt(), params["applet_minheight"]!!.toInt())
        applet.size = applet.preferredSize
        applet.layout = null
        applet.setStub(applet.createStub())
        applet.isVisible = true
        applet.init()

        /*
         * Setup RSBox LAF Theme
         */
        JFrame.setDefaultLookAndFeelDecorated(true)
        JDialog.setDefaultLookAndFeelDecorated(true)

        FlatAtomOneDarkContrastIJTheme.setup()

        /*
         * Create the JFrame
         */
        frame = JFrame(TITLE)
        frame.iconImages = icons
        frame.layout = GridLayout(1, 0)
        frame.add(applet)
        frame.pack()
        frame.defaultCloseOperation = JFrame.EXIT_ON_CLOSE
        frame.setLocationRelativeTo(null)
        frame.isVisible = true
        frame.minimumSize = frame.size
        frame.maximumSize = Dimension(params["applet_maxwidth"]!!.toInt(), params["applet_maxheight"]!!.toInt())
    }

    private fun Applet.createStub(): AppletStub = object : AppletStub {
        override fun isActive(): Boolean = true
        override fun getAppletContext(): AppletContext? = null
        override fun getCodeBase(): URL = URL(params["codebase"])
        override fun getDocumentBase(): URL = URL(params["codebase"])
        override fun getParameter(name: String): String? = params[name]
        override fun appletResize(width: Int, height: Int) {
            this@createStub.setSize(width, height)
        }
    }
}