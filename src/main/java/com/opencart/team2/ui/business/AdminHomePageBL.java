package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminHomePage;

public class AdminHomePageBL {

    private AdminHomePage adminHomePage;
    public AdminHomePageBL () {adminHomePage = new AdminHomePage();}

    public void totalOrderButton() {
        adminHomePage.getViewMoreTotalOrders().click();
    }

    public void totalSalesButton() {
        adminHomePage.getViewMoreTotalSales().click();
    }

    public void totalCustomersButton() {
        adminHomePage.getViewMoreTotalCustomers().click();
    }

    public void peopleOnlineButton() {
        adminHomePage.getViewMorePeopleOnline().click();
    }

    public void zoomInMap() {
        adminHomePage.getWorldMapZoomin().click();
    }

    public void zoomOut() {
        adminHomePage.getWorldMapZoomout().click();
    }
    public void calendarToday() {
        adminHomePage.getCalendarMainButton().click();
        adminHomePage.getCalendarToday().click();
    }

    public void calendarWeek() {
        adminHomePage.getCalendarMainButton().click();
        adminHomePage.getCalendarWeek().click();
    }

    public void calendarMonth() {
        adminHomePage.getCalendarMainButton().click();
        adminHomePage.getCalendarMonth().click();
    }

    public void calendarYear() {
        adminHomePage.getCalendarMainButton().click();
        adminHomePage.getCalendarYear().click();
    }

    public void settings() {
        adminHomePage.getSettings().click();
    }

}