package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class forgetpassword 
{

	@FindBy(xpath=("//a[text()='Forgotten password?']"))
	private WebElement link;
	
	@FindBy(xpath=("//table//tr//div[@class='_9nq2 marginBottom16px']"))           //private variable 
	private WebElement message;
	
	
	@FindBy(xpath=("//input[@type='text']"))
	private WebElement emailorphonebutton;
	
	
	@FindBy(xpath=("(//a[@role='button'])[1]"))
	private WebElement cancelButton;
	

	@FindBy(xpath=("//button[@type='submit']"))
	private WebElement searchButton;
	
	
	
	
	public forgetpassword(WebDriver driver1)         //constructor
	{
		PageFactory.initElements(driver1, this);
		
	}
	
	
	public void selectLink()
	{
		link.click();
	}
	//methods define
	public String getMessage()
	{
		return message.getText();
	}
	
	public void sendmailorphoneNo(String userid)
	{
		emailorphonebutton.sendKeys(userid);
	}
	
     public void clickoncancelButton()
	{
		cancelButton.click();
	}
	
  public void clickonsearchButton()
	{
	
		searchButton.click();
		
	}
	
	
	
	
}
	
	
