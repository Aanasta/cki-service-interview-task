package com.circlek;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class LoginPageTest {

    @Test
    public void assertTextOnPageIsPresent(){
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://circlek-public.github.io/cki-service-recruitment-task/");

        //assert Remember Me Button
        WebElement rememeberMeLabel = driver.findElement(By.id("remember_me_label"));
        assertEquals(rememeberMeLabel.getText(), "Remember Me");

        //assert Sign In text
        WebElement signInButton = driver.findElement(By.className("login"));
        assertEquals(signInButton.getText(), "Sign In");
    }

    @Test
    public void assertRememberMeCheckBoxIsClickable(){
        System.setProperty("webdriver.chrome.driver", "lib/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://circlek-public.github.io/cki-service-recruitment-task/");

        //click Remember Me checkbox
        WebElement rememberMeCheckBox = driver.findElement(By.xpath("//*[contains(text(), \"Remember Me\")]/../input"));
        rememberMeCheckBox.click();

        //check if clicked
        assertEquals(rememberMeCheckBox.isSelected(), true);

    }
}
