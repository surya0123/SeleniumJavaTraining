package org.examples.assignments;

import net.bytebuddy.asm.Advice;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;


public class Ignore {
@Test
    public static void main(String[] args) {
       System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");

   WebDriver driver = new ChromeDriver();
   driver.manage().window().maximize();
   driver.get("https://www.google.com/");
   driver.findElement(By.id("APjFqb")).click();
   driver.findElement(By.id("APjFqb")).sendKeys("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   driver.findElement(By.id("APjFqb")).sendKeys(Keys.ENTER);

   driver.findElement(By.xpath("(//a[@jsname=\"UWckNb\"])[1]")).click();



   driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--focus\"]")).click();
   driver.findElement(By.xpath("//input[@class=\"oxd-input oxd-input--focus\"]")).sendKeys("Admin");






    }
}
