plugins {
    application
}

application {
    mainClassName = "org.gradle.hello6.HelloApp"
}

dependencies {
    implementation(platform(project(":platform")))

    implementation(project(":services"))
    implementation(project(":services")) {
        capabilities { requireCapability("org.gradle.hello6:services-loud") }
    }
}