package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 10/11/2017.
 */
public class TestBaseLoginListener extends TestBaseListener{

    @Test
    public void testEventListener() throws InterruptedException{
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);


        driver.findElement(By.xpath("//*[@id='email']")).sendKeys("testCode");
        driver.findElement(By.xpath("//*[@id='passwd']")).sendKeys("testpass");
        driver.findElement(By.xpath("//*[@id='SubmitLogin']")).click();
    }
}
