package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 9/9/2017.
 */
public class HowToVerifyCommonTextInSelenium {
    WebDriver driver;
    @Test
    public void test01(){
      System.setProperty("webdriver.chrome.driver","C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
      driver = new ChromeDriver();


      ArrayList<String> ExpectedResult = new ArrayList<String>();
        ExpectedResult.add("Features & Benefits");
        ExpectedResult.add("Mobile Phone Bills");
        ExpectedResult.add("Electricity and Telephone Bills");
        ExpectedResult.add("Insurance Premium");
        ExpectedResult.add("How to register for BillPay");
        ExpectedResult.add("FAQs");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://www.hdfcbank.com/nri_banking/payments/BillPay/BillPay.htm");
        List<WebElement> listOfText=  driver.findElements(By.xpath("//div[@id='nre_savings_acc']/ul/li"));
        Iterator<WebElement> itr = listOfText.iterator();
        ArrayList<String> ActualArray = new ArrayList<String>();
        while(itr.hasNext()){
            ActualArray.add(itr.next().getText());
        }
        System.out.println(ActualArray);
        System.out.println(ExpectedResult);
        Assert.assertEquals(ActualArray,ExpectedResult);
    }
}
