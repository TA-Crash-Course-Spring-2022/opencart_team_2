package business;

import com.opencart.team2.ui.pages.AdminAddClassesPage;
import org.openqa.selenium.WebDriver;

public class AdminAddClassesBL {
   private AdminAddClassesPage adminAddClassesPage;

   public AdminAddClassesBL(WebDriver driver) { adminAddClassesPage = new AdminAddClassesPage(driver);}

    public void saveAdd() {
       adminAddClassesPage.getSaveAdd().click();
    }

    public void cancelAdd(){ adminAddClassesPage.getCancel().click();}

    public AdminAddClassesBL inputClassTitle (String title) {
       adminAddClassesPage.getInputTitle().clear();
       adminAddClassesPage.getInputTitle().sendKeys(title);
       return this;
    }

    public AdminAddClassesBL inputDescription (String description) {
       adminAddClassesPage.getInputDescription().clear();
       adminAddClassesPage.getInputDescription().sendKeys(description);
       return this;
    }

    public AdminAddClassesBL selectTaxRate (String value) {
       adminAddClassesPage.getTaxRate().selectByValue(value);
       return this;
    }

    public String getTaxRate() {
       return adminAddClassesPage.getTaxRate().getFirstSelectedOption().getText();
    }

    public AdminAddClassesBL selectBaseOn (String value) {
       adminAddClassesPage.getTaxBasedOn().selectByValue(value);
       return this;
    }

    public String getTax_BaseOn() {
       return adminAddClassesPage.getTaxBasedOn().getFirstSelectedOption().getText();
    }

    public AdminAddClassesBL inputPriority (String priority) {
       adminAddClassesPage.getTaxRateInputPriority().clear();
       adminAddClassesPage.getTaxRateInputPriority().sendKeys(priority);
       return this;
    }

    public void addButton() {
       adminAddClassesPage.getAddRateTaxRates().click();
    }

    public  void removeButton() {
       adminAddClassesPage.getRemoveRateTaxRates().click();
    }
}



