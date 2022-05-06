plugins {
    java
    kotlin("jvm") version "1.6.21"
    `maven-publish`
    id("org.jetbrains.dokka") version "1.6.21"
}

repositories {
    mavenCentral()
}

dependencies {
    dokkaHtmlPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.6.21")
}

tasks.dokkaGfm.configure {
    dokkaSourceSets {
        named("main") {
            includeNonPublic.set(false)
        }
    }
}
