package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

/**
 * Created by Sharif on 9/9/2017.
 */
public class CountNumberOfLinksInSeleniumInGivenPage {
    WebDriver driver;
    @Test
    public void test01(){
        System.setProperty("webdriver.chrome.driver","C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://www.facebook.com/");
        List<WebElement> totalLinks = driver.findElements(By.xpath("//a"));
        Assert.assertEquals(totalLinks.size(),51);
    }
}
