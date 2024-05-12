package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class createNewAcct 
{
	
	@FindBy(xpath=("//a[text()='Create new account']"))
	private WebElement createnewAccButton;
	
	@FindBy(xpath=("//input[@name='firstname']"))
	private WebElement fname;
	
	@FindBy(xpath=("//input[@name='lastname']"))
	private WebElement lname;
	
	@FindBy(xpath=("(//input[@type='radio'])[1]"))
	private WebElement Male;
	
	@FindBy(xpath=("(//input[@type='radio'])[2]"))
	private WebElement Female;
	
	@FindBy(xpath=("(//input[@type='radio'])[3]"))
	private WebElement Custom;
	
     @FindBy(xpath=("//select[@name='preferred_pronoun']"))
     private WebElement Pronoun;
     
     public createNewAcct(WebDriver driver1)
     {
    	 PageFactory.initElements(driver1, this);
     }
     
     public void ClickOnCreateButton()
     {
    	 createnewAccButton.click();
     }
     public void SelectNames(String user1,String user2)
     {
    	 
    	 fname.sendKeys(user1);
    	 lname.sendKeys(user2);
    	 
     }
     public void PronounSelected() 
     {
    	 boolean result1=Pronoun.isDisplayed();
 		System.out.println(result1);
 		
 		
 		if(result1==true)
 		{
 			System.out.println("Element is displayed");
 		}
 			
 		else
 		{
 			System.out.println("Element hide");
 			Custom.click();
 		}
 		
 		System.out.println("=======================");
 		result1=Pronoun.isDisplayed();
 		System.out.println(result1);
 		
}
}
