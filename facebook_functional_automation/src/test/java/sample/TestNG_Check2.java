package sample;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import base.Base;
import pom.LoginOrSignUpPage;
import pom.forgetpassword;

public class TestNG_Check2 {

		private WebDriver driver;
		private LoginOrSignUpPage loginOrSignUpPage;
		private forgetpassword forgetPass;
		
		
		
		
		//to pass the data from testNG suite to test class methods
	    
		@Parameters ("browser")
		
	    @BeforeTest
		public void launchBrowser(String browserName)
		
		{
			System.out.println("Before Test");
			System.out.println(browserName);

			if(browserName.equals("Chrome"))
			  {
				driver=Base.openChromeBrowser();
				//driver=openChromeBrowser();
				
				 
				  
			  }
			  if(browserName.equals("Firefox"))
			  {
				  driver=Base.openFirefoxBrowser();
					//driver=openFirefoxBrowser();
					
				  
			  }
			  if(browserName.equals("Edge"))
			  {
				  driver=Base.openEdgeBrowser();
					//driver=openEdgeBrowser();
				  
			  }
			  driver.manage().window().maximize();
			  
			
		}
		
		@BeforeClass
		public void beforeClass() 
		{
			System.out.println("Before Class");
		    // driver=new ChromeDriver();
		    //driver.manage().window().maximize();
		}
		
	     @BeforeMethod
		public void launchForgetPasswordPage() 
	     {
	    	 
	    	 System.out.println("Before method");
	    	 driver.get("https://www.facebook.com/");
	    	 LoginOrSignUpPage loginOrSignUpPage=new LoginOrSignUpPage(driver);
	    //	 loginOrSignUpPage.sendUserName("priyankamuttur@gmail.com");
	    	// loginOrSignUpPage.sendPassword("priyanka27");
	    	 
	    	 loginOrSignUpPage.forgetpasslink();
	    	 
	    	 
	     }
	     @Test
	     public void VerifyPasswordChangedSuccussfully() throws InterruptedException
	     {
	    	 
	         System.out.println("Test 1");
	         
	    	 forgetpassword forgetPass=new forgetpassword(driver);
	    	// forgetPass.selectLink();
	    	 
	    	 String msg=forgetPass.getMessage();
	         if(msg.equals("Please enter your email address or mobile number to search for your account."))
	          {
				   System.out.println("Pass");
	          }
			   else
			   {
				   System.out.println("Fail");
		
			   }
	         forgetPass.sendmailorphoneNo("priyankamuttur@gmail.com");
	         
	         forgetPass.clickonsearchButton();
	         
	     }
	    
	     @Test
	     public void verifyErrormsgOnclickonCancel()
	     {
	    	 System.out.println("Test 1");
	    	 forgetpassword forgetPass=new forgetpassword(driver);
	    	 //forgetPass.selectLink();
	    	 forgetPass.sendmailorphoneNo("priyankamuttur@gmail.com");
	    	 
	    	 //forgetPass.sendmailorphon[''2200000eNo("dbsjfhueifdbsd");
	    	 
	    	 forgetPass.clickoncancelButton(); 
	    	 
	     } 
	     @AfterMethod
	     public void captureScreenShot()
	     {
	    	 System.out.println("after method");
	    	 System.out.println("Take the screen shot of failed test");
	    	  
	     }
	     
	     @AfterClass
	     public void afterClass()
	     {
	    	 System.out.println("After class");
	     }
	     
	     
	     
	     @AfterTest
	     public void closedBrowser()
	     {
	    	 System.out.println("After Class");
	    	 driver.close();
	     }
	    
	     
	}

	    
	    

