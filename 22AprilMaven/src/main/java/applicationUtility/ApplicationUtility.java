package applicationUtility;

import org.openqa.selenium.WebElement;

public interface ApplicationUtility {
	public void doubleClick(WebElement ele);
	public void rightClick(WebElement ele);
	public void clickMe(WebElement ele);
	public void switchToTab(int i);
	public void uploadFile(String file);

}
