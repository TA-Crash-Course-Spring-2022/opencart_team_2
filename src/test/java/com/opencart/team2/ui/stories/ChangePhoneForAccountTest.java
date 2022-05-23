package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangePhoneForAccountTest extends TestRunner {

    @Test(description = "change phone for account test")
    public void EditButton() {


        String inputEmail = "2@gmail.com";
        String inputTelephone = "8888";
        String inputPassword = "2222";


        new Navigation().navigateToMainPage();
        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton()
                .editButton()
                .telephoneInput(inputTelephone)
                .continueButton();
        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
    }
}
