package com.opencart.team2.ui;

import com.opencart.team2.ui.business.HeaderPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;

import org.testng.annotations.Test;

public class SearchForProductNegativeTest extends TestRunner {

    @Test(description = "negative search for product")

    private void negativeSearchProduct() {
        new Navigation().navigateToMainPage();

        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(provider.getLoginEmail())
                .passwordLoginInput(provider.getLoginPassword())
                .continueLoginButton();

        String text = "There is no product that matches the search criteria.";

        new SearchFieldHeaderBL()
                .inputProduct(provider.getProductName())
                .confirmSearch();

        Assert.assertTrue(new HeaderPageBL().getSearchAlert().contains(text));
    }
}

