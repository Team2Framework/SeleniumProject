package autoQuote;

import base.CommonAPI;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class VehicleInfo6 extends CommonAPI {

    @FindBy(name = "radRegistered")
    public WebElement radRegistered;

    @FindBy(name = "vehLeasedCd")
    public WebElement vehLeasedCd;

    @FindBy(css = "#lowerQuestions > div:nth-child(5) > div > div > div.col-xs-12.col-sm-6.radioToggle > div > fieldset > label.btn.btn-default.yesNoBtn.noBtn.purchasedInLast90Days > div")
    public WebElement carPurchaseDate;

    @FindBy(name = "vehicleUseCd")
    public WebElement vehicleUseCd;

    @FindBy(id="continue")
    public WebElement nextpageclick;

    @FindBy(name = "milesCommuteOneWay")
    public WebElement milesCommuteOneWay;

    @FindBy(id = "numOfDaysPerWeekCommute")
    public WebElement numOfDaysPerWeekCommute;



    public void vehicleInfo5 (){
        Select drpDown = new Select(radRegistered);
        drpDown.selectByIndex(1);
        Select drpDown1 = new Select(vehLeasedCd);
        drpDown1.selectByIndex(1);
        carPurchaseDate.click();
        Select drpDown2 = new Select(vehicleUseCd);
        drpDown2.selectByIndex(2);
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait .until(ExpectedConditions.visibilityOfElementLocated(By.name("name=\"milesCommuteOneWay\"")));


        milesCommuteOneWay.sendKeys("2");
        Select drpDown4 = new Select(numOfDaysPerWeekCommute);
        drpDown4.selectByIndex(5);


        nextpageclick.click();





    }

}
