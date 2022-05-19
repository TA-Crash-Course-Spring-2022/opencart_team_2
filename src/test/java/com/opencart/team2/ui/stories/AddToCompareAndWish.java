package com.opencart.team2.ui.stories;

import com.opencart.team2.ui.TestRunner;
import com.opencart.team2.ui.business.ProductPageBL;
import org.openqa.selenium.By;
import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.annotations.Test;

public class AddToCompareAndWish extends TestRunner {

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


        new Navigation().navigateToMainPage();

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a")).click();

        new ProductPageBL()
        .CompareThisProduct()
        .addToWishList();

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a")).click();

        new ProductPageBL()
        .CompareThisProduct()
        .addToWishList();

        
    }
}
