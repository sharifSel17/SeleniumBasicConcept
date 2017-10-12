package basicselenium;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Sharif on 10/9/2017.
 */
public class ZoomInZoomOut {
    WebDriver driver;

    @BeforeClass
    public void howToVarifyFiltering(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }
    @Test
    public void test() throws Exception{
        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='30%'");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("document.body.style.zoom='100%'");
    }
}
