package com.opencart.team2.ui;

import com.opencart.team2.ui.pages.ShoppingCartPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ShoppingCartTest extends TestRunner {
    @Test(description = "simple test")
    public void simpleTest() {
        driver.get("www.google.com");
        String price = new ShoppingCartPage(driver).getTotalPrice();
        Assert.assertEquals(price, "10.55", "error - incorrect price.");
    }
}
