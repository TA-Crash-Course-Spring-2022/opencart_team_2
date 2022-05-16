package com.opencart.team2.ui;

import com.opencart.team2.ui.business.ProductSearchPageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class AddProdToCartTest extends TestRunner{

    @Test(description = "sss")
    public void addCart(){
        driver.get("http://localhost/opencart/upload/index.php");
        new ProductSearchPageBL().clickAddToWishListButton(0);
        new ProductSearchPageBL().clickAddToWishListButton(1);
        new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.elementToBeClickable(By.xpath("//a[@title='Shopping Cart']")));
        driver.findElement(By.xpath("//a[@title='Shopping Cart']")).click();

        int elSelected = driver.findElements(By.xpath("//div[@id='content']//tbody//button[@data-original-title='Remove')]")).size();
        Assert.assertEquals(elSelected, 2);
        driver.findElement(By.xpath("//div[@id='content']//tbody//button[@data-original-title='Remove')]")).click();
    }



}
