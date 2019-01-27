package in.amazon.pages;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.MobileElement;

import org.openqa.selenium.support.PageFactory;

import in.amazon.base.CommonMethod;
import in.amazon.util.Log;

public class AddToCart extends CommonMethod{

	public AddToCart() {
		PageFactory.initElements(driver, this);
	}
	
	public void click_hamburger_button() { 
		clickOn(driver, Hamburgerbtn, 10);
	}

	public void click_search_button() { 
		clickOn(driver, SearchBarbtn, 10);
	}
	public void click_my_cart_button() { 
		clickOn(driver, MyCartbtn, 10);
	}

	public void check_availability() throws Exception {


		MobileElement productPage = (MobileElement) driver.findElementByXPath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout");			
		String addToCart= ("Add to Cart"); 

		CommonMethod scroll = new CommonMethod();
		MobileElement addToCartBtn = scroll.scrollToExactElement(productPage, addToCart);

		if(addToCartBtn.isDisplayed())
		{

			clickOn(driver, addToCartBtn, 10);
			Log.info("Kidle is in stock and added to card");


		}
		else
		{
			Log.info("Kindle is not in stock try again later or choose another product");

		}



	}

	//Hamburger button
	@FindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	public WebElement Hamburgerbtn;

	//My Cart
	@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_cart_count")
	public WebElement MyCartbtn;

	//Search Button
	@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_search")
	public WebElement SearchBarbtn;

	//check product availability 
	@FindBy(id="availability")
	public WebElement CheckAvailability;

	@FindBy(id="add-to-cart-button")
	public WebElement AddToCart;

}






