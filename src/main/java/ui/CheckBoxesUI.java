package ui;

import org.openqa.selenium.By;

public class CheckBoxesUI {

    //*[@id="checkboxes"]/text()[2]

    //*[@id="checkboxes"]/text()[1]
    public static String checkboxText1 = "checkbox 1";
    public static String checkboxText2 = "checkbox 2";
    public static By checkBox1 = By.xpath("//form[@id='checkboxes']/input[1]");
    public static By checkBox2 = By.xpath("//form[@id='checkboxes']/input[2]");

    public static By checked = By.xpath("//*[@id=\"checkboxes\"]/*[@checked]");
}
