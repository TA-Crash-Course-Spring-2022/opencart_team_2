package business;

import com.opencart.team2.ui.pages.WishListPage;
import org.openqa.selenium.WebDriver;

public class WishListPageBL {
    private WishListPage wishListPage;

    public WishListPageBL(WebDriver driver) {
        wishListPage = new WishListPage(driver);
    }

    public void productName(int id) {wishListPage.getProductName(id).click();}

    public void addToCardButton(int id) {wishListPage.getProductAddToCard(id).click();}

    public void removeButton(int id) {wishListPage.getProductRemove(id).click();}

    public void continueButton() {wishListPage.getContinue().click();}
}
