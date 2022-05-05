package com.opencart.team2.ui.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ShoppingCartPage extends BasePage{
    private WebElement totalPrice;
    public ShoppingCartPage(WebDriver driver) {
        super(driver);
    }
    public String getTotalPrice(){
        totalPrice = driver.findElement(By.id("total-price"));
        return totalPrice.getText();
    }
}
