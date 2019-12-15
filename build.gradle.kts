plugins {
    id("java")
    id("org.jetbrains.kotlin.jvm") version "1.3.61"

    id("antlr")
}

group = "nl.santa"
version = "1.0-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-cli-jvm:0.2.0-dev-6")

    implementation("org.graalvm.sdk:graal-sdk:19.3.0")
    implementation("org.graalvm.truffle:truffle-api:19.3.0")
    implementation("org.graalvm.js:js-scriptengine:19.3.0")
    implementation("org.graalvm.js:js:19.3.0")

    antlr("org.antlr:antlr4:4.7.1")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
