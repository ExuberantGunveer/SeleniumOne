package TestCases;

import BaseTest.Base;
import Pages.LoginPage;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends Base {

    LoginPage loginpage ;

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
    }

}
