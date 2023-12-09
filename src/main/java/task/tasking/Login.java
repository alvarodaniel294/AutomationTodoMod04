package task.tasking;

import Helpers.helper.ScreenShotHelper;
import actions.Click;
import actions.Enter;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import ui.FormAuthentication;
import ui.HomePageUI;

public class Login {

    public static void as(WebDriver webDriver, String username, String password){
        Click.on(webDriver, HomePageUI.basicAuth);
        Enter.text(webDriver, FormAuthentication.userName, username);
        Enter.text(webDriver, FormAuthentication.password, password);
        Click.on(webDriver, FormAuthentication.login);
        ScreenShotHelper.takeScreenShotAndAdToHTMLReport(webDriver, Status.INFO, "Login");

    }
}
