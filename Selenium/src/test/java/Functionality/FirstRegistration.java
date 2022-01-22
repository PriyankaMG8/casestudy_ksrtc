package Functionality;

import java.io.File;
import java.io.IOException;


import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import ObjectRepository.Elements;

public class FirstRegistration {
	

	@Test
	
	public void Reg() throws IOException   {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Admin\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	    WebDriver d1;
		d1=new ChromeDriver();
	    d1.get("https://ksrtc.in/oprs-web/user/add.do");
	    Elements.username(d1).sendKeys("priyanka.gite@yahoo.com");
	    Elements.fullname(d1).sendKeys("Priyanka M Gite");
	    	    Elements.mobile(d1).sendKeys("8087474268");
	    Elements.savebutton(d1).click();
	    
	    TakesScreenshot tk3=(TakesScreenshot) d1;
		File Source1=tk3.getScreenshotAs(OutputType.FILE);
		File destination1=new File("C:\\\\Screenshot\\\\Booking2.jpg");
		FileHandler.copy(Source1, destination1);
	  
		
}
}

