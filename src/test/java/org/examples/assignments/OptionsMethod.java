package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.sql.Driver;
import java.util.List;

public class OptionsMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://only-testing-blog.blogspot.com/2014/01/textbox.html");
        WebElement element = driver.findElement(By.name("FromLB"));
        Select select = new Select(element);

        List<WebElement> options = select.getOptions();
        for (WebElement e : options) {
            System.out.println(e.getText());
        }

        List<WebElement> selectalloption = select.getAllSelectedOptions();
        System.out.println("select all options");
        for (WebElement e : options) {
            System.out.println(e.getText());

        }

    }}
