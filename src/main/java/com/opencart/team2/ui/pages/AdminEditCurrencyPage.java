package com.opencart.team2.ui.pages;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminEditCurrencyPage extends BasePage{

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")
    private WebElement Currencies;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    private WebElement Save;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement Cancel;

    @FindBy (xpath = "//*[@id=\"input-title\"]")
    private WebElement Input_CurrencyTitle;

    @FindBy (xpath = "//*[@id=\"input-code\"]")
    private WebElement Input_Code;

    @FindBy (xpath = "//*[@id=\"input-symbol-left\"]")
    private WebElement Input_SymbolLeft;

    @FindBy (xpath = "//*[@id=\"input-symbol-right\"]")
    private WebElement Input_SymbolRight;

    @FindBy (xpath = "//*[@id=\"input-value\"]")
    private WebElement Input_Value;

    @FindBy (xpath = "//*[@id=\"input-status\"]")
    private WebElement Input_Status;

    public AdminEditCurrencyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCurrencies () {
        return Currencies;
    }

    public WebElement getSave() {
        return Save;
    }

    public WebElement getCancel() {
        return Cancel;
    }

    public WebElement getInput_CurrencyTitle() {
        return Input_CurrencyTitle;
    }

    public WebElement getInput_Code() {
        return Input_Code;
    }

    public WebElement getInput_SymbolLeft() {
        return Input_SymbolLeft;
    }

    public WebElement getInput_SymbolRight () {
        return Input_SymbolRight;
    }

    public WebElement getInput_Value () {
        return Input_Value;
    }

    public WebElement getInput_Status () {
        return Input_Status;
    }
}
