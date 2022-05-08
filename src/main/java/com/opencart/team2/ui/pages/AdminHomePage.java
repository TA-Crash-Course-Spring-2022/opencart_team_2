package com.opencart.team2.ui.pages;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class AdminHomePage extends BasePage {

    @FindBy(xpath = "//*[@id=\"content\"]/div[1]/div/ul/li[2]/a")
    private WebElement Dashboard;

    @FindBy(xpath = "//*[@id=\"button-setting\"]")
    private WebElement Settings;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[1]/div/div[3]/a")
    private WebElement ViewMore_TotalOrders;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[2]/div/div[3]/a")
    private WebElement ViewMore_TotalSales;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[3]/div/div[3]/a")
    private WebElement ViewMore_TotalCustomers;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[1]/div[4]/div/div[3]/a")
    private WebElement ViewMore_PeopleOnline;

    @FindBy(xpath = "//*[@id=\"vmap\"]/div[1]")
    private WebElement WorldMap_Zoomin;

    @FindBy(xpath = "//*[@id=\"vmap\"]/div[2]")
    private WebElement WordlMap_Zoomout;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[2]/div[2]/div/div[1]/div/a/i[1]")
    private WebElement Calendar_SalesAnalytics;

    @FindBy(xpath = "//*[@id=\"range\"]/li[1]/a")
    private WebElement Calendar_Today;

    @FindBy(xpath = "//*[@id=\"range\"]/li[2]/a")
    private WebElement Calendar_Week;

    @FindBy(xpath = "//*[@id=\"range\"]/li[3]/a")
    private WebElement Calendar_Month;

    @FindBy(xpath = "//*[@id=\"range\"]/li[4]/a")
    private WebElement Calendar_Year;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]")
    private List<WebElement> ViewButton_16654;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[2]")
    private List<WebElement> ViewButton_16653;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[3]")
    private List<WebElement> ViewButton_16652;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[4]")
    private List<WebElement> ViewButton_16651;

    @FindBy(xpath = "//*[@id=\"content\"]/div[2]/div[3]/div[2]/div/div[2]/table/tbody/tr[5]")
    private List<WebElement> ViewButton_16650;

    public AdminHomePage(WebDriver driver) {
        super(driver);
    }

    public WebElement getDashboard() {
        return Dashboard;
    }

    public WebElement getSettings() {
        return Settings;
    }

    public WebElement getViewMore_TotalOrders() {
        return ViewMore_TotalOrders;
    }

    public WebElement getViewMore_TotalSales() {
        return ViewMore_TotalSales;
    }

    public WebElement getViewMore_TotalCustomers() {
        return ViewMore_TotalCustomers;
    }

    public WebElement getViewMore_PeopleOnline() {
        return ViewMore_PeopleOnline;
    }

    public WebElement getWorldMap_Zoomin() {
        return WorldMap_Zoomin;
    }

    public WebElement getWordlMap_Zoomout() {
        return WordlMap_Zoomout;
    }

    public WebElement getCalendar_SalesAnalytics() {
        return Calendar_SalesAnalytics;
    }

    public WebElement getCalendar_Today() {
        return Calendar_Today;
    }

    public WebElement getCalendar_Week() {
        return Calendar_Week;
    }

    public WebElement getCalendar_Month() {
        return Calendar_Month;
    }

    public WebElement getCalendar_Year() {
        return Calendar_Year;
    }

    public WebElement getViewButton_16654(int xpath) {
        return ViewButton_16654.get(xpath);
    }

    public WebElement getViewButton_16653(int xpath) {
        return ViewButton_16653.get(xpath);
    }

    public WebElement getViewButton_16652(int xpath) {
        return ViewButton_16652.get(xpath);
    }

    public WebElement getViewButton_16651(int xpath) {
        return ViewButton_16651.get(xpath);
    }

    public WebElement getViewButton_16650(int xpath) {
        return ViewButton_16650.get(xpath);
    }
}