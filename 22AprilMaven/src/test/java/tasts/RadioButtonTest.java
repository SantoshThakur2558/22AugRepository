package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.RadioButtons;

public class RadioButtonTest extends BaseLibrary {
	
	RadioButtons ob;
	
	@BeforeTest()
	public void launchUrlTest()
	{
		launchUrl();
		ob= new RadioButtons();
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
	public void clickOnRadioButton()
	{
		ob.clickOnradioButton();
	}
	
	@Test(priority = 5)
	public void clickOnYes()
	{
		ob.clickOnYes();
	}
	
	@Test(priority = 6)
	public void validateTest()
	{
		 ob.validate();
	}
	
	
	
	
	

}
