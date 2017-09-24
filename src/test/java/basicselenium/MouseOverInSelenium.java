package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 9/10/2017.
 */
public class MouseOverInSelenium {
    WebDriver driver;
    @Test
    public void test01(){
        System.setProperty("webdriver.chrome.driver","C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.flipkart.com/");

        WebElement electronics = driver.findElement(By.xpath(".//*[@id='container']/div/header/div[2]/div/ul/li[1]/a/span"));
        Actions action =  new Actions(driver);
        action.moveToElement(electronics).perform();
    }
}
