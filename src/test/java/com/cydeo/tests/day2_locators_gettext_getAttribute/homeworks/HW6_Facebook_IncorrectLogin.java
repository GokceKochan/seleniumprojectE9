package com.cydeo.tests.day2_locators_gettext_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW6_Facebook_IncorrectLogin {
    public static void main(String[] args) {

         //TC #2: Facebook incorrect login title verification
        // 1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.facebook.com
        driver.get("https://www.facebook.com");
        WebElement facebook = driver.findElement(By.xpath("/html/body/div[3]/div[2]/div/div/div/div/div[3]/button[2]"));
        facebook.click();
        //3. Enter incorrect username
        //4. Enter incorrect password
        WebElement userName = driver.findElement(By.id("email"));
        userName.sendKeys("123456@gmail.com");
        WebElement password = driver.findElement(By.id("pass"));
        password.sendKeys("incorrectpassword"+ Keys.ENTER);

        // 5. Verify title changed to:
        //Expected: “Log into Facebook”

        String expected = "Log into Facebook";
        String actual = driver.getTitle();

        if(actual.equals(expected)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
        driver.close();

    }
}
