package TestCases;

import TestBase.Base;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class HomepageTest extends Base {

    public HomepageTest(){
        super();
    }

    @BeforeMethod
        public void setUp() {

            initialization();
            obj.getLoginPage().login();
                }

    @Test(priority = 0)
    public void verifyAdminLinkTest(){
        obj.getHomepage().verifyAdminLink();
    }
    @Test(priority = 1)
    public void verifyPIMLinkTest(){
        obj.getHomepage().verifyPIMLink();
    }
    @Test(priority = 2)
    public void verifyLeaveLinkTest() {
        obj.getHomepage().verifyLeaveLink();
    }
    @Test(priority = 3)
    public void verifyTimeLinkTest(){
        obj.getHomepage().verifyTimeLink();
    }
    @Test(priority = 4)
    public void verifyRecruitmentLinkTest(){
        obj.getHomepage().verifyRecruitmentLink();
    }
    @Test(priority = 5)
    public void verifyMyInfoLinkTest() {
        obj.getHomepage().verifyMyInfoLink();
    }

    @Test(priority = 6)
    public void verifyPerformanceLinkTest() {
        obj.getHomepage().verifyPerformanceLink();
    }

    @Test(priority = 7)
    public void VerifyDashboardLinkTest(){
        obj.getHomepage().VerifyDashboardLink();
    }
    @Test(priority = 8)
    public void verifyDirectoryLinkTest(){
        obj.getHomepage().verifyDirectoryLink();
    }
    @Test(priority = 9)
    public void verifyMaintenanceLinkTest(){
        obj.getHomepage().verifyMaintenanceLink();
    }


    @Test(priority = 10)
    public void VerifyBuzzLinkTest() {
        obj.getHomepage().VerifyBuzzLink();
    }


}
