package com.bridgelabz.selenium093;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptScrollTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();

       /* driver.get("https://www.morningstar.com/");
        Thread.sleep(3000);

        WebElement coordinate = driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/footer[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]/a[1]/*[1]"));

        int xCord = coordinate.getLocation().getX();
        int yCord = coordinate.getLocation().getY();

        System.out.println("X Co-coordinate value is : " +xCord);
        System.out.println("Y Co-coordinate value is : " +yCord);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;

        javascriptExecutor.executeScript("window.scrollBy(" + xCord + "," + yCord + ")");*/

        driver.get("https://www.thesmartmove.se/international/?ref=onepagelove");

        Thread.sleep(2000);

        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(1000,0)");

    }
}
