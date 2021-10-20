package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.List;


public class SeleniumIntro {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");

        driver.findElement(By.id("email")).sendKeys("Test@gmail.com");
        driver.findElement(By.name("pass")).sendKeys("password");

        driver.findElement(By.linkText("Create New Account")).click();
        Thread.sleep(2000);
        driver.findElement(By.name("firstname")).sendKeys("ABC");

        /*Thread.sleep(1000);
        driver.findElement(By.id("day")).sendKeys("30");
        Thread.sleep(500);
        driver.findElement(By.id("month")).sendKeys("Feb");
        Thread.sleep(1000);
        driver.findElement(By.id("year")).sendKeys("2010");*/

        Thread.sleep(1000);
        WebElement day = driver.findElement(By.id("day"));
        Select selectDay = new Select(day);
        selectDay.selectByIndex(5);

        Thread.sleep(1000);
        Select selectMonth = new Select(driver.findElement(By.id("month")));
        selectMonth.selectByValue("1");

        Thread.sleep(1000);
        Select selectYear = new Select(driver.findElement(By.id("year")));
        selectYear.selectByVisibleText("2010");


        List<WebElement> gender = driver.findElements(By.name("sex"));
        gender.get(2).click();

    }
}
