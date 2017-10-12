package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Sharif on 10/6/2017.
 */
public class PageScrollingInSelenium {
    WebDriver driver;

    @BeforeClass
    public void howToVarifyFiltering(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/index.php");

    }
    @Test
    public void test() throws Exception{
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("window.scrollTo(0,-document.body.scrollHeight)");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,400)");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("window.scrollBy(0,-400)");
        Thread.sleep(3000);
        ((JavascriptExecutor)driver).executeScript("arguments[0].scrollIntoView(true);",driver.findElement(By.xpath(".//*[@id='homefeatured']/li[1]/div/div[1]/div/a[1]/img")));


    }
}
