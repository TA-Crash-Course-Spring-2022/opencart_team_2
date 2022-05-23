package com.opencart.team2.ui;

import com.opencart.team2.ui.business.ProductSearchPageBL;
import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProdCartBySearchTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());

        String productName = "Iphone";
        new SearchFieldHeaderBL().searchForProduct(productName);

        new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions
                .elementToBeClickable(By.xpath("//div[@class='button-group']//" +
                        "button[contains(@onclick,'cart.add')]")));


        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].click();", new ProductSearchPageBL().clickAddToCart(0));
        //new ProductSearchPageBL().clickAddToCart(0).clickOnElementJS();

        //new ProductSearchPageBL().clickAddToCart(0);

        Assert.assertTrue(new ProductSearchPageBL().getSuccess().contains("Success: "));
    }
}
