package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 9/9/2017.
 */
public class verifyCollapsedAndExpandedObjectInSelenium {
   WebDriver driver;
   @Test
   public void test01() throws InterruptedException{
       System.setProperty("webdriver.chrome.driver","C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.get("https://www.hdfcbank.com/htdocs/nri_banking/payments/BillPay/BillPay.htm");
       String style = driver.findElement(By.xpath(".//*[@id='nre_savings_acc']/ul/li[2]/h3")).getCssValue("background-image");
       System.out.println("Before clicking"+ style);

       if(style.contains("bg_collapsed_panel")){
           Assert.assertTrue(true,style);
       }else{
           Assert.assertTrue(false,style);
       }

       driver.findElement(By.xpath(".//*[@id='nre_savings_acc']/ul/li[2]/h3")).click();
       Thread.sleep(9000);

       style = driver.findElement(By.xpath(".//*[@id='nre_savings_acc']/ul/li[2]/h3")).getCssValue("background-image");
       System.out.println("After clicking"+ style);

       if(style.contains("bg_expanded_panel")){
           Assert.assertTrue(true,style);
       }else{
           Assert.assertTrue(false,style);
       }
   }

}
