dependencies {
    api(project(":server:common"))
    api(project(":server:cache"))
    api(project(":server:engine"))
    api(project(":server:util"))
    implementation("org.jetbrains.kotlin:kotlin-scripting-common:_")
    implementation("org.jetbrains.kotlin:kotlin-script-runtime:_")
}