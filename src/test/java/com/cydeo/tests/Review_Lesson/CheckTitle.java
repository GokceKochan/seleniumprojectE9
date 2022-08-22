package com.cydeo.tests.Review_Lesson;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckTitle {

    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();

        driver.get("http://practice.cybertekschool.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        String title = driver.getTitle();
        String actualTitle = "Practice";


        if (title.equals(actualTitle)){
            System.out.println("Title is correct");
        }else {
            System.out.println("Title is incorrect");
        }

        System.out.println("The current URL of the page is : "+ driver.getCurrentUrl());

        Thread.sleep(2000);

        driver.close();
    }
}
