package day5;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class test {
    @Test
    void t(){
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        

    }
}
