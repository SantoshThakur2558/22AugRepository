package waitUtility;

import org.openqa.selenium.WebElement;

public interface WaitUtility {
	public void waitForClick(WebElement ele);
	public void visiblityofElement(WebElement ele);
	public void waitForAlert();

}
