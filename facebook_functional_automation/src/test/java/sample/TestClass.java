package sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.LoginOrSignUpPage;
import pom.forgetpassword;

public class TestClass {

	public static void main(String args[])
	{
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		
		//1. object created fro pom class
		//2.  declarations of non static property(constructor)
		//3. webelement and methods
		//4. constructor(initialize of webelements)
		
		
		LoginOrSignUpPage login=new LoginOrSignUpPage(driver);
		
		login.sendUserName("priyankamuttur@gmail.com");
		login.sendPassword("priyanka27");
		login.clickonLoginBUtton();
		login.forgetpasslink();
		
		System.out.println("hi its work");
		
    
		   
		   
		   
		   
		   
		   
	}
	
	
	
}
