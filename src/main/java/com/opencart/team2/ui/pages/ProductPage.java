package com.opencart.team2.ui.pages;

import java.util.List;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ProductPage extends BasePage {

    public ProductPage (WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[@id='content']/div[1]/div[2]/div[1]/button[1]")
    private WebElement addToWishList;

    @FindBy(xpath = "//*[@id='content']/div[1]/div[2]/div[1]/button[2]")
    private WebElement compareThisProduct;

    @FindBy(xpath = "//*[@id=\"button-cart\"]")
    private WebElement addToCart;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[1]/a")
    private WebElement descriptionButton;

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div[1]/ul[2]/li[2]/a")
    private WebElement reviewsButton;

    @FindBy(xpath = "//*[@id=\"input-name\"]")
    private WebElement reviewsNameLine;

    @FindBy(xpath = "//*[@id=\"input-review\"]")
    private WebElement reviewsReviewField;

    @FindBy(xpath = "//div[@class='rating']//p//span[@class='fa fa-stack']")
    private List<WebElement> ratingButtons;

    @FindBy(id = "button-review")
    private WebElement continueButton;

    @FindBy(xpath = "//*[@id=\"input-quantity\"]")
    private WebElement quantityField;

    @FindBy(xpath = "//*[@id=\"u_0_1_97\"]/button/span")
    private WebElement likeButton;


    public WebElement getAddToWishList() {
        return addToWishList;
    }

    public WebElement getCompareThisProduct() {
        return compareThisProduct;
    }

    public WebElement getAddToCart() {
        return addToCart;
    }

    public WebElement getDescriptionButton() {
        return descriptionButton;
    }

    public WebElement getReviewsButton() {
        return reviewsButton;
    }

    public WebElement getReviewsNameLine() {
        return reviewsNameLine;
    }

    public WebElement getReviewsReviewField() { return reviewsReviewField; }

    public WebElement getRatingButtons(int id) { return ratingButtons.get(id); }

    public WebElement getContinueButton() { return continueButton; }

    public WebElement getQuantityField() { return quantityField; }

    public WebElement getLikeButton() { return likeButton; }
}
