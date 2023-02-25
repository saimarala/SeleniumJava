package seleniumwebdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;

import java.time.Duration;

public class Base {
    public  WebDriver driver;
    public WebDriverWait wait ;

    @BeforeClass
   void  config(){
      // wait =new WebDriverWait(driver, Duration.ofSeconds(20));
    }
}
