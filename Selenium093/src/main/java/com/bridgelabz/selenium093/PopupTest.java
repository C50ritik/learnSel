package com.bridgelabz.selenium093;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class PopupTest {
    public static void main(String[] args) {

        FirefoxOptions firefoxOptions = new FirefoxOptions();
        firefoxOptions.addArguments("--disable-geolocation");
        WebDriver firefoxDriver = new FirefoxDriver(firefoxOptions);

        ChromeOptions option = new ChromeOptions();
        option.addArguments("--disable-geolocation");

        WebDriver chromeDriver = new ChromeDriver(option);

    }
}
