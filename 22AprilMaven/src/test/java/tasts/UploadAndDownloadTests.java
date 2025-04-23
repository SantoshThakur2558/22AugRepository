package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ButtonsPage;
import pages.UploadAndDownloadPage;

public class UploadAndDownloadTests extends BaseLibrary {
	
	UploadAndDownloadPage ob;
	
	@BeforeTest
	public void launchurlTesta()
	{
		launchUrl();
		ob = new UploadAndDownloadPage();
	}
	
	
	@Test(priority = 1)
	public void clickOnCloseTest() throws InterruptedException
	{
		ob.clickOnClose();
	}
	
	@Test(priority = 2)
	public void clickonPracticeTest()
	{
		ob.clickonPractice();
	}
	
	@Test(priority = 3)
	public void clickOnElementsTest()
	{
		ob.clickOnElements();
	}
	
	@Test(priority = 4)
	public void clickonuploadDownloadTest()
	{
		ob.clickonuploadDownload();
	}
	
	@Test(priority = 5)
	public void clickonchoosFileTest()
	{
		ob.clickonchoosFile();
	}
	
	

}
