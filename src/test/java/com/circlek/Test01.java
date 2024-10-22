package com.circlek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class Test01 {

    @BeforeMethod
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }

    @Test
    public void assertTextOnPageIsPresent(){
        driver.get("https://circlek-public.github.io/cki-service-recruitment-task/");

        //assert Remember Me Button
        WebElement rememberMeLabel = driver.findElement(By.id("remember_me_label"));
        assertEquals(rememberMeLabel.getText(), "Remember Me");

        //assert Sign In text
        WebElement signInButton = driver.findElement(By.className("login"));
        assertEquals(signInButton.getText(), "Sign In");
    }

    @Test
    public void assertRememberMeCheckBoxIsClickable(){
        driver.get("https://circlek-public.github.io/cki-service-recruitment-task/");

        //click Remember Me checkbox
        WebElement rememberMeCheckBox = driver.findElement(By.id("remember_me"));
        rememberMeCheckBox.click();

        //check if clicked
        assertTrue(rememberMeCheckBox.isSelected());
    }
}
