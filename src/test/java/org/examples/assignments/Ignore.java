package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;
import java.util.concurrent.TimeUnit;

public class Ignore {

    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("https://www.globalsqa.com/demo-site/");
       driver.manage().window().maximize();
      driver.findElement(By.xpath("(//a[@ class= \"no_border\"])[1]")).click();
      driver.findElement(By.id("s")).sendKeys("ox");
      driver.findElement(By.id("s")).click();

    }
}
