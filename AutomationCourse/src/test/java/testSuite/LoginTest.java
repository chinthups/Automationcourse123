package testSuite;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import seleniumBasics.TestngBase;

public class LoginTest extends TestngBase{
	
	@Test
	public void verifyuserloginwithvalidcredentials()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement  loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	
	public void verifyuserloginwithinvalidusername()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user1");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce");
		WebElement  loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	@Test
	public void verifyuserloginwithinvalidpassword()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce1");
		WebElement  loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	@Test
	public void verifyuserloginwithinvalidpasswordandusername()
	{
		WebElement usernamefield=driver.findElement(By.id("user-name"));
		usernamefield.sendKeys("standard_user1");
		WebElement passwordfield=driver.findElement(By.id("password"));
		passwordfield.sendKeys("secret_sauce1");
		WebElement  loginbutton=driver.findElement(By.id("login-button"));
		loginbutton.click();
	}
	
}
