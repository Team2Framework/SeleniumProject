package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DriverInfo9 {

    @FindBy(id="continue")
    public WebElement clickandgo;


    public void driverInfo9(){
        clickandgo.click();
    }
}
