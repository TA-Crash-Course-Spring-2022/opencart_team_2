package com.opencart.team2.ui;

import com.opencart.team2.ui.business.ChangePasswordBL;
import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePasswordTest extends TestRunner{

    @Test(description = "change password")
    public void addWishList() {

        String inputEmail= "1@gmail.com";
        String inputPassword= "1111";
        String newPass="qwerty";

        new Navigation().navigateToMainPage();
        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton()
                .changePasswordButton()
                .inputPassword(newPass)
                .inputPasswordConfirm(newPass).clickContinueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your password has been successfully updated.");
        new HeaderPageBL()
                .clickAccountSelectButton()
                .clickAccountLogoutButton()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(newPass)
                .continueLoginButton()
                .changePasswordButton()
                .inputPassword(inputPassword)
                .inputPasswordConfirm(inputPassword)
                .clickContinueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your password has been successfully updated.");
    }
}
