package business;

import com.opencart.team2.ui.pages.AdminAddCurrencyPg;
import org.openqa.selenium.WebDriver;

public class AdminAddCurrencyBL {

    private AdminAddCurrencyPg adminAddCurrencyPg;

    public AdminAddCurrencyBL (WebDriver driver) {adminAddCurrencyPg = new AdminAddCurrencyPg(driver); }

    public AdminAddCurrencyBL CurrencyTitleField (String currencyTitle) {
        adminAddCurrencyPg.getCurrencyTitleField().clear();
        adminAddCurrencyPg.getCurrencyTitleField().sendKeys(currencyTitle);
        return this;
    }

    public AdminAddCurrencyBL CodeField (String currencyCode) {
        adminAddCurrencyPg.getCodeField().clear();
        adminAddCurrencyPg.getCodeField().sendKeys(currencyCode);
        return this;
    }

    public AdminAddCurrencyBL SymbolLeftField (String symbolLeft) {
        adminAddCurrencyPg.getSymbolLeftField().clear();
        adminAddCurrencyPg.getSymbolLeftField().sendKeys(symbolLeft);
        return this;
    }

    public AdminAddCurrencyBL SymbolRightField (String symbolRight) {
        adminAddCurrencyPg.getSymbolRightField().clear();
        adminAddCurrencyPg.getSymbolRightField().sendKeys(symbolRight);
        return this;
    }

    public AdminAddCurrencyBL DecimalPlacesField (String decimalPlaces) {
        adminAddCurrencyPg.getDecimalPlacesField().clear();
        adminAddCurrencyPg.getDecimalPlacesField().sendKeys(decimalPlaces);
        return this;
    }

    public AdminAddCurrencyBL ValueField (String value) {
        adminAddCurrencyPg.getValueField().clear();
        adminAddCurrencyPg.getValueField().sendKeys(value);
        return this;
    }

    public void StatusMenu (int id) {
        adminAddCurrencyPg.getStatusMenu(id).click();
    }

    public void SaveButton () {
        adminAddCurrencyPg.getSaveButton().click();
    }

    public void CancelButton () {
        adminAddCurrencyPg.getCancelButton().click();
    }

    public void CurrencyCodeButton () {
        adminAddCurrencyPg.getCurrencyCodeButton().click();
    }

    public void AdminCurrenciesPageButton () {
        adminAddCurrencyPg.getAdminCurrenciesPageButton().click();
    }

}
