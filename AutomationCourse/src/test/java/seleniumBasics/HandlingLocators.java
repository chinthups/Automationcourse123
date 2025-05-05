package seleniumBasics;

import org.openqa.selenium.By;

public class HandlingLocators  extends Base{
	public void verifyLocators() {
		  driver.navigate().to("https://selenium.qabible.in/simple-form-demo.php"); 
		  driver.findElement(By.id("button-one"));
		  driver.findElement(By.id("single-input-field"));
		  driver.findElement(By.className("form-control"));
		  driver.findElement(By.className("btn btn-primary"));
		  driver.findElement(By.tagName("button"));
		  driver.findElement(By.name("viewport"));
		  driver.findElement(By.linkText("Radio Buttons Demo"));
		  driver.findElement(By.partialLinkText("Radio Buttons"));
	      driver.findElement(By.cssSelector("input[id='single-input-field']"));
	      driver.findElement(By.cssSelector("button[id='button-one']"));
	     // /html/body/section/div/div/div[2]/div[1]/div/div[2]/form/button absolute xpath
	      driver.findElement(By.xpath("//button[@id='button-two']"));
	      driver.findElement(By.xpath("//button[text()='Show Message']"));
	      driver.findElement(By.xpath("//button[starts-with(text(),'Show ')]"));
	      driver.findElement(By.xpath("//button[@id='button-one' and @type='button']"));
	      driver.findElements(By.xpath("//button[@id='button-one' or @id='button-one-electronics']"));
	      driver.findElements(By.xpath("//div[contains(text(),'Single Input Field')]//parent::div[@class='card']"));
	      driver.findElements(By.xpath("//div[@class='card']//child::button[@id='button-one']"));
	      driver.findElements(By.xpath("//button[@id='button-one']//following::div[@class='card']"));
	      driver.findElements(By.xpath("//button[@id='button-one']//preceding::div[@class='card']"));
	      driver.findElements(By.xpath("//div[@class='card']//descendant::div"));
	      driver.findElements(By.xpath("//div[@class='card']//ancestor::div"));
		  
		
	   }

	public static void main(String[] args) {
		
		HandlingLocators locator= new HandlingLocators();
		locator.initialiseBrowser();
		locator.verifyLocators();
		locator.driverCloseandQuit();
	}

}
