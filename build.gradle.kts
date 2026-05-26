plugins {
    checkstyle
    java
    id("com.gradleup.shadow") version "8.3.0"

     }

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.7.1")
    testRuntimeOnly ("org.junit.platform:junit-platform-launcher")

}

tasks.test {
    useJUnitPlatform()
}