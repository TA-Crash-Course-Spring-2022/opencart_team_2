package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.MyAccountPage;

public class MyAccountBL {
    private MyAccountPage myAccountPage;

    public MyAccountBL() {
        myAccountPage = new MyAccountPage();
    }

    public void editButton() {

        myAccountPage.getEditButton().click();
    }

    public void changePasswordButton() {
        myAccountPage.getChangePasswordButton().click();
    }

    public void modifyAddressButton() {
        myAccountPage.getModifyAddressButton().click();
    }

    public void modifyWishList() {
        myAccountPage.getModifyWishListButton();
    }

    public void viewOrder() {
        myAccountPage.getViewOrderButton();
    }

    public void downloads() {
        myAccountPage.getDownloadsButton();
    }

    public void yourReward() {
        myAccountPage.getYourRewardButton();
    }

    public void viewReturn() {
        myAccountPage.getViewReturnButton();
    }

    public void transactions() {
        myAccountPage.getTransactionsButton();
    }

    public void recurring() {
        myAccountPage.getRecurringButton();
    }

    public void registerAffiliate() {
        myAccountPage.getRegisterAffiliateButton();
    }

    public void newsletter() {
        myAccountPage.getNewsletterButton();
    }

}
