package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.remote.DesiredCapabilities;

public class DownloadTest {
    public static void main(String[] args) throws InterruptedException {


        FirefoxProfile ffProfile = new FirefoxProfile();

        ffProfile.setPreference("browser.download.dir", "E:\\Testing");
        ffProfile.setPreference("browser.download.folderList", 2);

        ffProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip;");


        ffProfile.setPreference("browser.download.manager.showWhenStarting", false);
        ffProfile.setPreference("pdfjs.disabled", true);

        DesiredCapabilities cap = DesiredCapabilities.firefox();
        cap.setCapability(FirefoxDriver.PROFILE, ffProfile);
        /* Create Firefox browser based on the profile just created. */
        FirefoxDriver ffDriver = new FirefoxDriver(cap);

        /* For tomcat 9.0.zip. */
        ffDriver.get("https://www.selenium.dev/downloads/");
        ffDriver.get("http://www.seleniumhq.org/download/");

        Thread.sleep(2000);
        WebElement test = ffDriver.findElement(By.xpath("//a[contains(text(),'3.141.59 (November 14, 2018)')]"));
        Thread.sleep(2000);
        test.click();
        Thread.sleep(2000);
        test.click();
        Thread.sleep(3000);
    }
}
