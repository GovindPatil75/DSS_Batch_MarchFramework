package Com.Utility;

import org.openqa.selenium.WebElement;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;

public class Library {
	
	public static ExtentTest test;
	
	public static void custom_SendKeys(WebElement element,String text,String fieldname) {
		
		try {
			element.sendKeys(text);
			test.log(Status.PASS, fieldname+" =Value succesfully send ="+text);
			
		}catch(Exception e ) {
			test.log(Status.FAIL, e.getMessage());
			
		}
	}

}
