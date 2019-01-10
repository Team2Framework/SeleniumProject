package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SignIn extends CommonAPI{






    @FindBy(how = How.CSS, using = "Email Address")
    public static WebElement users;


    @FindBy(how = How.CSS, using = "Password")
    public static WebElement Pw;

    @FindBy(how = How.CSS, using = "SignIn")
    public static WebElement submit;

    // public SignIn(WebDriver driver) {
    //   pageFactory.initElements(driver, page this );


    //   }

    public void applicationSignIn() {
        users.sendKeys("doladaoud710@gmail.com");
        users.sendKeys("abcd12343");
        submit.click();
    }


}


