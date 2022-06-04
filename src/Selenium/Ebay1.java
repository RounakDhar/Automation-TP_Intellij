package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Ebay1 {
    public static void main(String[] args){

        //System.out.println("Hello World");

        //System.setProperty("webdriver.chrome.driver","C:\\IntelliJ-BrowserDrivers\\chromedriver.exe");
        System.setProperty("webdriver.gecko.driver","C:\\IntelliJ-BrowserDrivers\\geckodriver.exe");

        //WebDriver driver = new ChromeDriver();
        WebDriver driver = new FirefoxDriver();

        driver.get("https://www.ebay.com");

        driver.findElement(By.xpath("//*[@id=\"gh-ac\"]")).sendKeys("shirt");
        driver.findElement(By.xpath("//*[@id=\"gh-btn\"]")).click();

        //driver.quit();

    }
}
