package com.opencart.team2.ui;


import com.opencart.team2.ui.business.AdminLoginPgBL;
import com.opencart.team2.ui.business.AdminEditAccInfoBL;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChangeAllAccInfoTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToAdminMainPage();

        String usernameAdmin = "admin";
        String passwordAdmin = "admin";
        AdminLoginPgBL adminLoginPgBL = new AdminLoginPgBL();
        adminLoginPgBL.UsernameField(usernameAdmin);
        adminLoginPgBL.PasswordField(passwordAdmin);
        adminLoginPgBL.LoginButton();

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/ul/li[1]/a")).click();

        String username = "NewAdmin";
        String firstname = "Petro";
        String lastname = "Petrik";
        String email = "NewAdmin@gmail.com";
        String newPassword = "newadmin";
        String confirmMessage = "newConfirm";

        AdminEditAccInfoBL editAccInfoBL = new AdminEditAccInfoBL();
        editAccInfoBL.UsernameField(username);
        editAccInfoBL.FirstNameField(firstname);
        editAccInfoBL.LastNameField(lastname);
        editAccInfoBL.EmailField(email);
        editAccInfoBL.PasswordField(newPassword);
        editAccInfoBL.ConfirmField(confirmMessage);
        editAccInfoBL.SaveButton();
    }
}
