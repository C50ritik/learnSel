package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameTest2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.w3schools.com/");

        driver.switchTo().frame(1);
        Thread.sleep(1000);

        driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//a[contains(text(),'About')]")).click();

    }
}
