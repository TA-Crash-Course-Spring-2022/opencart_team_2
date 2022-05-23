package utils;

import com.opencart.team2.ui.driver.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DriverUtils {

    private WebDriver driver;

    public DriverUtils() { driver = Driver.DRIVERS.get(); }

    public void clickOnElementJS(WebElement webElement) {
        getJSExecutor().executeScript("arguments[0].click;", webElement);
    }

    private JavascriptExecutor getJSExecutor() { return (JavascriptExecutor) driver; }
}
