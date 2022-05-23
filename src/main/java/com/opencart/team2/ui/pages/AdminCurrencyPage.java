package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminCurrencyPage extends BasePage {


    @FindBy(xpath = "//div[@class='panel-body']//div[@class='table-responsive']//input[@type='checkbox']")
    private WebElement checkboxButton;

    @FindBy(xpath = "//div[@class='pull-right']//a[@class='btn btn-primary']")
    private WebElement addButton;

    @FindBy(xpath = "//button[@type='button']")
    private WebElement deleteButton;

    @FindBy(xpath = "//a[@class='btn btn-warning']")
    private WebElement refreshButton;

    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-left']//a[contains(@href,'title&order')]")
    private WebElement currencyTitleButton;


    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-left']//a[contains(@href,'code&order')]")
    private WebElement codeButton;

    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-right']//a[contains(@href,'value&order')]")
    private WebElement valueButton;

    @FindBy(xpath = "//div[@class='panel-body']//td[@class='text-left']//a[contains(@href,'modified&order')]")
    private WebElement lastUpdatedButton;

    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    private List<WebElement> checkbox;

    public AdminCurrencyPage() {
        super();
    }

    public WebElement getCheckboxButton() {
        return checkboxButton;
    }
    public WebElement getCheckbox(int id) {
        return checkbox.get(id);
    }

    public List<WebElement> getCheckbox() {
        return checkbox;
    }

    public WebElement getAddButton() {
        return addButton;
    }

    public WebElement getRefreshButton() {
        return refreshButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
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

}
