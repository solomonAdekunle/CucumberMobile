package Cashier;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BasePage;
import Util.Constant;

public class WithdrawPage extends BasePage {
	public double cashierCurrentBal;

	public WithdrawPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public boolean isNoWithdrawalMethodsAvailablePopUpBoxPresent() {
		this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(Constant.CashierWithdraw_NoWithdrawMethodAvailablePop_UpBox)));
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_NoWithdrawMethodAvailablePop_UpBox)).isDisplayed();
	}

	public boolean isWithdrawFundsTextPresent() {
		this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d,100);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_WithdrawFundsTexts)));
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_WithdrawFundsTexts)).isDisplayed();
	}

	public boolean isWithdrawCreditCardLogoPresent() {
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_CreditCardLogo)).isDisplayed();
	}

	public boolean isWithdrawCreditCardOwnerNamesPresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardOwnerName)).isDisplayed();
	}

	public boolean isWithdrawCreditCardExpiryPresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiredDate)).isDisplayed();
	}

	public boolean isWithdrawOtherAmountToWithdrawPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_AmountToWithdraw)));
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_AmountToWithdraw)).isDisplayed();
	}

	public boolean isWithdrawInActiveWithdrawButtonPresent() {
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_DisabledWithdrawButton)).isDisplayed();
	}

	public boolean isWithdrawActiveWithdrawButtonPresent() {
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_WithdrawButton)).isDisplayed();
	}

	public boolean isWithdrawSuccessPopUpBoxresent() {
		WebDriverWait wait = new WebDriverWait(d, 60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_WithdrawSuccesPop_Box)));
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_WithdrawSuccesPop_Box)).isDisplayed();
	}

	public boolean isWithdrawPendingWithdrawalCancelButton() {
		WebDriverWait wait = new WebDriverWait(d, 60);
		// wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_Cancel)));
		return d.findElement(By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_Cancel)).isDisplayed();
	}

	public boolean isCashierWithdrawPendingNotificationPopBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierPendingWithdrawalNotification_PopBox)));
		return d.findElement(By.cssSelector(Constant.CashierPendingWithdrawalNotification_PopBox)).isDisplayed();
	}

	public void clickCashierMenuIcon() {
		WebDriverWait wait = new WebDriverWait(d, 100);
		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_MenuIcon)));
		WebElement CashierIconMenu = d.findElement(By.cssSelector(Constant.CashierDeposit_MenuIcon));
		wait.until(ExpectedConditions.visibilityOf(CashierIconMenu));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", CashierIconMenu);
		WebElement Menuclick=d.findElement(By.id("preloader"));
		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOf( Menuclick));
		Menuclick.click();
		// d.findElement(By.cssSelector(Constant.CashierDeposit_MenuIcon)).click();
	}

	public void clickCashierWithdrawButton() {
		d.findElement(By.cssSelector(Constant.CashierWithdraw_WithdrawButton)).click();
	}

	public void clickCashierWithdrawSuccessPopUpBoxOKButton() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_WithdrawSuccessPopBox_Ok)));
		WebElement SuccesOkButton = d.findElement(By.cssSelector(Constant.CashierWithdraw_WithdrawSuccessPopBox_Ok));
		Actions move = new Actions(d);
		move.moveToElement(SuccesOkButton).perform();
		d.findElement(By.cssSelector(Constant.CashierWithdraw_WithdrawSuccessPopBox_Ok)).click();

	}

	public void clickCashier() {
		WebDriverWait wait = new WebDriverWait(d, 100);
		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_MenuIcon)));
		WebElement CashierIconMenu = d.findElement(By.cssSelector(Constant.CashierDeposit_MenuIcon));
		wait.until(ExpectedConditions.visibilityOf(CashierIconMenu));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", CashierIconMenu);
	}

	public void clickCashierWithdrawPendingCancelButton() {
		this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_Cancel)));
		d.findElement(By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_Cancel)).click();
	}

	public void clickCashierWithdrawPendingCancelNOConfirmationButton() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_CancelConfirmationPopBox_No)));
		d.findElement(By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_CancelConfirmationPopBox_No)).click();
	}

	public void clickCashierWithdrawPendingCancelYesConfirmationButton() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_WithdrawConfirmationPopBox_Yes)));
		d.findElement(By.cssSelector(Constant.CashierWithdraw_WithdrawConfirmationPopBox_Yes)).click();
	}

	public void clickCashierWithdrawPendingCancelConfirmationOKButton() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_CancelConfirmationPopBox_OK)));
		d.findElement(By.cssSelector(Constant.CashierWithdraw_PendingWithdrawal_CancelConfirmationPopBox_OK)).click();
	}

	public void clickCashierWithdrawPendingNotificationPopBox_GoToDepositButon() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(Constant.CashierPendingWithdrawalNotificationPopBox_GoToDeposit)));
		d.findElement(By.cssSelector(Constant.CashierPendingWithdrawalNotificationPopBox_GoToDeposit)).click();
	}

	public void clickCashierWithdrawPendingNotificationPopBox_VisaCancelButon() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(
				By.cssSelector(Constant.CashierPendingWithdrawalNotificationPopBox_VisaCancelButton)));
		d.findElement(By.cssSelector(Constant.CashierPendingWithdrawalNotificationPopBox_VisaCancelButton)).click();
	}

	public void clickCashierWithdrawDeclinedTransactionPopBox_Ok() {
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdrawalTransactionDeclinedPopBox_Ok)));
		d.findElement(By.cssSelector(Constant.CashierWithdrawalTransactionDeclinedPopBox_Ok)).click();

	}

	public void sendCashierAmountToWithdraw(String withdrawAmount) {
		this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.visibilityOfElementLocated(By.cssSelector(Constant.CashierWithdraw_AmountToWithdraw)));
		d.findElement(By.cssSelector(Constant.CashierWithdraw_AmountToWithdraw)).sendKeys(withdrawAmount);
	}

	public void NavigateBackToHomePage() {
		d.navigate().back();
		WebDriverWait wait = new WebDriverWait(d, 20);
		d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).click();
		WebElement Logoutlink = d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
		wait.until(ExpectedConditions.visibilityOf(Logoutlink));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Logoutlink);
	}

	public void SwitchFrame() {
		WebElement Frame = d.findElement(By.cssSelector("iframe.fill"));
		d.switchTo().frame(Frame);

	}

	public void storePreviousBalance() {
		WebDriverWait wait = new WebDriverWait(d, 45);
		wait.ignoring(NoSuchElementException.class).ignoring(StaleElementReferenceException.class);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_AccountBalance)));
		String CashBal = d.findElement(By.cssSelector(Constant.CashierDeposit_AccountBalance)).getText();
		String Balance = CashBal.replace(",", "").substring(1);
		cashierCurrentBal = Double.parseDouble(Balance);
	}

	public double storeCashierBalance() {
		d.switchTo().defaultContent();
		// this.SwitchFrame();
		String CashBal = d.findElement(By.cssSelector(Constant.CashierDeposit_AccountBalance)).getText();
		String Balance = CashBal.replace(",", "").substring(1);
		double BalCash = Double.parseDouble(Balance);
		// System.out.println(BalCash);
		return BalCash;

	}
}
