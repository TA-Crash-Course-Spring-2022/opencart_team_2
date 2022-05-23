package com.opencart.team2.ui.business;

import com.opencart.team2.ui.constants.MenuName;
import com.opencart.team2.ui.pages.MenuPage;

public class MenuCategoriesBL {
    private MenuPage menuPage;

    public MenuCategoriesBL() {
        menuPage = new MenuPage();
    }

    public MenuCategoriesBL clickMenuCategory(MenuName name){
        menuPage.getMenuCategory(name).click();
        return this;
    }

    public MenuCategoriesBL clickMenuOption(String option){
        menuPage.getMenuOption(option).click();
        return this;
    }
}