package org.examples.assignments;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windowsmethod {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.co.in/");
        driver.manage().window().maximize();

        driver.manage().window().fullscreen();

        Point point = driver.manage().window().getPosition();
        System.out.println(point.x);
        System.out.println(point.y);

        Point point1 = new Point(300,600);
        driver.manage().window().setPosition(point1);

        Dimension dimension = new Dimension(300,500);
        driver.manage().window().setSize(dimension);

    }
}
