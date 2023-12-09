package ui;

import org.openqa.selenium.By;

public class TodoLoggedInUI {

    public static By createProjectButton = By.xpath("//*[@id=\"MainTable\"]/tbody/tr/td[1]/div[6]/div");
    public static By projectTitleField = By.id("NewProjNameInput");
    public static By addButton = By.id("NewProjNameButton");
    public static By projectTitle = By.id("CurrentProjectTitle");
    public static By todoField = By.id("NewItemContentInput");

    public static By addTodoButton = By.id("NewItemAddButton");



    //for logout
//    public static By logoutButton = By.xpath("//*[@id=\"ctl00_HeaderTopControl1_LinkButtonLogout\"]");
    public static By logoutButton = By.xpath("//a[@id='ctl00_HeaderTopControl1_LinkButtonLogout']");
//    public static By logoutButton = By.id("ctl00_HeaderTopControl1_LinkButtonLogout");

}
