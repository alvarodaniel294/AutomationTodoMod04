import base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;
import task.tasking.CheckBox;
import task.tasking.CheckBoxCheckElement;
import task.tasking.CheckBoxUncheckElement;
import task.validations.IsCheckBoxChecked;

public class CheckBoxTest extends BaseTest {


    @Test
    public void defaultValuesTest() {
        CheckBox.as(webDriver);
        Assert.assertFalse(IsCheckBoxChecked.isFirstCheckBoxChecked(webDriver));
        Assert.assertTrue(IsCheckBoxChecked.isSecondCheckBoxChecked(webDriver));
    }

    @Test
    public void uncheckElementTest() {
        CheckBoxUncheckElement.as(webDriver);
        Assert.assertFalse(IsCheckBoxChecked.isSecondCheckBoxChecked(webDriver));
    }

    @Test
    public void checkElementTest() {
        CheckBoxCheckElement.as(webDriver);
        Assert.assertTrue(IsCheckBoxChecked.isFirstCheckBoxChecked(webDriver));
    }
}
