import base.CreateAnAccount;
import org.openqa.selenium.By;

public class CreateAnAccountTest extends CreateAnAccount {
    public void createAnAccount() {
        driver.findElement(By.id("email-signup-account")).sendKeys("DolaDaoud@icloud.com");
        driver.findElement(By.id("new-password")).sendKeys("Dola-1014");
        driver.findElement(By.cssSelector("#signup > div:nth-child(14) > label > span")).click();
        driver.findElement(By.name("/atg/userprofiling/ProfileFormHandler.create")).click();
    }
}


