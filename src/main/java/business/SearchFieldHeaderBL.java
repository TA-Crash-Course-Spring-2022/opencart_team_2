package business;

import com.opencart.team2.ui.pages.SearchFieldHeader;
import org.openqa.selenium.WebDriver;

public class SearchFieldHeaderBL {
    private SearchFieldHeader searchFieldHeader;

    public SearchFieldHeaderBL (WebDriver driver) {
            searchFieldHeader = new SearchFieldHeader(driver);
        }

    public SearchFieldHeaderBL inputProduct (String productName) {
            searchFieldHeader.getSearchLine().clear();
            searchFieldHeader.getSearchLine().sendKeys(productName);
            return this;
        }

        public void confirmSearch () {
            searchFieldHeader.getEnter().click();
        }

}
