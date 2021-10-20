package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

public class WindowHandle {

    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.naukri.com/");

        Thread.sleep(2000);

        Set<String> windowHandles = driver.getWindowHandles();

        System.out.println("Total window handle count :" + windowHandles.size());

        Object[] techMahindra = windowHandles.toArray();
        String test = String.valueOf(techMahindra[1]);

        driver.switchTo().window(test);
        Thread.sleep(1000);
        driver.findElement(By.xpath("//body/a[1]/img[1]")).click();

        Thread.sleep(2000);

     /*   for(String windowHandleIds : windowList){
            driver.switchTo().window(windowHandleIds);
            System.out.println("Title of the current window page :" +driver.getTitle());
        }
*/
        driver.quit();

    }
}
