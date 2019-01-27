package in.amazon.pages;

import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import in.amazon.base.CommonMethod;
import in.amazon.util.Log;

public class HomePage extends CommonMethod{
	public HomePage() {
		PageFactory.initElements(driver, this);
		
	}
	public void click_hamburger_button() { 
		Hamburgerbtn.click();
	}
	public void click_shop_by_category_button() {
		try{
			if(ShopByCategorybtn.isDisplayed()){
				clickOn(driver, ShopByCategorybtn, 10);
				Log.info("Clicked on Shop By Category button");
			}else{
				Log.info("Shop By Category button not found or not clickable");
			}

		}
		catch(Exception e){

		}



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

	//Shop By category button
	@FindBy(id="in.amazon.mShop.android.shopping:id/web_home_shop_by_department_label")
	public WebElement ShopByCategorybtn;

	//Search Button
	@FindBy(id="in.amazon.mShop.android.shopping:id/rs_search_src_text")
	public WebElement SearchBarbtn;

	//My Cart
	@FindBy(id="in.amazon.mShop.android.shopping:id/action_bar_cart_count")
	public WebElement MyCartbtn;
}





