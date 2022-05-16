package com.opencart.team2.ui;

import com.opencart.team2.ui.business.ChangePasswordBL;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChangePassword  extends TestRunner {

    @Test
    public void changePasswordNegativeCase() {
        driver.get("http://localhost/opencart/upload/index.php?route=common/home");
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/account')]")).click();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/login')]")).click();

        String inputLogin = "1@gmail.com";
        driver.findElement(By.id("input-email")).sendKeys(inputLogin);
        String oldPass = "1111";
        driver.findElement(By.id("input-password")).sendKeys(oldPass);

        driver.findElement(By.xpath("//input[contains(@value, 'Login')]")).click();


        driver.findElement(By.xpath("//div[@class='row']//a[contains(@href, 'account/password')]")).click();


        new ChangePasswordBL().inputPassword("abcd")
                .inputPasswordConfirm("zxyv")
                .clickContinueButton();

        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/account')]")).click();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/logout')]")).click();

        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/account')]")).click();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/login')]")).click();


        driver.findElement(By.id("input-email")).sendKeys(inputLogin);
        driver.findElement(By.id("input-password")).sendKeys(oldPass);

        driver.findElement(By.xpath("//input[contains(@value, 'Login')]")).click();
    }
}
