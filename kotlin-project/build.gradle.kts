plugins {
    kotlin("jvm") version "2.2.20"
}

group = "br.com.moisesdias"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
    testImplementation("org.amshove.kluent:kluent:1.73")
}


tasks.test {
    useJUnitPlatform()
}
kotlin {
    jvmToolchain(17)
}