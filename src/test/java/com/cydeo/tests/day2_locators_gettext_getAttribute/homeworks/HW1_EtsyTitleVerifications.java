package com.cydeo.tests.day2_locators_gettext_getAttribute.homeworks;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HW1_EtsyTitleVerifications {
    public static void main(String[] args) {
        //TC #1: Etsy Title Verification
        //1. Open Chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2. Go to https://www.etsy.com
        driver.get("https://www.etsy.com ");
        driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/div[2]/div[2]/button")).click();
        // 3. Search for “wooden spoon”
        WebElement search = driver.findElement(By.name("search_query"));
        search.sendKeys("wooden spoon"+ Keys.ENTER);
        // 4. Verify title:
        String expected = "wooden spoon | Etsy";
        String actual = driver.getTitle();
        if(expected.equals(actual)){
            System.out.println("Title verification PASSED! ");
        }else {
            System.out.println("Title verification FAILED!!");
        }
        //Expected: “Wooden spoon | Etsy”

    }
}
