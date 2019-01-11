package autoQuote;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class DriverInfo8 {

    @FindBy(id="maritalStatusCd")
    public WebElement maritalStatusCd;

    @FindBy (name="residenceTypeCd")
    public WebElement residenceTypeCd;

    @FindBy(css = "#innerContent > div.driverDetails > div:nth-child(14) > div > div > div > div.btn-group > fieldset > label:nth-child(2) > div")
    public WebElement douhavechildren;

    @FindBy(css = "#driverCourseXyears > div > div.btn-group > fieldset > label:nth-child(2) > div")
    public WebElement defensivedrvcourse;

    @FindBy (id="continue")
    public WebElement contnextpage;


    public void driverInfo8(){
        Select drpDown5 = new Select(maritalStatusCd);
        drpDown5.selectByIndex(1);

        Select drpDown6 = new Select(residenceTypeCd);
        drpDown6.selectByIndex(4);

        douhavechildren.click();
        defensivedrvcourse.click();
        contnextpage.click();
    }



}
