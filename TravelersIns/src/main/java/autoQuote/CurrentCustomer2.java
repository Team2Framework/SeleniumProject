package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CurrentCustomer2 {
    @FindBy (css = "#innerContent > div.welcomeContent > div.welcomeGetStartedBox > div.welcomeGetStartedInner > div.getStartedBoxRadioBox.radioToggle > div > label.btn.btn-default.yesNoBtn.getStartedRadioBoxNo.active > div")
    public WebElement currentCustNo;

    @FindBy(id = "continue")
    public WebElement continueQuoteButton;


    //Are you currently a Travelers customer?

    public void currentCustomer2 (){
        currentCustNo.click();
        continueQuoteButton.click();

    }
}
