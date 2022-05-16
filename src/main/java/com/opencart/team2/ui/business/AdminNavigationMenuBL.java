package com.opencart.team2.ui.business;

import com.opencart.team2.ui.constants.MenuCategories;
import com.opencart.team2.ui.pages.AdminNavigationMenu;

public class AdminNavigationMenuBL {
    private AdminNavigationMenu adminNavigationMenu;

    public AdminNavigationMenuBL() {
        adminNavigationMenu = new AdminNavigationMenu();
    }

    public AdminNavigationMenuBL clickMenuOption(MenuCategories menuCategory){
        adminNavigationMenu.getMenuCategory(menuCategory).click();
        return this;
    }

    public AdminNavigationMenuBL clickMenuOption(String menuOption){
        adminNavigationMenu.getMenuOption(menuOption).click();
        return this;
    }

}
