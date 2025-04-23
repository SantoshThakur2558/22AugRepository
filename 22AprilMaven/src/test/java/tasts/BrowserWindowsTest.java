package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.BrowserWindowsPage;

public class BrowserWindowsTest extends BaseLibrary {
	
	BrowserWindowsPage ob;
	
	@BeforeTest
	public void launchurl()
	{
		launchUrl();
		ob = new BrowserWindowsPage();
	}
	
	@Test(priority = 1)
	public void clickonCloseTest()
	{
		ob.clickOnClose();
	}
	
	@Test(priority = 2)
	public void clickonPracticeTest()
	{
		ob.clickonPractice();
	}
	
	@Test(priority = 3)
	public void clickonAllertWindowTest()
	{
		ob.clickonAllertWindow();
	}
	
	@Test(priority = 4)
	public void clickOnBrowserWindowTest()
	{
		ob.clickOnBrowserWindow();
	}
	
	@Test(priority = 5)
	public void clickOnNewTabTest() throws Throwable
	{
		ob.clickOnNewTab();
	}
	
	//@Test(priority = 6)
	public void clickOnNewWindow()
	{
		ob.clickOnNewWindow();
	}
	
	//@Test(priority = 7)
	public void newWindowMassage()
	{
		ob.newWindowMassage();
	}
	
	

}
