package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class RegisterAccount {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
        driver.manage().window().maximize();
        driver.findElement(By.linkText("login page")).click();
       if (driver.findElement(By.linkText("Login")).isDisplayed()){
           System.out.println("The content is good");

       }
       else {
           System.out.println("Error");
       }
        driver.navigate().back();
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        for (WebElement button : buttons){
            System.out.println(button.getText());
        }

        String id_firstname = "input-firstname";
        String id_lastname = "input-lastname";
        String id_email = "input-email";
        String id_telephone="input-telephone";
        String id_password = "input-password";
        String id_confirm = "input-confirm";
        String xpath_yes = "(//input[@ name=\"newsletter\"]) [1]";
        String xpath_tick ="(//input[@ name=\"agree\"]) ";
        String xpath_confirm="//input[@ value=\"Continue\"]";
        driver.findElement(By.id(id_firstname)).sendKeys("Raju");
        driver.findElement(By.id(id_lastname)).sendKeys("Danger");
        driver.findElement(By.id(id_email)).sendKeys("rajubhai222@gmail.com");
        driver.findElement(By.id(id_telephone)).sendKeys("66666665");
        driver.findElement(By.id(id_password)).sendKeys("12334565");
        driver.findElement(By.id(id_confirm)).sendKeys("12334565");
        driver.findElement(By.xpath(xpath_yes)).click();
        driver.findElement(By.xpath(xpath_tick)).click();
        driver.findElement(By.xpath(xpath_confirm)).click();

    }
}
