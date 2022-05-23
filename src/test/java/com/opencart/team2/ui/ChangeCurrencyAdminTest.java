package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.constants.MenuCategories;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.Alert;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeCurrencyAdminTest extends TestRunner {

    @Test()
    public void changeCurrency() {

        new Navigation()
                .navigateToAdminMainPage();
        new AdminLoginPgBL()
                .inputUsernameAdmin(provider.getAdminLogin())
                .inputPasswordAdmin(provider.getAdminPassword())
                .clickLoginAdminButton();
        new MenuCategoriesBL()
                .clickMenuCategory(MenuCategories.SYSTEM)
                .clickMenuOption(provider.getLvl1())
                .clickMenuOption(provider.getLvl2());
        new AdminCurrencyBL()
                .clickAddButton()
                .inputCurrencyTitle(provider.getCurrencyTitle())
                .inputCode(provider.getCode())
                .inputSymbolLeft(provider.getSymbolLeft())
                .inputSymbolRight(provider.getSymbolRight())
                .inputDecimalPlaces(provider.getDecimal())
                .inputValue(provider.getValue())
                .selectStatus(provider.getStatus())
                .clickSaveButton();
        new Navigation()
                .navigateToMainPage();
        new MainPageBL()
                .selectCurrency(provider.getCode());
        new Navigation()
                .navigateToAdminMainPage();
        new AdminLoginPgBL()
                .inputUsernameAdmin(provider.getAdminLogin())
                .inputPasswordAdmin(provider.getAdminPassword())
                .clickLoginAdminButton();
        new MenuCategoriesBL()
                .clickMenuCategory(MenuCategories.SYSTEM)
                .clickMenuOption(provider.getLvl1())
                .clickMenuOption(provider.getLvl2());
        new AdminCurrencyBL().clickCheckboxButton(provider.getId2()).clickDeleteButton();
        Alert alert = driver.switchTo().alert();
        alert.accept();
        driver.switchTo().defaultContent();

        int elementSelected = new AdminCurrencyBL().getCheckboxText();
        Assert.assertEquals(elementSelected, provider.getExpected4());
    }
}
