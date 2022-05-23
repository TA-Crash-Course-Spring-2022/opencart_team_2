package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class SearchForProductTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());

        String productName = "Iphone";
        new SearchFieldHeaderBL().searchForProduct(productName);

        driver.findElement(By.xpath("//div[@class='caption']//" +
                "a[contains(@href, 'product/product&product_id')]")).isDisplayed();
    }
}
