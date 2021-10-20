package com.bridgelabz.selenium093;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.apache.commons.io.FileUtils;


import java.io.File;
import java.io.IOException;

public class TakeScreenShotTest {
    public static void main(String[] args) throws IOException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.get("https://en-gb.facebook.com/");

        TakesScreenshot takesScreenshot = (TakesScreenshot) driver;
        File srcFile = takesScreenshot.getScreenshotAs(OutputType.FILE);
        File destFile = new File(".\\screenshots\\"+ System.currentTimeMillis()+".png");
        FileHandler.copy(srcFile, destFile);
        FileUtils.copyFile(srcFile,destFile);

    }
}
