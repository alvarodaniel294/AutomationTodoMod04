import base.BaseTodoTest;
import org.testng.annotations.Test;
import task.tasking.AutomationModulo04;
import task.tasking.TodoCreateAccount;
import ui.TodoLoggedInUI;

public class TodoCrateAccountTest extends BaseTodoTest {

    @Test
    public void createAccount() {
        AutomationModulo04.as(webDriver, "asdfsdf", "testalvaro00007@mail.com", "passwordalvaro00007", "newProject", "new Todo");
    }
}
