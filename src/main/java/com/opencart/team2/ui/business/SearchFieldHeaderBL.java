package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.SearchFieldHeader;

public class SearchFieldHeaderBL {
    private SearchFieldHeader searchFieldHeader;

    public SearchFieldHeaderBL () {
            searchFieldHeader = new SearchFieldHeader();
        }

    public SearchFieldHeaderBL inputProduct (String productName) {
            searchFieldHeader.getSearchLine().clear();
            searchFieldHeader.getSearchLine().sendKeys(productName);
            return this;
        }

        public ProductSearchPageBL confirmSearch () {
            searchFieldHeader.getEnter().click();
            return new ProductSearchPageBL();
        }

}
