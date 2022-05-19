package com.opencart.team2.ui;

import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AddFourPWishLTest extends TestRunner {

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

        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.button-group > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(3) > div > div.button-group > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(4) > div > div.button-group > button:nth-child(2)")).click();
    }
}
