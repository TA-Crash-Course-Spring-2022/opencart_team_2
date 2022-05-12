package com.opencart.team2.ui.pages;

import com.opencart.team2.ui.constants.MenuName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage{

    public MenuPage(WebDriver driver){
        super(driver);
    }

    public WebElement getMenuCategory(MenuName name){
        return driver.findElement(By.id("menu-" + name.getName()));
    }

    public WebElement getMenuOption(String name){
        return driver.FindElement(By.xpath("//a[contains(text(),'" + name + "')]"));
    }
}
