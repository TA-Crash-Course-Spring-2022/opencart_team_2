package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SearchFieldHeader extends BasePage {

    public SearchFieldHeader() {
        super();
    }

    @FindBy(xpath = "//*[@id='search']/input")
    private WebElement searchLine;

    @FindBy(xpath = "//*[@id='search']/span/button")
    private WebElement enter;

    public WebElement getSearchLine() { return searchLine; }

    public WebElement getEnter() { return enter; }

}