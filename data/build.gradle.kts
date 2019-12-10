plugins {
    `java-library`
    `java-test-fixtures`
    `maven-publish`
}

group = "org.gradle.hello6"
version = "0.1"

dependencies {
    api(platform(project(":platform")))
}

publishing {
    repositories {
        maven { setUrl(rootProject.file("repo")) }
    }
    publications.create<MavenPublication>("maven") {
        from(components["java"])
    }
}