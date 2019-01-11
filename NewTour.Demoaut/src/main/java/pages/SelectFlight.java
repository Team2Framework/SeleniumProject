package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class SelectFlight extends CommonAPI {
    @FindBy(how = How.CSS, using = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(9) > tbody > tr:nth-child(7) > td.frame_action_xrows > input[type=\"radio\"]")
    public static WebElement departFlight;

    @FindBy(how = How.CSS, using = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table:nth-child(10) > tbody > tr:nth-child(5) > td.frame_action_xrows > input[type=\"radio\"]")
    public static WebElement returnFlight;

    @FindBy(how = How.CSS, using = "#reserveFlights")
    public static WebElement submit;


    public SelectFlight(WebDriver driver) { // Create Constructor for related with BookTicketTests Class
        PageFactory.initElements(driver, this); // where we initiate constructor

    }

    public void flightSelection(WebDriver driver) { // method for using the actions
        departFlight.click();
        returnFlight.click();
        submit.click();
    }

}
