package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AddCurrencyPg extends BasePage {

    public AddCurrencyPg (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"input-title\"]")
    private WebElement CurrencyTitleField;

    @FindBy(xpath = "//*[@id=\"input-code\"]")
    private WebElement CodeField;

    @FindBy(xpath = "//*[@id=\"input-symbol-left\"]")
    private WebElement SymbolLeftField;

    @FindBy(xpath = "//*[@id=\"input-symbol-right\"]")
    private WebElement SymbolRightField;

    @FindBy(xpath = "//*[@id=\"input-decimal-place\"]")
    private WebElement DecimalPlacesField;

    @FindBy(xpath = "//*[@id=\"input-value\"]")
    private WebElement ValueField;

    @FindBy(xpath = "//*[@id=\"input-status\"]")
    private WebElement StatusMenu;

    @FindBy(xpath = "//*[@id=\"input-status\"]/option[2]")
    private WebElement StatusMenuDisabled;

    @FindBy(xpath = "//*[@id=\"input-status\"]/option[1]")
    private WebElement StatusMenuEnable;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    private WebElement SaveButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement CancelButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/a")
    private WebElement CurrencyCodeButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")
    private WebElement AdminCurrenciesPageButton;

    public WebElement getCurrencyTitleField() {
        return CurrencyTitleField;
    }

    public WebElement getCodeField() {
        return CodeField;
    }

    public WebElement getSymbolLeftField() {
        return SymbolLeftField;
    }

    public WebElement getSymbolRightField() {
        return SymbolRightField;
    }

    public WebElement getDecimalPlacesField() {
        return DecimalPlacesField;
    }

    public WebElement getValueField() {
        return ValueField;
    }

    public WebElement getStatusMenu() {
        return StatusMenu;
    }

    public WebElement getStatusMenuDisabled() {
        return StatusMenuDisabled;
    }

    public WebElement getStatusMenuEnable() {
        return StatusMenuEnable;
    }

    public WebElement getSaveButton() {
        return SaveButton;
    }

    public WebElement getCancelButton() {
        return CancelButton;
    }

    public WebElement getCurrencyCodeButton() {
        return CurrencyCodeButton;
    }

    public WebElement getAdminCurrenciesPageButton() {
        return AdminCurrenciesPageButton;
    }
}
