package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeEmailTest extends TestRunner{

    @Test(description = "change email")
    public void changeEmail() {

        String inputEmail = "1@gmail.com";
        String inputPassword = "1111";
        String newEmail = "zxc@gmail.com";

        new Navigation().navigateToMainPage();
        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton()
                .editButton()
                .emailInput(newEmail)
                .continueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
        new HeaderPageBL()
                .clickAccountSelectButton()
                .clickAccountLogoutButton()
                .selectLogin()
                .emailLoginInput(newEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton()
                .editButton()
                .emailInput(inputEmail)
                .continueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
    }
}