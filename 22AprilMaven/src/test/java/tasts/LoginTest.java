package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.LoginPage;

public class LoginTest extends BaseLibrary {
	
	LoginPage ob;
	
	@BeforeTest
	public void launchUrlTest()
	{
		launchUrl();
		ob = new LoginPage();
	}
	
	@Test
	public void clickOnCloseTest()
	{
		ob.clickOnClose();
		
	}
	
	@Test
	public void gettitleTest()
	{
		ob.getTitle();
	}
	

}
