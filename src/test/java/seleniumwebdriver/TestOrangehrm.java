package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Duration;

public class TestOrangehrm extends Base{

//    WebDriver driver;
//   public WebDriverWait wait ;
    @Test
    public void validLogin()


    {

        driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        orangehrmloginpage orm=new orangehrmloginpage(driver);

        //home.clickOnLoginButton();

        //LoginPage login=new LoginPage(driver);

        orangehrmHomepage login=orm.loginApp("Admin","admin123");
        
     //   wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//h6[text()='Dashboard']"))).isDisplayed();
        AdminPage adminPage=login.admin();
        Assert.assertTrue(login.adminPageDisplayed().contains("admin"));
        //   wait.until(ExpectedConditions.urlContains("admin"));
        adminPage.usernameDetail("test");







    }
}
