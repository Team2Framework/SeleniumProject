package autoQuote;

import base.CommonAPI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class EnterZipCode1 extends CommonAPI {
    @FindBy(name = "zipCode")
    public WebElement zipCode;


    @FindBy(id = "button-get-quote")
    public WebElement startQuoteButton;

//    Public EnterZipCode1(WebDriver driver){
//        PageFactory.initElements(driver,this);
//    }

// Entering the zip code and clicking the button
    public void enterZipCode(){
        zipCode.sendKeys("07072");
        startQuoteButton.click();
    }


}

