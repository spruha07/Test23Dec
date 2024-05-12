package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class LoginOrSignUpPage 
{
	
	
	
//variable-private->WebElemnt------------1 step
	
	@FindBy(xpath=("//input[@name='email']"))
	private WebElement username;
	
	
	
	
	@FindBy(xpath=("//input[@name='pass']"))
	private WebElement password;
	
	
	
	
	@FindBy(xpath=("//button[@name='login']"))
	private WebElement loginButton;
	
	
    @FindBy(xpath=("//a[text()='Forgotten password?']"))
     private WebElement forgetpasswordlink;
//	
	
	
	@FindBy(xpath=("//a[text()='Create new account']"))
	private WebElement createnewAccButton;
	
	
	
	//constructor -public-> webelement initialise------2 step
	
	public LoginOrSignUpPage(WebDriver driver1)         //driver1=driver=new chromedriver
	{
		PageFactory.initElements(driver1, this);
		
	}
	
	
	//methods-public=>Action on WebElement---------3 step
	public void sendUserName(String userid)
	{
		username.sendKeys(userid);
	}
	
	
	public void sendPassword(String userpassword)
	{
		password.sendKeys(userpassword);
	}
	
	
	public void clickonLoginBUtton()
	{
		loginButton.click();
	}
	
	
	public void forgetpasslink()
	{
	
		forgetpasswordlink.click();
     }
	
	
	public void clickoncreateNewAccButton()
	{
		createnewAccButton.click();
		
		
	}
	
	
	


}
