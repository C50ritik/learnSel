package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://jqueryui.com/droppable/");

        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        Thread.sleep(2000);
        Actions actions = new Actions(driver);

        actions.dragAndDrop(driver.findElement(By.xpath("//p[contains(text(),'Drag me to my target')]")),
                driver.findElement(By.id("droppable"))).perform();


    }
}
