package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminTaxRatesPage extends BasePage {

    @FindBy(xpath = "//a[contains(@data-original-title, 'Add New')]")
    private WebElement addNewButton;

    @FindBy(xpath = "//button[@data-original-title='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//input[@onclick=\"$('input[name*=\\'selected\\']').prop('checked', this.checked);\"]")
    private WebElement checkboxButton;

    @FindBy(xpath = "//a[contains(@href,'tr.name')]")
    private WebElement taxNameButton;

    @FindBy(xpath = "//a[contains(@href,'tr.rate')]")
    private WebElement taxRateButton;

    @FindBy(xpath = "//a[contains(@href,'tr.type')]")
    private WebElement typeButton;

    @FindBy(xpath = "//a[contains(@href,'tr.gz.name')]")
    private WebElement geoZoneButton;

    @FindBy(xpath = "//a[contains(@href,'tr.date_added')]")
    private WebElement dateAddedButton;

    @FindBy(xpath = "//a[contains(@href,'tr.date_modified')]")
    private WebElement dateModifiedButton;

    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    private List<WebElement> checkbox;

    @FindBy(xpath = "//tbody//td[2]")
    private List<WebElement> taxName;

    @FindBy(xpath = "//tbody//td[3]")
    private List<WebElement> taxRate;

    @FindBy(xpath = "//tbody//td[4]")
    private List<WebElement> type;

    @FindBy(xpath = "//tbody//td[5]")
    private List<WebElement> geoZone;

    @FindBy(xpath = "//tbody//td[6]")
    private List<WebElement> dateAdded;

    @FindBy(xpath = "//tbody//td[7]")
    private List<WebElement> dateModified;

    @FindBy(xpath = "//a[@data-original-title='Edit']")
    private List<WebElement> editButton;


    public AdminTaxRatesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getAddNewButton() {
        return addNewButton;
    }

    public WebElement getDeleteButton() {
        return deleteButton;
    }

    public WebElement getCheckboxButton() {
        return checkboxButton;
    }

    public WebElement getTaxNameButton() {
        return taxNameButton;
    }

    public WebElement getTaxRateButton() {
        return taxRateButton;
    }

    public WebElement getTypeButton() {
        return typeButton;
    }

    public WebElement getGeoZoneButton() {
        return geoZoneButton;
    }

    public WebElement getDateAddedButton() {
        return addNewButton;
    }

    public WebElement getDateModifiedButton() {
        return dateModifiedButton;
    }

    public WebElement getCheckbox(int id) {
        return checkbox.get(id);
    }

    public WebElement getTaxName(int id) {
        return taxName.get(id);
    }

    public WebElement getTaxRate(int id) {
        return taxRate.get(id);
    }

    public WebElement getType(int id) {
        return type.get(id);
    }

    public WebElement getGeoZone(int id) {
        return geoZone.get(id);
    }

    public WebElement getDateAdded(int id) {
        return dateAdded.get(id);
    }

    public WebElement getDateModified(int id) {
        return dateModified.get(id);
    }

    public WebElement getEditButton(int id) {
        return editButton.get(id);
    }
}
