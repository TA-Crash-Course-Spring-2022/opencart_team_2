package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminGeoZonesPage extends BasePage {

    @FindBy(xpath = "//a[contains(@data-original-title, 'Add New')]")
    private WebElement addNewButton;

    @FindBy(xpath = "//button[@data-original-title='Delete']")
    private WebElement deleteButton;

    @FindBy(xpath = "//input[@onclick=\"$('input[name*=\\'selected\\']').prop('checked', this.checked);\"]")
    private WebElement checkboxButton;

    @FindBy(xpath = "//a[contains(@href,'sort=name')]")
    private WebElement geoZoneNameButton;

    @FindBy(xpath = "//a[contains(@href,'sort=description')]")
    private WebElement descriptionButton;

    @FindBy(xpath = "//tbody//input[@type='checkbox']")
    private List<WebElement> checkbox;

    @FindBy(xpath = "//tbody//td[2]")
    private List<WebElement> geoZoneName;

    @FindBy(xpath = "//tbody//td[3]")
    private List<WebElement> description;

    @FindBy(xpath = "//a[@data-original-title='Edit']")
    private List<WebElement> editButton;

    public AdminGeoZonesPage(WebDriver driver) {
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

    public WebElement getGeoZoneNameButton() {
        return geoZoneNameButton;
    }

    public WebElement getDescriptionButton() {
        return descriptionButton;
    }

    public WebElement getCheckbox(int id) {
        return checkbox.get(id);
    }

    public WebElement getGeoZoneName(int id) {
        return geoZoneName.get(id);
    }

    public WebElement getDescription(int id) {
        return description.get(id);
    }

    public WebElement getEditButton(int id) {
        return editButton.get(id);
    }
}
