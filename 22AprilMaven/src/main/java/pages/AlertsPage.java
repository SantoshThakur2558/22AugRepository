package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class AlertsPage extends BaseLibrary {
	
	public AlertsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement allertframe;
	
	@FindBy(xpath = "//a[text()='alerts']")
	private WebElement alerts;
	
	@FindBy(xpath = "//button[@onclick='myalert()']")
	private WebElement seeAlert;
	
	@FindBy(xpath = "//button[@onclick='aftersec5()']")
	private WebElement aftersec5;
	
	@FindBy(xpath = "//button[@onclick='myconfirm()']")
	private WebElement alertCancil;
	
	@FindBy(xpath = "//button[@onclick='myprompt()']")
	private WebElement sendAlert;
	
	public void clickOnClose()
	{
		waitForClick(close);
		
	}
	
	public void clickonPractice()
	{
		waitForClick(practice);
	}
	
	public void clickonAllertWindow()
	{
		allertframe.click();
	}
	
	public void clickOnAlerts()
	{
		alerts.click();
	}
	
	public void clickOnSeeAlert()
	{
		seeAlert.click();
		driver.switchTo().alert().accept();
	}
	
	public void clickOnaftersec5()
	{
		aftersec5.click();
		waitForAlert();
		driver.switchTo().alert().accept();
	}
	
	public void clickOnAlertCancil()
	{
		alertCancil.click();
		driver.switchTo().alert().dismiss();
	}
	
	public void clickOnSendAlert()
	{
		sendAlert.click();
		driver.switchTo().alert().sendKeys("Santosh");
		driver.switchTo().alert().accept();
	
	}
	
	
	

}
