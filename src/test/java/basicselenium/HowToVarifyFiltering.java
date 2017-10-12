package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.sql.Driver;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Sharif on 10/4/2017.
 */
public class HowToVarifyFiltering {
    WebDriver driver;

    @BeforeClass
    public void howToVarifyFiltering(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.olx.in/bangalore/");

    }
    @Test
    public void test() throws Exception{
        driver.findElement(By.xpath(".//*[@id='cityField']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='choosecat']/span[2]")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@class='abs categorySelectContainer']/ul/li[3]/a[@id='a-category-5']")).click();
        driver.findElement(By.xpath(".//*[@id='search-text']")).sendKeys("Swift");
        Thread.sleep(3000);
        driver.findElement(By.xpath(".//*[@id='withshowboxTable']/tbody/tr/td[3]/span/span")).click();
        Thread.sleep(9000);
        List<WebElement> allData = driver.findElements(By.xpath("//*[@id='offers_table']/tbody/tr/td/table/tbody/tr/td[2]/h3/a/span"));

       Iterator<WebElement> itr= allData.iterator();
        while(itr.hasNext()){
           String data = itr.next().getText();
           System.out.println(data);
//           if(data.toLowerCase().contains("swift")){
//
//           }else{
//               Assert.assertTrue(false,data);
//           }

       }

    }
}
