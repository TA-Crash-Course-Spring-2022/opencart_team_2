package com.opencart.team2.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import java.time.Duration;

public class ChangeAllAccInfo extends TestRunner {

    @Test
    public void Test() {
        driver.get("http://localhost/opencart/upload/admin/index.php?route=common/login");
        WebElement UsernameLogField = driver.findElement(By.xpath("//*[@id='input-username']"));
        UsernameLogField.clear();
        UsernameLogField.sendKeys("Admin");
        WebElement PasswordLogField = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        PasswordLogField.clear();
        PasswordLogField.sendKeys("admin");
        PasswordLogField.sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"header\"]/div/ul/li[1]/ul/li[1]/a")).click();

        WebElement UsernameField = driver.findElement(By.xpath("//*[@id=\"input-username\"]"));
        UsernameField.clear();
        UsernameField.sendKeys("Admin1");

        WebElement FirstNameField = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
        FirstNameField.clear();
        FirstNameField.sendKeys("Ivan");

        WebElement LastNameField = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
        LastNameField.clear();
        LastNameField.sendKeys("Snow");

        WebElement EmailField = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        EmailField.clear();
        EmailField.sendKeys("admin1@gmail.com");

        driver.findElement(By.xpath("//*[@id=\"thumb-image\"]/img")).click();
        driver.findElement(By.xpath("//*[@id=\"button-image\"]")).click();
        //driver.findElement(By.xpath("//div[@class='modal-body']//div[@class='row']//div[@class='col-sm-3 col-xs-6 text-center']//a[@class='thumbnail']//img[@alt='Photo.jpg']\"")).click();
        //Duration duration = Duration.ofSeconds(10);
        //WebDriverWait wait = new WebDriverWait(driver,duration);
        //wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='modal-body']//div[@class='row']//div[@class='col-sm-3 col-xs-6 text-center']//a[@class='thumbnail']//img[@alt='Photo.jpg']"))).click();



        //driver.findElement(By.xpath("//*[@id=\"filemanager\"]/div/div[2]/div[3]/div/a")).click();

        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        PasswordField.click();
        PasswordField.sendKeys("password");

        WebElement ConfirmField = driver.findElement(By.xpath("//*[@id=\"input-confirm\"]"));
        ConfirmField.click();
        ConfirmField.sendKeys("Confirm");

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div/div/button")).click();
    }
}
