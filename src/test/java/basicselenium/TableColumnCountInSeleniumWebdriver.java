package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 9/24/2017.
 */
public class TableColumnCountInSeleniumWebdriver {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("file:///E:/Documents/Selenium%20Basics%20by%20bhanu/tableColumnCount.html");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        int size = driver.findElements(By.xpath("html/body/table/tbody/tr")).size();

        for (int i=2; i<=size;i++){
            String firstPart = "html/body/table/tbody/tr[";
            String secondPart = "]/td[2]";
            System.out.println(firstPart+i+secondPart);
            String text = driver.findElement(By.xpath(firstPart+i+secondPart)).getText();
            System.out.println(text);
        }
    }

    @AfterClass
    public void endClass(){
        // driver.close();
    }
}
