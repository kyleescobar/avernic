plugins {
    application
}

dependencies {
    implementation(project(":server:common"))
    implementation(project(":server:util"))
    implementation(project(":server:config"))
    implementation(project(":server:engine"))
    implementation(project(":server:cache"))
    implementation("ch.qos.logback:logback-classic:_")
}

application {
    mainClass.set("dev.avernic.server.launcher.ServerLauncher")
}

tasks.named<JavaExec>("run") {
    mainClass.set("dev.avernic.server.launcher.ServerLauncher")
    workingDir = rootProject.projectDir
}

tasks.create("run server") {
    dependsOn(tasks.getByName("run"))
    group = "avernic"
}

task("setup server", JavaExec::class) {
    classpath = sourceSets["main"].runtimeClasspath
    mainClass.set("dev.avernic.server.launcher.ServerSetup")
    workingDir = rootProject.projectDir
    group = "avernic"
}