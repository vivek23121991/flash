package LoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import com.demoaut.locators.LoginElements;

public class LoginTestCase implements LoginElements {
	WebDriver driver;
	@Test
	public void login()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Vivek\\Appium Installer\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		
		System.out.println("Testcase started");
		System.out.println(driver.getTitle());
		
				
		driver.findElement(username).sendKeys("tutorial2");
		driver.findElement(password).sendKeys("tutorial2");
		driver.findElement(loginbutton).click();
		
		System.out.println(driver.getTitle());
		driver.close();
		
		System.out.println("Testcase ended");
		
		
	}

}
