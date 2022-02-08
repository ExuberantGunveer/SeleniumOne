package TestCases;

import BaseTest.Base;
import Pages.Homepage;
import Pages.LoginPage;
import Utils.TestUtil;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;
import java.time.Duration;

public class LoginPageTest extends Base {

    LoginPage loginpage ;
    Homepage homepage;

    public LoginPageTest(){
         super();
    }

    @BeforeMethod
    public void setUp(){
        initialization();
        loginpage = new LoginPage();
    }

    @Test(priority = 1)
    public void VerifyLoginPageTitle(){

        loginpage.validateLoginPageTitle();

    }
    @Test(priority = 2)
    public void setLoginpage() throws IOException {

      loginpage.login();
//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(TestUtil.Explicit_Wait_Time));
//        wait.until(ExpectedConditions.visibilityOfAllElements(loginpage.login()));

    }

}
