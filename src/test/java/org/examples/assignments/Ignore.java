package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Ignore {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.google.com/");
       driver.manage().window().maximize();
       driver.findElement(By.id("APjFqb")).sendKeys("amazon");
        driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//div[@class =\"CCgQ5 vCa9Yd QfkTvb N8QANc Va3FIb EE3Upf\"]")).click();
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Samsung");
        driver.findElement(By.id("nav-search-submit-button")).click();
        driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[5]")).click();
        driver.findElement(By.xpath("(//i[@class=\"a-icon a-icon-checkbox\"])[21]")).click();
        driver.findElement(By.id("")).click();


    }
}
