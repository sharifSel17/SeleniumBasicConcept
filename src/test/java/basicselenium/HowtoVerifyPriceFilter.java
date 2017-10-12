package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 10/11/2017.
 */
public class HowtoVerifyPriceFilter {
    WebDriver driver;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
    }

    @Test
    public void test01() throws InterruptedException {
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.findElement(By.xpath(".//*[@id='block_top_menu']/ul/li[2]/a")).click();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath("//*[contains(text(),'Printed Chiffon Dress')]"))));

        Select select = new Select(driver.findElement(By.xpath(".//*[@id='selectProductSort']")));
        select.selectByVisibleText("Price: Lowest first");

        Thread.sleep(8000);
        List<WebElement> array = driver.findElements(By.xpath(".//*[@id='center_column']/ul/li/div/div[2]/div/span[1]"));
        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        Iterator<WebElement> itr = array.iterator();
        while(itr.hasNext()){
            String list = itr.next().getText();
            System.out.println(list);
            if(list.contains("$")){
                String actualData = list.substring(1);
                System.out.println(actualData);
                double list1 = Double.parseDouble(actualData);
                int productPrice = (int)(list1);
                arrayList.add(productPrice);
            }
        }
        for(int i=0; i<arrayList.size()-1;i++){
            if(arrayList.get(i)<arrayList.get(i+1)){
                System.out.println("obj.get(i):-"+arrayList.get(i));
                System.out.println("obj.get(i):-"+arrayList.get(i+1));
            }
        }
    }

}
