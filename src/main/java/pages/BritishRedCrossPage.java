package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BritishRedCrossPage {
	
	private String createAccountDetails = "//input[@id='%s']";
	
	private String menuTabs = "//li[@class='nav-bar__item']//a[contains(text(),'%s')]";
	
	
	@FindBy(xpath = "//img[@title='British Red Cross']")
	WebElement redCrossLink ;
	
	@FindBy(xpath="//a[@class='header__action-item-link hidden-pocket hidden-lap']")
	WebElement myAccountTab;
	
	@FindBy(xpath="//form[@id='header_customer_login']//following-sibling::div[@class='popover__secondary-action']//button[@class='link link--accented']")
	WebElement createAccountLink;
	
	@FindBy(xpath="//button[contains(text(),'Create my account')]")
	WebElement createMyAccountTab ;
	
	
	
	

}
