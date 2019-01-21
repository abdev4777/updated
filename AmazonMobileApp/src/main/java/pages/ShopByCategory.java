package pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import base.CommonMethod;

import org.openqa.selenium.support.PageFactory;

public class ShopByCategory extends CommonMethod{

	public void click_Kindle_EReader_and_Ebooks() { 
		try{
			if(KindleEReadersandEbooks.isDisplayed()){
				clickOn(driver, KindleEReadersandEbooks, 15);
				Log.info("Clicked on Kindle EReaders and Books button");

			}else{
				Log.info("Kindle EReaders and books button not displayed or not clickable");
			}
		}
		catch(Exception e){

		}

	}
	public void click_Kidle_EReaders(){
		try{
			if (KindleEReaders.isDisplayed()){
				clickOn(driver, KindleEReaders, 10);
				Log.info("clicked on Kindle E-Reader button");
			}else{
				Log.info("Kindle E-Reader button not displayed or not clickable");
			}
		}
		catch(Exception e){

		}
	}

	public ShopByCategory() {
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
	

	//Hamburger button
	@FindBy(id = "in.amazon.mShop.android.shopping:id/action_bar_burger_icon")
	public WebElement Hamburgerbtn;

	//My Cart
	@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_cart_count")
	public WebElement MyCartbtn;

	//Search Button
	@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_search")
	public WebElement SearchBarbtn;

	//Shop By category button
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[3]")
	public WebElement EchoAndAlexa;

	//FireTvStick
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[5]/android.view.View/android.view.View[3]")
	public WebElement FireTvStick;

	//Kindle E-Reader and E-books
	@FindBy(xpath="hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View/android.view.View[3]")
	public WebElement KindleEReadersandEbooks;

	//Kindle E-Readers
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[7]/android.view.View[3]")
	public WebElement KindleEReaders;

	//Amazon Prime Video
	@FindBy(xpath="/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.support.v4.widget.DrawerLayout/android.widget.RelativeLayout/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.LinearLayout[2]/android.widget.ViewAnimator/android.view.ViewGroup/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.RelativeLayout/android.widget.RelativeLayout/android.webkit.WebView/android.webkit.WebView/android.view.View[1]/android.view.View/android.view.View[6]/android.view.View/android.view.View[1]")
	public WebElement AmazonPrimeVideo;


}





