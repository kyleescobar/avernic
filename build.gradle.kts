plugins {
    kotlin("jvm") version "1.5.30"
}

tasks.withType<Wrapper> {
    gradleVersion = "7.1.1"
}

allprojects {
    apply(plugin = "org.jetbrains.kotlin.jvm")

    group = "dev.avernic"
    version = "1.0.0"

    repositories {
        mavenLocal()
        mavenCentral()
    }

    dependencies {
        implementation(kotlin("stdlib"))
    }
}