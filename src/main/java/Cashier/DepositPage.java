 package Cashier;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.internal.Coordinates;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import Pages.BasePage;
import Util.Constant;

public class DepositPage extends BasePage {
	  public double cashierCurrentBal;
	public DepositPage(WebDriver d) {
		super(d);
		
		// TODO Auto-generated constructor stub
	}

	/////////////////////////////////////////////////////////////////////////////////////////////////
	/////////////////////////////// Verification method
	///////////////////////////////////////////////////////////////////////////////////////////////// /////////////////////////////////////////////
	public boolean isSafeChargeLogoPresent() {
		this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d, 30);
		wait.until(
				ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_SafechargeLogo)));
		WebElement SafechargeLogo = d.findElement(By.cssSelector(Constant.CashierDeposit_SafechargeLogo));
		return SafechargeLogo.isDisplayed();
		// d.findElement(By.cssSelector(Constant.CashierDeposit_SafechargeLogo)).isDisplayed();

	}

	public boolean isUserNamePresent(String Username) {
		d.switchTo().defaultContent();
		WebDriverWait wait = new WebDriverWait(d,50);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_UserNameInfo)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_UserNameInfo)).isDisplayed();

	}

	public boolean isCashierPaymentDetailsTextPresent() {

		WebDriverWait wait = new WebDriverWait(d, 40);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_PaymentDetailsText)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_PaymentDetailsText)).isDisplayed();

	}

	public boolean isCashierPaymentsMethodTextPresent() {
		this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d, 40);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_PaymentDetailsText)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_PaymentDetailsText)).isDisplayed();

	}

	public boolean isCashierPaymentsLogoPresent() {
		// this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d, 40);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_PaymentDetailsText)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_PaymentList)).isDisplayed();

	}

	public boolean isCashierOtherPaymentsLogoPresent() {
		// this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_OtherMethodsPaymentLogo)));
		WebElement otherLogo = d.findElement(By.cssSelector(Constant.CashierDeposit_OtherMethodsPaymentLogo));
		Actions move = new Actions(d);
		move.moveToElement(otherLogo).perform();
		return d.findElement(By.cssSelector(Constant.CashierDeposit_OtherMethodsPaymentLogo)).isDisplayed();

	}

	public boolean isCashierCreditCardOwnerNamePresent() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_CardOwnerName)));
		// WebElement
		// CardHolderName=d.findElement(By.cssSelector(Constant.CashierDeposit_AccuntholderName));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardOwnerName)).isDisplayed();

	}

	public boolean isCashierCreditCardLastFourNumberPresent(String cardnumber) {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_LastFourNumber)).isDisplayed();

	}

	public boolean isCashierCreditCardExpiryDatePresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiredDate)).isDisplayed();

	}

	public boolean isCashierCreditCardCVVPresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CVV)).isDisplayed();
	}

	public boolean isCashierSafeChargeDepositButtonPresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_DEPOSIT)).isDisplayed();

	}

	public boolean isCashierPromoCodePresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_PromotionCode)).isDisplayed();

	}

	public boolean isCashierBillingAddressCheckBoxPresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_BillingAddressCheck)).isDisplayed();
	}

	public boolean isCashierAmountToDepositPresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_AmountToDeposit)).isDisplayed();

	}

	public boolean isCashierOtherAmountInputFieldPresent() {
		return d.findElement(By.cssSelector(Constant.CashierDeposit_OtherAmountToDeposit)).isDisplayed();

	}
	
	public boolean isCashierDepositSuccessLightBoxPresent(){
		WebDriverWait wait = new WebDriverWait(d,60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.lightbox-header h2")));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_SuccessDepositPop_Box)).isDisplayed();
		
	}
	
	public boolean isCashierDepositSuccessLightBoxTextPresent(){
		WebDriverWait wait = new WebDriverWait(d,60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_SuccessDepositPopBoxMessage)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_SuccessDepositPopBoxMessage)).isDisplayed();
	}
	public boolean isCashierDepositSuccessLightBoxCloseButtonPresent(){
		WebDriverWait wait = new WebDriverWait(d,60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_SuccessDepositPopBoxCloseButton)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_SuccessDepositPopBoxCloseButton)).isDisplayed();
	}
	public boolean isCreditCardEXperiationMonthErrorMessagePresent(){
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryMonthErrorMessage)).isDisplayed();
		
	}
	
	public boolean isCreditCardEXperiationYearErrorMessagePresent(){
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryYearErrorMessage)).isDisplayed();
		
	}
	
	public boolean isCreditCardCVVErrorMessagePresent(){
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardCVVErrorMessage)).isDisplayed();
		
	}
	
	public boolean isCashierDepositOtherAmounToDepositErrorMessagePresent(){
		return d.findElement(By.cssSelector(Constant.CashierDeposit_OtherAmountToDepositInvalidAmount)).isDisplayed();
		
	}
	public boolean isCashierDepositCardCVVNumberGreenMarkPresent(){
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CVVGreenTick)).isDisplayed();
		
	}
	
	public boolean isCashierDepositCardNumberGreenMarkPresent(){
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_CardNumberInputBoxGreenTick)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_CardNumberInputBoxGreenTick)).isDisplayed();
		
	}
	public boolean isCashierDepositOtherAmountToDepositGreenMarkPresent(){
		WebDriverWait wait= new WebDriverWait(d,30);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_OtherAmountToDepositGreenTick)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_OtherAmountToDepositGreenTick)).isDisplayed();
		
	}
	public boolean isCashierDepositDeclinedPop_BoxPresent(){
		WebDriverWait wait= new WebDriverWait(d,60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_DepositDeclinePop_UpBox)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_DepositDeclinePop_UpBox)).isDisplayed();
		
	}
	
	public boolean isCashierDepositDeclinedPopBoxMessagePresent(){
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_DepositDeclinePopUpBoxText)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_DepositDeclinePopUpBoxText)).isDisplayed();
		
	}
	
	public boolean isCashierDepositDeclinedPopBoxMCustomerSupportContactNumberPresent(){
		WebDriverWait wait= new WebDriverWait(d,30);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_DepositDeclinedPopUpBoxContactSupportNumber)));
		return d.findElement(By.cssSelector(Constant.CashierDeposit_DepositDeclinePopUpBoxText)).isDisplayed();
		
	}
	
	public boolean isCashierDepositDeclinedPopBoxCloseIconPresent(){
		WebDriverWait wait= new WebDriverWait(d,45);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_DepositDeclinedPopBoxCloseIcon)));
		WebElement DepositDeclinedCloseIcon=d.findElement(By.cssSelector(Constant.CashierDeposit_DepositDeclinedPopBoxCloseIcon));
		Actions move = new Actions(d);
		move.moveToElement(DepositDeclinedCloseIcon).build();
		move.perform();
		return DepositDeclinedCloseIcon.isDisplayed();
		
		
	}
	///////////////////////////// \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	//////////////////////////// Send method\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
	
	
	public void sendCashierDepositCardExpiryMonth(String CardExpiryDateMonth) {
		d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryMonth)).sendKeys(CardExpiryDateMonth);
	}

	public void sendCashierDepositCardExpiryYear(String CardExpiryDateYear) {

		d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryYear)).sendKeys(CardExpiryDateYear);
	}

	public void sendCashierDepositCardCVVNumber(String CardCVVNumber) {
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_CVV)));
		  d.findElement(By.cssSelector(Constant.CashierDeposit_CVV)).sendKeys(CardCVVNumber);
	 
		}
		
	

	public void sendCashierDepositOtherAmountToDeposit(String Amount) {
		 d.findElement(By.cssSelector(Constant.CashierDeposit_OtherAmountToDeposit)).clear();
		d.findElement(By.cssSelector(Constant.CashierDeposit_OtherAmountToDeposit)).sendKeys(Amount);
	}
	 
	public void sendCashierDepositCreditCardNumbers(String cardNumbers){
		WebDriverWait wait = new WebDriverWait(d,45);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_CardNumberInputBox)));
		d.findElement(By.cssSelector(Constant.CashierDeposit_CardNumberInputBox)).sendKeys(cardNumbers);
		
	}
	public void sendCashierDepositCreditCradExpireDateMonth(String cardExpiryMonth){
		WebDriverWait wait = new WebDriverWait(d,45);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_CardExpiryMonth)));
		WebElement ExpiryDateMonth=d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryMonth));

		d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryMonth)).sendKeys(cardExpiryMonth);
	}
	public void sendCashierDepositCreditCardExpireDateYear(String cardExpiryYear){
		WebElement ExpiryDateYear=d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryYear));
		Actions move= new Actions(d);
		move.moveToElement(ExpiryDateYear);
		move.click();
		move.sendKeys(cardExpiryYear);
		move.perform();
		//d.findElement(By.cssSelector(Constant.CashierDeposit_CardExpiryYear)).sendKeys(cardExpiryYear);
	}

	///////////////////////////////////////////////////////////////////
	///// Click Method \\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	public void clickCashierDepositSafeChargeDepositButton() {
		d.findElement(By.cssSelector(Constant.CashierDeposit_DEPOSIT)).click();

	}
	public void clickCashierDepositSuccessPopBoxCloseButton() {
		//this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d,60);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.cssSelector("div.blockOverlay")));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_SuccessDepositPopBoxCloseButton)));
		d.findElement(By.cssSelector(Constant.CashierDeposit_SuccessDepositPopBoxCloseButton)).click();

	}
	public void clickCashierDepositPaymentMethodLogo(){
		this.SwitchFrame();
		WebDriverWait wait = new WebDriverWait(d,45);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierDeposit_PaymentVisaLogo)));
		WebElement PaymentMethodLogo=d.findElement(By.cssSelector(Constant.CashierDeposit_PaymentVisaLogo));
		Actions move= new Actions(d);
		move.moveToElement(PaymentMethodLogo).perform();;
		PaymentMethodLogo.click();
		//d.findElement(By.cssSelector(Constant.CashierDeposit_PaymentVisaLogo)).click();
	}
	
	public void clickCashierMenuDepositLink(){
		WebDriverWait wait = new WebDriverWait(d,45);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector(Constant.CashierMenu_MyAccountDeposit)));
	d.findElement(By.cssSelector(Constant.CashierMenu_MyAccountDeposit)).click();

	}

	////////////////////////////////////////////////////////////////////////////////////////////
	//////////////// Store Element or
	//////////////////////////////////////////////////////////////////////////////////////////// values/////////////////////////////////////////////////////
	public void storePreviousBalance() {
		WebDriverWait wait = new WebDriverWait(d,45);
		wait.ignoring(NoSuchElementException.class)
		    .ignoring(StaleElementReferenceException.class);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.CashierDeposit_AccountBalance)));
		String CashBal = d.findElement(By.cssSelector(Constant.CashierDeposit_AccountBalance)).getText();
		String Balance = CashBal.replace(",", "").substring(1);
		cashierCurrentBal = Double.parseDouble(Balance);
		this.SwitchFrame();
		//System.out.println(cashierCurrentBal);
	}

	public double storeCashierBalance() {
		d.switchTo().defaultContent();
		// this.SwitchFrame();
		String CashBal = d.findElement(By.cssSelector(Constant.CashierDeposit_AccountBalance)).getText();
		String Balance = CashBal.replace(",", "").substring(1);
		double BalCash = Double.parseDouble(Balance);
		//System.out.println(BalCash);
		return BalCash;

	}

	///////////////////////////////////////////////////////////////////////////////////////////////////////
	///////////////////////////////////////// Other
	/////////////////////////////////////////////////////////////////////////////////////////////////////// Methods\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\

	public void SwitchFrame() {
		WebElement Frame = d.findElement(By.cssSelector("iframe.fill"));
	    	d.switchTo().frame(Frame);
			
		
			
		
	}

	public void NavigateBackToHomePage()  {
		d.navigate().back();
		WebDriverWait wait = new WebDriverWait(d, 40);
		d.findElement(By.cssSelector(Constant.hp_SidebarIcon)).click();
		WebElement Logoutlink = d.findElement(By.cssSelector(Constant.SideBarMenu_Logout));
		wait.until(ExpectedConditions.visibilityOf(Logoutlink));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", Logoutlink);
	}
	
	public void SwitchDefaultCashier(){
		d.switchTo().defaultContent();
	}

}