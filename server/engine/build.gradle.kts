dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:util"))
    implementation(project(":server:config"))
    implementation(project(":server:cache"))
    implementation("io.netty:netty-all:_")
    implementation("io.guthix:jagex-bytebuf:_")
}