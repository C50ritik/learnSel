package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MorningStarScrollTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.manage().window().maximize();


        driver.get("https://www.morningstar.com/");

        Thread.sleep(4000);

       // driver.findElement(By.cssSelector("div.mdc-page-shell.mds-page-shell.default-layout:nth-child(2) div.mdc-page-shell__content.mds-page-shell__content main.today:nth-child(2) section.today__section.today__section--markets:nth-child(2) div.mdc-grid.mds-layout-grid div.mdc-row.mds-layout-grid__row > div.mdc-column.mds-layout-grid__col.today__markets-column.mdc-column--hidden-below-1092.mds-layout-grid__col--3-at-1092:nth-child(3)"));
        //tbody/tr[10]/td[1]

        WebElement coordinate = driver.findElement(By.xpath("//a[contains(text(),'Apple Inc')]"));

        int xCord = coordinate.getLocation().getX();
        int yCord = coordinate.getLocation().getY();

        System.out.println("X Co-coordinate value is : " +xCord);
        System.out.println("Y Co-coordinate value is : " +yCord);

        driver.findElement(By.xpath("//body/div[@id='__nuxt']/div[@id='__layout']/div[1]/div[2]/div[3]/main[1]/section[1]/div[1]/div[1]/div[3]/div[2]/div[2]"));
        JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;


        javascriptExecutor.executeScript("window.scrollBy(" + xCord + "," + yCord + ")");


      /*  JavascriptExecutor javascriptExecutor = (JavascriptExecutor) driver;
        javascriptExecutor.executeScript("window.scrollBy(100,0)");*/
    }
}
