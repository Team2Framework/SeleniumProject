package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LogIn extends CommonAPI {
    @FindBy(name = "userName")
    public static WebElement user;

    @FindBy(name = "password")
    public static WebElement passw;

    @FindBy(name = "login")
    public static WebElement submit;

//    public LogIn(WebDriver driver) {// We create Constructor and related with BookTicketTests Class
//        PageFactory.initElements(driver, this); // driver >> where we initiate Constructor
//    }

    public void applicationLogin(WebDriver driver) {
        user.sendKeys("mercury");
        passw.sendKeys("mercury");
        submit.click();
    }
}
