package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class FlightFinder extends CommonAPI {
    @FindBy(css = "body > div > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(4) > td > table > tbody > tr > td:nth-child(2) > table > tbody > tr:nth-child(5) > td > form > table > tbody > tr:nth-child(9) > td:nth-child(2) > font > font > input[type=\"radio\"]:nth-child(2)")
    public static WebElement businessClass;

    @FindBy (name ="airline")
    public static WebElement flight;

    @FindBy(name = "findFlights")
    public static WebElement submit;

    public FlightFinder(WebDriver driver) { // We Create the Constructor and Related to BookTicketTests Class
        PageFactory.initElements(driver, this); // Where we initiate Constructor
    }

    public void findFlight(WebDriver driver) { // Method for actions
        businessClass.click();
        Select drpDown = new Select(flight); //We use Select method for DROP DOWN BOX List
        drpDown.selectByIndex(2); // (selectByVisibleText("Unified Airlines") we can use it also.
        submit.click();
    }
}
