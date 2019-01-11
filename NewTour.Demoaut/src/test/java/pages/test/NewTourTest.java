package pages.test;

import base.CommonAPI;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;

public class NewTourTest extends CommonAPI {

    @Test


    public void logInProcess() {

        LogIn lg = PageFactory.initElements(driver, LogIn.class);// if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and lg). We need to Create Constructor
        lg.applicationLogin(driver); // we called method in LogIn Class
    }
    public void flightFinderProcess() {
        FlightFinder ff = PageFactory.initElements(driver, FlightFinder.class); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and ff). We need to Create Constructor
        ff.findFlight(driver); // we called method in FlightFinder
    }
    public void selectFlightProcess() {
        SelectFlight sf = PageFactory.initElements(driver, SelectFlight.class); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and sf). We need to Create Constructor
        sf.flightSelection(driver); // we called method in SelectFlight
    }
    public void bookAFlightProcess() {
        BookAFlight bf = PageFactory.initElements(driver, BookAFlight.class); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and bf). We need to Create Constructor
        bf.flightBooking("Zack", "Otumlu", "34562819280"); // We called method in BookAFlight class and enter the values for Parameters method
    }
    public void flightConfirmationProcess() {
        FlightConfirmation fc = PageFactory.initElements(driver, FlightConfirmation.class); // if we Execute it like that, ERROR will Exist, Because now we have 2 objects( driver and fc). We need to Create Constructor
        String expectedMessage = "Your itinerary has been booked!";
        String actualMessage = fc.successMessage.getText();
        Assert.assertEquals(actualMessage, expectedMessage);
    }



}
