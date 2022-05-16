package business;

import com.opencart.team2.ui.pages.EditAccInfo;
import org.openqa.selenium.WebDriver;

public class EditAccInfoBL {

    private EditAccInfo editAccInfo;

    public EditAccInfoBL (WebDriver driver) {
        editAccInfo = new EditAccInfo(driver);
    }

    public  EditAccInfoBL UsernameField (String username) {
        editAccInfo.getUsernameField().clear();
        editAccInfo.getUsernameField().sendKeys(username);
        return this;
    }

    public EditAccInfoBL FirstNameField (String firstname) {
        editAccInfo.getFirstNameField().clear();
        editAccInfo.getFirstNameField().sendKeys(firstname);
        return this;
    }

    public EditAccInfoBL LastNameField (String lastname) {
        editAccInfo.getLastNameField().clear();
        editAccInfo.getLastNameField().sendKeys(lastname);
        return this;
    }

    public EditAccInfoBL EmailField (String email) {
        editAccInfo.getEmailField().clear();
        editAccInfo.getEmailField().sendKeys(email);
        return this;
    }

    public EditAccInfoBL PasswordField (String newPassword) {
        editAccInfo.getPasswordField().clear();
        editAccInfo.getPasswordField().sendKeys(newPassword);
        return this;
    }

    public EditAccInfoBL ConfirmField (String confirmMessage) {
        editAccInfo.getConfirmField().clear();
        editAccInfo.getConfirmField().sendKeys(confirmMessage);
        return this;
    }

    public void SaveButton () {
        editAccInfo.getSaveButton().click();
    }

    public void CancelButton () {
        editAccInfo.getCancelButton().click();
    }

    public void ProfileButton () {
        editAccInfo.getProfileButton().click();
    }

}
