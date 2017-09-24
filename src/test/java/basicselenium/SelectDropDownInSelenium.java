package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * Created by Sharif on 9/9/2017.
 */
public class SelectDropDownInSelenium {

    public WebDriver driver;
    @Test
    public void  test01(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//seleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.facebook.com/");

        Select select = new Select(driver.findElement(By.xpath(".//*[@id='month']")));
        select.selectByVisibleText("Jan");

        select = new Select(driver.findElement(By.xpath(".//*[@id='day']")));
        select.selectByIndex(3);

        select = new Select(driver.findElement(By.xpath(".//*[@id='year']")));
        select.selectByVisibleText("2014");
    }
}
