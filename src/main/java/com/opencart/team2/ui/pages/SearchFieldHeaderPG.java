package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class SearchFieldHeaderPG extends BasePage {

    public SearchFieldHeaderPG() {
        super();
    }

    @FindBy(xpath = "//*[@id=\"search\"]/input")
    private WebElement searchLine;

    @FindBy(xpath = "//*[@id=\"search\"]/span/button")
    private WebElement enterButton;

    @FindBy(xpath = "//*[@id=\"logo\"]/a")
    private WebElement opencartMainButton;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[1]")
    private WebElement viewCartHeaderButton;

    @FindBy(xpath = "//*[@id='cart']/button")
    private WebElement shoppingcartHeaderButton;

    @FindBy(xpath = "//*[@id=\"cart\"]/ul/li[2]/div/p/a[2]")
    private WebElement checkoutHeaderButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//li//tbody//tr//td//button[@class='btn btn-danger btn-xs']")
    private List<WebElement> productRemoveHeaderButton;

    @FindBy(xpath = "//ul[@class='dropdown-menu pull-right']//li//tbody//tr//td[@class='text-left']//a")
    private List<WebElement> buttonToProductPageByName;

    public WebElement getSearchLine() { return searchLine; }

    public WebElement getEnterButton() { return enterButton; }

    public WebElement getOpencartMainButton() { return opencartMainButton; }

    public WebElement getViewCartHeaderButton() { return viewCartHeaderButton; }

    public WebElement getCheckoutHeaderButton() { return checkoutHeaderButton; }

    public WebElement getShoppingcartHeaderButton() { return shoppingcartHeaderButton; }

    public WebElement getProductRemoveHeaderButton(int id) { return productRemoveHeaderButton.get(id); }

    public WebElement getButtonToProductPageByName(int id) { return buttonToProductPageByName.get(id); }

}
