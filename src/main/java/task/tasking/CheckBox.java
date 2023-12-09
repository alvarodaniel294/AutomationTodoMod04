package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.CheckBoxesUI;
import ui.HomePageUI;

public class CheckBox {

    public static void as(WebDriver webDriver) {
        Click.on(webDriver, HomePageUI.checkBoxes);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Check Default");
    }
}
