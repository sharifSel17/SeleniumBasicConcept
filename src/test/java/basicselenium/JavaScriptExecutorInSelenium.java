package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.awt.*;

/**
 * Created by Sharif on 9/24/2017.
 */
public class JavaScriptExecutorInSelenium {
    WebDriver driver;

    @BeforeClass
    public void setup() throws Exception{

        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://blackrockdigital.github.io/startbootstrap-sb-admin-2/pages/forms.html");
        Thread.sleep(1000);
    }
    @Test
    public void javaScriptExecutor(){
        JavascriptExecutor   exe = (JavascriptExecutor)driver;
        exe.executeScript("arguments[0].value=\"testSelenium\"",driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[2]/div/div/div[2]/div/div[1]/form/div[1]/input")));
        exe.executeScript("arguments[0].click();",driver.findElement(By.xpath(".//*[@id='page-wrapper']/div[2]/div/div/div[2]/div/div[1]/form/div[4]/input")));
        exe.executeScript("document.getElementById(\"inputSuccess\").value=\"test\"");
        exe.executeScript("document.getElementById(\"inputWarning\").value=\"testWarning\"");

    }

}
