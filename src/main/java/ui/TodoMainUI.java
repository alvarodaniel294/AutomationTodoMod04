package ui;

import org.openqa.selenium.By;

public class TodoMainUI {

    public static By singUpButton = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[3]/a/img");
    public static By nameField = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxFullName\"]");
    public static By email = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxEmail\"]");
    public static By password = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_TextBoxPassword\"]");
    public static By checkBox = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_CheckBoxTerms\"]");
    public static By create = By.xpath("//*[@id=\"ctl00_MainContent_SignupControl1_ButtonSignup\"]");


//    public static By loginButton = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img");
    public static By loginButton = By.xpath("//*[@id=\"ctl00_MainContent_PanelNotAuth\"]/div[2]/div[1]/div[2]/a/img");


    public static By loginName = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxEmail\"]");
    public static By loginPassword = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_TextBoxPassword\"]");
//    public static By loginInButton = By.id("ctl00_MainContent_LoginControl1_ButtonLogin");
    public static By loginInButton = By.xpath("//*[@id=\"ctl00_MainContent_LoginControl1_ButtonLogin\"]");


}
