package tasts;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import baseLibrary.BaseLibrary;
import pages.AlertsPage;
import pages.UploadAndDownloadPage;

public class AlertsTest extends BaseLibrary {
	AlertsPage ob;
	
	@BeforeTest
	public void launchurlTesta()
	{
		launchUrl();
		ob = new AlertsPage();
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
	public void clickonclickOnAlertsTest()
	{
		ob.clickOnAlerts();
	}
	
	@Test(priority = 5)
	public void clickOnSeeAlertTest()
	{
		ob.clickOnSeeAlert();
	}
	
	@Test(priority = 6)
	public void clickOnaftersec5Test()
	{
		ob.clickOnaftersec5();
	}
	
	@Test(priority = 7)
	public void clickOnAlertCancilTest()
	{
		ob.clickOnAlertCancil();
	}
	
	@Test(priority = 8)
	public void clickOnSendAlertTest()
	{
		ob.clickOnSendAlert();
	}

}
