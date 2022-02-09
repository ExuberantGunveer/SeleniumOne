package Pages;

import TestBase.Base;
import Utils.TestUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.time.Duration;

public class HomePage extends Base {

    @FindBy(id = "menu_admin_viewAdminModule")
    WebElement Admin;
    @FindBy(id = "menu_pim_viewPimModule")
    WebElement PIM;
    @FindBy(id = "menu_leave_viewLeaveModule")
    WebElement Leave;
    @FindBy(id = "menu_time_viewTimeModule")
    WebElement Time;
    @FindBy(id = "menu_recruitment_viewRecruitmentModule")
    WebElement Recruitment;
    @FindBy(id = "menu_pim_viewMyDetails")
    WebElement Myinfo;
    @FindBy(id = "menu__Performance")
    WebElement Performance;
    @FindBy(id = "menu_dashboard_index")
    WebElement Dashboard;
    @FindBy(id = "menu_directory_viewDirectory")
    WebElement Directory;
    @FindBy(id = "menu_maintenance_purgeEmployee")
    WebElement Maintenance;
    @FindBy(id = "menu_buzz_viewBuzz")
    WebElement Buzz;
    @FindBy(partialLinkText = "Welcome")
    WebElement WelcomeButton;
    @FindBy(partialLinkText = "Logout")
    WebElement LogoutButton ;
    public HomePage()
    {
        PageFactory.initElements(driver,this);
    }

    public void verifyAdminLink()
    {
        Admin.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyPIMLink()
    {
        PIM.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyLeaveLink()
    {
        Leave.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyTimeLink()
    {
        Time.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyRecruitmentLink()
    {
        Recruitment.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyMyInfoLink ()
    {
        Myinfo.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyPerformanceLink()
    {
        Performance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void VerifyDashboardLink()
    {
        Dashboard.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyDirectoryLink()
    {
        Directory.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyMaintenanceLink()
    {
        Maintenance.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void VerifyBuzzLink ()
    {
        Buzz.click();
        driver.navigate().back();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(TestUtils.Page_Load_Time));
    }
    public void verifyLogoutButton()
    {
        WelcomeButton.click();
        LogoutButton.click();
    }


}
