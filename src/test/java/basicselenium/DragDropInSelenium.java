package basicselenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

/**
 * Created by Sharif on 9/24/2017.
 */
public class DragDropInSelenium {
    WebDriver driver;
    @Test
    public void test01() throws InterruptedException{
        System.setProperty("webdriver.chrome.driver", "C://Users//Sharif//development//SeleniumBasic//drivers//chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.get("http://jqueryui.com/droppable/");
        driver.switchTo().frame(driver.findElement(By.className("demo-frame")));

        WebElement source = driver.findElement(By.xpath(".//*[@id='draggable']"));
        WebElement destination = driver.findElement(By.xpath(".//*[@id='droppable']"));
        Thread.sleep(2000);

        Actions action = new Actions(driver);
        action.dragAndDrop(source,destination).perform();

    }
}
