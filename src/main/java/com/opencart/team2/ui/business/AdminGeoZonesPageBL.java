package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminGeoZonesPage;

public class AdminGeoZonesPageBL {
    private AdminGeoZonesPage adminGeoZonesPage;

    public AdminGeoZonesPageBL() {
        adminGeoZonesPage = new AdminGeoZonesPage();
    }

    //to do return bl of add
    public void clickAddNewButton() {
        adminGeoZonesPage.getAddNewButton().click();
    }

    public void clickDeleteButton() {
        adminGeoZonesPage.getDeleteButton().click();
    }

    public int getAmountGeoZones(){
        return adminGeoZonesPage.getGeoZoneName().size();
    }

    public boolean isGeoZonesNameClickable(){
        return adminGeoZonesPage.getGeoZoneNameButton().isEnabled();
    }

    public AdminGeoZonesPageBL clickCheckboxButton() {
        adminGeoZonesPage.getCheckboxButton().click();
        return this;
    }

    public AdminGeoZonesPageBL clickGeoZoneNameButton() {
        adminGeoZonesPage.getGeoZoneNameButton().click();
        return this;
    }

    public AdminGeoZonesPageBL clickDescriptionButton() {
        adminGeoZonesPage.getDescriptionButton().click();
        return this;
    }

    public void clickEditButton(int id) {
        adminGeoZonesPage.getEditButton(id).click();
    }
}
