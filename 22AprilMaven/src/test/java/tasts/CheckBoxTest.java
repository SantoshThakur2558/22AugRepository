package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.CheckBox;

public class CheckBoxTest extends BaseLibrary {
	
	CheckBox ob;
	
	@BeforeTest
	public void launchUrlTest()
	{
		launchUrl();
		ob= new CheckBox();
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
	public  void clickOnElementTest()
	{
		ob.clickOnElements();
	}
	
	@Test(priority = 4)
	public void clickoncheckBoxTest()
	{
		ob.clickoncheckBox();
	}
	
	@Test(priority = 5)
	public void clickonmobileCheckTest()
	{
		ob.clickonmobileCheck();
	}
	
	@Test(priority = 6)
	public void clickOnlaptopCheckTest()
	{
		ob.clickOnlaptopCheck();
	}
	
	@Test(priority = 7)
	public void clickOndesktopCheckTest()
	{
		ob.clickOndesktopCheck();
	}

}
