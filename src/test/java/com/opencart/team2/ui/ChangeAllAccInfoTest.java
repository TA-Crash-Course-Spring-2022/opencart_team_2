package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeAllAccInfoTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());

        new MyAccountBL().clickEditButton();

        new EditAccountInfoPageBL()
                .firstNameInput(provider.getNewFirstName())
                .lastNameInput(provider.getNewLastName())
                .emailInput(provider.getNewEmail())
                .telephoneInput(provider.getNewTelephone())
                .clickContinueButton();

        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");

        new MyAccountBL().clickEditButton();

        new EditAccountInfoPageBL().CancelChanges(provider.getFirstName(),
                provider.getLastName(), provider.getLoginEmail(), provider.getDefaultTelephone());
    }
}
