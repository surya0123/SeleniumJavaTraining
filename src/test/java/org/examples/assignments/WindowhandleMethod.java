package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowhandleMethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.naukri.com/");
        String Mainwindow = driver.getWindowHandle();
        System.out.println(Mainwindow);
        Set<String> handles = driver.getWindowHandles();
        for (String handle:handles){
            if (!Mainwindow.equals(handle)){
                driver.switchTo().window(handle);
                System.out.println(driver.switchTo().window(handle).getTitle());
                driver.close();
            }
        }
        driver.switchTo().window(Mainwindow);
        driver.findElement(By.id(""));
    }
}
