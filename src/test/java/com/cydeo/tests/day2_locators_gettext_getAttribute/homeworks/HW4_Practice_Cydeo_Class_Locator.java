package com.cydeo.tests.day2_locators_gettext_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW4_Practice_Cydeo_Class_Locator {
    public static void main(String[] args) {
        //TC #4: Practice Cydeo – Class locator practice
        //1- Open a Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/inputs
        driver.get("https://practice.cydeo.com/inputs");
        //3- Click to “Home” link
        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();
        //4- Verify title is as expected:
        //Expected: Practice
        String expected = "Practice";
        String actual = driver.getTitle();
        if(expected.equals(actual)){
            System.out.println("Title verification PASSED");
        }else {
            System.out.println("Title verification FAILED");
        }
        //PS: Locate “Home” link using “className” locator
    }
}
