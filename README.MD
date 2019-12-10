# Gradle 6 Sample Project

Gradle build files:

- [data/build.gradle.kts](data/build.gradle.kts)
- [services/build.gradle.kts](services/build.gradle.kts)
- [app/build.gradle.kts](app/build.gradle.kts)
- [platform/build.gradle.kts](platform/build.gradle.kts)
- [build.gradle.kts](build.gradle.kts) (root build file)

Some tasks to run (add `--scan` to produced a build scan):

- Run the app: `./gradlew app:run`
- Run all tests: `./gradlew check`
- Compile all code: `./gradlew assemble`
- Print compile classpath of app: `./gradlew app:dependencies --configuration compileClasspath`
- Print runtime classpath of app: `./gradlew app:dependencies --configuration runtimeClasspath`

Build scan to explore the build: [scans.gradle.com/s/23ipxdulqsgn6](https://scans.gradle.com/s/23ipxdulqsgn6)