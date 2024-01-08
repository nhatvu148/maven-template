/*
 * This file was generated by the Gradle 'init' task.
 *
 * This generated file contains a sample Java application project to get you started.
 * For more details on building Java & JVM projects, please refer to https://docs.gradle.org/8.5/userguide/building_java_projects.html in the Gradle documentation.
 */

plugins {
    // Apply the application plugin to add support for building a CLI application in Java.
    application
}

project.description = "My Java Project"
project.version = "1.0"

repositories {
    println(project.name)
    println(project.description)
    println(project.version)
    println(project.path)
    println(projectDir)

    // Use Maven Central for resolving dependencies.
    mavenCentral()

    mavenLocal()

    // maven {
    //     url = uri("https://repo.maven.apache.org/maven2")
    // }
}

dependencies {
    // Use JUnit Jupiter for testing.
    testImplementation(libs.junit.jupiter)

    testRuntimeOnly("org.junit.platform:junit-platform-launcher")

    // This dependency is used by the application.
    implementation(libs.guava)

    // implementation("org.apache.commons:commons-lang3:3.14.0")
    implementation(files("src/main/resources/commons-lang3-3.14.0.jar"))
}

// Apply a specific Java toolchain to ease working on different environments.
java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(21))
    }
}

application {
    // Define the main class for the application.
    mainClass.set("com.nhatvu148.App")
}

tasks.named<Test>("test") {
    // Use JUnit Platform for unit tests.
    useJUnitPlatform()
}

tasks.register("firstTask") {
    println("Gradle Rocks!!!")

    doFirst {
        println("doFirst")
    }

    doLast {
        println("doLast")
    }
}