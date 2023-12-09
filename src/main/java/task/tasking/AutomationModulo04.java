package task.tasking;

import actions.Click;
import actions.Enter;
import actions.WaitUntilElement;
import org.openqa.selenium.WebDriver;
import ui.TodoLoggedInUI;
import ui.TodoMainUI;

public class AutomationModulo04 {

    public static void as(WebDriver webDriver,
                          String userName,
                          String email,
                          String password,
                          String projectTitle,
                          String todoTitle) {
        //create account
        Click.on(webDriver, TodoMainUI.singUpButton);
        WaitUntilElement.isVisible(webDriver, TodoMainUI.create);
        Enter.text(webDriver, TodoMainUI.nameField, userName);
        Enter.text(webDriver, TodoMainUI.email, email);
        Enter.text(webDriver, TodoMainUI.password, password);
        Click.on(webDriver, TodoMainUI.checkBox);
        Click.on(webDriver, TodoMainUI.create);
        //logout
        WaitUntilElement.isVisible(webDriver, TodoLoggedInUI.logoutButton);
        Click.on(webDriver, TodoLoggedInUI.logoutButton);
        WaitUntilElement.isVisible(webDriver, TodoMainUI.singUpButton);

        //login
        Click.on(webDriver, TodoMainUI.loginButton);
        WaitUntilElement.isVisible(webDriver, TodoMainUI.loginInButton);
        Enter.text(webDriver, TodoMainUI.loginName, email);
        Enter.text(webDriver, TodoMainUI.loginPassword, password);
        Click.on(webDriver, TodoMainUI.loginInButton);
        WaitUntilElement.isVisible(webDriver, TodoLoggedInUI.logoutButton);


        //create project
        Click.on(webDriver, TodoLoggedInUI.createProjectButton);
        Enter.text(webDriver, TodoLoggedInUI.projectTitleField, projectTitle);
        Click.on(webDriver, TodoLoggedInUI.createProjectButton);
        WaitUntilElement.isVisible(webDriver, TodoLoggedInUI.projectTitle);

        //create todo

        Enter.text(webDriver, TodoLoggedInUI.todoField, "new todo");
        Click.on(webDriver, TodoLoggedInUI.addTodoButton);


    }
}
