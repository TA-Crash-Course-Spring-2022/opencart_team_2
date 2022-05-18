package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminEditTaxClassesPG extends BasePage{

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/button/i")
    private WebElement saveEdit;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement cancelEdit;

    @FindBy (xpath = "//*[@id=\"input-title\"]")
    private WebElement taxClassTitle;

    @FindBy (xpath = "//*[@id=\"input-description\"]")
    private WebElement taxClassDescription;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[1]/select")
    private WebElement taxRate;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[2]/select")
    private WebElement taxBasedOn;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[3]/input")
    private WebElement priority;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[4]/button")
    private WebElement removeButton;

    @FindBy (xpath = "//*[@id=\"tax-rule\"]/tfoot/tr/td[2]/button")
    private WebElement addRule;

    public AdminEditTaxClassesPG() {
        super();
    }

    public WebElement getSaveEdit() {
        return saveEdit;
    }

    public WebElement getCancelEdit() {
        return cancelEdit;
    }

    public WebElement getTaxClassTitle() {
        return taxClassTitle;
    }

    public WebElement getTaxClassDescription() {
        return taxClassDescription;
    }

    public Select getTaxRate() {return new Select (taxRate);}

    public Select getTaxBaseOn() {return new Select(taxBasedOn);}

    public WebElement getPriority() {
        return priority;
    }

    public WebElement getRemoveButton() {
        return removeButton;
    }

    public WebElement getAddRule() {
        return addRule;
    }
}
