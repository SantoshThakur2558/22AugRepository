package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LinksPage;
import pages.RadioButtons;

public class LinksTest extends BaseLibrary {
	
	LinksPage ob;
	
	@BeforeTest()
	public void launchUrlTest()
	{
		launchUrl();
		ob= new LinksPage();
	}
	
	@Test(priority = 1)
	public void clickOnCloseTest()
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
	public void clickOnLinksTest()
	{
		ob.clickOnLinks();
	}
	
	@Test(priority = 5)
	public void clickOnDemoPageTest()
	{
		ob.clickOnDemoPage();
	}
	

}
