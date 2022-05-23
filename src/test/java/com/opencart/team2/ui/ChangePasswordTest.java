package com.opencart.team2.ui;

import com.opencart.team2.ui.business.MainPageBL;
import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePasswordTest extends TestRunner{

    @Test(description = "change password")
    public void addWishList() {

        new Navigation().navigateToMainPage();
        new MainPageBL()
                .selectLogin()
                .inputLoginEmail(provider.getLoginEmail())
                .inputLoginPassword(provider.getLoginPassword())
                .continueLoginButton()
                .changePasswordButton()
                .inputPassword(provider.getNewPassword())
                .inputPasswordConfirm(provider.getNewPassword())
                .clickContinueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your password has been successfully updated.");
        new MainPageBL()
                .clickAccountSelectButton()
                .clickAccountLogoutButton()
                .selectLogin()
                .inputLoginEmail(provider.getLoginEmail())
                .inputLoginPassword(provider.getNewPassword())
                .continueLoginButton()
                .changePasswordButton()
                .inputPassword(provider.getLoginPassword())
                .inputPasswordConfirm(provider.getLoginPassword())
                .clickContinueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your password has been successfully updated.");
    }
}
