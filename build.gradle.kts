plugins {
    java
    id("io.qameta.allure") version "2.12.0"
}

group = "com.company.web"
version = "1.0-SNAPSHOT"

java {
    toolchain {
        languageVersion.set(JavaLanguageVersion.of(17))
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("com.codeborne:selenide:7.7.3")
    implementation("org.testng:testng:7.11.0")
    implementation("io.qameta.allure:allure-testng:2.29.1")
    implementation("io.qameta.allure:allure-selenide:2.29.1")
}

tasks.test {
    useTestNG()
    systemProperty("file.encoding", "UTF-8")
}

allure {
    report {
        version.set("2.32.0")
    }
    adapter {
        allureJavaVersion.set("2.29.1")
    }
}
