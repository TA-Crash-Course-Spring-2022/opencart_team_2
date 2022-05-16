package com.opencart.team2.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ComparePrByPg extends TestRunner {

    @Test
    public void Test() {
        driver.get("https://demo.opencart.com");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
        WebElement EmailAddressField = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        EmailAddressField.sendKeys("tester132q@gmail.com");
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        PasswordField.sendKeys("test");
        PasswordField.sendKeys(Keys.ENTER);
        driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a")).click();
        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div[1]/button[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"product-product\"]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[2]/div[1]/h4/a")).click();
        driver.findElement(By.xpath("//*[@id=\"content\"]/div[1]/div[2]/div[1]/button[2]")).click();
        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-product\"]/div[1]"))).click();
    }
}
