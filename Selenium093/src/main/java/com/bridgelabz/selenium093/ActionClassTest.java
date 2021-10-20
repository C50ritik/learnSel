package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.interactions.Actions;

public class ActionClassTest {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.istqb.in/");

        Actions actions = new Actions(driver);
        Thread.sleep(1000);
        actions.moveToElement(driver.findElement(By.linkText("FOUNDATION")));
        actions.perform();
        actions.moveToElement(driver.findElement(By.cssSelector("body.tm-noblog.header-default.navbar-default.layout-full.headertype-sticky.su-shortcodes-loaded:nth-child(2) div.layout-full-wrapper.ls-overflow-visible div.header-top-wrapper div.tm-header-wrapper div.uk-sticky-placeholder div.tm-headerbar.uk-clearfix div.uk-container.uk-container-center nav.tm-navbar-full div.uk-navbar div.uk-visible-large.uk-navbar-flip:nth-child(3) ul.uk-navbar-nav.uk-hidden-small li.uk-parent.uk-open:nth-child(3) div.uk-dropdown.uk-dropdown-navbar.uk-dropdown-width-2.uk-dropdown-bottom:nth-child(2) div.uk-grid.uk-dropdown-grid div.uk-width-1-2:nth-child(1) ul.uk-nav.uk-nav-navbar li:nth-child(3) > a:nth-child(1)"))).click().perform();
    }
}
