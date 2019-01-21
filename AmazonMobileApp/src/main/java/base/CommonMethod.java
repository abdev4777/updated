package base;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.MobileElement;
//import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;

public class CommonMethod extends Base{ 


	protected AndroidDriver<WebElement> driver;
	public CommonMethod(){

		this.driver = super.getDriver();

	}

	public static void clickOn(WebDriver driver, WebElement element, int timeout){
		new WebDriverWait(driver, timeout).until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}
	public static void captureScreenshot(AndroidDriver<WebElement> driver, String screenshotName) {
		try{
			TakesScreenshot ts= (TakesScreenshot)driver;
			File source=ts.getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(source, new File("./Screenshots/"+screenshotName+".png"));
			Log.info("screenshot taken");
		}
		catch(Exception e){
			System.out.println("Exception while taking screenshot");
		}}
	public MobileElement scrollToExactElement(MobileElement ele,String str) 
	{
		Log.info("Scrolling to exact element");
		return ((AndroidElement) ele)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().text(\""+str+"\"));");

	}

	public MobileElement ScrollToElement(MobileElement ele, String str) 
	{
		Log.info("Scrolling to element");
		return ((AndroidElement) ele)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector()).scrollIntoView("
						+ "new UiSelector().textContains(\""+str+"\"));");


	}
	public MobileElement ScrollStepWise(MobileElement ele, int step) 
	{
		return ((AndroidElement) ele)
				.findElementByAndroidUIAutomator("new UiScrollable(new UiSelector().scrollForward("+step+"))");
	}

}



