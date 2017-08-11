package Pages;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Properties;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;

import Util.Constant;

public class BasePage {

	protected WebDriver d;
	protected static Properties OR=null;
	public double currentBalance;

	
	public void ORConfig() throws IOException{
		// OR
		OR = new Properties();
		FileInputStream fs = new FileInputStream(
		System.getProperty("user.dir") + "\\src\\main\\java\\Config\\OR.Properties");
		OR.load(fs);
	}
	
	

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
		WebDriverWait wait= new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_Login)));
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
		WebDriverWait wait= new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_LiveTab)));
		return d.findElement(By.cssSelector(Constant.hp_LiveTab)).isDisplayed();

	}

	public boolean isPromoTabPresent() {
		return d.findElement(By.cssSelector(Constant.hp_PromotionTab)).isDisplayed();

	}
	public boolean isTopDepositButtonPresent(){
		WebDriverWait wait= new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_DepositButton)));
		return d.findElement(By.cssSelector(Constant.hp_DepositButton)).isDisplayed();
	}
	public boolean isUserInfoPresent(){
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_UserNmaeInfo)));
		return d.findElement(By.cssSelector(Constant.hp_UserNmaeInfo)).isDisplayed();
	}
	
	public void storeHomePageAccountBalance(){
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_AccountBalance)));
		String HomePageBal=d.findElement(By.cssSelector(Constant.hp_AccountBalance)).getText();
		String balance = HomePageBal.replace(",", "").substring(0);
		 currentBalance=Double.parseDouble( balance);
		  System.out.println(currentBalance);
		
	
	}
	
	public boolean isHomePageAccountBalancePresent(){
	return d.findElement(By.cssSelector(Constant.hp_AccountBalance)).isDisplayed();
		
	}
	
	
	
	
	public void clickLoginButton() {
	d.findElement(By.cssSelector(Constant.hp_Login)).click();
		try{
			WebDriverWait wait = new WebDriverWait(d,15);
			WebElement PlayerMessage=d.findElement(By.cssSelector("div.playerMessages-modal .footer .ok"));
					if(PlayerMessage.isDisplayed()==true)
						wait.until(ExpectedConditions.visibilityOf(PlayerMessage));
						((JavascriptExecutor) d).executeScript("arguments[0].click();", PlayerMessage);
				
		}catch (NoSuchElementException e){
			e.getStackTrace();
		}

	}
	

	public void clickSideBarMenu() {
	WebDriverWait wait= new WebDriverWait(d,20);
	wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_SidebarIcon)));
	WebElement SideBarMenu = d.findElement(By.cssSelector(Constant.hp_SidebarIcon));
	((JavascriptExecutor) d).executeScript("arguments[0].click();", SideBarMenu);
	//d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).click();

	}

	public void clickCasinoTab() {

	}

	public void clickVegasTab() {
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_VegasTab)));
		d.findElement(By.cssSelector(Constant.hp_VegasTab)).click();

	}

	public void clickLiveTab() {
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_LiveTab)));
	d.findElement(By.cssSelector(Constant.hp_LiveTab)).click();

	}

	public void clickTopDepositButton() {
		try {
			WebDriverWait wait = new WebDriverWait(d, 15);
			System.out.println("Checking for clue");
			WebElement PlayerMessage = d.findElement(By.cssSelector("div.playerMessages-modal .footer button.ok"));
			if (PlayerMessage.isDisplayed() == true)
				System.out.println(PlayerMessage.isDisplayed());
				System.out.println(">>>> " + PlayerMessage.toString());
				wait.until(ExpectedConditions.visibilityOf(PlayerMessage));
				JavascriptExecutor executor = (JavascriptExecutor) d;
				executor.executeScript("arguments[0].click();", PlayerMessage);
			//((JavascriptExecutor)d).executeScript("document.getElementById('onclick').click();");
			System.out.println("Checking for clue1");

		} catch (NoSuchElementException e) {
			e.getStackTrace();
		}
		System.out.println("Checking for clue2");
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.LoginPopUpBox)));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_DepositButton)));

		d.findElement(By.cssSelector(Constant.hp_DepositButton)).click();

	}

	public void clickPromosTab() {
		d.findElement(By.cssSelector(Constant.hp_PromotionTab)).click();
	}
	
	// Verifying if element is present
		public boolean isElementPresent(String objectName) {
			// log("Checking object presence "+ objectName);
			int count = d.findElements(By.cssSelector((objectName))).size();
			if (count == 0)
				return false;
			else
				return true;
		}
		
		public boolean isLoggedIn() {
			//WebElement Depositbutton=d.findElement(By.cssSelector(Constant.hp_DepositButton));
			if (isElementPresent(Constant.hp_DepositButton))
				return true;
			else
				return false;
		}
		
		public void doLogin(String baseURL, String username, String password) throws InterruptedException {
			d.get(baseURL);
			d.findElement(By.cssSelector(Constant.hp_Login)).click();
			Thread.sleep(1000);
			d.findElement(By.cssSelector(Constant.LoginPopUpBoxUsername)).sendKeys(username);
			Thread.sleep(1000);
			d.findElement(By.cssSelector(Constant.LoginPopBoxPassword)).sendKeys(password);
			Thread.sleep(1000);
			d.findElement(By.cssSelector(Constant.LoginPopBoxSignin)).click();
			WebDriverWait wait = new WebDriverWait(d,10);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.hp_DepositButton)));
			
			try{
				WebElement PlayerMessage=d.findElement(By.cssSelector("div.playerMessages-modal .footer .ok"));
						if(PlayerMessage.isDisplayed()==true)
							((JavascriptExecutor) d).executeScript("arguments[0].click();", PlayerMessage);
							}catch (NoSuchElementException e){
					e.getStackTrace();
				}

		}
		
		
		
		
		public void logOut() {
			try{
				WebElement GamePop = d.findElement(By.cssSelector(Constant.hp_GamePopUPBox_closeIcon));
				WebDriverWait wait = new WebDriverWait(d,15);
				wait.until(ExpectedConditions.visibilityOf(GamePop));
					if(GamePop.isDisplayed())
					     GamePop.click();
				}catch (NoSuchElementException e){
					e.getStackTrace();
				}
		
		WebDriverWait wait = new WebDriverWait(d,15);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector(Constant.hp_GamesPopUpBox)));
		d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).click();
		WebElement Logoutlink=d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
		wait.until(ExpectedConditions.visibilityOf(Logoutlink));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Logoutlink);
		//WebDriverWait Wait=new WebDriverWait(d,20);
				//Wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Logout)));
		
			
		}
		 public void NavigateBackToHomePage(){
			 d.navigate().back();
		 }
		protected String generateStringWithAllobedSplChars(int length, String allowdSplChrs) {
			String allowedChars = "abcdefghijklmnopqrstuvwxyz" + // alphabets
					"1234567890" + // numbers
					allowdSplChrs;
			return RandomStringUtils.random(length, allowedChars);
		}

		public String generateRandomAlphaNumeric(int lenght ,String charcter ){
			String characters = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz!”$%^&*()" +"0123456789";
			 charcter=RandomStringUtils.random(lenght,characters);
			return charcter ;
			 }
		public static String getRelativeUrl(String absoluteURL) throws MalformedURLException {
			URL url = new URL(absoluteURL);
			return url.getPath();
		}
}