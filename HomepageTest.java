package TestCases;

import BaseTest.Base;
import Pages.*;
import org.checkerframework.checker.units.qual.C;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.IOException;

public class HomepageTest extends Base {

    LoginPage loginpage ;
    Homepage homepage;
    Contacts contact ;
    Company company;
    Deals deals;

    public HomepageTest(){
        super();
    }

    @BeforeMethod
    public void setUp() throws IOException {

        initialization();

        loginpage = new LoginPage();

        homepage = loginpage.login();
        contact = new Contacts();
        company = new Company();
        deals = new Deals();
    }

    @Test(priority=1)
    public void verifyHomepageTitleTest(){
        String homepageTitle  = homepage.verifyHomepageTitle();
        Assert.assertEquals(homepageTitle,"Cogmento CRM");
    }
    @Test(priority=2)
    public void userNameTitleTest(){

        Assert.assertTrue(homepage.verifyUserNameTitle());
    }

    @Test(priority=3)
    public void verifyContactLinkTest(){
        contact = homepage.clickOnContactLink();

    }

    @Test(priority=4)
    public void verifyCompanyLinkTest(){
        company = homepage.clickOnCompanyLink();

    }
    @Test(priority=1)
    public void verifyDealsLinkTest(){
        deals = homepage.clickOnDealsLink();

    }


}
