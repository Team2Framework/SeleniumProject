package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrentInsInfo10 {

    @FindBy(id="continue")
    public WebElement contbutton;


    public void currentInsInfo10(){
        contbutton.click();
    }
}
