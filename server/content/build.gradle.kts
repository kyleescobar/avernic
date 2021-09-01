subprojects {
    dependencies {
        implementation(project(":server:api"))
        implementation(project(":server:config"))

        project(":server:content").dependencyProject.subprojects.forEach { subProject ->
            if(subProject.buildFile.exists() && subProject.name !=  project.name) {
                api(subProject)
            }
        }

        implementation("org.jetbrains.kotlin:kotlin-script-runtime:_")
    }

    gradle.buildFinished { if(!buildFile.exists()) buildDir.deleteRecursively() }
}

dependencies {
    implementation(project(":server:api"))
    implementation("io.github.classgraph:classgraph:_")
}

gradle.buildFinished { buildDir.deleteRecursively() }