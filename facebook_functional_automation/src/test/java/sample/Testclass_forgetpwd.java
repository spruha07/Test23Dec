package sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.forgetpassword;

public class Testclass_forgetpwd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		driver.get("https://www.facebook.com/");
		//driver.manage().window().maximize();
		
		
		forgetpassword forget=new forgetpassword(driver);
		
		          forget.selectLink();
		          
       	        String msg=forget.getMessage();
          if(msg.equals("Please enter your email address or mobile number to search for your account."))
           {
 			   System.out.println("Pass");
           }
		   else
		   {
			   System.out.println("Fail");
	
		   }
          forget.sendmailorphoneNo("priyankamuttur@gmail.com");
          
          forget.clickonsearchButton();
          
//		   System.out.println("hi");
//		   forget.sendmailorphoneNo("9545445071");
//		   forget.clickonsearchButton();
//		   
//		   
		   
	}

}
