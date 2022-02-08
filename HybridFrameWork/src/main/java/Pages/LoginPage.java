package Pages;

import BaseTest.Base;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class LoginPage extends Base {

    public static  String path;
    public static  String uname;
    public static String username ;
    public static String pass ;

    @FindBy(name = "email")
    WebElement emailAddress ;

    @FindBy(name = "password")
    WebElement password ;

    @FindBy(xpath = "//div[@class='ui fluid large blue submit button']")
    WebElement loginBtn ;

    @FindBy(xpath = "//a[contains(text(),'Sign Up')]")
    WebElement signUpBtn;

    @FindBy(xpath = "//a[contains(text(),'Forgot your password?')]")
    WebElement forgotPassword;


    public LoginPage(){

        PageFactory.initElements(driver, this);

    }


    public  String validateLoginPageTitle(){
        return driver.getTitle();
    }

    public Homepage login() throws IOException {



        path = System.getProperty("user.dir")+"//src//main//java//TestData//GunveerFile.xlsx";
        FileInputStream prop = null;
        try{
            prop = new FileInputStream(path);
        }catch(FileNotFoundException e){
            e.printStackTrace();
        }catch (IOException e) {
            e.printStackTrace();
        }
        XSSFWorkbook wb = new XSSFWorkbook(prop);
        XSSFSheet sheet = wb.getSheet("Sheet1");

        for(int i = 1 ; i<=sheet.getLastRowNum();i++) {
            username = sheet.getRow(i).getCell(0).getStringCellValue();
            emailAddress.sendKeys(username);
            pass = sheet.getRow(i).getCell(1).getStringCellValue();
            password.sendKeys(pass);
            loginBtn.click();


        }
        return new Homepage();
    }


}
