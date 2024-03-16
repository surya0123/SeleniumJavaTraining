package org.examples.assignments;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Assignment2 {
    public static void main(String[] args) {
        System.setProperty("WebDriver.gecko.driver","src/test/resources/drivers/geckodriver.exe");
        WebDriver driver =new FirefoxDriver();
        driver.get("https://gmail.com");
        String title =driver.getTitle();
        if(title.equals("Gmail")){
            System.out.println("The title is matching");
        }
        else {
            System.out.println("The title is not matching");
        }
        driver.quit();
    }
}
