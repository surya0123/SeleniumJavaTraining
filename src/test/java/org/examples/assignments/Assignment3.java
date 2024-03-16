package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.findElement(By.name("firstname")).sendKeys("Surya");
        driver.findElement(By.name("lastname")).sendKeys("Singh");
        driver.findElement(By.name("email")).sendKeys("argus49T@gmail.com");
        driver.findElement(By.name("telephone")).sendKeys("123456789");

        driver.findElement(By.name("password")).sendKeys("123456789");
        driver.findElement(By.xpath("//input[@ name=\"confirm\"]")).sendKeys("123456789");


driver.findElement(By.xpath("(//input[@ name=\"newsletter\"] )[1]")).click();
driver.findElement(By.name("agree")).click();
  driver.findElement(By.xpath("//input[@ value=\"Continue\"]")).click();
String s = driver.getTitle();
        System.out.println(s);
    }
}
