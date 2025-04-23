package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


import baseLibrary.BaseLibrary;

public class ButtonsPage extends BaseLibrary {
	
	public ButtonsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='buttons']")
	private WebElement buttons;
	
	@FindBy(xpath = "//button[@ondblclick='doubletext()']")
	private WebElement doubleClick;
	
	@FindBy(xpath = "//button[@oncontextmenu='righttext()']")
	private WebElement rightClick;
	
	@FindBy(xpath = "//button[@onclick='clicktext()']")
	private WebElement clickMe;
	
	@FindBy(xpath = "//p[text()='you have done a double click']")
	private WebElement valDoubleClick;
	
	@FindBy(xpath = "//p[text()='you have done a right click']")
	private WebElement valRightClick;
	
	@FindBy(xpath = "you have done a dynamic click")
	private WebElement valClickMe;
	
	
	public void clickOnClose() throws InterruptedException
	{
		Thread.sleep(5000);
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
	
	public void clickOnButtons()
	{
		waitForClick(buttons);
	}
	
	public void clickOndoubleClick() 
	{
		doubleClick(doubleClick);
	}
	
	public void clickOnrightClick()
	{
		rightClick(rightClick);
		rightClick.click();
	}
	
	public void clickOnclickMe()
	{
		clickMe(clickMe);
	}
	
	public void validateDetails()
	{
		String aValueDuble = valDoubleClick.getText();
		
		String aValueRight = valRightClick.getText();
		String aValueclick = valClickMe.getText();
		System.out.println(aValueclick);
		System.out.println(aValueRight);
		System.out.println(aValueclick);
		
//		String eValueDuble = getReadData("double");
//		String eValueRight = getReadData("right");
//		String eValueclick = getReadData("click");
//		
//		Assert.assertEquals(aValueDuble, eValueDuble);
//		Assert.assertEquals(aValueRight, eValueRight);
//		Assert.assertEquals(aValueclick, eValueclick);
//		
//		System.out.println("Validation is Completed ");
		
	}
	
	
	

}
