package in.amazon.mshop.AmazonMobileApp;

import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
//import org.testng.Assert;
import org.testng.annotations.Test;

import in.amazon.base.Base;
import in.amazon.base.CommonMethod;
import in.amazon.pages.AddToCart;
import in.amazon.pages.HomePage;
import in.amazon.pages.LoginPage;
import in.amazon.pages.ResultsPage;
import in.amazon.pages.ShopByCategory;
import in.amazon.util.Log;

import org.testng.annotations.Listeners;

@Listeners(in.amazon.util.Listeners.class)
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
			Log.endLog("Test is ending...");
		}
	}}







