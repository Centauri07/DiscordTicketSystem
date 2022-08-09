plugins {
    kotlin("jvm") version "1.6.10-RC"
    java
}

group = "me.centauri07.dts"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()

    maven(url = uri("https://jitpack.io"))
}

dependencies {
    implementation("org.jetbrains.kotlin:kotlin-stdlib:1.7.0")

    implementation("net.dv8tion:JDA:5.0.0-alpha.17")
    implementation("com.github.Centauri07:JarbAPI:5ff610dbad")

    testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.0")
    testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.0")
}

tasks.getByName<Test>("test") {
    useJUnitPlatform()
}