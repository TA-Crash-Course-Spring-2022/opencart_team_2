package com.opencart.team2.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class FirstNameChange extends TestRunner {

    @Test
    public void Test () {
        driver.get("http://localhost/opencart/upload/admin/index.php?route=common/login");
        WebElement UsernameField = driver.findElement(By.xpath("//*[@id='input-username']"));
        UsernameField.clear();
        UsernameField.sendKeys("Admin");
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        PasswordField.clear();
        PasswordField.sendKeys("admin");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/div/div/div[2]/form/div[3]/button")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/ul/li[1]/a")).click();
        WebElement FirstNameField = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        FirstNameField.clear();
        FirstNameField.sendKeys("Petro");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();


    }
}
