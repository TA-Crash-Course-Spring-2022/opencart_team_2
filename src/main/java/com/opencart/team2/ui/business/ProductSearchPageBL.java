package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.ProductSearchPage;
import org.openqa.selenium.WebElement;

public class ProductSearchPageBL {
    private ProductSearchPage productSearchPage;

    public ProductSearchPageBL() {
        productSearchPage = new ProductSearchPage();
    }

    public ProductSearchPageBL searchInput(String text) {
        WebElement input = productSearchPage.getSearchInput();
        input.clear();
        input.sendKeys(text);
        return this;
    }

    public ProductSearchPageBL clickCategorySelectButton(String value) {
        productSearchPage.getCategorySelectButton().selectByValue(value);
        return this;
    }

    public String getCategorySelect() {
        return productSearchPage.getCategorySelectButton().getFirstSelectedOption().getText();
    }

    public ProductSearchPageBL clickCheckboxSubcategories() {
        productSearchPage.getCheckboxSubcategories().click();
        return this;
    }

    public ProductSearchPageBL clickCheckboxDescription() {
        productSearchPage.getCheckboxDescription().click();
        return this;
    }

    public ProductSearchPageBL clickSearchButton(){
        productSearchPage.getSearchButton().click();
        return this;
    }

    public ProductSearchPageBL clickListButton(){
        productSearchPage.getListButton().click();
        return this;
    }

    public ProductSearchPageBL clickGridButton(){
        productSearchPage.getGridButton().click();
        return this;
    }

    public ProductSearchPageBL clickProductCompareButton(){
        productSearchPage.getProductCompareButton().click();
        return this;
    }

    public ProductSearchPageBL clickSortBySelectButton(String value){
        productSearchPage.getSortBySelectButton().selectByValue(value);
        return this;
    }

    public String getSortBySelect() {
        return productSearchPage.getSortBySelectButton().getFirstSelectedOption().getText();
    }

    public ProductSearchPageBL clickShowSelectButton(String value){
        productSearchPage.getShowSelectButton().selectByValue(value);
        return this;
    }

    public String getShowSelect() {
        return productSearchPage.getShowSelectButton().getFirstSelectedOption().getText();
    }

    public void clickProductPhotoButtons(int id) {
        productSearchPage.getProductPhotoButtons(id).click();
    }

    public void clickProductButtons(int id) {
        productSearchPage.getProductButtons(id).click();
    }

    public ProductSearchPageBL clickAddToCart(int id) {
        productSearchPage.getAddToCartButton(id).click();
        return this;
    }

    public ProductSearchPageBL clickAddToWishListButton(int id) {
        productSearchPage.getAddToWishListButton(id).click();
        return this;
    }

    public ProductSearchPageBL clickCompareButton(int id) {
        productSearchPage.getCompareButton(id).click();
        return this;
    }

    public HeaderPageBL productSearchPageToHeader () {
        productSearchPage.getProductSearchPageToHeader();
        return new HeaderPageBL();
    }
}