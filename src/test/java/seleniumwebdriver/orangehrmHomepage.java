package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class orangehrmHomepage {
    WebDriver driver;
    public orangehrmHomepage(WebDriver driver){
        this.driver=driver;
    }

    By dashboard = By.xpath("//h6[text()='Dashboard']");
    By admin = By.xpath("//span[text()='Admin']");
    AdminPage admin(){

        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        wait.until(ExpectedConditions.elementToBeClickable(admin)).click();
 //       driver.findElement(admin).click();
        return new AdminPage(driver);
    }
     String adminPageDisplayed(){
          return driver.getCurrentUrl();
     }
}
