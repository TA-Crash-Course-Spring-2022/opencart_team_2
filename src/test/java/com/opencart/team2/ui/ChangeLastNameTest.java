package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeLastNameTest extends TestRunner {

    @Test(description = "change last name")
    public void changeLastName() {

        new Navigation().navigateToMainPage();
        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(provider.getLoginEmail())
                .passwordLoginInput(provider.getLoginPassword())
                .continueLoginButton()
                .editButton()
                .lastNameInput(provider.getNewLastName())
                .continueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
    }
}
