package com.opencart.team2.ui.business;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.pages.ProductSearchPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

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

    public ProductPageBL clickProductPhotoButtons(int id) {
        productSearchPage.getProductPhotoButtons(id).click();
        return new ProductPageBL();
    }

    public ProductPageBL clickProductButtons(int id) {
        productSearchPage.getProductButtons(id).click();
        return new ProductPageBL();
    }

    public ProductSearchPageBL clickAddToCart(int id) {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button-group']//button[contains(@onclick,'cart.add')]")));
        productSearchPage.getAddToCartButton(id).click();
        return this;
    }

    public ProductSearchPageBL clickAddToWishListButton(int id) {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='button-group']//button[contains(@onclick,'wishlist.add')]")));
        productSearchPage.getAddToWishListButton(id).click();
        return this;
    }

    public ProductSearchPageBL clickCompareButton(int id) {
        productSearchPage.getCompareButton(id).click();
        return this;
    }

    public MainPageBL productSearchPageToHeader () {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='×']")));
        productSearchPage.getProductSearchPageToHeader();
        return new MainPageBL();

    }

    public String getSuccess() {
        return productSearchPage.getSuccess().getText();
    }

    public ProductSearchPageBL clickCloseButton(){
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//button[normalize-space()='×']")));
        productSearchPage.getCloseButton().click();
        return this;
    }

}