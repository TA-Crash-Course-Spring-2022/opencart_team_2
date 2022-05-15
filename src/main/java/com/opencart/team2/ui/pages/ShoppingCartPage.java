package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class ShoppingCartPage extends BasePage {

    @FindBy(xpath = "//div[@id='checkout-cart']//td[@class='text-center']//a[contains(@href,'product/product&product_id=')]")
    private List<WebElement> image;

    @FindBy(xpath = "//div[@id='checkout-cart']//td[@class='text-left']//a[contains(@href,'product/product&product_id=')]")
    private List<WebElement> productName;

    @FindBy(xpath = "//div[@id='checkout-cart']//tbody//td[3]")
    private List<WebElement> model;

    @FindBy(xpath = ".//div[@id='checkout-cart']//td[@class='text-left']//a[contains(name='quantity')]")
    private List<WebElement> quantityNumberInput;

    @FindBy(xpath = ".//button[@data-original-title='Update']")
    private List<WebElement> quantityUpdateButton;

    @FindBy(xpath = ".//button[@data-original-title='Remove']")
    private List<WebElement> quantityRemoveButton;

    @FindBy(xpath = "//div[@id='checkout-cart']//tbody//td[5]")
    private List<WebElement> unitPrice;

    @FindBy(xpath = "//div[@id='checkout-cart']//tbody//td[6]")
    private List<WebElement> total;

    @FindBy(xpath = "//div[@class='panel-group']//a[contains(@href, 'coupon')]")
    private WebElement couponDropdown;

    @FindBy(id = "input-coupon")
    private WebElement couponInput;

    @FindBy(id = "button-coupon")
    private WebElement couponApply;

    @FindBy(xpath = "//div[@class='panel-group']//a[contains(@href, 'shipping')]")
    private WebElement shippingDropdown;

    @FindBy(id = "input-country")
    private WebElement shippingCountry;

    @FindBy(id = "input-zone")
    private WebElement shippingRegion;

    @FindBy(id = "input-postcode")
    private WebElement shippingPostCode;

    @FindBy(id = "button-quote")
    private WebElement shippingGetQuotes;

    @FindBy(xpath = "//div[@class='panel-group']//a[contains(@href, 'voucher')]")
    private WebElement giftCertificateDropdown;

    @FindBy(id = "input-voucher")
    private WebElement giftCertificateInput;

    @FindBy(id = "button-voucher")
    private WebElement giftCertificateApply;

    @FindBy(xpath = "//div[@id='content']//*[text()='Sub-Total:']/../../td[2]")
    private WebElement subTotal;

    @FindBy(xpath = "//div[@id='content']//*[contains(text(), 'Eco Tax')]/../../td[2]")
    private WebElement ecoTax;

    @FindBy(xpath = "//div[@id='content']//*[contains(text(), 'VAT')]/../../td[2]")
    private WebElement vat;

    @FindBy(xpath = "//div[@id='content']//*[text()='Total:']/../../td[2]")
    private WebElement totalPrice;

    @FindBy(xpath = "//div[@class='buttons clearfix']//a[contains(@href, 'checkout/checkout')]")
    private WebElement checkoutButton;

    @FindBy(xpath = "//div[@class='buttons clearfix']//a[contains(@href, 'common/home')]")
    private WebElement continueShoppingButton;


    public ShoppingCartPage() {
        super();
    }

    public WebElement getImage(int id) {
        return image.get(id);
    }

    public WebElement getProductName(int id) {
        return productName.get(id);
    }

    public WebElement getModel(int id) {
        return model.get(id);
    }

    public WebElement getQuantityNumberInput(int id) {
        return quantityNumberInput.get(id);
    }

    public WebElement getQuantityUpdateButton(int id) {
        return quantityUpdateButton.get(id);
    }

    public WebElement getQuantityRemoveButton(int id) {
        return quantityRemoveButton.get(id);
    }

    public WebElement getUnitPrice(int id) {
        return unitPrice.get(id);
    }

    public WebElement getTotal(int id) {
        return total.get(id);
    }

    public WebElement getCouponDropdown() {
        return couponDropdown;
    }

    public WebElement getCouponInput() {
        return couponInput;
    }

    public WebElement getCouponApply() {
        return couponApply;
    }

    public WebElement getShippingDropdown() {
        return shippingDropdown;
    }

    public Select getShippingCountry() {
        return new Select(shippingCountry);
    }

    public Select getShippingRegion() {
        return new Select(shippingRegion);
    }

    public WebElement getShippingPostCode() {
        return shippingPostCode;
    }

    public WebElement getShippingGetQuotes() {
        return shippingGetQuotes;
    }

    public WebElement getGiftCertificateDropdown() {
        return giftCertificateDropdown;
    }

    public WebElement getGiftCertificateInput() {
        return giftCertificateInput;
    }

    public WebElement getGiftCertificateApply() {
        return giftCertificateApply;
    }

    public WebElement getSubTotal() {
        return subTotal;
    }

    public WebElement getEcoTax() {
        return ecoTax;
    }

    public WebElement getVat() {
        return vat;
    }

    public WebElement getTotalPrice() {
        return totalPrice;
    }

    public WebElement getCheckoutButton() {
        return checkoutButton;
    }

    public WebElement getContinueShoppingButton() {
        return continueShoppingButton;
    }
}
