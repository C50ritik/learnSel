package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.morningstar.com/");

        driver.switchTo().frame(5);

        Actions actions = new Actions(driver);

        Thread.sleep(1000);
        WebElement doubleClickBlock = driver.findElement(By.xpath("//a[contains(text(),'Separating wheat from chaff? Morningstar FundInves')]"));
        Thread.sleep(2000);
        actions.doubleClick(doubleClickBlock).perform();
        Thread.sleep(1000);
        actions.doubleClick(doubleClickBlock).perform();

    }
}
