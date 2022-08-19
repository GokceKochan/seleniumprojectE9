package com.cydeo.tests.day2_locators_gettext_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getTest_getAttribute {
    public static void main(String[] args) {
        //TC #5: getText() and getAttribute() method practice
        //1- Open a chrome browser
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        //2- Go to: https://practice.cydeo.com/registration_form
        driver.get("https://practice.cydeo.com/registration_form");
        // 3- Verify header text is as expected:
        WebElement header= driver.findElement(By.tagName("h2"));
        //Expected: Registration form
        String expectedHeaderText = "Registration form";
        String actualHeaderText = header.getText(); //will return "Registration form"

        if(actualHeaderText.equals(expectedHeaderText)){
            System.out.println("Header Text verification PASSED!");
        }else {
            System.out.println("Header Text verification FAILED!!");
        }

        // 4- Locate “First name” input box
        //we are locating the web element using "name" locator
        //name attribute has "firstname" value

        WebElement firstNameInput = driver.findElement(By.name("firstname"));
        //5- Verify placeholder attribute’s value is as expected:
        // Expected: first name
        String expectedPlaceholder = "first name";
        String actualPlaceholder = firstNameInput.getAttribute("placeholder");

        if(actualPlaceholder.equals(expectedPlaceholder)){
            System.out.println("Placeholder text verification PASSED");
        }else {
            System.out.println("Pleaseholder text verification FAILED");
        }
        driver.close();

    }
}
