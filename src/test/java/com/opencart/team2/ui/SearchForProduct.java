package com.opencart.team2.ui;

import com.opencart.team2.ui.business.SearchFieldHeaderBL;
import org.testng.annotations.Test;

public class SearchForProduct extends TestRunner {

    @Test
    public void Test() {

        driver.get("https://demo.opencart.com");

        String productName = "Iphone";
        SearchFieldHeaderBL searchFieldHeaderBL = new SearchFieldHeaderBL();
        searchFieldHeaderBL.inputProduct(productName);

        searchFieldHeaderBL.confirmSearch();

    }
}
