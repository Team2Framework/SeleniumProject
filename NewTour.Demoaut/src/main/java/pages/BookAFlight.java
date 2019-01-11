package pages;

import base.CommonAPI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class BookAFlight extends CommonAPI {
    @FindBy(how = How.CSS, using = "#passFirst0")
    public static WebElement firstName;

    @FindBy(how = How.CSS, using = "#passLast0")
    public static WebElement lastName;

    @FindBy(how = How.CSS, using = "#creditnumber")
    public static WebElement ccNumber;

    @FindBy(how = How.CSS, using = "#buyFlights")
    public static WebElement submit;

    public BookAFlight(WebDriver driver) { // Create Constructor for related to BookTicketTests Class
        PageFactory.initElements(driver, this);
    }

    public void flightBooking(String fName, String lName, String credCardNum) {// We using Parameter for method
        firstName.sendKeys(fName);
        lastName.sendKeys(lName);
        ccNumber.sendKeys(credCardNum);
        submit.click();
    }
}
