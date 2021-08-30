dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:util"))
    implementation(project(":server:config"))
    implementation(project(":server:cache"))
    implementation("io.netty:netty-all:_")
    implementation("io.guthix:jagex-bytebuf:_")
    implementation("com.google.guava:guava:_")
    implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:_")
    implementation("io.github.classgraph:classgraph:_")
    implementation("it.unimi.dsi:fastutil:_")
}