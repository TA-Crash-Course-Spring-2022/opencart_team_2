package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminTaxClassesPg extends BasePage {

    public AdminTaxClassesPg(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement AddNewButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/div/button")
    private WebElement DeleteButton;

    @FindBy(linkText = "Are you sure")
    private WebElement Alert;

    @FindBy(xpath = "//div[@class='panel-body']//table[@class='table table-bordered table-hover']//tbody//tr//td//a")
    private List<WebElement> EditButton;

    @FindBy(className = "asc")
    private WebElement SortButton;

    @FindBy(xpath = "[@id=\"form-tax-class\"]/div/table/thead/tr/td[1]/input")
    private WebElement MainTickButton;

    @FindBy(xpath = "//div[@class='panel-body']//tbody//input[@name='selected[]']")
    private List<WebElement> TicksButtons;


    public WebElement getAddNewButton() {
        return AddNewButton;
    }

    public WebElement getDeleteButton() {
        return DeleteButton;
    }

    public WebElement getAlert() {
        return Alert;
    }

    public WebElement getEditButton(int id) {
        return EditButton.get(id);
    }

    public WebElement getSortButton() {
        return SortButton;
    }

    public WebElement getMainTickButton() {
        return MainTickButton;
    }

    public WebElement getTicksButtons(int id) {
        return TicksButtons.get(id);
    }

}
