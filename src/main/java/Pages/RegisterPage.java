package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.Constant;

public class RegisterPage extends BasePage {

	public RegisterPage(WebDriver d) {
		super(d);
		// TODO Auto-generated constructor stub
	}

	public void getRegisterUrl(String baseUrl) {
		// d.get("https://www.supercasino.com/register");
		d.get(baseUrl + "/register");

	}

	public String isRegisterPageTitlePresent() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.RegisterTitle)));
		String Title = d.findElement(By.cssSelector(Constant.RegisterTitle)).getText();
		return Title;

	}

	public void sendRegUserNmae(String username) {
		String UserName = username;
		if (UserName.equals("{generator}")) {
			UserName = generateStringWithAllobedSplChars(20, "");
		}
		d.findElement(By.cssSelector(Constant.Register_Username)).sendKeys(UserName);
	}

	public void sendRegPasswor(String password) {
		d.findElement(By.cssSelector(Constant.Register_Password)).sendKeys(password);
	}

	public void sendRegCofirmPassword(String ConfPass) {
		d.findElement(By.cssSelector(Constant.Register_ConfirmPassword)).sendKeys(ConfPass);
	}

	public void sendRegScreename(String screenName) {
		String ScreenName = screenName;
		if (ScreenName.equals("{generator}")) {
			ScreenName = generateStringWithAllobedSplChars(16, "");
		}
		d.findElement(By.cssSelector(Constant.Register_ScreenName)).sendKeys(ScreenName);
	}

	public void sendRegEmail(String email) {
		d.findElement(By.cssSelector(Constant.Register_Email)).sendKeys(email);
	}

	public void sendRegTitle(String title) {
		d.findElement(By.cssSelector(Constant.Register_TitleDropDown)).sendKeys(title);
	}

	public void sendRegFirstName(String firstName) {
		d.findElement(By.cssSelector(Constant.Register_FirstName)).sendKeys(firstName);
	}

	public void sendRegLastName(String surName) {
		d.findElement(By.cssSelector(Constant.Register_SurName)).sendKeys(surName);
	}

	public void sendRegDOBDay(String Day) {
		d.findElement(By.cssSelector(Constant.Register_DOB_Day)).sendKeys(Day);
	}

	public void sendRegDOBMonth(String Month) {
		d.findElement(By.cssSelector(Constant.Register_DOB_Month)).sendKeys(Month);
	}

	public void sendRegDOBYear(String Year) {
		d.findElement(By.cssSelector(Constant.Register_DOB_Year)).sendKeys(Year);
	}

	public void sendRegAddress(String Address) {
		d.findElement(By.cssSelector(Constant.Register_Address)).sendKeys(Address);
	}

	public void sendRegCity(String Town) {
		d.findElement(By.cssSelector(Constant.Register_Town)).sendKeys(Town);
	}

	public void sendRegCounty(String county) {
		d.findElement(By.cssSelector(Constant.Register_County)).sendKeys(county);
	}

	public void sendRegPostCode(String Postcode) {
		d.findElement(By.cssSelector(Constant.Register_PostCode)).sendKeys(Postcode);
	}
    public void  sendRegCountry(String country){
    	d.findElement(By.id(Constant.Reg_Country)).sendKeys(country);
    }
    
    public void  sendRegCunrrency(String CurrencyType){
    	d.findElement(By.id(Constant.Reg_Currency)).sendKeys(CurrencyType);
    }
    public void  sendRegCountryDialingCodeDropdownBox(String DialingCode){
    	d.findElement(By.id(Constant.Reg_CountryDialingCode)).sendKeys(DialingCode);
    }
	public void sendRegContactNumber(String contactNumber) {
		d.findElement(By.cssSelector(Constant.Register_ContactNumber)).sendKeys(contactNumber);
	}

	public void sendRegChooseType(String ChooseType) {
		d.findElement(By.cssSelector(Constant.Register_DepositLimitChooseType)).sendKeys(ChooseType);

	}

	public void sendRegLimitType(String ChooseLimit) {
		d.findElement(By.cssSelector(Constant.Register_DepositLimitChooseLimit)).sendKeys(ChooseLimit);
	}

	public void sendRegDepositLimitOtherAmount(String Other) {
		d.findElement(By.cssSelector(Constant.Register_DepositLimitOtherAmount)).sendKeys(Other);
	}

	public void clickRegDepositLimitLink() {
		d.findElement(By.cssSelector(Constant.Register_DepositLimitClickHere)).click();
	}

	public void clickEnterAddressManuallyLink() {
		d.findElement(By.cssSelector(Constant.Register_EnterAddressManually)).click();
	}

	public void clickOver18CheckBox() {
		d.findElement(By.cssSelector(Constant.Register_Over18CheckBox)).click();
	}

	public void clickTermAndWaggeringLink() {
		d.findElement(By.cssSelector(Constant.Register_FreeBonusTermsAndWagering)).click();
	}

	public void clickOver18TermsLink() {
		d.findElement(By.cssSelector(Constant.Register_Over18Term)).click();
	}

	public void clickOver18PrivacyPolicyLink() {
		d.findElement(By.cssSelector(Constant.Register_Over18PrivacyPolicy)).click();
	}

	public void clickRegisterSubmitButtton() {
		d.findElement(By.cssSelector(Constant.Register_Submit)).click();
	}

	public void clickRegisterBonusTermsfromeBoxCloseIcon() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)));
		d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)).click();

	}

	public void clickRegisterTermsfromeBoxCloseIcon() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)));
		d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)).click();

	}

	public void clickRegisterPrivacyPolicyfromeBoxCloseIcon() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)));
		d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBox_Close)).click();

	}
	public boolean isRegisterEmailInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_Email)).isDisplayed();
	}

	public boolean isRegisterPasswordInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_Password)).isDisplayed();
	}

	public boolean isRegisterUserNameInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_Username)).isDisplayed();
	}

	public boolean isRegisterScreenNameInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_ScreenName)).isDisplayed();
	}

	public boolean isRegisterFirstNameInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_FirstName)).isDisplayed();
	}

	public boolean isRegisterSurNameInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_SurName)).isDisplayed();
	}

	public boolean isRegisterDOBDayDropdownBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_DOB_Day)).isDisplayed();
	}

	public boolean isRegisterDOBMonthDropdownBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_DOB_Month)).isDisplayed();
	}

	public boolean isRegisterGenderTypeFemaleRadioButtonPresent() {
		return d.findElement(By.id(Constant.Reg_GenderTypeFemale)).isDisplayed();
	}

	public boolean isRegisterDOBYearhDropdownBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_DOB_Year)).isDisplayed();
	}

	public boolean isRegisterGenderTypeMaleRadioButtonPresent() {
		return d.findElement(By.id(Constant.Reg_GenderTypeMale)).isDisplayed();
	}

	public boolean isRegisterCountryInputBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Reg_Country)).isDisplayed();
	}

	public boolean isRegisterCunrrencyDropdownBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Reg_Currency)).isDisplayed();
	}

	public boolean isRegisterFindAddressButtonPresent() {
		return d.findElement(By.cssSelector(Constant.Reg_FindAddressButton)).isDisplayed();
	}

	public boolean isRegisterCountryDialingCodeDropdownBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Reg_CountryDialingCode)).isDisplayed();
	}
	
	public boolean isRegisterFreeBonusessCheckedBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_FreeBonusCheckBox)).isDisplayed();
	}
	public boolean isRegisterOverEightennPlusCheckBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_Over18CheckBox)).isDisplayed();
	}
	public boolean isRegisterOverEighteenTermsPresent() {
		return d.findElement(By.cssSelector(Constant.Register_Over18Term)).isDisplayed();
	}
	public boolean isRegisterOverEighteenPrivacyPolicyBoxPresent() {
		return d.findElement(By.cssSelector(Constant.Register_Over18PrivacyPolicy)).isDisplayed();
	}
	
	public boolean isComplianceTextPresent() {
		return d.findElement(By.cssSelector(Constant.Register_ComplianceMessage)).isDisplayed();
	}
	public boolean isRegisterDepositLimiClickHeretLinkPresent() {
		
		return d.findElement(By.cssSelector(Constant.Register_DepositLimitClickHere)).isDisplayed();
	}
    public boolean isRegisterSubmitButtonPresent(){
    	WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Register_Submit)));
    return d.findElement(By.cssSelector(Constant.Register_Submit)).isDisplayed();
    }
	public boolean isDepositLimitChooseLimitPresent() {
		WebDriverWait wait = new WebDriverWait(d, 20);
		wait.until(ExpectedConditions
				.visibilityOfAllElementsLocatedBy(By.cssSelector(Constant.Register_DepositLimitChooseLimit)));
		return d.findElement(By.cssSelector(Constant.Register_DepositLimitChooseLimit)).isDisplayed();
	}

	public boolean isDepositLimitChooseTypePresent() {
		return d.findElement(By.cssSelector(Constant.Register_DepositLimitChooseType)).isDisplayed();
	}

	public boolean isDepositLimitDailyPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeDaily)).isDisplayed();

	}

	public boolean isDepositLimitWeeklyPresent(String Value) {
		return d.findElement(By.cssSelector(Constant.Reg_DepositLimit_ChooseTypeWeekLy)).isDisplayed();

	}

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

	public boolean isRegisterComplianceMessagePresent() {
		return d.findElement(By.cssSelector(Constant.Register_Submit)).isDisplayed();

	}

	public boolean isRegisterBonusTermsFrameBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)));
		return d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)).isDisplayed();

	}

	public boolean isRegisterTermsAndConditionFrameBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)));
		return d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)).isDisplayed();

	}

	public boolean isRegisterPrivacyPolicyFrameBoxPresent() {
		WebDriverWait wait = new WebDriverWait(d,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)));
		return d.findElement(By.cssSelector(Constant.Reg_BonusTermFrameBoxHeader)).isDisplayed();

	}

	public boolean isRegisterErrorMessagePresent() {
		return d.findElement(By.cssSelector(Constant.Reg_ErrorText)).isDisplayed();
	}

}
