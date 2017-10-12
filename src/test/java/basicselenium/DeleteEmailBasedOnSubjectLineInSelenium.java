package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

/**
 * Created by Sharif on 10/6/2017.
 */
public class DeleteEmailBasedOnSubjectLineInSelenium {
    WebDriver driver;
    @BeforeClass
    public void howToVarifyFiltering(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://mg.mail.yahoo.com/d/folders/1");

    }
    @Test
    public void test() throws Exception{
        driver.findElement(By.xpath(".//*[@id='mail-app-component']/div[1]/div/div[2]/div/div/div/div[2]/div[2]/ul[1]/li[3]/a/div[1]/div[1]/button")).click();



    }
}
