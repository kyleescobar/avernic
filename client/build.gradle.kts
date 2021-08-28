plugins {
    java
    application
}

dependencies {
    implementation("com.formdev:flatlaf:_")
    implementation("com.formdev:flatlaf-intellij-themes:_")
}

application {
    mainClass.set("ClientLauncher")
}

tasks.named<JavaExec>("run") {
    mainClass.set("ClientLauncher")
    workingDir = rootProject.projectDir
}

tasks.register("run client") {
    dependsOn(tasks.getByName("run"))
    group = "avernic"
}