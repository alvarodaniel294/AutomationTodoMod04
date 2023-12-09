package task.tasking;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TodoMainUI;

public class TodoCreateAccount {

    public static void as(WebDriver webDriver, String userName, String email, String password) {
        Click.on(webDriver, TodoMainUI.singUpButton);
        WaitUntilElement.isVisible(webDriver, TodoMainUI.create);
        Enter.text(webDriver, TodoMainUI.nameField, userName);
        Enter.text(webDriver, TodoMainUI.email, email);
        Enter.text(webDriver, TodoMainUI.password, password);
        Click.on(webDriver, TodoMainUI.checkBox);
        Click.on(webDriver, TodoMainUI.create);
    }
}
