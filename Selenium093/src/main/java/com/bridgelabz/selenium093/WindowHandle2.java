package com.bridgelabz.selenium093;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        Thread.sleep(2000);

        String parentWindow = driver.getWindowHandle();

        Set<String> windowHandles = driver.getWindowHandles();
        for (String windowHandleIds : windowHandles) {
            driver.switchTo().window(windowHandleIds);

            // when parent window id =! current window id close the browser
            if (!windowHandleIds.equals(parentWindow))
                driver.close();
        }
    }
}
