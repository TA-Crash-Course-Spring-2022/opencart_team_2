package com.opencart.team2.ui;

import com.opencart.team2.ui.business.ProductPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.annotations.Test;

public class ProdAddSearchTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        String email = "tester132q@gmail.com";
        String userPassword = "test";
        UserLoginPageBL userLoginPageBL = new UserLoginPageBL();
        userLoginPageBL.MyAccountMainButton();
        userLoginPageBL.UserLoginMainButton();
        userLoginPageBL.UserEmailField(email);
        userLoginPageBL.UserPasswordField(userPassword);
        userLoginPageBL.UserLoginButton();

        String productName = "Iphone";
        SearchFieldHeaderBL searchFieldHeaderBL = new SearchFieldHeaderBL();
        searchFieldHeaderBL.inputProduct(productName);

        searchFieldHeaderBL.confirmSearch();

        ProductPageBL productPageBL = new ProductPageBL();
        productPageBL.addToCartOnSearch();

    }
}
