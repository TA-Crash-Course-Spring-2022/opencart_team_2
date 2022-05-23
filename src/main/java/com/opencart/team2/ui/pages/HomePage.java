package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class HomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"slideshow0\"]/div/div[4]/a/img")
    private WebElement productIphoneSlide;

    @FindBy(xpath = "//*[@id=\"slideshow0\"]/div/div[3]/img")
    private WebElement productMacbookSlide;

    @FindBy(xpath = "//div[@class='image']//a[contains(@href, 'product/product&product_id')]")
    private List<WebElement> productPhotoButtons;

    @FindBy(xpath = "//div[@class='caption']//a[contains(@href, 'product/product&product_id')]")
    private List<WebElement> productButtons;

    @FindBy(xpath = "//div[@class='button-group']//button[contains(@onclick,'cart.add')]")
    private List<WebElement> addToCartButton;

    @FindBy(xpath = "//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")
    private List<WebElement> addToWishListButton;

    @FindBy(xpath = "//div[@class='button-group']//button[contains(@onclick,'compare.add')]")
    private List<WebElement> compareButton;

    @FindBy(xpath = "//div[@class='swiper-button-next']")
    private WebElement swipeNextButton;

    @FindBy(xpath = "//div[@class='swiper-button-prev']")
    private WebElement swipePreviousButton;

    @FindBy(xpath = "//div[@class='swiper-pagination carousel0 swiper-pagination-clickable swiper-pagination-bullets']")
    private WebElement sponsorsCarousel;

    @FindBy(className = "alert")
    private WebElement alertText;

    public HomePage() {
        super();
    }

    public WebElement getProductIphoneSlide() {return productIphoneSlide;}

    public WebElement getProductMacbookSlide() {return productMacbookSlide;}

    public WebElement getProductPhotoButtons(int id) {return productPhotoButtons.get(id);}

    public WebElement getProductButtons(int id) {return productButtons.get(id);}

    public WebElement getAddToCartButton(int id) {return addToCartButton.get(id);}

    public WebElement getAddToWishListButton(int id) {return addToWishListButton.get(id);}

    public WebElement getCompareButton(int id) {return compareButton.get(id);}

    public WebElement getSwipeNextButton() {return swipeNextButton;}

    public WebElement getSwipePreviousButton() {return swipePreviousButton;}

    public WebElement getSponsorsCarousel() {return sponsorsCarousel;}

    public WebElement getAlertText() {return alertText;}
}
