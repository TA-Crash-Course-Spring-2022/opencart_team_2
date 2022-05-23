package com.opencart.team2.ui.business;

import com.opencart.team2.ui.driver.Driver;
import com.opencart.team2.ui.pages.SearchFieldHeaderPG;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class SearchFieldHeaderBL {
    private SearchFieldHeaderPG searchFieldHeaderPG;

    public SearchFieldHeaderBL () {
            searchFieldHeaderPG = new SearchFieldHeaderPG();
        }

    public SearchFieldHeaderBL inputProduct (String productName) {
        new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search']/input")));
        searchFieldHeaderPG.getSearchLine().clear();
            searchFieldHeaderPG.getSearchLine().sendKeys(productName);
            return this;
        }

        public ProductSearchPageBL confirmSearch () {
            new WebDriverWait(Driver.DRIVERS.get(), Duration.ofSeconds(5)).until(ExpectedConditions.elementToBeClickable(By.xpath("//*[@id='search']/span/button")));
            searchFieldHeaderPG.getEnter().click();
            return new ProductSearchPageBL();
        }

}
