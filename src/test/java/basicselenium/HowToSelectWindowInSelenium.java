package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 9/9/2017.
 */
public class HowToSelectWindowInSelenium {
    WebDriver driver;
    @Test
    public void test01() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver","C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("https://www.hdfcbank.com/htdocs/common/onlineservices/netbankingloginsafe_nri.htm");
        driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div[1]/ul/li[1]/a")).click();

        Set<String> windowsId = driver.getWindowHandles();
        Iterator<String> itr = windowsId.iterator();
        String parentWindow = itr.next();
        String childWindow = itr.next();


        driver.switchTo().window(childWindow);
        driver.findElement(By.xpath(".//*[@id='netbanking']")).click();
        Thread.sleep(10000);
        driver.close();

        driver.switchTo().window(parentWindow);
        driver.findElement(By.xpath(".//*[@id='element1']/div[4]/a/img")).click();

        System.out.println(parentWindow);
        System.out.println(childWindow);

    }
}
