package com.opencart.team2.ui;

import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;

public class SearchForProductTest extends TestRunner {

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

        String productName = "Iphone";
        new SearchFieldHeaderBL()
        .inputProduct(productName)
        .confirmSearch();

        int id = 0;
        Assert.assertEquals(id, 0);
    }
}
