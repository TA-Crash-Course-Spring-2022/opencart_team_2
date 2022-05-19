package com.opencart.team2.ui;

import com.opencart.team2.ui.business.UserLoginPageBL;
import com.opencart.team2.ui.navigation.Navigation;
import com.opencart.team2.ui.business.ProductPageBL;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;

import java.time.Duration;

public class ComparePrByPgTest extends TestRunner {

    @Test
    public void Test() {
        new Navigation().navigateToMainPage();

        String email = "tester132q@gmail.com";
        String userPassword = "test";
        new UserLoginPageBL()
                .MyAccountMainButton()
                .UserLoginMainButton()
                .UserEmailField(email)
                .UserPasswordField(userPassword);

        new Navigation().navigateToMainPage();

        driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[6]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[1]/div/div[1]/a")).click();

        ProductPageBL productPageBL = new ProductPageBL();
        productPageBL.CompareThisProduct();

        driver.findElement(By.xpath("//*[@id=\"product-product\"]/ul/li[2]/a")).click();

        driver.findElement(By.xpath("//*[@id=\"content\"]/div[2]/div[2]/div/div[1]/a")).click();

        productPageBL.CompareThisProduct();

        Duration duration = Duration.ofSeconds(5);
        WebDriverWait wait = new WebDriverWait(driver,duration);
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id=\"product-product\"]/div[1]"))).click();
    }
}
