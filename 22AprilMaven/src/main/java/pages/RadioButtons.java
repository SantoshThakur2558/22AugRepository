package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import baseLibrary.BaseLibrary;

public class RadioButtons extends BaseLibrary {
	
	
	public RadioButtons()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='radio buttons']")
	private WebElement radioButton;
	
	@FindBy(xpath = "//input[@value='yes']")
	private WebElement yes;
	
	@FindBy(xpath = "//p[text()='You have selected yes']")
	private WebElement actualData;
	
	
	
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
	
	public void clickOnradioButton()
	{
		waitForClick(radioButton);
	}
	
	public void clickOnYes()
	{
		waitForClick(yes);
	}
	
	public void validate()
	{
		String eValue = getReadData("yes");
		String aValue = actualData.getText();
		Assert.assertEquals(aValue, eValue);
		System.out.println("Validation is completed");
		System.out.println(aValue);
		
	}
	
	
	

}
