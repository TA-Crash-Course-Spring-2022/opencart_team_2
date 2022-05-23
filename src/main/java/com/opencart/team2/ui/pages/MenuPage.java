package com.opencart.team2.ui.pages;

import com.opencart.team2.ui.constants.MenuCategories;
import com.opencart.team2.ui.constants.MenuName;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class MenuPage extends BasePage {

    public WebElement getMenuCategory(MenuCategories name) {
        return driver.findElement(By.id("menu-" + name.getName()));
    }

    public MenuPage() {
        super();
    }

    public WebElement getMenuOption(String name) {
        return driver.findElement(By.xpath("//a[contains(text(),'" + name + "')]"));
    }
}
