package pages;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class WebTablePage extends BaseLibrary {
	
	public WebTablePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='web tables']")
	private WebElement webTable;
	
	@FindBy(xpath = "//input[@pattern='^[a-zA-Z][\\sa-zA-Z]{2,32}']")
	private WebElement name;
	
	@FindBy(xpath = "//input[@pattern='[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,}$']")
	private WebElement email;
	
	@FindBy(xpath = "//button[text()='Save']")
	private WebElement save;
	
	@FindBy(xpath = "//iframe[@src='Webtable.html']")
	private WebElement iframe;
	
	@FindBy(xpath = "//button[text()='Edit']")
	private List<WebElement> edit;
	
	@FindBy(xpath = "//input[@name='edit_name']")
	private WebElement updateName;
	
	@FindBy(xpath = "//input[@name='edit_email']")
	private WebElement updateEmail;
	
	@FindBy(xpath = "//button[text()='Update']")
	private WebElement update;
	
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
	
	public void clickOnWebTable()
	{
		waitForClick(webTable);
	}
	
	public void fillDetails() throws InterruptedException
	{
		driver.switchTo().frame(iframe);
		for(int i=1; i<=4; i++)
		{
			Thread.sleep(5);
			name.sendKeys(getReadData(1, i, 0));
			email.sendKeys(getReadData(1, i, 1));
			waitForClick(save);
		}
		//driver.switchTo().defaultContent();
		
	}
	
	public void updateDetails()
	{
		int j=1;
		for(int i=0; i<edit.size(); i++)
		{
			edit.get(i).click();
			updateName.clear();
			updateName.sendKeys(getReadData(2, j, 0));
			updateEmail.clear();
			updateEmail.sendKeys(getReadData(2, j, 1));
			update.click();
			j++;
		}
		
		driver.switchTo().defaultContent();
		
	}
	
	

}
