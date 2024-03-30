package pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.PageFactoryFinder;

public class LoginPage {
	
	// create the object of webdriver : ldriver and also import the package of webdriver
	WebDriver ldriver;
	
	// Create the constructor (class name and constructor name should be same. eg : Here loginpage is a class )
	
	public LoginPage(WebDriver rDriver) {
	
	ldriver = rDriver;
	
	PageFactory.initElements(rDriver, this);
	
	}
	@FindBy(id = "Email")
	
	WebElement email;
	
	@FindBy(id = "Password")
	WebElement password;
	
	@FindBy(xpath = "//button[normalize-space()='Log in']")
	WebElement LoginBtn;
	
	@FindBy(linkText = "Logout")
	WebElement logout;
	
	// Create Action Method for the above element
	public void enterEmail(String emailAdd)
	{
		email.sendKeys(emailAdd);
	}
	
	public void enterPassword(String pwd)
	{
		password.sendKeys(pwd);
	}
	
	public void clickOnLoginButton()
	{
		
		LoginBtn.click();
	}
	
	
	
	public void clickOnLogoutButton()
	{
		
		logout.click();
	}
	
	

}
