plugins {
    id("org.jetbrains.kotlin.jvm") version "1.3.61"
}

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
}

dependencies {
    implementation(project(":grammar"))

    implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
    implementation("org.jetbrains.kotlinx:kotlinx-cli-jvm:0.2.0-dev-6")

    implementation("org.graalvm.sdk:graal-sdk:19.3.0")
    implementation("org.graalvm.truffle:truffle-api:19.3.0")
    implementation("org.graalvm.js:js-scriptengine:19.3.0")
    implementation("org.graalvm.js:js:19.3.0")
}

tasks {
    compileKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
    compileTestKotlin {
        kotlinOptions.jvmTarget = "1.8"
    }
}
