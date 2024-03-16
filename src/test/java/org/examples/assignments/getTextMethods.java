package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTextMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/v1/");
        driver.findElement(By.id("user-name")).sendKeys("standard_user");
        driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("password")).sendKeys(Keys.ENTER);
        String text = driver.findElement(By.xpath("//div[@class=\"product_label\"]")).getText();
        if(text.equals("Products")){
            System.out.println("its matching");
        }
        else {
            System.out.println("not matching");
        }


    }
}
