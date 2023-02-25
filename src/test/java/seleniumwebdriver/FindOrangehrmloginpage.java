package seleniumwebdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class FindOrangehrmloginpage {
    WebDriver driver;
    public FindOrangehrmloginpage(WebDriver driver){
        this.driver=driver;
    }
    @FindBy(name = "username")    WebElement uname;
    @FindBy(name = "password")
    WebElement password;
    @FindBy(xpath = "//button[@type='submit']")
    WebElement  signIn;

    orangehrmHomepage loginApp(String user,String pass){
        WebDriverWait wait =new WebDriverWait(driver, Duration.ofSeconds(20));
        uname.sendKeys(user);
        password.sendKeys(pass);
        signIn.click();
//        driver.findElement(uname).sendKeys(user);
//        driver.findElement(password).sendKeys(pass);
//        driver.findElement(signIn).click();

        return new orangehrmHomepage(driver);
    }
}
