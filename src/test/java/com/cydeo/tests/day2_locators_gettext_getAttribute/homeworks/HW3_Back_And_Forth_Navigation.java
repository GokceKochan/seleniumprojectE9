package com.cydeo.tests.day2_locators_gettext_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW3_Back_And_Forth_Navigation {
    public static void main(String[] args) {
        //TC #3: Back and forth navigation
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        //2- Go to: https://google.com
        driver.get("https://google.com");
        driver.findElement(By.id("L2AGLb")).click();
        //3- Click to Gmail from top right.
       driver.findElement(By.className("gb_d")).click();
        //WebElement gmail = driver.findElement(By.linkText("Gmail"));
        //gmail.click();
        //4- Verify title contains:
        //Expected: Gmail
        String expectedTitle="Gmail";
        String actualTitle =driver.getTitle();
        if (expectedTitle.contains(actualTitle)){
            System.out.println("Title verification PASSED!");
        }else {
            System.out.println("Title verification FAILED");
        }
        //5- Go back to Google by using the .back();
        driver.navigate().back();
        //6- Verify title equals:
        //Expected: Google
        String expectedTitle2 = "Google";
        String actualTitle2 = driver.getTitle();
        if(expectedTitle2.equals(actualTitle2)){
            System.out.println("Title-2 verification PASSED");
        }else {
            System.out.println("Title-2 verification FAILED");
        }

    }
}
