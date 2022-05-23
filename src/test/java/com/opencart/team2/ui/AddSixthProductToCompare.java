package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class AddSixthProductToCompare extends TestRunner{

    @Test(description = "add 6 product to compare")

    private void addProductToCompare() {
        new Navigation().navigateToMainPage();

        String inputEmail = "lilia.baranovska@gmail.com";
        String inputPassword = "admin";

        new HeaderPageBL()
                .selectLogin()
                .emailLoginInput(inputEmail)
                .passwordLoginInput(inputPassword)
                .continueLoginButton();

        String firstProductName = "IPhone";

        new SearchFieldHeaderBL()
                .inputProduct(firstProductName)
                .confirmSearch();

        int id1 = 0;
        new ProductSearchPageBL()
                .clickProductButtons(id1);

        new ProductPageBL()
                .compareThisProduct();

       // Assert.assertTrue(new ProductPageBL().getAlertButton().contains("Success: "));

        String secondProductName = "Mac";

        new SearchFieldHeaderBL()
                .inputProduct(secondProductName)
                .confirmSearch();

        int id2 = 0;
        new ProductSearchPageBL()
                .clickProductButtons(id2);
        new ProductPageBL()
                .compareThisProduct();

       // Assert.assertTrue(new ProductPageBL().getAlertButton().contains("Success: "));

       // String thirdProductName = "Mac";

        new SearchFieldHeaderBL()
                .inputProduct(secondProductName)
                .confirmSearch();
        int id3 = 1;
        new ProductSearchPageBL()
                .clickProductButtons(id3);
        new ProductPageBL()
                .compareThisProduct();

        new SearchFieldHeaderBL()
                .inputProduct(secondProductName)
                .confirmSearch();
        int id4 = 2;
        new ProductSearchPageBL()
                .clickProductButtons(id4);
        new ProductPageBL()
                .compareThisProduct();

        Assert.assertTrue(new ProductPageBL().getAlertButton().contains("Success: "));

        new ProductPageBL()
                .goToComparePage();


        // Select s = new Select(driver.findElement(By.xpath("//div[@id='content']//table//tbody//tr//td//a[contains(@href,'product/product')]")));
        //List <WebElement> list = s.getOptions();
        // new ComparePageBL()
          //      .productName(3);

    }
}
