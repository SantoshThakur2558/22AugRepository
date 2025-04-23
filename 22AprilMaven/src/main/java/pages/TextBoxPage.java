package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.asserts.SoftAssert;

import baseLibrary.BaseLibrary;

public class TextBoxPage extends BaseLibrary {
	
	public TextBoxPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='text box']")
	private WebElement textBox;
	
	@FindBy(xpath = "//input[@id='fullname1']")
	private WebElement fullName;
	
	@FindBy(xpath = "//input[@id='fullemail1']")
	private WebElement email;
	
	@FindBy(xpath = "//textarea[@id='fulladdresh1']")
	private WebElement currentAddresh;
	
	@FindBy(xpath = "//textarea[@id='paddresh1']")
	private WebElement permanentAddresh;
	
	@FindBy(xpath = "//input[@value='Submit']")
	private WebElement submit;
	
	@FindBy(xpath = "//div[@class=\"col-md-6 mt-5\"]/label")
	private List<WebElement> details;


	private String name;
	
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
	
	public void clickOnTextBox()
	{
		waitForClick(textBox);
	}
	
	public void fillDetails() 
	
	{
		
		fullName.sendKeys(getReadData(0, 1, 0));
		email.sendKeys(getReadData(0, 1, 1));
		currentAddresh.sendKeys(getReadData(0, 1, 2));
		permanentAddresh.sendKeys(getReadData(0, 1, 3));
		submit.click();
	}
	
	public void validateDetails() throws InterruptedException
	{
		//SoftAssert sAssert = new SoftAssert();
		ArrayList<String> actual = new ArrayList<String>();
		for(int i=1; i<details.size(); i=i+2)
		{
			name = details.get(i).getText();
			actual.add(name);
		}
		
		ArrayList<String> expected = new ArrayList<String>();
		for(int i=0; i<4; i++)
		{
			expected.add(getReadData(0, 1, i));
		}
		
		for(int i=0; i<actual.size(); i++)
		{
			Assert.assertEquals(actual.get(i), expected.get(i));
		    //sAssert.assertEquals(actual.get(i), expected.get(i));
		}
		
		//sAssert.assertAll();
	}

}
