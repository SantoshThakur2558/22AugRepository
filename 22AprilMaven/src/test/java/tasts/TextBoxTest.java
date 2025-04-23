package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.TextBoxPage;

public class TextBoxTest extends BaseLibrary {
	
	 TextBoxPage ob;
	
	@BeforeTest
	public void launchUrltest()
	{
		launchUrl();
		ob = new TextBoxPage();
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
	public void clickOnTextBoxTest()
	{
		ob.clickOnTextBox();
	}
	
	@Test(priority = 5)
	public void fillDetailsTest()
	{
		ob.fillDetails();
	}
	
	@Test(priority = 6 )
	public void validateDetailsTest() throws InterruptedException
	{
		Thread.sleep(5);
		ob.validateDetails();
	}
	

}
