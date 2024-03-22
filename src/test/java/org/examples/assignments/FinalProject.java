package org.examples.assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FinalProject {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver","src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
        driver.manage().window().maximize();
        //login------------
        driver.findElement(By.xpath("(//span[@ class=\"hidden-xs hidden-sm hidden-md\"])[3]")).click();
        driver.findElement(By.xpath("//a[@ href=\"https://tutorialsninja.com/demo/index.php?route=account/login\"]")).click();
        //---------------
//Entering details------------
        driver.findElement(By.id("input-email")).sendKeys("rajubhai222@gmail.com");
        driver.findElement(By.xpath("//input[@ type=\"submit\"]")).click();
        //---------------------
        driver.findElement(By.xpath("(//a[@ class=\"dropdown-toggle\"])[3]")).click();
        driver.findElement(By.xpath("(//a[@ class=\"see-all\"])[2]")).click();
        //-----------------------
        //Purchasing items---------------------
        driver.findElement(By.xpath("(//span[@ class=\"hidden-xs hidden-sm hidden-md\"])[9]")).click();
        driver.findElement(By.xpath("(//span[@ class=\"hidden-xs hidden-sm hidden-md\"])[10]")).click();
        driver.findElement(By.xpath("(//span[@ class=\"hidden-xs hidden-sm hidden-md\"])[5]")).click();
        //----------------------------------------------
        //verify the text
        if (driver.findElement(By.xpath("(//a[@ href=\"https://tutorialsninja.com/demo/index.php?route=product/product&product_id=44\"])[4]")).isDisplayed()){
            System.out.println("It is displaying");
        }
        else {
            System.out.println("Error");
        }
        if(driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/form/div/table/tbody/tr[2]/td[2]/a")).isDisplayed()){
            System.out.println("This is also displayed");
        }
        else {
            System.out.println("Error");
        }
        String Bill = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div[2]/div/table/tbody/tr[1]/td[2]")).getText();
        System.out.println("The total amount is :" + Bill);
        if (Bill.equals("$3,202.00")){
            System.out.println("Its matching");
        }
        else {
            System.out.println("ITS not matching");
        }
        //-----------------------------------
        //Checkout
        driver.findElement(By.xpath("//a[@ class=\"btn btn-primary\"]")).click();
        driver.quit();

    }
}
