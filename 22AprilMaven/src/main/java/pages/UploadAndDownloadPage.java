package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import baseLibrary.BaseLibrary;

public class UploadAndDownloadPage extends BaseLibrary {
	
	public UploadAndDownloadPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	String path = "C:\\Users\\keshr\\eclipse-workspace\\FinalTestingBabaMavenProject\\Final.TestingBaba\\tastData\\New Microsoft Excel Worksheet.xlsx";
	
	
	@FindBy(xpath = "//button[text()='×']")
	private WebElement close;
	
	
	@FindBy(xpath = "//a[text()='Practice']")
	private WebElement practice;
	
	@FindBy(xpath = "//button[@class='btn btn-block p-0 text-left']")
	private WebElement elements;
	
	@FindBy(xpath = "//a[text()='upload and download']")
	private WebElement uploadDownload;
	
	@FindBy(xpath = "//label[text()='Select a file']")
	private WebElement choosFile;
	
	
	
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
	
	public void clickonuploadDownload()
	{
		waitForClick(uploadDownload);
	}
	
	public void clickonchoosFile()
	{
		waitForClick(choosFile);
		uploadFile(path);
	}
	
	

}
