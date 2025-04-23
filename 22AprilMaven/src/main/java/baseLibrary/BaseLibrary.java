package baseLibrary;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;

import applicationUtility.ApplicationUtility;
import excelUtility.ExcelUtility;
import propertyUtility.PropertyUtility;
import screenshootUtility.ScreenshootUtility;
import waitUtility.WaitUtility;

public class BaseLibrary implements WaitUtility, ExcelUtility,PropertyUtility, ApplicationUtility, ScreenshootUtility {
	public static WebDriver driver ;
	
	public void launchUrl()
	{
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://testingbaba.com/old/");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		System.out.println("Santosh");
	}

	@Override
	public void waitForClick(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
	}

	@Override
	public void visiblityofElement(WebElement ele) {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(ele));
	}

	@Override
	public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
	}
	
	
	
	//@AfterTest
	public void flush()
	{
		driver.close();
		driver.quit();
	}

	@Override
	public String getReadData(int sheetNo, int row, int column) {
		String val = "";
		String path = "C:\\Users\\keshr\\eclipse-workspace\\FinalTestingBabaMavenProject\\Final.TestingBaba\\tastData\\New Microsoft Excel Worksheet.xlsx";
		
		try {
			FileInputStream fil = new FileInputStream(path);
			XSSFWorkbook wb = new XSSFWorkbook(fil);
			XSSFSheet sheet = wb.getSheetAt(sheetNo);
			val = sheet.getRow(row).getCell(column).getStringCellValue();
			
			
		} 
		catch (Exception e) 
		{
		 System.out.println("Show error msg"+e);
		}
		
		
		return val;
	}

	@Override
	public String getReadData(String keyName) {
		String path = "C:\\Users\\keshr\\eclipse-workspace\\FinalTestingBabaMavenProject\\Final.TestingBaba\\tastData\\config.properties";
		String val = null;
		try 
		{
			FileInputStream fil = new FileInputStream(path);
			Properties prop = new Properties();
			prop.load(fil);
			val = prop.getProperty(keyName);
			
		} 
		catch (Exception e) 
		{
			System.out.println("Show errar msg "+ e);
		}
		return val;
	}

	@Override
	public void doubleClick(WebElement ele) {
		Actions act = new Actions(driver);
		act.doubleClick(ele).perform();
	}

	@Override
	public void rightClick(WebElement ele) {
		Actions act = new Actions(driver);
		act.contextClick(ele).perform();
	}

	@Override
	public void clickMe(WebElement ele) {
		Actions act = new Actions(driver);
		act.click(ele).perform();
	}

	@Override
	public void switchToTab(int i) {
		Set<String> handle = driver.getWindowHandles();
		ArrayList<String> listOfHandles = new ArrayList<String>(handle);
		driver.switchTo().window(listOfHandles.get(i));
		
	}

	@Override
	public void uploadFile(String path) {
		
		
		try 
		{
			StringSelection sel = new StringSelection(path);
			Clipboard clipboard = Toolkit.getDefaultToolkit().getSystemClipboard();
			clipboard.setContents(sel, null);
			
			Robot rob = new Robot();
			rob.delay(500);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			rob.keyPress(KeyEvent.VK_CONTROL);
			rob.keyPress(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_V);
			rob.keyRelease(KeyEvent.VK_CONTROL);
			rob.delay(500);
			rob.keyPress(KeyEvent.VK_ENTER);
			rob.keyRelease(KeyEvent.VK_ENTER);
			rob.delay(500);
			
			
		} 
		catch (Exception e) {
			System.out.println("Sow error msg "+e);
		}
		
		
		
	}

	@Override
	public void getScreenShoot(String folderName, String fileName) {
		String loc = System.getProperty("user.dir");
		String path = loc + " // " + " Screenshoot " + " // " + folderName + " // " + fileName + ".jpeg";
		
		try 
		{
			//eventf  
			
			
			
		} 
		catch (Exception e) {
			// TODO: handle exception
		}
		
		
		
	}

	

}
