package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class ComparePage extends BasePage {

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'product/product')]")
    private List <WebElement> productName;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td[@class= 'text-center']")
    private List <WebElement> productImage;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td[@class= 'rating']")
    private List <WebElement> productRating;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td[@class= 'description']")
    private List <WebElement> productSummary;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td//input[@class='btn btn-primary btn-block']")
    private List <WebElement> productAddToCard;

    @FindBy (xpath = "//div[@id='content']//table//tbody//tr//td//a[contains(@href,'product/compare')]")
    private List <WebElement> productRemove;

    public ComparePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getProductName(int xpath){
                return productName.get(xpath);
    }

    public WebElement getProductImage(int xpath) {
        return productImage.get(xpath);
    }

    public WebElement getProductRating(int xpath) {
                return productRating.get(xpath);
    }

    public WebElement getProductSummary(int xpath) {return productSummary.get(xpath); }

    public WebElement getProductAddToCard(int xpath) {return productAddToCard.get(xpath);}

    public WebElement getProductRemove( int xpath) {
                return productRemove.get(xpath);
    }
}
