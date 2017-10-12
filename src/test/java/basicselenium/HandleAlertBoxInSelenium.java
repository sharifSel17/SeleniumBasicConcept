package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 9/24/2017.
 */
public class HandleAlertBoxInSelenium {
    WebDriver driver;

    @BeforeClass
    public void setup(){
       System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
       driver = new ChromeDriver();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("file:///E:/Documents/Selenium%20Basics%20by%20bhanu/alertbox.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath("html/body/button")).click();
        Thread.sleep(2000);
        driver.switchTo().alert().accept();
    }

    @AfterClass
    public void endClass(){
       driver.close();
    }
}
