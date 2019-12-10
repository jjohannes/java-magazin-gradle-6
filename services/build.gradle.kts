plugins {
    `java-library`
}

group = "org.gradle.hello6"
version = "0.1"

val loud: SourceSet by sourceSets.creating
java {
    registerFeature("loud") {
        usingSourceSet(loud)
    }
}

dependencies {
    api(platform(project(":platform")))

    api(project(":data"))
    implementation("org.apache.commons:commons-lang3")

    "loudApi"(project(":data"))
    "loudImplementation"("com.google.guava:guava")

    testImplementation(testFixtures(project(":data")))
    testImplementation("org.junit.jupiter:junit-jupiter-api:5.6.0-M1")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine")
}

tasks.withType<Test> {
    useJUnitPlatform()
}