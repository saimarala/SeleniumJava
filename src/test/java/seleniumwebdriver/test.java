package seleniumwebdriver;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.List;
import java.util.stream.Collectors;

public class test {
    @Test
    void test() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));


        By name=By.name("q");
        WebDriverWait  wait =new WebDriverWait(driver,Duration.ofSeconds(20));
                wait.until(ExpectedConditions.elementToBeClickable(name)).sendKeys("testing", Keys.SPACE);
                List<WebElement>ele=wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//div[@role='option']")));
                System.out.println(ele.size());

                driver.quit();


////        List<WebElement> ele = driver.findElements(By.xpath("dd"));
////        ele.stream().map(e->e.getText()).collect(Collectors.toList());
//      //  driver.findElement(By.xpath("")).getDomAttribute("");
//      //  System.getProperty("RP");
////        driver.findElement(By.className("submit-btn")).click();
////        WebElement ele=driver.findElement(By.className("errorMessage"));
////        System.out.println(ele.getCssValue("color"));
////        System.out.println(ele.getCssValue("font-weight"));
////        System.out.println(ele.getDomAttribute("class"));
////        ele.getAriaRole();
////        System.out.println(ele.getDomProperty("class"));
////        driver.findElement(By.id("datepicker")).click();
//
////        driver.findElement(By.name("email1")).sendKeys("ineuron@ineuron.ai");
////        driver.findElement(By.name("password1")).sendKeys("ineuron");
//        driver.findElement(By.xpath("//a[contains(text(),'Signup')]")).click();
////        Thread.sleep(2000);
//        driver.findElement(By.xpath("//button[text()='Sign up']")).isDisplayed();
//        driver.findElement(By.xpath("//input[@type='text']")).sendKeys("SAI Testing");
//        driver.findElement(By.xpath("//input[@type='email']")).sendKeys("test123@gmail.com");
//        driver.findElement(By.xpath("//input[@type='password']")).sendKeys("test1234");
//        driver.findElement(By.xpath("//label[text()='Testing']//preceding::input[@type='checkbox'][1]")).click();
//        driver.findElement(By.xpath("//*[@value='Male']")).click();
//        Select s=new Select(driver.findElement(By.id("state")));
//        s.selectByVisibleText("Andhra Pradesh");
//        driver.findElement(By.xpath("//button[text()='Sign up']")).isEnabled();
//        WebElement signUp=driver.findElement(By.xpath("//button[text()='Sign up']"));
//        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true)",signUp);
//        ((JavascriptExecutor)driver).executeScript("arguments[0].click",signUp);
//       // signUp.click();
        Thread.sleep(3000);
        driver.quit();
    }
}
