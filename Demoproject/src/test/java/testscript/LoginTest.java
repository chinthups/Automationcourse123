package testscript;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import DemoPackage.TestngBase;
import Pages.LoginPage;
import utilities.ExelUtility;

public class LoginTest extends TestngBase {
	
	@Test(priority=1,description="verifying whether the user is able tosuccessfully login with valid credentials")
	public void verifyuserloginwithvalidcredentials() throws IOException
	{
	String 	username=ExelUtility.readStringData(0, 0, "Loginpage");
	String password =ExelUtility.readStringData(0, 1, "Loginpage");
	LoginPage login=new LoginPage(driver);
	login.enterUsernameOnUserNameField(username);
	login.enterPasswordOnPasswordField(password);
	login.clickONLoginButon();
		
	}
	@Test(priority=2)
	public void verifyuserloginwithinvalidusername() throws IOException
	{
		String 	username=ExelUtility.readStringData(1, 0, "Loginpage");
		String password =ExelUtility.readStringData(1, 1, "Loginpage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickONLoginButon();
	}
	@Test(priority=3)
	public void verifyuserloginwithinvalidpassword() throws IOException
	{
		String 	username=ExelUtility.readStringData(2, 0, "Loginpage");
		String password =ExelUtility.readStringData(2, 1, "Loginpage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickONLoginButon();
		String actual=login.getpagetitle();
		String expected="Swag Labs";
		Assert.assertEquals(actual, expected,"User was able to Login with Invalid Username");
			
	}
	@Test(priority=4)
	public void verifyuserloginwithinvalidpasswordandusername() throws IOException
	{
		String 	username=ExelUtility.readStringData(3, 0, "Loginpage");
		String password =ExelUtility.readStringData(3, 1, "Loginpage");
		LoginPage login=new LoginPage(driver);
		login.enterUsernameOnUserNameField(username);
		login.enterPasswordOnPasswordField(password);
		login.clickONLoginButon();
	}

}
