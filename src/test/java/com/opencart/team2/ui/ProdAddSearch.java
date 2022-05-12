package com.opencart.team2.ui;

import org.openqa.selenium.Keys;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class ProdAddSearch extends TestRunner {

    @Test
    public void Test() {
        driver.get("https://demo.opencart.com");
        WebElement searchLine = driver.findElement(By.xpath("//*[@id=\"search\"]/input"));
        searchLine.clear();
        searchLine.sendKeys("iPhone");
        searchLine.sendKeys(Keys.ENTER);
        WebElement addToCart = driver.findElement(By.xpath("//*[@id=\"content\"]/div[3]/div/div/div[2]/div[2]/button[1]"));
        addToCart.click();
    }
}
