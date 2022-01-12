package com.example.ui_tests;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.WeakHashMap;

public class MainTest {
    private WebDriver driver;

    @BeforeAll
    public static void  setupDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setUp() {
        driver = new ChromeDriver();
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }


    @Test
    void openGoogle(){
        driver.get("https://google.com");

        WebElement input = driver.findElement(By.tagName("input"));
        input.sendKeys("Selenium Dev");

    }
}
