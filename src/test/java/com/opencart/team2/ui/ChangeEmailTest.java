package com.opencart.team2.ui;

import com.opencart.team2.ui.business.MainPageBL;
import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeEmailTest extends TestRunner{

    @Test(description = "change email")
    public void changeEmail() {

        new Navigation().navigateToMainPage();
        new MainPageBL()
                .selectLogin()
                .inputLoginEmail(provider.getLoginEmail())
                .inputLoginPassword(provider.getLoginPassword())
                .continueLoginButton()
                .editButton()
                .emailInput(provider.getNewEmail())
                .continueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
        new MainPageBL()
                .clickAccountSelectButton()
                .clickAccountLogoutButton()
                .selectLogin()
                .inputLoginEmail(provider.getNewEmail())
                .inputLoginPassword(provider.getLoginPassword())
                .continueLoginButton()
                .editButton()
                .emailInput(provider.getLoginEmail())
                .continueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
    }
}