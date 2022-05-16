package com.opencart.team2.ui;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class ChangeEmailTest extends TestRunner{

    @Test(description = "change email")
    public void changeEmail() {
        driver.get("http://localhost/opencart/upload/index.php");
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/account')]")).click();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/login')]")).click();

        String inputLogin= "1@gmail.com";
        driver.findElement(By.id("input-email")).sendKeys(inputLogin);
        String inputPassword= "1111";
        driver.findElement(By.id("input-password")).sendKeys(inputPassword);

        driver.findElement(By.xpath("//input[contains(@value, 'Login')]")).click();


        driver.findElement(By.xpath("//div[@class='row']//a[contains(@href, 'account/edit')]")).click();

        String newEmail= "zxc@gmail.com";
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys(newEmail);
        driver.findElement(By.xpath("//div[@class='buttons clearfix']//input[@value='Continue']")).click();

        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/account')]")).click();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/logout')]")).click();

        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/account')]")).click();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/login')]")).click();


        driver.findElement(By.id("input-email")).sendKeys(newEmail);
        driver.findElement(By.id("input-password")).sendKeys(inputPassword);
        driver.findElement(By.xpath("//input[contains(@value, 'Login')]")).click();

        driver.findElement(By.xpath("//div[@class='row']//a[contains(@href, 'account/edit')]")).click();

        String oldEmail= "1@gmail.com";
        driver.findElement(By.id("input-email")).clear();
        driver.findElement(By.id("input-email")).sendKeys(oldEmail);
        driver.findElement(By.xpath("//div[@class='buttons clearfix']//input[@value='Continue']")).click();
    }
}
