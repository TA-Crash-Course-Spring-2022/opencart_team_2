package com.opencart.team2.ui.business;

import com.opencart.team2.ui.pages.AdminTaxClassesPg;

public class AdminTaxClassesBL {

    private AdminTaxClassesPg adminTaxClassesPg;

    public AdminTaxClassesBL () {adminTaxClassesPg = new AdminTaxClassesPg(); }

    public void EditButton (int id) {
        adminTaxClassesPg.getEditButton(id).click();
    }

    public void TicksButtons (int id) {
        adminTaxClassesPg.getTicksButtons(id).click();
    }

    public void AddNewButton () {
        adminTaxClassesPg.getAddNewButton().click();
    }

    public void DeleteButton () {
        adminTaxClassesPg.getDeleteButton().click();
    }

    public void MainTickButton () {
        adminTaxClassesPg.getMainTickButton().click();
    }

    public void SortButton () {
        adminTaxClassesPg.getSortButton().click();
    }

}
