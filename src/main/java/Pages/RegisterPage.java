package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class RegisterPage extends BasePage {

	/* Initialised WebDriver */
	public RegisterPage(WebDriver d) {
		super(d);
	}

	/* Go to Registrtaion page */
	public void getRegisterUrl(String baseUrl) {
		d.get(baseUrl + "/register");

	}

	/* Check if Register is displayed as title on Registration page */
	public String isRegisterPageTitlePresent() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.RegisterTitle)));
		String Title = d.findElement(By.cssSelector(Constant.RegisterTitle)).getText();
		return Title;

	}

	/* Enter your UserName on Registration page */
	public void sendRegUserNmae(String username) {
		String UserName = username;
		if (UserName.equals("{generator}")) {
			UserName = generateStringWithAllobedSplChars(20, "");
		}
		d.findElement(By.name(Constant.Register_Username)).sendKeys(UserName);
	}

	/* Enter your Password on Registration Page */
	public void sendRegPasswor(String password) {
		d.findElement(By.name(Constant.Register_Password)).sendKeys(password);
	}

	public void sendRegConfPassword(String ConfPassword){
		d.findElement(By.name(Constant.Register_ConfPassword)).sendKeys(ConfPassword);
	}
	
	public void sendRegTitle(String title){
		d.findElement(By.name(Constant.Register_Title)).sendKeys(title);
	}
	
	/* Enter your ON ScreenName on Registration Page */
	public void sendRegScreename(String screenName) {
		String ScreenName = screenName;
		if (ScreenName.equals("{generator}")) {
			ScreenName = generateStringWithAllobedSplChars(16, "");
		}
		d.findElement(By.name(Constant.Register_ScreenName)).sendKeys(ScreenName);
	}

	/* Enter your E-mail on Registration Page */
	public void sendRegEmail(String email) {
		d.findElement(By.name(Constant.Register_Email)).sendKeys(email);
	}

	/* Enter your FirstName on Registration Page */
	public void sendRegFirstName(String firstName) {
		d.findElement(By.name(Constant.Register_FirstName)).sendKeys(firstName);
	}

	/* Enter your lastName on Registration Page */
	public void sendRegLastName(String surName) {
		d.findElement(By.name(Constant.Register_SurName)).sendKeys(surName);
	}

	/*
	 * Enter your Day date of Birth from the Drop down menu on Registration Page
	 */
	public void sendRegDOBDay(String Day) {
		d.findElement(By.name(Constant.Register_DOB_Day)).sendKeys(Day);
	}

	/*
	 * Enter your Month date of Birth from the Drop down menu on Registration
	 * Page
	 */
	public void sendRegDOBMonth(String Month) {
		d.findElement(By.name(Constant.Register_DOB_Month)).sendKeys(Month);
	}

	/*
	 * Enter your Year date of Birth from the Drop down menu on Registration
	 * Page
	 */
	public void sendRegDOBYear(String Year) {
		d.findElement(By.name(Constant.Register_DOB_Year)).sendKeys(Year);
	}

	/* Enter your Address Number on Registration Page */
	public void sendRegAddress(String Address) {
		WebDriverWait wait = new WebDriverWait (d,15);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.name(Constant.Register_Address)));
		d.findElement(By.name(Constant.Register_Address)).sendKeys(Address);
	}

	/* Enter the name of your Town or City on Registration Page */
	public void sendRegCity(String Town) {
		d.findElement(By.name(Constant.Register_Town)).sendKeys(Town);
	}

	/* Enter the name of your County on Registration Page */
	public void sendRegCounty(String county) {
		d.findElement(By.name(Constant.Register_County)).sendKeys(county);
	}

	/* Enter your Post code on Registration Page */
	public void sendRegPostCode(String Postcode) {
		d.findElement(By.name(Constant.Register_PostCode)).sendKeys(Postcode);
	}

	/* Enter your Country Name on Registration Page */
	public void sendRegCountry(String country) {
		d.findElement(By.name(Constant.Reg_Country)).sendKeys(country);
	}

	/* Enter your Country Currency on Registration Page */
	public void sendRegCunrrency(String CurrencyType) {
		d.findElement(By.name(Constant.Reg_Currency)).sendKeys(CurrencyType);
	}

	/* Enter your Phone Dialling Code on Registration Page */
	public void sendRegCountryDialingCodeDropdownBox(String DialingCode) {
		d.findElement(By.name(Constant.Reg_CountryDialingCode)).sendKeys(DialingCode);
	}

	/* Enter your Contact Number on Registration Page */
	public void sendRegContactNumber(String contactNumber) {
		d.findElement(By.name(Constant.Register_ContactNumber)).sendKeys(contactNumber);
	}

	/* Select your Deposit Limit Type on Registration Page */
	public void sendRegChooseType(String ChooseType) {
		d.findElement(By.name(Constant.Register_DepositLimitChooseType)).sendKeys(ChooseType);

	}

	/* Enter your Deposit Limit Amount on Registration Page */
	public void sendRegLimitType(String ChooseLimit) {
		d.findElement(By.name(Constant.Register_DepositLimitChooseLimit)).sendKeys(ChooseLimit);
	}

	/* Select your Deposit Limit other Amount on Registration Page */
	public void sendRegDepositLimitOtherAmount(String Other) {
		d.findElement(By.cssSelector(Constant.Register_DepositLimitOtherAmount)).sendKeys(Other);
	}

	/* click on Deposit Limit link on Registration Page */
	public void clickRegDepositLimitLink() {
		WebElement ClikHereDepositLimitLink=d.findElement(By.cssSelector(Constant.Register_DepositLimitClickHere));
		 ((JavascriptExecutor) d).executeScript("arguments[0].click();", ClikHereDepositLimitLink);
	}

	/*
	 * click on click here to enter your address manually link Registration Page
	 */
	public void clickEnterAddressManuallyLink() {
		 WebElement ClickHereToEnterYourAddress=d.findElement(By.cssSelector(Constant.Register_EnterAddressManually));
		 ((JavascriptExecutor) d).executeScript("arguments[0].click();", ClickHereToEnterYourAddress);

		 
	}

	/* click on Over 18 check box on Registration Page */
	public void clickOver18CheckBox() {
		WebElement checkbox = d.findElement(By.name(Constant.Register_Over18CheckBox));
		// Actions move =new Actions(d);
		// move.moveToElement(checkbox).build().perform();
		// checkbox.click();
		((JavascriptExecutor) d).executeScript("arguments[0].click();", checkbox);

		
	}

	/* click on Term And Wagering check box on Registration Page */
	public void clickTermAndWaggeringLink() {
		d.findElement(By.cssSelector(Constant.Register_FreeBonusTermsAndWagering)).click();
	}

	/* click on Over 18 Term link on Registration Page */
	public void clickOver18TermsLink() {
		d.findElement(By.cssSelector(Constant.Register_Over18Term)).click();
	}

	/* click on Over 18 Privacy Policy link on Registration Page */
	public void clickOver18PrivacyPolicyLink() {
		d.findElement(By.cssSelector(Constant.Register_Over18PrivacyPolicy)).click();
	}

	/* click on Submit button on Registration Page */
	public void clickRegisterSubmitButtton() {
		WebElement RegisterSubmitButton=d.findElement(By.id(Constant.Register_Submit));
		((JavascriptExecutor) d).executeScript("arguments[0].click();", RegisterSubmitButton);

		//d.findElement(By.id(Constant.Register_Submit)).click();
	}

	/*
	 * click on Close Icon on Bonus Terms Frame Pop-p box on Registration Page
	 */
	public void clickRegisterBonusTermsfromeBoxCloseIcon() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)));
		d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)).click();

	}

	/* click on Close Icon on Terms Frame Pop-p box on Registration Page */
	public void clickRegisterTermsfromeBoxCloseIcon() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)));
		d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)).click();

	}

	/*
	 * click on Close Icon on Privacy Policy Frame Pop-p box on Registration
	 * Page
	 */
	public void clickRegisterPrivacyPolicyfromeBoxCloseIcon() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)));
		d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)).click();

	}

	/* click on Gender Type Radio button on Registration Page */
	public void clickRegisterGenderType() {
		d.findElement(By.id(Constant.Reg_GenderTypeFemale)).click();
	}

	/* Check if Email input box is displayed on Registration Page */
	public boolean isRegisterEmailInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_Email)).isDisplayed();
	}

	/* Check if Password input box is displayed on Registration Page */
	public boolean isRegisterPasswordInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_Password)).isDisplayed();
	}

	/* Check if UserName input box is displayed on Registration Page */
	public boolean isRegisterUserNameInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_Username)).isDisplayed();
	}

	/* Check if On ScreenName input box is displayed on Registration Page */
	public boolean isRegisterScreenNameInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_ScreenName)).isDisplayed();
	}

	/* Check if FirstName input box is displayed on Registration Page */
	public boolean isRegisterFirstNameInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_FirstName)).isDisplayed();
	}

	/* Check if SurName input box is displayed on Registration Page */
	public boolean isRegisterSurNameInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_SurName)).isDisplayed();
	}

	/*
	 * Check if Day Date of birth Dropdown menu box is displayed on Registration
	 * Page
	 */
	public boolean isRegisterDOBDayDropdownBoxPresent() {
		return d.findElement(By.name(Constant.Register_DOB_Day)).isDisplayed();
	}

	/*
	 * Check if Month Date of birth Dropdown menu box is displayed on
	 * Registration Page
	 */
	public boolean isRegisterDOBMonthDropdownBoxPresent() {
		return d.findElement(By.name(Constant.Register_DOB_Month)).isDisplayed();
	}

	/* Check if Female Gender Radio button is displayed on Registration Page */
	public boolean isRegisterGenderTypeFemaleRadioButtonPresent() {
		return d.findElement(By.id(Constant.Reg_GenderTypeFemale)).isDisplayed();
	}

	/*
	 * Check if Year Date of birth Dropdown menu box is displayed on
	 * Registration Page
	 */
	public boolean isRegisterDOBYearhDropdownBoxPresent() {
		return d.findElement(By.name(Constant.Register_DOB_Year)).isDisplayed();
	}

	/* Check if Male Gender Radio button is displayed on Registration Page */
	public boolean isRegisterGenderTypeMaleRadioButtonPresent() {
		return d.findElement(By.id(Constant.Reg_GenderTypeMale)).isDisplayed();
	}

	/* Check if Country input box is displayed on Registration Page */
	public boolean isRegisterCountryInputBoxPresent() {
		return d.findElement(By.name(Constant.Reg_Country)).isDisplayed();
	}

	/* Check if Currency dropdown box is displayed on Registration Page */
	public boolean isRegisterCunrrencyDropdownBoxPresent() {
		return d.findElement(By.name(Constant.Reg_Currency)).isDisplayed();
	}

	/* Check if House Number input box is displayed on Registration Page */
	public boolean isRegisterHouseNumberInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_Address)).isDisplayed();
	}

	/* Check if Find Address Green Button is displayed on Registration Page */
	public boolean isRegisterFindAddressButtonPresent() {
		return d.findElement(By.name(Constant.Reg_FindAddressButton)).isDisplayed();
	}

	/*
	 * Check if Country Dialling code drop down menu box is displayed on
	 * Registration Page
	 */
	public boolean isRegisterCountryDialingCodeDropdownBoxPresent() {
		return d.findElement(By.name(Constant.Reg_CountryDialingCode)).isDisplayed();
	}

	/* Check if Contact Number input box is displayed on Registration Page */
	public boolean isRegisterContactNumberInputBoxPresent() {
		return d.findElement(By.name(Constant.Register_ContactNumber)).isDisplayed();
	}
	
	 /* Check if free Bonus check box  box is displayed on Registration Page */
	public boolean isRegisterFreeBonusessCheckedBoxPresent() {
		return d.findElement(By.name(Constant.Register_FreeBonusCheckBox)).isDisplayed();
	}
	 /* Check if Over 18 plus check box is displayed on Registration Page */
	public boolean isRegisterOverEightennPlusCheckBoxPresent() {
		return d.findElement(By.name(Constant.Register_Over18CheckBox)).isDisplayed();
	}
	/* Check if Over 18 plus term link is displayed on Registration Page */
	public boolean isRegisterOverEighteenTermsPresent() {
		return d.findElement(By.name(Constant.Register_Over18Term)).isDisplayed();
	}
	/* Check if Over 18 plus Privacy policy is displayed on Registration Page */
	public boolean isRegisterOverEighteenPrivacyPolicyBoxPresent() {
		return d.findElement(By.name(Constant.Register_Over18PrivacyPolicy)).isDisplayed();
	}
	/* Check if Compliance message is displayed below the Submit button on Registration Page */
	public boolean isComplianceTextPresent() {
		return d.findElement(By.name(Constant.Register_ComplianceMessage)).isDisplayed();
	}
	
	/* Check if  Deposit Limit click here link is displayed on Registration Page */
	public boolean isRegisterDepositLimiClickHeretLinkPresent() {

		return d.findElement(By.cssSelector(Constant.Register_DepositLimitClickHere)).isDisplayed();
	}
	/* Check if Submit  Button is displayed on Registration Page */
	public boolean isRegisterSubmitButtonPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id(Constant.Register_Submit)));
		return d.findElement(By.id(Constant.Register_Submit)).isDisplayed();
	}
	/* Check if Deposit limit Choose Limit is displayed on Registration Page */
	public boolean isDepositLimitChooseLimitPresent() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.name(Constant.Register_DepositLimitChooseLimit)));
		return d.findElement(By.name(Constant.Register_DepositLimitChooseLimit)).isDisplayed();
	}
	/* Check if Deposit limit choose Type Input box is displayed on Registration Page */
	public boolean isDepositLimitChooseTypePresent() {
		return d.findElement(By.name(Constant.Register_DepositLimitChooseType)).isDisplayed();
	}
	/* Check if Over 18 plus check box is displayed on Registration Page */
	public boolean isDepositLimitDailyPresent(String Value) {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.presenceOfElementLocated(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeDaily)));
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeDaily)).isDisplayed();

	}
	/* Check if  Deposit limit weekly input box is displayed on Registration Page */
	public boolean isDepositLimitWeeklyPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeWeekLy)).isDisplayed();

	}
	/* Check if Over 18 plus check box is displayed on Registration Page */
	public boolean isDepositLimitMonthlyPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeMonthly)).isDisplayed();

	}
	

	public boolean isDepositLimitThousandPoundsPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue1)).isDisplayed();

	}

	public boolean isDepositLimitTenThousandPoundsPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue2)).isDisplayed();
	}

	public boolean isDepositLimitFiftyThousandPoundsPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue3)).isDisplayed();
	}

	public boolean isDepositLimitOtherValuePresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseLimitValue4)).isDisplayed();
	}

	public boolean isDepositLimitOtherInputBoxPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Register_DepositLimitOtherAmount)).isDisplayed();
	}
	/* Check if Over 18 plus check box is displayed on Registration Page */
	public boolean isRegisterComplianceMessagePresent() {
		return d.findElement(By.name(Constant.Register_Submit)).isDisplayed();

	}

	/* Check if Bonus Terms Pop-up fame box is displayed on Registration Page */
	public boolean isRegisterBonusTermsFrameBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)));
		return d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)).isDisplayed();

	}
	/* Check if Terms And Condition Pop-up fame box is displayed on Registration Page */
	public boolean isRegisterTermsAndConditionFrameBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)));
		return d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)).isDisplayed();

	}

	/* Check if Privacy Policy Pop-up fame box is displayed on Registration Page */
	public boolean isRegisterPrivacyPolicyFrameBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d, 10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)));
		return d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)).isDisplayed();

	}
	/* Check if Error Message is displayed on Registration Page */
	public boolean isRegisterErrorMessagePresent() {
		return d.findElement(By.cssSelector(Constant.Reg_ErrorText)).isDisplayed();
	}
	/* Check if Error message  is displayed on Registration Page */
	public boolean isRegInvalidDataErrorMessagePresent() {
		return d.findElement(By.cssSelector(Constant.Reg_InvalidDataErrorMessage)).isDisplayed();
	}
	/* Check if Register Submit Button  is displayed on Registration Page */
	public boolean isDisabledRegisterNowButtonPresent() {
		return d.findElement(By.cssSelector(Constant.Reg_DisabledRegisterNowButton)).isDisplayed();

	}

}
