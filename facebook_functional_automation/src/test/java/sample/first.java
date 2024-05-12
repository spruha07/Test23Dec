package sample;


import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class first {

	public static void main(String[] args) 
	
	{
			// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(0,TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");

		
	}

}
