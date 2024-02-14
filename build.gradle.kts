plugins {
    id("java")
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    // https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-java
    implementation("org.seleniumhq.selenium:selenium-java:4.17.0")
    // https://mvnrepository.com/artifact/org.testng/testng
    testImplementation("org.testng:testng:7.9.0")
    // https://mvnrepository.com/artifact/io.cucumber/cucumber-java
    implementation("io.cucumber:cucumber-java:7.15.0")
    implementation("io.github.bonigarcia:webdrivermanager:5.6.3")



}

tasks.test {
    useJUnitPlatform()
}