package com.bridgelabz.selenium093;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopupsTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

        driver.get("http://www.tizag.com/javascriptT/javascriptprompt.php");

        driver.findElement(By.xpath("//tbody/tr[1]/td[1]/div[4]/input[1]")).click();
        Thread.sleep(2000);
        Alert alert = driver.switchTo().alert();
        System.out.println("Alert Popup text: "+alert.getText());
        alert.sendKeys("Sachin");
        Thread.sleep(1000);
        alert.dismiss();
        Thread.sleep(2000);
        System.out.println("after accepted first confirmation popup: "+alert.getText());
        Thread.sleep(1000);
        alert.accept();

    }
}
