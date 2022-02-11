package PageFactory;

import Pages.HomePage;

import Pages.LoginPage;

public class ObjectFactory {

    private LoginPage loginPage;
    private HomePage homepage;

    public LoginPage getLoginPage(){

        if(loginPage==null){
            loginPage = new LoginPage();
        }
        return  loginPage;
    }

    public HomePage getHomepage(){

        if(homepage == null){
            homepage = new HomePage();
        }
        return homepage;
    }


}
