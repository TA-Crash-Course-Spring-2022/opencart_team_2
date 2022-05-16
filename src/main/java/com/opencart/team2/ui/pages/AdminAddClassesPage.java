package com.opencart.team2.ui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class AdminAddClassesPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/button/i")
    private WebElement saveAdd;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement cancelAdd;

    @FindBy (xpath = "//*[@id=\"input-title\"]")
    private WebElement inputTitle;

    @FindBy (xpath = "//*[@id=\"input-description\"]")
    private WebElement inputDescription;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[1]/select)")
    private WebElement taxRate;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[2]/select")
    private WebElement taxBasedOn;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[3]/input")
    private WebElement taxRateInputPriority;

    @FindBy (xpath = "//*[@id=\"tax-rule\"]/tfoot/tr/td[2]/button")
    private WebElement addRateTaxRates;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[4]/button/i")
    private WebElement removeRateTaxRates;

    public AdminAddClassesPage(WebDriver driver) {
        super(driver);
    }

    public WebElement getSaveAdd() {return saveAdd;}

    public WebElement getCancel() {return cancelAdd;}

    public WebElement getInputTitle() {
        return inputTitle;
    }

    public WebElement getInputDescription() {
        return inputDescription;
    }

    public Select getTaxRate() {return new Select(taxRate);}

    public Select getTaxBasedOn() {return new Select(taxBasedOn);}

    public WebElement getTaxRateInputPriority() {return taxRateInputPriority;}

    public WebElement getAddRateTaxRates() {
        return addRateTaxRates;
    }

    public WebElement getRemoveRateTaxRates() {return removeRateTaxRates;}
}
