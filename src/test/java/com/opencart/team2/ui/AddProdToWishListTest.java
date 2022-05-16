package com.opencart.team2.ui;

import com.opencart.team2.ui.business.ProductSearchPageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProdToWishListTest extends TestRunner{

    @Test(description = "add product to wish list")
    public void addWishList() {
        driver.get("http://localhost/opencart/upload/index.php");
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/account')]")).click();
        driver.findElement(By.xpath("//div[@class='container']//a[contains(@href, 'account/login')]")).click();

        String inputLogin= "1@gmail.com";
        driver.findElement(By.id("input-email")).sendKeys(inputLogin);
        String inputPassword= "1111";
        driver.findElement(By.id("input-password")).sendKeys(inputPassword);

        driver.findElement(By.xpath("//input[contains(@value, 'Login')]")).click();
        driver.findElement(By.xpath("//div[@id='logo']//a[contains(@href, 'common/home')]")).click();

        new ProductSearchPageBL().clickAddToWishListButton(1);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.id("wishlist-total")));
        driver.findElement(By.id("wishlist-total")).click();
        int elSelected = driver.findElements(By.xpath("//div[@id='content']//tbody//a[contains(@href, 'wishlist&remove=')]")).size();
        Assert.assertEquals(elSelected, 1);
            driver.findElement(By.xpath("//div[@id='content']//tbody//a[contains(@href, 'wishlist&remove=')]")).click();

    }
}
