package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class BrowserWindowsPage extends BaseLibrary {
	
	public BrowserWindowsPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@data-target='#alerts']")
	private WebElement allertframe;
	
	@FindBy(xpath = "//a[text()='browser windows']")
	private WebElement browserWindow;
	
	@FindBy(xpath = "//a[@href='https://www.google.co.in/']")
	private WebElement newTab;
	
	@FindBy(xpath = "//textarea[@class='gLFyf']")
	private WebElement googleSerch;
	
	@FindBy(xpath = "//a[@href='https://www.google.co.in/maps']//h3[text()='Google Maps']")
	private WebElement googleMap; 
	
	@FindBy(xpath = "//input[@role=\"combobox\"]")
	private WebElement serchInMap;
	
	@FindBy(xpath = "//button[@class='mL3xi']//span[@style='font-size: 24px']")
	private WebElement serchIcon;
	
	@FindBy(xpath = "//a[text()='New Window']")
	private WebElement newWindow;
	
	
	
	
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
	
	public void clickOnBrowserWindow()
	{
		waitForClick(browserWindow);
	}
	
	public void clickOnNewTab() throws Throwable
	{
		waitForClick(newTab);
		switchToTab(1);
	 Thread.sleep(1000);
		googleSerch.sendKeys("Google map");
		 Thread.sleep(1000);
		googleSerch.sendKeys(Keys.ENTER);
		//waitForClick(googleMap);
		//serchInMap.sendKeys("Bettiah");
		//serchInMap.sendKeys(Keys.ENTER);
		switchToTab(0);
		
	}
	
	public void clickOnNewWindow()
	{
		waitForClick(newWindow);
		switchToTab(1);
		driver.manage().window().maximize();
		switchToTab(0);
		
	}
	
	public void newWindowMassage()
	{
		
		driver.findElement(By.xpath("//a[text()='New Window Message']")).click();
		switchToTab(1);
		System.out.println(driver.findElement(By.xpath("//p[text()='Lorem ipsum, dolor sit amet consectetur adipisicing elit. Odio, facilis deserunt? Fuga dolores amet non alias necessitatibus ipsam eaque blanditiis!']")).getText());
		switchToTab(0);
	}
	
	

}
