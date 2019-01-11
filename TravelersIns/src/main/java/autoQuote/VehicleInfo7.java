package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VehicleInfo7 {

    @FindBy(id="continue")
    public WebElement contbuttonfornext;


    public void vehicleInfo7 (){
        contbuttonfornext.click();
    }
}
