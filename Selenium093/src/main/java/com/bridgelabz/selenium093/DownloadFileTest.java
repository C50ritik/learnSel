package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;


public class DownloadFileTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.gecko.driver", "F:\\learning\\Selenium\\drivers\\geckodriver.exe");
        FirefoxProfile profile = new FirefoxProfile();
//Set the Key so that it will not show the file download pop up on the screen
        String key = "browser.helperApps.neverAsk.saveToDisk";
//Set the type of file which you want to download
        String value = "application/zip";
//using setPreference() method, change the setting
        profile.setPreference(key, value);
// 0 - save to desktop, 1 - save to download folder( default), 2 - save to any other //location
        profile.setPreference("browser.download.folderList", 2);
//save the file to the given folder location
        profile.setPreference("browser.download.dir", "E:\\Testing");
//Use DesiredCapabilities class to modify the firefox settings as shown below
        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability(FirefoxDriver.PROFILE, profile);
//Launch the firefox browser with the above modified settings
        WebDriver driver = new FirefoxDriver(cap);
//Enter selenium official website url
        driver.get("http://www.seleniumhq.org/download/");
//Use following-sibling axes in Xpath to find the download link for selenium java
        driver.findElement(By.xpath("//a[contains(text(),'3.141.59 (November 14, 2018)')]")).click();
        Thread.sleep(3000);
        FirefoxOptions firefoxOptions = new FirefoxOptions();
    }
}
