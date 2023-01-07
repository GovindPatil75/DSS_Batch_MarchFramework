package HomePageTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_004 {

	public static void main(String[] args) {
		
		// Browser open 
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
		
		// Element identify ---
		driver.findElement(By.xpath("")).sendKeys("Test");
		driver.findElement(By.xpath("")).sendKeys("12345678");
		driver.findElement(By.xpath("")).click();
		
		// Homepage 
		// verify Expected --Actual 
		
		String expected ="Welcome to Homepage";
		String actual=driver.getTitle();
		
		if(expected.equals(actual)) {
			System.out.println("Pass");
		}else {
			System.out.println("Fail");
		}
		
		
      // Browser close
		driver.close();

	}

}
