package com.opencart.team2.ui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminAddClassesPage extends BasePage {

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")
    private WebElement Tax_Classes_Add;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/button/i")
    private WebElement Save_Add;

    @FindBy (xpath = "//*[@id=\"content\"]/div[1]/div/div/a")
    private WebElement Cancel_Add;

    @FindBy (xpath = "//*[@id=\"input-title\"]")
    private WebElement Input_Title;

    @FindBy (xpath = "//*[@id=\"input-description\"]")
    private WebElement Input_Description;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[1]/select")
    private WebElement Tax_Rate_EcoTax;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[2]/select")
    private WebElement Tax_Rate_BasedOn;

    @FindBy (xpath = "//*[@id=\"tax-rule-row0\"]/td[3]/input")
    private WebElement Tax_Rate_InputPriority;

    @FindBy (xpath = "//*[@id=\"tax-rule\"]/tfoot/tr/td[2]/button")
    private WebElement Add_Rate_Tax_Rates;

    public AdminAddClassesPage(WebDriver driver) {
        super(driver);
    }

    public  WebElement Tax_Classes () {
        return Tax_Classes_Add;
    }

    public WebElement getSave() {
        return Save_Add;
    }

    public WebElement getCancel() {
        return Cancel_Add;
    }

    public WebElement getInput_Title() {
        return Input_Title;
    }

    public WebElement getInput_Description() {
        return Input_Description;
    }

    public WebElement getTax_Rate_EcoTax () {return Tax_Rate_EcoTax;}

    public WebElement getTax_Rate_BasedOn() {return Tax_Rate_BasedOn;}

    public WebElement getTax_Rate_InputPriority () {return Tax_Rate_InputPriority;}

    public WebElement getAdd_Rate_Tax_Rates() {
        return Add_Rate_Tax_Rates;
    }
}
