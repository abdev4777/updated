package in.amazon.base;

import java.io.FileInputStream;
import java.io.InputStream;
import java.net.MalformedURLException;
//import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.openqa.selenium.WebElement;
//import org.aspectj.lang.annotation.Before;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeClass;

import in.amazon.util.Log;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.AndroidMobileCapabilityType;
import io.appium.java_client.remote.MobileCapabilityType;



public class Base {
	public static Properties prop;
	public static InputStream input;
	protected static AndroidDriver<WebElement> androidDriver=null;

	@BeforeClass
	public void setup(){
		initDriver();
	}

	public void initDriver(){
		readPropertiesFile();
		Log.startLog("test is strating");
		DesiredCapabilities capabilities = DesiredCapabilities.android(); 
		capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME,prop.getProperty("platformName"));
		capabilities.setCapability(MobileCapabilityType.NO_RESET, false);
		capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, prop.getProperty("deviceName"));
		capabilities.setCapability("browserName", "");
		capabilities.setCapability(AndroidMobileCapabilityType.APP_PACKAGE, prop.getProperty("appPackageName"));
		capabilities.setCapability(AndroidMobileCapabilityType.APP_ACTIVITY, prop.getProperty("appActivityName"));

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

	public AndroidDriver<WebElement> getDriver() 
	{
		return androidDriver;
	}
	public static void readPropertiesFile() {
		prop = new Properties();
		try {
			input = new FileInputStream("C://Users//AB//workspace//AmazonMobileApp//src//main//java//util//config.properties");
			prop.load(input);
		} catch (Exception e) {
			e.printStackTrace();
		}



	}}







