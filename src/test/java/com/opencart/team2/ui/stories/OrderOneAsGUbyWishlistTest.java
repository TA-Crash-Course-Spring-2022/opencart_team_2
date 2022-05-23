package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.Assert;
import org.testng.annotations.Test;
public class OrderOneAsGUbyWishlistTest extends TestRunner {

    @Test
    public void Test() {

        new Navigation().navigateToMainPage();

        new HomePageBL().clickProductButtons(1);

        new ProductPageBL().clickAddToWishList();
        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));

    }
}
