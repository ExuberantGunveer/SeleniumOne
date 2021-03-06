package Assignment;

import com.TestUtils.utils;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;

public class NewJa {

    static WebDriver driver ;
    @BeforeMethod
    public void launchBrowser() throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        Thread.sleep(5000);
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        driver.manage().deleteAllCookies();
        driver.get("https://opensource-demo.orangehrmlive.com/");
    }

    @DataProvider
    public Iterator<Object[]> getTestData(){
        ArrayList<Object[]> testData = utils.getDataExcel();
        return testData.iterator();
    }

    @Test(dataProvider = "getTestData")
    public void Login(String username , String password ){

        driver.findElement(By.id("txtUsername")).clear();
        driver.findElement(By.id("txtUsername")).sendKeys(username);

        driver.findElement(By.id("txtPassword")).clear();
        driver.findElement(By.id("txtPassword")).sendKeys(password);

        driver.findElement(By.id("btnLogin")).click();




    }

}
