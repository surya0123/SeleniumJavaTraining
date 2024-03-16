package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {
    public static void main(String[] args) {
        System.setProperty("webchrome.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
        driver.manage().window().maximize();
        driver.findElement(By.id("input-email")).sendKeys("rajubhai222@gmail.com");
        driver.findElement(By.id("input-password")).sendKeys("12334565");
        driver.findElement(By.xpath("//input[@ type=\"submit\"]")).click();

        driver.findElement(By.xpath("//span[@ class=\"caret\"]")).click();

        if (driver.findElement(By.xpath("(//a[contains(@ href , Logout)])[7]")).isDisplayed()){
            System.out.println("Homepage is displayed");
        }
        else {
            System.out.println("Error");
        }
        }


    }

