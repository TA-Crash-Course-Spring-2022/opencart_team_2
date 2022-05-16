package com.opencart.team2.ui.pages;

import com.opencart.team2.ui.constants.MenuCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AdminNavigationMenu extends BasePage {

    public AdminNavigationMenu(WebDriver driver) {
        super(driver);
    }

    public WebElement getMenuCategory(MenuCategories name) {
        return driver.findElement(By.id("menu-" + name.getName()));
    }

    public WebElement getMenuOption(String name) {
        return driver.findElement(By.xpath("//a[contains(text(), '" + name + "')]"));
    }
}
