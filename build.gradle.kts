plugins {
    kotlin("multiplatform") version "1.3.61"
}

val antlrKotlinVersion = "0.0.6"

repositories {
    mavenCentral()
    maven("https://dl.bintray.com/kotlin/kotlin-dev")
    jcenter()
    maven("https://jitpack.io")
}

kotlin {
    linuxX64("native") {
        binaries {
            executable()
        }
    }

    sourceSets {

        val nativeMain by getting {
            dependencies {
                implementation(kotlin("stdlib-common"))
                implementation("org.jetbrains.kotlinx:kotlinx-cli-linuxx64:0.2.0-dev-6")
                api("com.strumenta.antlr-kotlin:antlr-kotlin-runtime:$antlrKotlinVersion")
            }
        }

        linuxX64("native").compilations["main"].defaultSourceSet { nativeMain }
    }
}

tasks.withType<Wrapper> {
    gradleVersion = "5.3.1"
    distributionType = Wrapper.DistributionType.ALL
}
