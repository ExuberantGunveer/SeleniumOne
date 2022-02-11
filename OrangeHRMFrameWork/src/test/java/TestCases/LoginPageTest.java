package TestCases;

import TestBase.Base;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class LoginPageTest extends Base {

    public LoginPageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() { initialization();}

    @Test(priority = 1)
    public void VerifyLoginPageTitle(){
        String title = obj.getLoginPage().validateLoginPageTitle();
        Assert.assertEquals(title,"OrangeHRM");
    }

    @Test(priority = 2)
    public void setLoginpage() {
        obj.getLoginPage().login();
    }


}
