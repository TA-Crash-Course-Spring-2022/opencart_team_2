package com.opencart.team2.ui;


import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ChangeAllAccInfoTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        String email = "tester132q@gmail.com";
        String userPassword = "test";
        new UserLoginPageBL()
                .MyAccountMainButton()
                .UserLoginMainButton()
                .UserEmailField(email)
                .UserPasswordField(userPassword);

        String newFirstName = "Petro";
        String newLastName = "LastPetro";
        String newEmail = "newTester132q@gmail.com";
        String newTelephone = "0112233445566";

        new MyAccountBL().editButton();

        new EditAccountInfoPageBL()
                .firstNameInput(newFirstName)
                .lastNameInput(newLastName)
                .emailInput(newEmail)
                .telephoneInput(newTelephone)
                .continueButton();

        Assert.assertEquals(new MyAccountBL().getAlert(), "Success: Your account has been successfully updated.");
    }
}
