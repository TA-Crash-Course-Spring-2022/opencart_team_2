package com.opencart.team2.ui.business;

import com.opencart.team2.ui.constants.MenuCategories;
import com.opencart.team2.ui.pages.AdminNavigationMenuPG;

public class AdminNavigationMenuBL {
    private AdminNavigationMenuPG adminNavigationMenuPG;

    public AdminNavigationMenuBL() {
        adminNavigationMenuPG = new AdminNavigationMenuPG();
    }

    public AdminNavigationMenuBL clickMenuOption(MenuCategories menuCategory){
        adminNavigationMenuPG.getMenuCategory(menuCategory).click();
        return this;
    }

    public AdminNavigationMenuBL clickMenuOption(String menuOption){
        adminNavigationMenuPG.getMenuOption(menuOption).click();
        return this;
    }

}
