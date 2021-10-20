package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("F:\\learning\\Selenium\\Selenium093\\src\\main\\resources\\page2.html");

        driver.findElement(By.id("t2")).sendKeys("t2 ");
        Thread.sleep(2000);
        driver.switchTo().frame("f1");
        driver.findElement(By.id("t1")).sendKeys("frame t1");
        driver.switchTo().defaultContent();
        Thread.sleep(1000);
        driver.findElement(By.id("t2")).sendKeys("after switching to default content ");
        driver.switchTo().frame(0);
        Thread.sleep(1000);
        driver.findElement(By.id("t1")).sendKeys(" Switched with the help of index");
        driver.switchTo().parentFrame();
        Thread.sleep(1000);
        WebElement f2Class =  driver.findElement(By.className("c2"));
        driver.switchTo().frame(driver.findElement(By.className("c2")));
        driver.findElement(By.id("t3")).sendKeys("T3 text field");


    }
}
