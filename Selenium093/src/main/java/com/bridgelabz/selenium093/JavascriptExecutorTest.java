package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("F:\\learning\\Selenium\\Selenium093\\src\\main\\resources\\javascriptTest.html");
        WebElement textField1 = driver.findElement(By.id("t1"));
        Thread.sleep(1000);
        textField1.clear();
        Thread.sleep(1000);
        textField1.sendKeys("after clearing t1");

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        Thread.sleep(1000);
        javascriptExecutor.executeScript("document.getElementById('t2').value=''");
        Thread.sleep(1000);

        javascriptExecutor.executeScript("document.getElementById('t2').value='Enter using Javascript Executor'");
        Thread.sleep(10000);
        driver.close();

    }
}
