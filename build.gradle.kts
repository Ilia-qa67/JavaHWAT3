import org.gradle.internal.impldep.org.bouncycastle.util.encoders.UTF8

plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

tasks.withType<JavaCompile> {
    options.encoding = "UTF-8"
}

repositories {
    mavenCentral()
}


dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
    testImplementation("com.codeborne:selenide:6.19.0")

}

tasks.test {
    useJUnitPlatform()
    System.setProperty("selenide.headless", System.getProperty("selenide.headless"));
}