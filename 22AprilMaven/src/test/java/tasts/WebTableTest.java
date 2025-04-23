package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.WebTablePage;

public class WebTableTest extends BaseLibrary {
	WebTablePage ob;
	
	@BeforeTest()
	public void launchurlTest()
	{
		launchUrl();
		ob = new WebTablePage();
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
	public void clickOnWebTabelTest()
	{
		ob.clickOnWebTable();
	}
	
	@Test(priority = 5)
	public void fillDetailsTest() throws InterruptedException
	{
		ob.fillDetails();
	}
	
	@Test(priority = 6)
	public void updateDetailsTest()
	{
		ob.updateDetails();
	}

}
