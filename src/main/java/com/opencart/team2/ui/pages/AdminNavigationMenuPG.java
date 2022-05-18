package com.opencart.team2.ui.pages;

import com.opencart.team2.ui.constants.MenuCategories;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AdminNavigationMenuPG extends BasePage {

    public AdminNavigationMenuPG() {
        super();
    }

    public WebElement getMenuCategory(MenuCategories name) {
        return driver.findElement(By.id("menu-" + name.getName()));
    }

    public WebElement getMenuOption(String name) {
        return driver.findElement(By.xpath("//a[contains(text(), '" + name + "')]"));
    }
}
