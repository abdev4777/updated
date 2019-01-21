package base;

import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.logging.Logger;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebElement;
//import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class Base {
	
	private final static String APP_PACKAGE_NAME = "in.amazon.mShop.android.shopping";
	private final static String APP_ACTIVITY_NAME = "com.amazon.mShop.splashscreen.StartupActivity";
	private final static String Device_Name= "Honor Play";
	protected static AndroidDriver<WebElement> androidDriver=null;
	public static Logger Log = Logger.getLogger(Logger.class.getName());

	@BeforeClass
	public void setup(){
		initDriver();
		
	}

	public AndroidDriver<WebElement> getDriver() {

		return androidDriver;
	}

	public void initDriver(){

		Log.info("initializing driver");
		DesiredCapabilities capabilities = DesiredCapabilities.android(); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,Platform.ANDROID);
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, Device_Name);
		capabilities.setCapability("browserName", "");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, APP_PACKAGE_NAME);
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, APP_ACTIVITY_NAME);
		
		//AndroidDriver driver = null;
 		try {
			androidDriver = new AndroidDriver<WebElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
			Log.info("Driver initialized successfully");
		} catch (MalformedURLException e)
 		{
		//	 TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}







