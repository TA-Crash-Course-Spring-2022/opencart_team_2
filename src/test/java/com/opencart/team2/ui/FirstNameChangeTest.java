package com.opencart.team2.ui;

import com.opencart.team2.ui.business.MyAccountBL;
import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import com.opencart.team2.ui.business.AdminEditAccInfoBL;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class FirstNameChangeTest extends TestRunner {

    @Test
    public void Test () {
        new Navigation().navigateToMainPage();

        String email = "tester132q@gmail.com";
        String userPassword = "test";
        UserLoginPageBL userLoginPageBL = new UserLoginPageBL();
        userLoginPageBL.MyAccountMainButton();
        userLoginPageBL.UserLoginMainButton();
        userLoginPageBL.UserEmailField(email);
        userLoginPageBL.UserPasswordField(userPassword);
        userLoginPageBL.UserLoginButton();

        userLoginPageBL.UserLoginMainButton();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();

        MyAccountBL myAccountBL = new MyAccountBL();
        myAccountBL.editButton();



        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/ul/li[1]/a")).click();

        String firstname = "Petro";
        AdminEditAccInfoBL editAccInfoBL = new AdminEditAccInfoBL();
        editAccInfoBL.FirstNameField(firstname);
    }
}
