package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.UserLoginPage;
import org.openqa.selenium.Keys;

import static java.lang.System.getProperty;

public class UserLoginPageBL {

    private UserLoginPage userLoginPage;

    public UserLoginPageBL() { userLoginPage = new UserLoginPage(); }

    public UserLoginPageBL MyAccountMainButton () { userLoginPage.getMyAccountMainButton().click(); return this; }

    public UserLoginPageBL UserLoginMainButton () { userLoginPage.getUserLoginMainButton().click(); return this; }

    public UserLoginPageBL UserLoginM (String email, String password){
        userLoginPage.getMyAccountMainButton().click();
        userLoginPage.getUserLoginMainButton().click();
        userLoginPage.getUserEmailField().sendKeys(email);
        userLoginPage.getUserPasswordField().sendKeys(password);
        userLoginPage.getLoginButton().click();
        return this;
    }

    public UserLoginPageBL UserEmailField (String email) {
        userLoginPage.getUserEmailField().clear();
        userLoginPage.getUserEmailField().sendKeys(email);
        return this;
    }

    public UserLoginPageBL UserPasswordField (String userPassword) {
        userLoginPage.getUserPasswordField().clear();
        userLoginPage.getUserPasswordField().sendKeys(userPassword);
        userLoginPage.getUserPasswordField().sendKeys(Keys.ENTER);
        return this;
    }

    public void UserLoginButton () { userLoginPage.getLoginButton().click(); }

}
