package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.BrowserWindowsPage;
import pages.NestedFremesPage;

public class NestedFremesTest extends BaseLibrary {
	
	NestedFremesPage ob;
	
	@BeforeTest
	public void launchurl()
	{
		launchUrl();
		ob = new NestedFremesPage();
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
	public void clickOnNestedFrameTest()
	{
		ob.clickOnNestedFrame();
	}
	
	@Test(priority = 5)
	public void printParentTest()
	{
		ob.printParent();
	}
	
	
	

}
