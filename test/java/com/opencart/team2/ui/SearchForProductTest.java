package com.opencart.team2.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class SearchForProductTest extends TestRunner {

    @Test
    public void Test() {
        driver.get("https://demo.opencart.com");
        WebElement searchLine = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        searchLine.clear();
        searchLine.sendKeys("iPhone");
        driver.findElement(By.xpath("//*[@id='search']/span/button")).click();

    }
}
