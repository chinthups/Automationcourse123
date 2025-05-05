package seleniumBasics;

public class FileUpload extends Base{
	public void verifyFileUploadusingsendkeys()
	{
		driver.navigate().to("https://demo.guru99.com/test/upload/"); 
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      FileUpload file=new FileUpload();
      file.initialiseBrowser();
      file.verifyFileUploadusingsendkeys();
      file.driverCloseandQuit();
	}

}
