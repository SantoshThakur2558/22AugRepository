package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class CheckBox extends BaseLibrary {
	
	public CheckBox()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='check box']")
	private WebElement checkBox;
	
	@FindBy(xpath = "//iframe[@src='Checkbox.html']")
	private WebElement frame;
	
	@FindBy(xpath = "//input[@onclick='myFunction()']")
	private WebElement mobileCheck;
	
	@FindBy(xpath = "//input[@onclick='myFunction1()']")
	private WebElement laptopCheck;
	
	@FindBy(xpath = "//input[@onclick='myFunction2()']")
	private WebElement desktopCheck;
	
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
	
	public void clickoncheckBox()
	{
		checkBox.click();
	}
	
	public void clickonmobileCheck()
	{
		driver.switchTo().frame(frame);
		waitForClick(mobileCheck);
	}
	
	public void clickOnlaptopCheck()
	{
		waitForClick(laptopCheck);
	}
	
	public void clickOndesktopCheck()
	{
		waitForClick(desktopCheck);
		driver.switchTo().defaultContent();
	}
	
	 

}
