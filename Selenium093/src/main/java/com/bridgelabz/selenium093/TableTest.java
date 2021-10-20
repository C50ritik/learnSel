package com.bridgelabz.selenium093;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class TableTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "F:\\learning\\Selenium\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("F:\\learning\\Selenium\\Selenium093\\src\\main\\resources\\table.html");

//Count Total number of rows present in the table
        List<WebElement> allRows = driver.findElements(By.xpath("//tr"));
        int totalRows = allRows.size();
        System.out.println("total number of rows present in the table is :" + totalRows);
//count total number of columns
        List<WebElement> allColumns = driver.findElements(By.xpath("//th"));
        int totalColumns = allColumns.size();
        System.out.println("Total number of columns in the table is :" + totalColumns);
//Count number of cells present in the table
        List<WebElement> allCells = driver.findElements(By.xpath("//th|//td"));
        int totalCells = allCells.size();
        System.out.println("Total number of cells present in the table is :" + totalCells);
//Print ONLY the numbers
        int countNumberValue = 0;
        int sum = 0;
        //   for(int  i = 0;i<=allCells.size();i++)
        for (WebElement cell : allCells) {
            String cellValue = cell.getText();
            try {
                int number = Integer.parseInt(cellValue);
                System.out.print(" : " + number);
                countNumberValue++;
                sum = sum + number;
            } catch (Exception e) {
            }
        }
        System.out.println("\n Total count of numeric values is :" + countNumberValue);
        System.out.println("Total sum of all the numeric values is :" + sum);

        int totalPrice = 0;
        for (int i = 2; i <= 4; i++) {
            WebElement price = driver.findElement(By.xpath("//tbody/tr[" + i + "]/td[3]"));

//totalPrice= totalPrice +  Integer.parseInt(price.getText());
            totalPrice += Integer.parseInt(price.getText());
        }
        System.out.println("Total Price : " + totalPrice);

//close the browser
        driver.close();
    }
}
