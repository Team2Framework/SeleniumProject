package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleInfo5 {

    @FindBy(css = "#vehicleSummary > div.row > div:nth-child(1) > div")
    public WebElement pickYourCar;


    public void vehicleInfo5(){
        pickYourCar.click();
    }
}
