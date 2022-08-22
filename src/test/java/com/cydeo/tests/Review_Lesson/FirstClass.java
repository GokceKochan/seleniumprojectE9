package com.cydeo.tests.Review_Lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstClass {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();

        driver.get("https://www.google.com");
        driver.findElement(By.id("L2AGLb")).click();
        //go to ebay page
        driver.navigate().to("https://www.ebay.com");
        //go back google
        driver.navigate().back();
        //go to ebay one more time
        driver.navigate().forward();
        //refresh ebay
        driver.navigate().refresh();

        System.out.println(driver.getTitle());

    }


}
