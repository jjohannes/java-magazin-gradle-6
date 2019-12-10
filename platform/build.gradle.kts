plugins {
    `java-platform`
    `maven-publish`
}

group = "org.gradle.hello6"
version = "0.1"

dependencies {
    constraints {
        api("org.apache.commons:commons-lang3:3.7")
        api("com.google.guava:guava:24.1.1-jre!!")
    }
}

publishing {
    repositories {
        maven { setUrl(rootProject.file("repo")) }
    }
    publications.create<MavenPublication>("maven") {
        from(components["javaPlatform"])
    }
}