package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PersonalInfo3 {

    @FindBy(name = "firstName")
    public WebElement firstName;

    @FindBy(name = "lastName")
    public WebElement lastName;

    @FindBy(name = "streetAddr1")
    public WebElement streetAddr1;

    @FindBy(css = "#innerContent > div.aboutYou1 > div:nth-child(6) > div > div > div > div > fieldset > label.btn.btn-default.yesNoBtn.active > div")
    public WebElement maillingAddress;

    @FindBy(css = "#innerContent > div.aboutYou1 > div:nth-child(8) > div > div > div > div > fieldset > label.btn.btn-default.yesNoBtn.noBtnWithMarginForGender.active > div")
    public WebElement haveumovedlastsixmonths;

    @FindBy(css = "#innerContent > div.aboutYou1 > div:nth-child(10) > div > div > div > div > fieldset > label:nth-child(2) > div")
    public WebElement gender;

    @FindBy(id = "dobMonth")
    public WebElement dobMonth;

    @FindBy(id = "dobDay")
    public WebElement dobDay;

    @FindBy(id = "dobYear")
    public WebElement dobYear;

    @FindBy(id = "continue")
    public WebElement continueButton;


    public void personalInfo (){
        firstName.sendKeys("Victoria");
        lastName.sendKeys("Arda");
        streetAddr1.sendKeys("636 Center St");
        maillingAddress.click();
        haveumovedlastsixmonths.click();
        gender.click();
        dobMonth.sendKeys("10");
        dobDay.sendKeys("05");
        dobYear.sendKeys("1985");
        continueButton.click();



    }

}
