package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class LoginPage extends BasePage {

	public LoginPage(WebDriver d) {
		super(d);
		
	}
	/* Check if Login Pop-up box is displayed */
	public boolean isLoginPopUpBoxPresend() {
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBox)));
		return d.findElement(By.cssSelector(Constant.LoginPopUpBox)).isDisplayed();

	}
	/* Check if Supercasino Logo is displayed on the Login Pop-up box */
	public boolean isPopUpBoxSupercasinoLogoPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopUpBox_SiteLog)).isDisplayed();

	}
	/* Check if Username Input box is displayed on the Login Pop-up box */
	public boolean isPopUpBoxUsernameInputBoxPresent() {
		
		return d.findElement(By.cssSelector(Constant.LoginPopBoxNewUser)).isDisplayed();

	}
	/* Check if Password Input box is displayed on the Login Pop-up box */
	public boolean isPopUpBoxPasswordInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxPassword)).isDisplayed();

	}
	/* Check if Sign Button is displayed on the Login Pop-up box */
	public boolean isPopUpBoxSignButtonPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxSignin)).isDisplayed();

	}
	/* Check if Forgotten Details Link is displayed on the Login Pop-up box */
	public boolean isPopUpBoxForgottenDetialsLinkPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxForgottenDetailsLink)).isDisplayed();

	}
	/* Check if New User link  is displayed at the footer of the Login Pop-up box */
	public boolean isPopUpBoxNewUserLinkPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxNewUser)).isDisplayed();

	}
	/* Check if Register Now button is displayed on the Login Pop-up box */
	public boolean isPopUpBoxJoinNowButtonPresent() {
		return d.findElement(By.cssSelector(Constant.LoginPopBoxJoinNow)).isDisplayed();

	}
	/* Check if Close icon is displayed on the Login Pop-up box */
	public boolean isPopUpBoxCloseIconPresent(){
		 WebDriverWait wait = new WebDriverWait(d,20);
			wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBoxCloseIcon)));
		return d.findElement(By.cssSelector(Constant.LoginPopUpBoxCloseIcon)).isDisplayed();
	}
	/* Check if Login Error Message is displayed on the Login Pop-up box */
   public boolean isLoginPopUpBoxErrorMessagePresent(){
	   WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.LoginPopUpBoxErrorMessage)));
	return d.findElement(By.cssSelector(Constant.LoginPopUpBoxErrorMessage)).isDisplayed();
	   
   }
   /*  Enter your Username in the Login Pop-up box */
	public void sendUseraname(String username) throws InterruptedException {
	WebDriverWait wait = new WebDriverWait(d,30);
  	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.LoginPopUpBoxUsername)));
  	Thread.sleep(1000);
	d.findElement(By.cssSelector(Constant.LoginPopUpBoxUsername)).sendKeys(username);

	}
	 /*  Enter your Password in the Login Pop-up box */
	public void sendPassword(String password) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.LoginPopBoxPassword)));
		Thread.sleep(1000);
		d.findElement(By.cssSelector(Constant.LoginPopBoxPassword)).sendKeys(password);

	}
	 /* click on Signin button the Login Pop-up box */
	public void clickSigninButton() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
		d.findElement(By.cssSelector(Constant.LoginPopBoxSignin)).click();

	}
	 /* click on Forgotten Details link the Login Pop-up box */
	public void clickForgottenDetailsLink() {
		d.findElement(By.cssSelector(Constant.LoginPopBoxForgottenDetailsLink)).click();

	}
	/* click on Forgotten Details link the Login Pop-up box */
	public void clickJoinNowButton() {
		d.findElement(By.cssSelector(Constant.LoginPopBoxJoinNow)).click();

	}
	/* click on Close icon on the Login Pop-up box */
	public void clickLoginBoxCloseIcon() {
		System.out.println("Am closing the Pop-up");
		WebDriverWait wait = new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBoxCloseIcon)));
		System.out.println("Am closing the Pop-up Box");
		d.findElement(By.cssSelector(Constant.LoginPopUpBoxCloseIcon)).click();
	}
	
}
