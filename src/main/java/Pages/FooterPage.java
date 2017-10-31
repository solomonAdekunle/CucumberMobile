package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class FooterPage extends BasePage {

	
	
	/* Initialised the Webdriver */
	public FooterPage(WebDriver d) {
		super(d);
	}
	/* Verify if Terms and Conditions link is present on the footer  */
	public boolean isTermsAndConditionLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_TermsAndConditions)).isDisplayed();

	}
	/* Verify if Privacy Policy link is displayed */
	public boolean isPrivacyPolicyLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_PrivacyPolicy)).isDisplayed();

	}

	/*  Verify if Responsible Gambling link is displayed */
	public boolean isResponsibleGamblingLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_ResponsibleGambling)).isDisplayed();

	}

	/* Verify  if VIP Link */
	public boolean isVIPLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_VIP)).isDisplayed();

	}

	/* Verify if PayPal Logo is  Present on the Link */
	public boolean isPayPalLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_PayPalLogo)).isDisplayed();

	}
	/* Verify if Visa Logo is  Present on the Link */
	public boolean isVisaLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_VISALogo)).isDisplayed();

	}

	/* Verify if MasterCard Logo is  Present on the Link */
	public boolean isMasterCardLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_MasterLogo)).isDisplayed();

	}

	/* Verify if PayPal Logo is  Present on the Link */
	public boolean isDetlaCardLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_DeltaLogo)).isDisplayed();

	}

	/* Verify if PaySafe Logo is  Present on the Link */
	public boolean isPaySafeLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_PaySafeLogo)).isDisplayed();

	}

	/* Verify if EntroPay Logo is  Present on the Link */
	public boolean isEntroPayLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_entroPayLogo)).isDisplayed();

	}
	/* Verify if Neteller Logo is  Present on the Link */
	public boolean isNetellerLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_NetellerLogo)).isDisplayed();

	}
	/* Verify if Qiwi Logo is  Present on the Link */
	public boolean isQiwiLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_QiwiLogo)).isDisplayed();

	}
	/* Verify if Over 18 plus Logo is  Present on the Link */
	public boolean isEighteenPlusLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_Over18Logo)).isDisplayed();

	}
	/* Verify if Facebook Logo is  Present on the Link */
	public boolean isFacebookLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_FacebookLogo)).isDisplayed();

	}
	/* Verify if Twitter Logo is  Present on the Link */
	public boolean isTwitterlLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_TwitterLogo)).isDisplayed();

	}

	/* Verify if NetPlay TV Logo is  Present on the Link */
	public boolean isNetPlayTVLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_NetPlayTvLogo)).isDisplayed();

	}
	/* Verify if GameCare Logo is  Present on the Link */
	public boolean isGameCareLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_GamcareLogo)).isDisplayed();

	}
	/* Verify if Gambling Commission Logo is  Present on the Link */
	public boolean isGamblingCommissionLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_GamblingCommissionLogo)).isDisplayed();

	}
	/* Verify if  NetPlayTv Licence   Logo is  Present on the Link */
	public boolean isNetplayTvLienceMessagelPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_NetplayTvText)).isDisplayed();

	}
	
	/*  Click on the Terms And Conditions And Conditions Link */
	public void clickFooterTermsAndConditionlink() {
		WebElement TAndC =d.findElement(By.cssSelector(Constant.Footer_TermsAndConditions));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", TAndC);
	}
	/* click Privacy link is  Present on the Link */
	public void clickFooterPrivacyPolicylink() {
		WebElement Privacylink =d.findElement(By.cssSelector(Constant.Footer_PrivacyPolicy));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Privacylink );

	}
	/* Click on Responsible Gambling link */
	public void clickFooterResponsibleGamblinglink() {
		WebElement Resplink =d.findElement(By.cssSelector(Constant.Footer_ResponsibleGambling));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Resplink );

	}
	/* Click VIP link */
	public void clickFooterVIPlink() {
		WebElement VIPlink =d.findElement(By.cssSelector(Constant.Footer_VIP));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", VIPlink );
		

	}
	/* click VIP Link on  Live Vertical */
	public void clickLiveFooterVIPlink() {
	WebElement LiveVIPFooterLink=d.findElement(By.cssSelector(Constant.Footer_VIP));
	((JavascriptExecutor) d).executeScript("arguments[0].click();", LiveVIPFooterLink );
//	WebDriverWait wait= new WebDriverWait(d,30);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.footer-mobile-menu a[href='/vip']")));
//	JavascriptExecutor jse = (JavascriptExecutor)d;
//	jse.executeScript("window.scrollBy(0,250)", "");
//	LiveVIPFooterLink.click();
		

	}
	/* click Facebook Link on  Live Vertical */
	public void clickFooterFacebooklink() {
		WebElement FaceBookLink=d.findElement(By.cssSelector(Constant.Footer_FacebookLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", FaceBookLink );
		//d.findElement(By.cssSelector(Constant.Footer_FacebookLogo)).click();

	}
	/* click Tiwtter Link on  Live Vertical */
	public void clickFooterTiwtterlink() {
		WebElement Tiwtterink=d.findElement(By.cssSelector(Constant.Footer_TwitterLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Tiwtterink );
		//d.findElement(By.cssSelector(Constant.Footer_TwitterLogo)).click();

	}
	/* click NetPlayTV Link on  Live Vertical */
	 public void clickFooterNetplayTvIconLink(){
		 WebElement NetPlayTvlink=d.findElement(By.cssSelector(Constant.Footer_NetPlayTvLogo));
			((JavascriptExecutor) d).executeScript("arguments[0].click();", NetPlayTvlink );
		 //d.findElement(By.cssSelector(Constant.Footer_NetPlayTvLogo)).click();

	 }
	 /* click EigteenPlus Link on  Live Vertical */
	public void clickFooterEighteenPluslink() {
		 WebElement Over18link=d.findElement(By.cssSelector(Constant.Footer_Over18Logo));
			((JavascriptExecutor) d).executeScript("arguments[0].click();", Over18link );
		//d.findElement(By.cssSelector(Constant.Footer_Over18Logo)).click();

	}
	/* click GamCare Link on  Live Vertical */
	public void clickFooterGamCareink() {
		WebElement GamCarelink=d.findElement(By.cssSelector(Constant.Footer_GamcareLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", GamCarelink );
		//d.findElement(By.cssSelector(Constant.Footer_GamcareLogo)).click();

	}
	/* click Gambling Commission Link on  Live Vertical */
	public void clickFooterGamblingCommissionlink() {
		WebElement Gamblingink=d.findElement(By.cssSelector(Constant.Footer_GamblingCommissionLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Gamblingink );
	//d.findElement(By.cssSelector(Constant.Footer_GamblingCommissionLogo)).click();

	}
}
