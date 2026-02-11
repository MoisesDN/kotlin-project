plugins {
    kotlin("jvm") version "2.2.20"
}

group = "br.com.moisesdias"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    // Source: https://mvnrepository.com/artifact/org.jetbrains.kotlin/kotlin-reflect
    runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:2.3.10")

    testImplementation(kotlin("test"))
    testImplementation("org.amshove.kluent:kluent:1.73")
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}