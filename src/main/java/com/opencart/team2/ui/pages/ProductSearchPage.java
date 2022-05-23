package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ProductSearchPage extends BasePage {

    @FindBy(id = "input-search")
    private WebElement searchInput;

    @FindBy(xpath = "//select[@name='category_id']")
    private WebElement categorySelectButton;

    @FindBy(xpath = "//input[@name='sub_category']")
    private WebElement checkboxSubcategories;

    @FindBy(id = "description")
    private WebElement checkboxDescription;

    @FindBy(id = "button-search")
    private WebElement searchButton;

    @FindBy(id = "list-view")
    private WebElement listButton;

    @FindBy(id = "grid-view")
    private WebElement gridButton;

    @FindBy(id = "compare-total")
    private WebElement productCompareButton;

    @FindBy(id = "input-sort")
    private WebElement sortBySelectButton;

    @FindBy(id = "input-limit")
    private WebElement showSelectButton;

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

    @FindBy(id = "top")
    private WebElement productSearchPageToHeader;

    @FindBy(className = "alert")
    private WebElement success;

    @FindBy(className = "close")
    private WebElement closeButton;

    public ProductSearchPage() {
        super();
    }

    public WebElement getCloseButton(){return closeButton; }

    public WebElement getSuccess() {
        return success;
    }

    public WebElement getProductSearchPageToHeader() {
        return productSearchPageToHeader;
    }

    public WebElement getSearchInput() {
        return searchInput;
    }

    public Select getCategorySelectButton() {
        return new Select(categorySelectButton);
    }

    public WebElement getCheckboxSubcategories() {
        return checkboxSubcategories;
    }

    public WebElement getCheckboxDescription() {
        return checkboxDescription;
    }

    public WebElement getSearchButton() {
        return searchButton;
    }

    public WebElement getListButton() {
        return listButton;
    }

    public WebElement getGridButton() {
        return gridButton;
    }

    public WebElement getProductCompareButton() {
        return productCompareButton;
    }

    public Select getSortBySelectButton() {
        return new Select(sortBySelectButton);
    }

    public Select getShowSelectButton() {
        return new Select(showSelectButton);
    }

    public WebElement getProductPhotoButtons(int id) {
        return productPhotoButtons.get(id);
    }

    public WebElement getProductButtons(int id) {
        return productButtons.get(id);
    }

    public WebElement getAddToCartButton(int id) {
        return addToCartButton.get(id);
    }

    public WebElement getAddToWishListButton(int id) {
        return addToWishListButton.get(id);
    }

    public WebElement getCompareButton(int id) {
        return compareButton.get(id);
    }
}
