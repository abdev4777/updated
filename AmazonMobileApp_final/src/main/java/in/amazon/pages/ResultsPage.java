package in.amazon.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.base.CommonMethod;
import in.amazon.util.Log;

public class ResultsPage extends CommonMethod{

	public ResultsPage() {

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
	public void click_on_kindle_product() { 
		try{
			if(KindleProduct.isDisplayed()){
				clickOn(driver, KindleProduct, 10);
				Log.info("clicked on Kindle Product");
			}else{
				Log.info("Kidle product not found in results list or not clickable");
			}
		}catch(Exception e){

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

	//Kindle product list
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View[1]/android.view.View[2]/android.view.View[3]/android.widget.ListView/android.view.View[1]/android.view.View/android.view.View")
	public WebElement KindleProduct;



}





