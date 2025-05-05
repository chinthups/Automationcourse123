package seleniumBasics;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class AlertHandling extends Base{
	
	public void verifyAlertHandling()
	{
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement simpleclick=driver.findElement(By.id("alertButton"));
		simpleclick.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
	}
	public void Verifyconfirmalert()
	{  
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement confirmalert=driver.findElement(By.id("confirmButton"));
		confirmalert.click();
		Alert alert=driver.switchTo().alert();
		alert.accept();	
	}
	public void verifyPromptalert() {
		driver.navigate().to("https://demoqa.com/alerts");
		WebElement promptalert=driver.findElement(By.id("promtButton"));
		promptalert.click();
		Alert alert=driver.switchTo().alert();
		alert.sendKeys("Saranya");
	    alert.accept();	
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AlertHandling handling=new AlertHandling();
		handling.initialiseBrowser();
		//handling.verifyAlertHandling();
		handling.verifyPromptalert();
		//handling.driverCloseandQuit();
	}

}
