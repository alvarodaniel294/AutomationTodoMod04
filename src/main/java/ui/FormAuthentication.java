package ui;

import org.openqa.selenium.By;

public class FormAuthentication {

    public static By userName = By.id("username");
    public static By password = By.id("password");
    public static By login = By.xpath("//*[@id=\"login\"]/button");

    public static By logout = By.xpath("//a[.='Logout']");
    public static By alertSuccess = By.xpath("//div[@id='flash']");
    public static By alertError = By.xpath("//div[@id='flash']");
}
