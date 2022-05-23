package com.opencart.team2.ui;

import com.opencart.team2.ui.business.EditAccountInfoPageBL;
import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class FirstNameChangeTest extends TestRunner {

    @Test
    public void Test () {
        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());

        new MyAccountBL().clickEditButton();

        new EditAccountInfoPageBL()
                .firstNameInput(provider.getNewFirstName())
                .clickContinueButton();

        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
    }
}
