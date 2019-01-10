import base.SignIn;
import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class SignInTest extends SignIn {

    @Test
    public void test1 (){
        SignIn();

    }

    public void openLululemon() throws InterruptedException{
        driver.navigate().to("https://shop.lululemon.com/");
        Thread.sleep(1000);

    }


    @Test
    public void testSearch()throws InterruptedException{
        driver.findElement(By.id("search-icon"));
        Thread.sleep(1000);
    }
    @Test
    public void testing ()throws InterruptedException{
        driver.findElement(By.cssSelector("type=\"text\"")).sendKeys("Yoga Mat");
        Thread.sleep(1500);

    }

}




}
