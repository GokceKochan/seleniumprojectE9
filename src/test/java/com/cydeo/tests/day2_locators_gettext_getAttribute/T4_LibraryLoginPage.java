package com.cydeo.tests.day2_locators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryLoginPage {
    public static void main(String[] args) {
        //TC #4: Library verifications
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://library1.cydeo.com/login.html
        driver.get("https://library1.cydeo.com/login.html");
        //3. Enter username: “incorrect@email.com”
        WebElement userNameInput = driver.findElement(By.className("form-control"));
        userNameInput.sendKeys("incorrectemail.com");
        //4. Enter password: “incorrect password”
        WebElement passwordInput = driver.findElement(By.id("inputPassword"));
        passwordInput.sendKeys("incorrect password");
        //5.Click to Sign in button
        WebElement signinButton= driver.findElement(By.tagName("button"));
        signinButton.click();

        //6. Verify: visually “Sorry, Wrong Email or Password”

        //displayed
        //PS: Locate Locate Locate
        //input box using “className” locator input box using “id” locator
        //button using “tagName” locator
    }
}
