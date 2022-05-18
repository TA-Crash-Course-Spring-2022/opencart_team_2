package com.opencart.team2.ui;

import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.testng.annotations.Test;

public class SearchForProductTest extends TestRunner {

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

        //Login
        /*driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
        WebElement EmailAddressField = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        EmailAddressField.sendKeys("tester132q@gmail.com");
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        PasswordField.sendKeys("test");
        PasswordField.sendKeys(Keys.ENTER);*/

        String productName = "Iphone";
        SearchFieldHeaderBL searchFieldHeaderBL = new SearchFieldHeaderBL();
        searchFieldHeaderBL.inputProduct(productName);

        searchFieldHeaderBL.confirmSearch();

    }
}
