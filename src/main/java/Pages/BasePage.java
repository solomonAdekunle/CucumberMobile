package Pages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;

import Util.Constant;

public class BasePage {

	protected WebDriver d;

	// Initilising the WebDriver
	public BasePage(WebDriver d) {
		this.d = d;

	}
	
	
 public void getBrowserType(String browser){
	 d.get(browser);
	 
 }
	public void getSiteAddress(String BaseUrl) {
		this.d.get(BaseUrl + "/");
		//d.get("https://www.supercasino.com/");

	}

	public boolean isLoginButtonPresent() {
		return d.findElement(By.cssSelector(Constant.hp_Login)).isDisplayed();

	}

	public boolean isSupercasinoLogoPresent() {
		return d.findElement(By.cssSelector(Constant.hp_SiteLogo)).isDisplayed();
	}

	public boolean isSideBarIconPresent() {
		return d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).isDisplayed();

	}

	public boolean isCasinoTabPresent() {
		return d.findElement(By.cssSelector(Constant.hp_CasinoTab)).isDisplayed();

	}

	public boolean isVegasTabPresent() {
	return d.findElement(By.cssSelector(Constant.hp_VegasTab)).isDisplayed();

	}

	public boolean isLiveTabPresent() {
		return d.findElement(By.cssSelector(Constant.hp_LiveTab)).isDisplayed();

	}

	public boolean isPromoTabPresent() {
		return d.findElement(By.cssSelector(Constant.hp_PromotionTab)).isDisplayed();

	}
	public boolean isTopDepositButtonPresent(){
		return d.findElement(By.cssSelector(Constant.hp_DepositButton)).isDisplayed();
	}
	public boolean isUserInfoPresent(){
		return d.findElement(By.cssSelector(Constant.hp_UserNmaeInfo)).isDisplayed();
	}
	
	public boolean isHomePageAccountBalancePresent(){
		return d.findElement(By.cssSelector(Constant.hp_AccountBalance)).isDisplayed();
	}
	
	
	
	
	
	
	public void clickLoginButton() {
	d.findElement(By.cssSelector(Constant.hp_Login)).click();

	}
	

	public void clickSideBarMenu() {

	}

	public void clickCasinoTab() {

	}

	public void clickVegasTab() {

	}

	public void clickLiveTab() {

	}

	public void clickPromosTab() {

	}
}