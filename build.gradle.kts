plugins {
    kotlin("jvm") version "1.9.22"
}

group = "com.libyao"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.fasterxml.jackson.core:jackson-databind:2.16.2")
    implementation("redis.clients:jedis:5.1.0")
    implementation("org.slf4j:slf4j-nop:2.0.7")

    testImplementation("org.jetbrains.kotlin:kotlin-test")
}

tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}