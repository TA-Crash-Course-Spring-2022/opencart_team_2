package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminCurrencyPage extends BasePage {


    @FindBy(xpath = "//div[@class='panel-body']//div[@class='table-responsive']//input[@type='checkbox']")
    private WebElement checkboxButton;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-center']//input[@value='3']")
    private WebElement checkbox1Button;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-center']//input[@value='1']")
    private WebElement checkbox2Button;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-center']//input[@value='2']")
    private WebElement checkbox3Button;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-left']//a[contains(@href,'title&order')]")
    private WebElement currencyTitleButton;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-left']//a[contains(@href,'code&order')]")
    private WebElement codeButton;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-right']//a[contains(@href,'value&order')]")
    private WebElement valueButton;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-left']//a[contains(@href,'modified&order')]")
    private WebElement lastUpdatedButton;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-right']//a[contains(@href,'3')]")
    private WebElement edit1Button;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-right']//a[contains(@href,'1')]")
    private WebElement edit2Button;
    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-right']//a[contains(@href,'2')]")
    private WebElement edit3Button;


    public AdminCurrencyPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getCheckboxButton() {
        return checkboxButton;
    }

    public WebElement getCheckbox1Button() {
        return checkbox1Button;
    }

    public WebElement getCheckbox2Button() {
        return checkbox2Button;
    }

    public WebElement getCheckbox3Button() {
        return checkbox3Button;
    }

    public WebElement getCurrencyTitleButton() {
        return currencyTitleButton;
    }

    public WebElement getCodeButton() {
        return codeButton;
    }

    public WebElement getValueButton() {
        return valueButton;
    }

    public WebElement getLastUpdatedButton() {
        return lastUpdatedButton;
    }

    public WebElement getEdit1Button() {
        return edit1Button;
    }

    public WebElement getEdit2Button() {
        return edit2Button;
    }

    public WebElement getEdit3Button() {
        return edit3Button;
    }
}
