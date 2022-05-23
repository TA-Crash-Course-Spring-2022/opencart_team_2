package com.opencart.team2.ui;

import com.opencart.team2.ui.business.*;
import com.opencart.team2.ui.constants.MenuName;
import com.opencart.team2.ui.navigation.Navigation;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

import static com.opencart.team2.ui.constants.MenuName.PHONESPDAs;

public class AddToComparePrByPgTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        new UserLoginPageBL().UserLoginM(provider.getLoginEmail(), provider.getLoginPassword());

        new Navigation().navigateToMainPage();

        new MenuCategoriesBL().clickMenuCategory(PHONESPDAs);
        //new MenuCategoriesBL().clickMenuCategory(MenuName.COMPONENTS).clickMenuOption("Monitors");
        //new MenuCategoriesBL().clickMenuCategory(MenuName.PHONESPDAs);

        //driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();

       driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a")).click();

        new ProductPageBL().clickCompareThisProduct();

        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));

        driver.findElement(By.xpath("//*[@id=\"product-product\"]/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a")).click();

        new ProductPageBL().clickCompareThisProduct();

        Assert.assertTrue(new ProductPageBL().alert().contains("Success: "));

        /*Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("" +
                "//*[@id=\"product-product\"]/div[1]"))).click();*/
    }
}
