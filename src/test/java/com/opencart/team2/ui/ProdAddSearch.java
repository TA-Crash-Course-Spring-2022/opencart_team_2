package com.opencart.team2.ui;

import business.ProductPageBL;
import business.SearchFieldHeaderBL;
import org.testng.annotations.Test;

public class ProdAddSearch extends TestRunner {

    @Test
    public void Test() {
        driver.get("https://demo.opencart.com");

        String productName = "Iphone";
        SearchFieldHeaderBL searchFieldHeaderBL = new SearchFieldHeaderBL(driver);
        searchFieldHeaderBL.inputProduct(productName);

        searchFieldHeaderBL.confirmSearch();

        ProductPageBL productPageBL = new ProductPageBL(driver);
        productPageBL.addToCartOnSearch();

    }
}
