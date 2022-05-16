package business;

import com.opencart.team2.ui.pages.AdminEditCurrencyPage;
import org.openqa.selenium.WebDriver;

public class AdminEditCurrencyPageBL {
    private AdminEditCurrencyPage adminEditCurrencyPage;

    public AdminEditCurrencyPageBL (WebDriver driver) {
        adminEditCurrencyPage = new AdminEditCurrencyPage(driver);
    }

    public void saveEdit() {
        adminEditCurrencyPage.getSave().click();
    }

    public void cancelEdit() {
        adminEditCurrencyPage.getCancel().click();
    }
    public AdminEditCurrencyPageBL inputCurrencyTitle (String title) {
        adminEditCurrencyPage.getInputCurrencyTitle().clear();
        adminEditCurrencyPage.getInputCurrencyTitle().sendKeys(title);
        return this;
    }

    public AdminEditCurrencyPageBL inputCode (String code) {
        adminEditCurrencyPage.getInputCode().clear();
        adminEditCurrencyPage.getInputCode().sendKeys(code);
        return this;
    }

    public AdminEditCurrencyPageBL inputSymbolLeft (String symbolLeft){
        adminEditCurrencyPage.getInputSymbolLeft().clear();
        adminEditCurrencyPage.getInputSymbolLeft().sendKeys(symbolLeft);
        return this;
    }

    public AdminEditCurrencyPageBL inputSymbolRight (String symbolRight) {
        adminEditCurrencyPage.getInputSymbolRight().clear();
        adminEditCurrencyPage.getInputSymbolRight().sendKeys(symbolRight);
        return this;
    }

    public AdminEditCurrencyPageBL inputValue (String value) {
        adminEditCurrencyPage.getInputValue().clear();
        adminEditCurrencyPage.getInputValue().sendKeys(value);
        return this;
    }

    public AdminEditCurrencyPageBL inputStatus (String status) {
        adminEditCurrencyPage.getInputStatus().clear();
        adminEditCurrencyPage.getInputStatus().sendKeys(status);
        return this;
    }
}
