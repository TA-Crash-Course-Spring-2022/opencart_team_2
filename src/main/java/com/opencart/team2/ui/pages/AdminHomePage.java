package com.opencart.team2.ui.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AdminHomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"button-developer\"]")
    private WebElement settings;

    @FindBy (xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[1]/div/div[3]")
    private WebElement viewMoreTotalOrders;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/div/div[3]")
    private WebElement viewMoreTotalSales;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[3]/div/div[3]/a")
    private WebElement viewMoreTotalCustomers;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[4]/div/div[3]/a")
    private WebElement viewMorePeopleOnline;

    @FindBy(xpath = "//*[@id=\"vmap\"]/div[1]")
    private WebElement worldMapZoomin;

    @FindBy(xpath = "//*[@id=\"vmap\"]/div[2]")
    private WebElement worldMapZoomout;

    @FindBy(xpath = "//*[@id=\"range\"]/li[1]/a")
    private WebElement calendarToday;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[2]/div/div[1]/div/a")
    private WebElement calendarMainButton;

    @FindBy(xpath = "//*[@id=\"range\"]/li[2]/a")
    private WebElement calendarWeek;

    @FindBy(xpath = "//*[@id=\"range\"]/li[3]/a")
    private WebElement calendarMonth;

    @FindBy(xpath = "//*[@id=\"range\"]/li[4]/a")
    private WebElement calendarYear;

    public AdminHomePage() {
        super();
    }

    public WebElement getSettings() {
        return settings;
    }

    public WebElement getViewMoreTotalOrders() {
        return viewMoreTotalOrders;
    }

    public WebElement getViewMoreTotalSales() {
        return viewMoreTotalSales;
    }

    public WebElement getViewMoreTotalCustomers() {
        return viewMoreTotalCustomers;
    }

    public WebElement getViewMorePeopleOnline() {
        return viewMorePeopleOnline;
    }

    public WebElement getWorldMapZoomin() {
        return worldMapZoomin;
    }

    public WebElement getWorldMapZoomout() {
        return worldMapZoomout;
    }

    public WebElement getCalendarToday() {
        return calendarToday;
    }

    public WebElement getCalendarWeek() {
        return calendarWeek;
    }

    public WebElement getCalendarMonth() {
        return calendarMonth;
    }

    public WebElement getCalendarYear() {
        return calendarYear;
    }

    public WebElement getCalendarMainButton() {
        return calendarMainButton;
    }
}