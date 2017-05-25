package Pages;

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
		// TODO Auto-generated constructor stub
	}

	public boolean IsSideBarJoinNowButtonPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow)).isDisplayed();

	}

	public boolean IsSideBarLoginButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Login)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_Login)).isDisplayed();
	}

	public boolean IsSideBarHomeLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SiderBarMenu_Home)));
		return d.findElement(By.cssSelector(Constant.SiderBarMenu_Home)).isDisplayed();

	}

	public boolean IsSideBarGettingStartedDropDownArrowLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow)).isDisplayed();

	}

	public boolean IsSideBarGettingStartedDropDownHowToGetStartedLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted)).isDisplayed();

	}

	public boolean IsSideBarGettingStartedDropDownHowToDepositLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit)).isDisplayed();

	}

	public boolean IsSideBarGettingStartedDropDownHowToWithdrawLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)).isDisplayed();
	}

	public boolean IsSideBarGettingStartedDropDownIsMyDepositSafeLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe)).isDisplayed();

	}

	public boolean IsSideBarGettingSecurityLinkPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_Security)));
		return d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_Security)).isDisplayed();

	}

	public boolean IsSideBarHelpLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_Help)).isDisplayed();
	}

	public boolean IsSideBarTVPresenterLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_TVPresenter)).isDisplayed();

	}

	public boolean IsSideBarResponsibleGamblingLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling)).isDisplayed();
	}

	public boolean IsSideBarMyAccountDropDownMemuArrowLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount)).isDisplayed();

	}

	public boolean IsSideBarMyAccountDropDownMemuDepositLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Deposit)).isDisplayed();

	}

	public boolean IsSideBarMyAccountDropDownMenuTransactionLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Transactions)).isDisplayed();

	}

	public boolean IsSideBarMyAccountDropDownMenuWithdrawLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Withdraw)).isDisplayed();

	}

	public boolean IsSideBarMyAccountDropDownMenuAChangePasswordLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarmenu_ChangePassword)).isDisplayed();

	}

	public boolean IsSideBarLogOutLinkPresent() {
		return d.findElement(By.cssSelector(Constant.SideBarMenu_Logout)).isDisplayed();

	}

	public void clickJoinNow() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.SideBarMenu_JoinNow)));
		WebElement JoinNowButton = d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", JoinNowButton);
		// d.findElement(By.cssSelector(Constant.SideBarMenu_JoinNow)).click();

	}

	public void clickSideBarLoginButton() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Login)));
		WebElement LoginButton = d.findElement(By.cssSelector(Constant.SideBarMenu_Login));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", LoginButton);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_Login)).click();
	}

	public void clickSideBarSideBarHomeLink() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SiderBarMenu_Home)));
		WebElement HomeLink = d.findElement(By.cssSelector(Constant.SiderBarMenu_Home));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",HomeLink);
		//d.findElement(By.cssSelector(Constant.SiderBarMenu_Home)).click();

	}

	public void clickSideBarGettingStartedDropDownArrowLinkk() {
		WebDriverWait wait = new WebDriverWait(d,40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow)));
		WebElement GettingStartedDropDownArrow = d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",GettingStartedDropDownArrow);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStartedMenuArrow)).click();
	}

	public void clickSideBarGettingStartedDropDownHowToGetStartedLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToGetStarted)));
		WebElement GettingStartedLink= d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToGetStarted));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",GettingStartedLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToGetStarted)).click();
	}

	public void clickSideBarGettingStartedDropDownHowToDepositLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit)));
		WebElement HowToDepositLink= d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",HowToDepositLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowToDeposit)).click();

	}

	public void clickSideBarGettingStartedDropDownHowToWithdrawLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)));
		WebElement HowToDepositLink= d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",HowToDepositLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_HowTWithdraw)).click();
	}

	public void clickSideBarGettingStartedDropDownIsMyDepositSafeLink() {
		d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_IsDepositSafe)).click();
	}

	public void clickSideBarGettingSecurityLink() {
		d.findElement(By.cssSelector(Constant.SideBarMenu_GettingStarted_Security)).click();

	}

	public void clickSideBarMenuHelpLink() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Help)));
		WebElement HelpLink= d.findElement(By.cssSelector(Constant.SideBarMenu_Help));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",HelpLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_Help)).click();
	}

	public void clickSideBarMenuTVPresenterLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_TVPresenter)));
		WebElement TVPresenterLink= d.findElement(By.cssSelector(Constant.SideBarMenu_TVPresenter));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",TVPresenterLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_TVPresenter)).click();

	}

	public void clickSideBarMenuResponsibleGamblingLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling)));
		WebElement ResponsibleGamblingLink= d.findElement(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",ResponsibleGamblingLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_ResponsibleGambling)).click();
	}

	public void clickSideBarMyAccountDropDownMemuArrowLink() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount)));
		WebElement MyAccountink= d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",MyAccountink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount)).click();

	}

	public void clickSideBarMyAccountDropDownMemuDepositLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_MyAccount_Deposit)));
		WebElement MyAccountDepositLink= d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Deposit));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",MyAccountDepositLink);
		Thread.sleep(2000);
		d.navigate().back();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_SidebarIcon)));
		d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).click();
		WebElement Logoutlink=d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
		wait.until(ExpectedConditions.visibilityOf(Logoutlink));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Logoutlink);
		
		
	}

	public void clickSideBarMyAccountDropDownMenuTransactionLink() {
		WebElement MyAccountTransactionLink= d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Transactions));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",MyAccountTransactionLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Transactions)).click();

	}

	public void clickSideBarMyAccountDropDownMenuWithdrawLink() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(d,30);
		d.findElement(By.cssSelector(Constant.SideBarMenu_MyAccount_Withdraw)).click();
		Thread.sleep(2000);
		d.navigate().back();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.hp_SidebarIcon)));
		d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).click();
		WebElement Logoutlink=d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
		wait.until(ExpectedConditions.visibilityOf(Logoutlink));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Logoutlink);

	}

	public void clickSideBarMyAccountDropDownMenuAChangePasswordLink() {
		d.findElement(By.cssSelector(Constant.SideBarmenu_ChangePassword)).click();

	}

	public void clickSideBarLogOutLink() {
		WebDriverWait wait = new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.SideBarMenu_Logout)));
		WebElement LogOutLink= d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
		((JavascriptExecutor) d).executeScript("arguments[0].click();",LogOutLink);
		//d.findElement(By.cssSelector(Constant.SideBarMenu_Logout)).click();

	}
}
