package sample;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.createNewAcct;

public class TestClass_createnewacct {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		 WebDriver driver=new ChromeDriver();
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
			
			driver.get("https://www.facebook.com/");
			//driver.manage().window().maximize();
		
			createNewAcct createnewacct=new createNewAcct(driver);
			
			createnewacct.ClickOnCreateButton();
			createnewacct.SelectNames("Priyanka","Spruha");
			
			createnewacct.PronounSelected();
			
	}

}
