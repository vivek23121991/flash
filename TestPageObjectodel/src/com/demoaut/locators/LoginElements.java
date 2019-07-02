/**
 * 
 */
package com.demoaut.locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

/**
 * @author vivek.nikalje
 *
 */
public interface LoginElements {
	
	By username= By.name("userName");
	By password= By.name("password");
	By loginbutton= By.name("login");
	
	/*WebDriver driver;
	
	
	public LoginElements(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void enterUsername(String user)
	{
		driver.findElement(username).sendKeys(user);
	}
	
	public void enterPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	
	public void clickonloginbutton()
	{
		driver.findElement(loginbutton).click();
	}
*/	

}
