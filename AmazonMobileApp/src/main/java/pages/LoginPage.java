package pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import base.CommonMethod;
import org.openqa.selenium.support.PageFactory;


public class LoginPage extends CommonMethod{
	public LoginPage() {
		PageFactory.initElements(driver, this);
		
	}
	public void check_Header(){
		try{
			if (Header.isDisplayed()){
				Log.info("Header displayed"+Header.getText());
			}
			else{
				Log.info("Header not displayed");
				Assert.fail();
			}
		}
		catch(Exception e){

		}
		Header.getText();
	}
	public void click_skip_button() { 
		try{
			if (SkipSignInbtn.isDisplayed()){
				clickOn(driver, SkipSignInbtn, 10);
				Log.info("Clicked skip button");

			}
			else{
				Log.info("Skip button not found on page or not clickable");
				Assert.fail();
			}
		}catch(Exception e){

		}

	}
	public void click_sign_in_to_account_button() { 
		clickOn(driver, signinToAccountbtn, 10);
	}
	public void click_already_a_customer() { 
		clickOn(driver, AlreadyACustomerbtn, 10 );
	}
	public void click_new_user_button() { 
		clickOn(driver, NewUserbtn, 10);
	}

	//Login Page Header
	@FindBy(id= "in.amazon.mShop.android.shopping:id/sso_splash_logo")
	public WebElement Header;

	//Sign in to your account
	@FindBy(id = "in.amazon.mShop.android.shopping:id/signin_to_yourAccount")
	public WebElement signinToAccountbtn;

	//Skip Sign In Button
	@FindBy(id="in.amazon.mShop.android.shopping:id/skip_sign_in_button")
	public WebElement SkipSignInbtn;

	//Already a Customer
	@FindBy(id="in.amazon.mShop.android.shopping:id/sign_in_button")
	public WebElement AlreadyACustomerbtn;

	//New User
	@FindBy(id="in.amazon.mShop.android.shopping:id/new_user")
	public WebElement NewUserbtn;
}





