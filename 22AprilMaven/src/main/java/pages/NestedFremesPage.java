package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class NestedFremesPage extends BaseLibrary {
	
	
	
	public NestedFremesPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement allertframe;
	
	@FindBy(xpath ="//a[text()='nested frames']")
	private WebElement nestedFrame;
	
	@FindBy(xpath = "//iframe[@height='450px']")
	private WebElement frame1;
	
	@FindBy(xpath = "//iframe[@height='400']")
	private WebElement frame2;
	
	@FindBy(xpath = "//iframe[@height='300']")
	private WebElement frame3;
	
	@FindBy(xpath = "//h2[text()='Parent']")
	private WebElement parent;
	
	@FindBy(xpath = "//h2[text()='Child']")
	private WebElement child;
	
	@FindBy(xpath = "//a[text()='Click Here']")
	private WebElement clickHere;
	
	@FindBy(xpath = "//p[text()='Hello']")
	private WebElement hello;
	
	
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
	
	public void clickOnNestedFrame()
	{
		nestedFrame.click();
	}
	
	public void printParent()
	{
		driver.switchTo().frame(frame1);
		driver.switchTo().frame(frame2);
		System.out.println(parent.getText());
		driver.switchTo().frame(frame3);
		System.out.println(child.getText());
		clickHere.click();
		System.out.println(hello.getText());
		
		driver.switchTo().parentFrame();
		System.out.println(parent.getText());
		driver.switchTo().parentFrame();
		driver.switchTo().defaultContent();
	}
	
	
	

}
