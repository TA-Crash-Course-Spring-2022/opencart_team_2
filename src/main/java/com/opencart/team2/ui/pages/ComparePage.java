package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ComparePage extends BasePage {

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'product/product')]")
    private List <WebElement> Product_Name;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td[@class= 'text-center']")
    private List <WebElement> Product_Image;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td[@class= 'rating']")
    private List <WebElement> Product_Rating;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td[@class= 'description']")
    private List <WebElement> Product_Summary;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td//input[@class='btn btn-primary btn-block']")
    private List <WebElement> Product_AddToCard;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'product/compare')]")
    private List <WebElement> Product_Remove;

    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProduct_Name(int xpath){
                return Product_Name.get(xpath);
    }

    public WebElement getProduct_Image(int xpath) {
        return Product_Image.get(xpath);
    }

    public WebElement getProduct_Rating (int xpath) {
                return Product_Rating.get(xpath);
    }

    public WebElement getProduct_Summary (int xpath) {return Product_Summary.get(xpath); }

    public WebElement getProduct_AddToCard (int xpath) {
                return Product_AddToCard.get(xpath);
    }

    public WebElement getProduct_Remove (int xpath) {
                return Product_Remove.get(xpath);
    }
}
