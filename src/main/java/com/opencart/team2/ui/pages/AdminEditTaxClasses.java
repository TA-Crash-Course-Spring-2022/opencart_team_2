package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import javax.print.DocFlavor;

public class AdminEditTaxClasses extends BasePage{

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")
    private WebElement Tax_Classes_Edit;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/button/i")
    private WebElement Save_Edit;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement Cancel_Edit;

    @FindBy (xpath = "//*[@id=\"input-title\"]")
    private WebElement Tax_Class_Title;

    @FindBy (xpath = "//*[@id=\"input-description\"]")
    private WebElement Tax_Class_Description;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[1]/select")
    private WebElement TaxRate_EcoTax;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[2]/select")
    private WebElement BasedOn_StoreAdress;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[3]/input")
    private WebElement Priority;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[4]/button")
    private WebElement Remove_Button;

    @FindBy (xpath = "//*[@id=\"tax-rule\"]/tfoot/tr/td[2]/button")
    private WebElement Add_Rule;

    public AdminEditTaxClasses(WebDriver driver) {
        super(driver);
    }

    public WebElement getTax_Classes_Edit () {
        return Tax_Classes_Edit;
    }

    public WebElement getSave_EditSave_Edit () {
        return Save_Edit;
    }

    public WebElement getCancel_Edit () {
        return Cancel_Edit;
    }

    public WebElement getSave_EditTax_Class_Title () {
        return Tax_Class_Title;
    }

    public WebElement getSave_EditTax_Class_Description () {
        return Tax_Class_Description;
    }

    public WebElement getTaxRate_EcoTax () {
        return TaxRate_EcoTax;
    }

    public WebElement getBasedOn_StoreAdress () {
        return BasedOn_StoreAdress;
    }

    public WebElement getPriority () {
        return Priority;
    }

    public WebElement getRemove_Button () {
        return Remove_Button;
    }

    public WebElement getAdd_Rule () {
        return Add_Rule;
    }
}
