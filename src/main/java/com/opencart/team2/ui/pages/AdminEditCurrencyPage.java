package com.opencart.team2.ui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminEditCurrencyPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    private WebElement save;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement cancel;

    @FindBy (xpath = "//*[@id=\"input-title\"]")
    private WebElement inputCurrencyTitle;

    @FindBy (xpath = "//*[@id=\"input-code\"]")
    private WebElement inputCode;

    @FindBy (xpath = "//*[@id=\"input-symbol-left\"]")
    private WebElement inputSymbolLeft;

    @FindBy (xpath = "//*[@id=\"input-symbol-right\"]")
    private WebElement inputSymbolRight;

    @FindBy (xpath = "//*[@id=\"input-value\"]")
    private WebElement inputValue;

    @FindBy (xpath = "//*[@id=\"input-status\"]")
    private WebElement inputStatus;

    public AdminEditCurrencyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSave() {
        return save;
    }

    public WebElement getCancel() {
        return cancel;
    }

    public WebElement getInputCurrencyTitle() {
        return inputCurrencyTitle;
    }

    public WebElement getInputCode() {
        return inputCode;
    }

    public WebElement getInputSymbolLeft() {return inputSymbolLeft;}

    public WebElement getInputSymbolRight() {
        return inputSymbolRight;
    }

    public WebElement getInputValue() {
        return inputValue;
    }

    public WebElement getInputStatus() {
        return inputStatus;
    }
}
