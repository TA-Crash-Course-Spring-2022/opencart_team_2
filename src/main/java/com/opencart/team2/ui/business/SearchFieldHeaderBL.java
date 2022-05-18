package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.SearchFieldHeaderPG;

public class SearchFieldHeaderBL {
    private SearchFieldHeaderPG searchFieldHeaderPG;

    public SearchFieldHeaderBL () {
            searchFieldHeaderPG = new SearchFieldHeaderPG();
        }

    public SearchFieldHeaderBL inputProduct (String productName) {
            searchFieldHeaderPG.getSearchLine().clear();
            searchFieldHeaderPG.getSearchLine().sendKeys(productName);
            return this;
        }

        public ProductSearchPageBL confirmSearch () {
            searchFieldHeader.getEnter().click();
            return new ProductSearchPageBL();
        }

}
