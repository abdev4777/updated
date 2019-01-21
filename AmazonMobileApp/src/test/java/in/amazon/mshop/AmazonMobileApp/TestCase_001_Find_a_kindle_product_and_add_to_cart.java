package in.amazon.mshop.AmazonMobileApp;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.Assert;
import org.testng.annotations.Test;

import base.CommonMethod;

import base.Base;
//import io.qameta.allure.Step;
//import junit.framework.Assert;
import pages.AddToCart;
import pages.HomePage;
//import base.capabilitiesManager;
//import io.appium.java_client.AppiumDriver;
//import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import pages.LoginPage;
import pages.ResultsPage;
import pages.ShopByCategory;
import org.testng.annotations.Listeners;

@Listeners(util.Listeners.class)
public class TestCase_001_Find_a_kindle_product_and_add_to_cart extends Base  {

	@Test(priority=1)
	private void To_Check_Kindle_Availablity() throws Exception{

		LoginPage loginPage = new LoginPage();
		HomePage homePage= new HomePage();
		ShopByCategory shopbycategory= new ShopByCategory();
		ResultsPage results=new ResultsPage();
		AddToCart addtocart=new AddToCart();

		loginPage.click_skip_button();
		homePage.click_shop_by_category_button();
		shopbycategory.click_Kindle_EReader_and_Ebooks();
		shopbycategory.click_Kidle_EReaders();
		results.click_on_kindle_product();
		addtocart.check_availability();
	}

	@AfterMethod

	public void tearDown(ITestResult result)
	{
		if(ITestResult.FAILURE==result.getStatus())
		{
			CommonMethod.captureScreenshot(getDriver(),result.getName());
		}
	}}







