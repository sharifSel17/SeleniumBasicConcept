package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.List;

/**
 * Created by Sharif on 10/6/2017.
 */
public class VerifyDisableAndEnabledObjectInSelenium {
    WebDriver driver;
    @BeforeClass
    public void howToVarifyFiltering(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.olx.in/bangalore/cars/q-Swift/");

    }
    @Test
    public void test() throws Exception{
        driver.findElement(By.xpath(".//*[@class='icon down abs']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath(".//*[@class='small suggestinput bgfff lheight20 br-3 abs subcategories binded']/li[2]/a")).click();



    }
}
