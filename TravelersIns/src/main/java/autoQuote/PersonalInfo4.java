package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInfo4 {

    @FindBy(name = "emailAddress")
    public WebElement emailAddress;

    @FindBy(id="continue")
    public WebElement contbutton;


    public void personalInfo4(){
        emailAddress.sendKeys("ardavictoria22@gmail.com");
        contbutton.click();
    }



}
