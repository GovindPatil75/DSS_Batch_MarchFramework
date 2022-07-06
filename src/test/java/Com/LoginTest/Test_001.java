package Com.LoginTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Com.PageObject.LoginPom;
import Com.Utility.BaseClass;
import Com.Utility.Library;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_001 extends BaseClass{
	
	@Test
	public void verifyLoginpage() {
				
		// identify webelement
		LoginPom login=PageFactory.initElements(driver, LoginPom.class);
		       
		// Action
		Library.custom_SendKeys(login.gettxt_email(),excel.getStringData("Sheet1", 0, 0),"Email");
		Library.custom_SendKeys(login.gettxt_password(), excel.getStringData("Sheet1", 0, 1),"Password");
				
	}
}
