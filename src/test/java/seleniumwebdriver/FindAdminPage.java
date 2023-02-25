package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindAdminPage {
    WebDriver driver;
    public FindAdminPage(WebDriver driver){
        this.driver=driver;

    }

    By username= By.xpath("//label[text()='Username']//following::input[1]");
     void usernameDetail(String name){
         WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        // driver.findElement(username).sendKeys(name);
         wait.until(ExpectedConditions.elementToBeClickable(username)).sendKeys(name);
     }

}


