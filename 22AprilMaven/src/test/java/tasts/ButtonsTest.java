package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.ButtonsPage;

public class ButtonsTest extends BaseLibrary {
	ButtonsPage ob;
	
	@BeforeTest
	public void launchurlTesta()
	{
		launchUrl();
		ob = new ButtonsPage();
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
	public void clickOnButtonsTest()
	{
		ob.clickOnButtons();
	}
	
	@Test(priority = 5)
	public void clickOndoubleClickTest()
	{
		ob.clickOndoubleClick();
	}
	
	@Test(priority = 6)
	public void clickOnrightClickTest()
	{
		ob.clickOnrightClick();
	}
	
	@Test(priority = 7)
	public void clickOnclickMeTest()
	{
		ob.clickOnclickMe();
	}
	
	@Test(priority = 8)
	public void validateDetailsTest()
	{
		ob.validateDetails();
	}
	
	

}
