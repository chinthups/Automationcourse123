package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public WebDriver driver;
	public LoginPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id="user-name")private WebElement usernamefield;
	@FindBy(id="password")private WebElement passwordfield;
	@FindBy(id="login-button")private WebElement loginbutton;
	@FindBy(xpath="//title[text()='Swag Labs']")private WebElement pagetitle;


	public void enterUsernameOnUserNameField(String username) {
		usernamefield.sendKeys(username);
		
	}

	public void enterPasswordOnPasswordField(String password) {
		passwordfield.sendKeys(password);
	}

	public void clickONLoginButon() {
		loginbutton.click();
	}
	public String getpagetitle()
	   {
		 return  pagetitle.getText();
	   }
}
