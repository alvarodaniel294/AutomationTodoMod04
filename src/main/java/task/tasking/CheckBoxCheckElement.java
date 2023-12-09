package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.CheckBoxesUI;
import ui.HomePageUI;

public class CheckBoxCheckElement {

    public static void as(WebDriver webDriver) {
        Click.on(webDriver, HomePageUI.checkBoxes);
        Click.on(webDriver, CheckBoxesUI.checkBox1);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Check Element");
    }
}
