package Pages;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class SideBarPage extends BasePage {

	public SideBarPage(WebDriver d) {
		super(d);
		
	}
   /* Check if Join Now Button is displayed within Sidebar Menu */
	public boolean IsSideBarJoinNowButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_JoinNow)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow)).isDisplayed();

	}
	/* Check if Login Button is displayed within Sidebar Menu */
	public boolean IsSideBarLoginButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Login)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_Login)).isDisplayed();
	}
	/* Check if Home link is displayed within Sidebar Menu */
	public boolean IsSideBarHomeLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SiderBarMenu_Home)));
		return d.findElement(By.cssSelector(Constant.SiderBarMenu_Home)).isDisplayed();

	}
	/* Check if GettingStarted link is displayed within Sidebar Menu */
	public boolean IsSideBarGettingStartedDropDownArrowLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow)).isDisplayed();

	}
	 /* Check if How To Get Started link is displayed within Getting Started Menu on Sidebar Menu */
	public boolean IsSideBarGettingStartedDropDownHowToGetStartedLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted)).isDisplayed();

	}
	/* Check if How To Deposit link is displayed within Getting Started Menu on Sidebar Menu */
	public boolean IsSideBarGettingStartedDropDownHowToDepositLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit)).isDisplayed();

	}
	/* Check if How To Withdraw link is displayed within Getting Started Menu on Sidebar Menu */
	public boolean IsSideBarGettingStartedDropDownHowToWithdrawLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)).isDisplayed();
	}
	/* Check if Is My Deposit Safe link is displayed within Getting Started Menu on Sidebar Menu */
	public boolean IsSideBarGettingStartedDropDownIsMyDepositSafeLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe)).isDisplayed();

	}
	/* Check if Security link is displayed within Getting Started Menu on Sidebar Menu */
	public boolean IsSideBarGettingSecurityLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_Security)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_Security)).isDisplayed();

	}
	/* Check if Help link is displayed within Sidebar Menu */
	public boolean IsSideBarHelpLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Help)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_Help)).isDisplayed();
	}
	/* Check if TV Presenter link is displayed within Sidebar Menu */
	public boolean IsSideBarTVPresenterLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_TVPresenter)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_TVPresenter)).isDisplayed();

	}
	/* Check if Responsible Gambling link is displayed within Sidebar Menu */
	public boolean IsSideBarResponsibleGamblingLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling)).isDisplayed();
	}
	/* Check if Account Dropdown menu link is displayed within Sidebar Menu */
	public boolean IsSideBarMyAccountDropDownMemuArrowLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount)).isDisplayed();

	}
	/* Check if Account Dropdown menu link is displayed within Sidebar Menu */
	public boolean IsSideBarMyAccountDropDownMemuDepositLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount_Deposit)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Deposit)).isDisplayed();

	}
	/* Check if Transaction link is displayed within the Account Dropdown menu on the Sidebar Menu */
	public boolean IsSideBarMyAccountDropDownMenuTransactionLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount_Transactions)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Transactions)).isDisplayed();

	}
	/* Check if Withdrawal link is displayed within the Account Dropdown menu on the Sidebar Menu */
	public boolean IsSideBarMyAccountDropDownMenuWithdrawLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount_Withdraw)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Withdraw)).isDisplayed();

	}
	/* Check if Change Password link is displayed within the Account Dropdown menu on the Sidebar Menu */
	public boolean IsSideBarMyAccountDropDownMenuAChangePasswordLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarmenu_ChangePassword)));
		return d.findElement(By.cssSelector(Constant.SideBarmenu_ChangePassword)).isDisplayed();

	}
	/* Check if Chat link is displayed within Sidebar Menu */
	public boolean isSideBarLiveChatLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SiderBarMenu_LiveChat)));
		return d.findElement(By.cssSelector(Constant.SiderBarMenu_LiveChat)).isDisplayed();

	}
	/* Check if Logout link is displayed within Sidebar Menu */
	public boolean IsSideBarLogOutLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Logout)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_Logout)).isDisplayed();

	}
	/* Click on Register Now Button within Sidebar Menu */
	public void clickJoinNow() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SideBarMenu_JoinNow)));
		WebElement JoinNowButton = d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", JoinNowButton);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow)).click();

	}
	/* Click on Login Button within Sidebar Menu */
	public void clickSideBarLoginButton() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Login)));
		WebElement LoginButton = d.findElement(By.cssSelector(Constant.SideBarMenu_Login));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", LoginButton);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_Login)).click();
	}
	/* Click on  Home Link within Sidebar Menu */
	public void clickSideBarSideBarHomeLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SiderBarMenu_Home)));
		WebElement HomeLink = d.findElement(By.cssSelector(Constant.SiderBarMenu_Home));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", HomeLink);
		// d.findElement(By.cssSelector(Constant.SiderBarMenu_Home)).click();

	}
	/* Click on Getting Started Menu within Sidebar Menu */
	public void clickSideBarGettingStartedDropDownArrowLinkk() {
		WebDriverWait wait = new WebDriverWait(d, 40);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow)));
		WebElement GettingStartedDropDownArrow = d
				.findElement(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", GettingStartedDropDownArrow);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow)).click();
	}
	/* Click on How To Get Started link within Getting Started Menu on Sidebar Menu */
	public void clickSideBarGettingStartedDropDownHowToGetStartedLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToGetStarted)));
		WebElement GettingStartedLink = d
				.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToGetStarted));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", GettingStartedLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToGetStarted)).click();
	}
	/* Click on How To Deposit link within Getting Started Menu on Sidebar Menu */
	public void clickSideBarGettingStartedDropDownHowToDepositLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit)));
		WebElement HowToDepositLink = d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", HowToDepositLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit)).click();

	}
	/* Click on How To Withdraw link within Getting Started Menu on Sidebar Menu */
	public void clickSideBarGettingStartedDropDownHowToWithdrawLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)));
		WebElement HowToDepositLink = d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", HowToDepositLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)).click();
	}
	/* Click on How To Get Started link within Getting Started Menu on Sidebar Menu */
	public void clickSideBarGettingStartedDropDownIsMyDepositSafeLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe)));
		WebElement IsMyDepositLink = d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", IsMyDepositLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe)).click();
	}

	public void clickSideBarGettingSecurityLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe)));
		WebElement IsMyDepositLink = d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_Security));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", IsMyDepositLink);
		d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_Security)).click();

	}

	public void clickSideBarMenuHelpLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Help)));
		WebElement HelpLink = d.findElement(By.cssSelector(Constant.SideBarMenu_Help));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", HelpLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_Help)).click();
	}

	public void clickSideBarMenuTVPresenterLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_TVPresenter)));
		WebElement TVPresenterLink = d.findElement(By.cssSelector(Constant.SideBarMenu_TVPresenter));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", TVPresenterLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_TVPresenter)).click();

	}

	public void clickSideBarMenuLiveChatLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SiderBarMenu_LiveChat)));
		WebElement LiveChatLinkLink = d.findElement(By.cssSelector(Constant.SiderBarMenu_LiveChat));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", LiveChatLinkLink);

	}

	public void clickSideBarMenuResponsibleGamblingLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling)));
		WebElement ResponsibleGamblingLink = d.findElement(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", ResponsibleGamblingLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling)).click();
	}

	public void clickSideBarMyAccountDropDownMemuArrowLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount)));
		WebElement MyAccountink = d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", MyAccountink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount)).click();

	}

	public void clickSideBarMyAccountDropDownMemuDepositLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount_Deposit)));
		WebElement MyAccountDepositLink = d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Deposit));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", MyAccountDepositLink);
		

	}

	public void clickSideBarMyAccountDropDownMenuTransactionLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement MyAccountTransactionLink = d
				.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Transactions));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", MyAccountTransactionLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Transactions)).click();

	}

	public void clickSideBarMyAccountDropDownMenuWithdrawLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement WithdrawaLink = d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Withdraw));
		wait.until(ExpectedConditions.visibilityOf(WithdrawaLink));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", WithdrawaLink);
		

	}

	public void clickSideBarMyAccountDropDownMenuAChangePasswordLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		WebElement WithdrawaLink = d.findElement(By.cssSelector(Constant.SideBarmenu_ChangePassword));
		wait.until(ExpectedConditions.visibilityOf(WithdrawaLink));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", WithdrawaLink);
		

	}

	public void clickSideBarLogOutLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Logout)));
		WebElement LogOutLink = d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", LogOutLink);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_Logout)).click();

	}
}
