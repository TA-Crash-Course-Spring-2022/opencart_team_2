package com.opencart.team2.ui;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class AddFourPWishL extends TestRunner {

    @Test
    public void Test() {
        driver.get("https://demo.opencart.com");
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[2]/a")).click();
        WebElement EmailAddressField = driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
        EmailAddressField.sendKeys("tester132q@gmail.com");
        WebElement PasswordField = driver.findElement(By.xpath("//*[@id=\"input-password\"]"));
        PasswordField.sendKeys("test");
        driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input")).click();
        driver.findElement(By.xpath("//*[@id=\"logo\"]/h1/a")).click();
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(1) > div > div.button-group > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(2) > div > div.button-group > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(3) > div > div.button-group > button:nth-child(2)")).click();
        driver.findElement(By.cssSelector("#content > div.row > div:nth-child(4) > div > div.button-group > button:nth-child(2)")).click();
    }
}
