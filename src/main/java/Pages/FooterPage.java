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

	public FooterPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean isTermsAndConditionLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_TermsAndConditions)).isDisplayed();

	}

	public boolean isPrivacyPolicyLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_PrivacyPolicy)).isDisplayed();

	}

	public boolean isResponsibleGamblingLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_ResponsibleGambling)).isDisplayed();

	}

	public boolean isVIPLinkPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_VIP)).isDisplayed();

	}

	public boolean isPayPalLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_PayPalLogo)).isDisplayed();

	}

	public boolean isVisaLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_VISALogo)).isDisplayed();

	}

	public boolean isMasterCardLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_MasterLogo)).isDisplayed();

	}

	public boolean isDetlaCardLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_DeltaLogo)).isDisplayed();

	}

	public boolean isPaySafeLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_PaySafeLogo)).isDisplayed();

	}

	public boolean isEntroPayLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_entroPayLogo)).isDisplayed();

	}

	public boolean isNetellerLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_NetellerLogo)).isDisplayed();

	}

	public boolean isQiwiLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_QiwiLogo)).isDisplayed();

	}

	public boolean isEighteenPlusLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_Over18Logo)).isDisplayed();

	}

	public boolean isFacebookLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_FacebookLogo)).isDisplayed();

	}

	public boolean isTwitterlLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_TwitterLogo)).isDisplayed();

	}

	public boolean isNetPlayTVLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_NetPlayTvLogo)).isDisplayed();

	}

	public boolean isGameCareLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_GamcareLogo)).isDisplayed();

	}

	public boolean isGamblingCommissionLogoPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_GamblingCommissionLogo)).isDisplayed();

	}

	public boolean isNetplayTvLienceMessagelPresent() {
		return d.findElement(By.cssSelector(Constant.Footer_NetplayTvText)).isDisplayed();

	}
	
	 
	public void clickFooterTermsAndConditionlink() {
		WebElement TAndC =d.findElement(By.cssSelector(Constant.Footer_TermsAndConditions));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", TAndC);
	}

	public void clickFooterPrivacyPolicylink() {
		WebElement Privacylink =d.findElement(By.cssSelector(Constant.Footer_PrivacyPolicy));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Privacylink );

	}

	public void clickFooterResponsibleGamblinglink() {
		WebElement Resplink =d.findElement(By.cssSelector(Constant.Footer_ResponsibleGambling));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Resplink );

	}

	public void clickFooterVIPlink() {
		WebElement VIPlink =d.findElement(By.cssSelector(Constant.Footer_VIP));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", VIPlink );
		

	}
	public void clickLiveFooterVIPlink() {
	WebElement LiveVIPFooterLink=d.findElement(By.cssSelector(Constant.Footer_VIP));
	((JavascriptExecutor) d).executeScript("arguments[0].click();", LiveVIPFooterLink );
//	WebDriverWait wait= new WebDriverWait(d,30);
//	wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("div.footer-mobile-menu a[href='/vip']")));
//	JavascriptExecutor jse = (JavascriptExecutor)d;
//	jse.executeScript("window.scrollBy(0,250)", "");
//	LiveVIPFooterLink.click();
		

	}

	public void clickFooterFacebooklink() {
		WebElement FaceBookLink=d.findElement(By.cssSelector(Constant.Footer_FacebookLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", FaceBookLink );
		//d.findElement(By.cssSelector(Constant.Footer_FacebookLogo)).click();

	}

	public void clickFooterTiwtterlink() {
		WebElement Tiwtterink=d.findElement(By.cssSelector(Constant.Footer_TwitterLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Tiwtterink );
		//d.findElement(By.cssSelector(Constant.Footer_TwitterLogo)).click();

	}
	 public void clickFooterNetplayTvIconLink(){
		 WebElement NetPlayTvlink=d.findElement(By.cssSelector(Constant.Footer_NetPlayTvLogo));
			((JavascriptExecutor) d).executeScript("arguments[0].click();", NetPlayTvlink );
		 //d.findElement(By.cssSelector(Constant.Footer_NetPlayTvLogo)).click();

	 }

	public void clickFooterEighteenPluslink() {
		 WebElement Over18link=d.findElement(By.cssSelector(Constant.Footer_Over18Logo));
			((JavascriptExecutor) d).executeScript("arguments[0].click();", Over18link );
		//d.findElement(By.cssSelector(Constant.Footer_Over18Logo)).click();

	}

	public void clickFooterGamCareink() {
		WebElement GamCarelink=d.findElement(By.cssSelector(Constant.Footer_GamcareLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", GamCarelink );
		//d.findElement(By.cssSelector(Constant.Footer_GamcareLogo)).click();

	}

	public void clickFooterGamblingCommissionlink() {
		WebElement Gamblingink=d.findElement(By.cssSelector(Constant.Footer_GamblingCommissionLogo));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Gamblingink );
	//d.findElement(By.cssSelector(Constant.Footer_GamblingCommissionLogo)).click();

	}
}
