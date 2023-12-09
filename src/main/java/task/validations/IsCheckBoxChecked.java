package task.validations;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import ui.CheckBoxesUI;

public class IsCheckBoxChecked {

    public static boolean isFirstCheckBoxChecked(WebDriver webDriver) {
        WebElement webElement = webDriver.findElement(CheckBoxesUI.checkBox1);
        return webElement.isSelected();
    }

    public static boolean isSecondCheckBoxChecked(WebDriver webDriver) {
        WebElement webElement = webDriver.findElement(CheckBoxesUI.checkBox2);
        return webElement.isSelected();
    }
}
