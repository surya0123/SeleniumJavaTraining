package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToMethods {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://the-internet.herokuapp.com/javascript_alerts");
        driver.findElement(By.xpath("//button[@ onclick=\"jsAlert()\"]")).click();
       String s = driver.switchTo().alert().getText();
        System.out.println("The message is" + s);
        driver.switchTo().alert().accept();


         driver.findElement(By.xpath("//button[@ onclick=\"jsConfirm()\"]")).click();
         driver.switchTo().alert().dismiss();

         driver.findElement(By.xpath("//button[@ onclick=\"jsPrompt()\"]")).click();
         driver.switchTo().alert().sendKeys("HELLO");
    }
}
