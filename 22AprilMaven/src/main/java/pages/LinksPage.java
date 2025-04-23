package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class LinksPage extends BaseLibrary {
	
	public LinksPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='links']")
	private WebElement links;
	
	@FindBy(xpath = "//a[text()='Demo Page']")
	private WebElement DemoPage;
	
	
	public void clickOnClose()
	{
		waitForClick(close);
		
	}
	
	public void clickonPractice()
	{
		waitForClick(practice);
	}
	
	public void clickOnElements()
	{
		waitForClick(elements);
	}
	
	public void clickOnLinks()
	{
		waitForClick(links);
	}
	
	public void clickOnDemoPage()
	{
		waitForClick(DemoPage);
		switchToTab(1);
		waitForClick(close);
		waitForClick(practice);
		waitForClick(elements);
		switchToTab(0);
	}
	
	
	

}
