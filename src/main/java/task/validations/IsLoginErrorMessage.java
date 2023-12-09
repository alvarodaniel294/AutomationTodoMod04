package task.validations;

import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.FormAuthentication;

public class IsLoginErrorMessage {

    public static Boolean visible(WebDriver webDriver) {
        return WaitUntilElement.isVisible(webDriver, FormAuthentication.alertError);

    }

    public static String getTextError(WebDriver webDriver) {
        WebElement element = webDriver.findElement(FormAuthentication.alertError);
        return element.getText();
    }
}
