package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Sharif on 10/4/2017.
 */
public class HowToVarifyDisableButton {
    WebDriver driver;

    @BeforeClass
    public void howToVarifyFiltering(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.olx.in/bangalore/cars/q-Swift/");
    }
    @Test
    public void test(){
        String disable = driver.findElement(By.xpath(".//*[@id='param_model']")).getAttribute("class");
        Assert.assertEquals(disable,"param paramSelect disabled");
    }
}
