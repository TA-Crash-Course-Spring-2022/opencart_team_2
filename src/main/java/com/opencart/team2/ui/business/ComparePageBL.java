package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.ComparePage;

public class ComparePageBL {
    private ComparePage comparePage;

    public ComparePageBL() {
        comparePage = new ComparePage();
    }

    public void productName(int id) {comparePage.getProductName(id).click();}

    public void addProductToCard(int id) {
        comparePage.getProductAddToCard(id).click();
    }

    public void removeProduct(int id) {comparePage.getProductRemove(id).click();
    }
}
