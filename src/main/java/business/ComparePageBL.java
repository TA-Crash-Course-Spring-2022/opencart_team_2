package business;

import com.opencart.team2.ui.pages.ComparePage;
import org.openqa.selenium.WebDriver;

public class ComparePageBL {
    private ComparePage comparePage;

    public ComparePageBL(WebDriver driver) {
        comparePage = new ComparePage(driver);
    }

    public void productName(int id) {comparePage.getProductName(id).click();}

    public void addProductToCard(int id) {
        comparePage.getProductAddToCard(id).click();
    }

    public void removeProduct(int id) {comparePage.getProductRemove(id).click();
    }
}
