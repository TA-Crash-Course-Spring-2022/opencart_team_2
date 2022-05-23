package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.HomePageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductToCardTest extends TestRunner {

    @Test
    private void Test() {
        new Navigation().navigateToMainPage();

        String inputEmail = "tester132q@gmail.com";
        String inputPassword = "test";
        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton();

        new SearchFieldHeaderBL()
                .opencartHomePage();


        new HomePageBL().clickAddToCart(1);

        Assert.assertTrue(new HomePageBL().alert().contains("Success: "));
    }
}
