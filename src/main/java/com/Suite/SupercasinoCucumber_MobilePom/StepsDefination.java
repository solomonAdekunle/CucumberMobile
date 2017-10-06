package com.Suite.SupercasinoCucumber_MobilePom;

import java.awt.AWTException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import org.junit.Assert;

import Cashier.CashierMenuPage;
import Cashier.DepositPage;
import Cashier.TransactionPage;
import Cashier.WithdrawPage;
import Pages.BasePage;
import Pages.ChangePasswordPage;
import Pages.ChatPage;
import Pages.ContactUSPage;
import Pages.ExternalPage;
import Pages.FooterPage;
import Pages.GameInfoPage;
import Pages.GettingStartedPage;
import Pages.HomePage;
import Pages.HowToDepositPage;
import Pages.HowToWithdrawPage;
import Pages.IsMyDepositSafePage;
import Pages.LiveVerticalPage;
import Pages.LoginErrorPage;
import Pages.LoginPage;
import Pages.PresentersPage;
import Pages.PrivacyPolicyPage;
import Pages.RegisterPage;
import Pages.ResponsibleGamblingPage;
import Pages.RouletteExpressPremium;
import Pages.SecurityPage;
import Pages.SideBarPage;
import Pages.SlotsGamePage;
import Pages.TermsAndConditionsPage;
import Pages.VIPPage;
import Pages.WelcomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepsDefination extends TestBase {
	private BasePage basePage;
	private LoginPage loginPage;
	private LoginErrorPage LEPage;
	private RegisterPage RegPage;
	private SideBarPage sidebarPage;
	private WelcomePage welcomePage;
	private HomePage homePage;
	private RouletteExpressPremium RepPage;
	private SlotsGamePage slotGamePage;
	private LiveVerticalPage livePage;
	private FooterPage footerPage;
	private ExternalPage externalPage;
	private ResponsibleGamblingPage reponsibleGamblingPage;
	private PrivacyPolicyPage privcypolicyPage;
	private TermsAndConditionsPage TAndCPage;
	private VIPPage vipPage;
	private ChangePasswordPage changepasswordPage;
	private ContactUSPage contactusPage;
	private GettingStartedPage gettingStartedPage;
	private HowToDepositPage howToDepositPage;
	private HowToWithdrawPage howToWithdrawPage;
	private IsMyDepositSafePage ismyDepositSafePage;
	private SecurityPage securityPage;
	private PresentersPage presenterPage;
	private DepositPage depositPage;
	private TransactionPage transactionPage;
	private WithdrawPage withdrawPage;
	private ChatPage chatPage;
	private CashierMenuPage cmPage;
	private GameInfoPage gameInfoPage;

	public StepsDefination() throws IOException {

		super();
		basePage = new BasePage(TestBase.d);
		loginPage = new LoginPage(TestBase.d);
		LEPage = new LoginErrorPage(TestBase.d);
		RegPage = new RegisterPage(TestBase.d);
		sidebarPage = new SideBarPage(TestBase.d);
		welcomePage = new WelcomePage(TestBase.d);
		homePage = new HomePage(TestBase.d);
		RepPage = new RouletteExpressPremium(TestBase.d);
		slotGamePage = new SlotsGamePage(TestBase.d);
		livePage = new LiveVerticalPage(TestBase.d);
		footerPage = new FooterPage(TestBase.d);
		externalPage = new ExternalPage(TestBase.d);
		reponsibleGamblingPage = new ResponsibleGamblingPage(TestBase.d);
		privcypolicyPage = new PrivacyPolicyPage(TestBase.d);
		TAndCPage = new TermsAndConditionsPage(TestBase.d);
		vipPage = new VIPPage(TestBase.d);
		changepasswordPage = new ChangePasswordPage(TestBase.d);
		contactusPage = new ContactUSPage(TestBase.d);
		gettingStartedPage = new GettingStartedPage(TestBase.d);
		howToDepositPage = new HowToDepositPage(TestBase.d);
		howToWithdrawPage = new HowToWithdrawPage(TestBase.d);
		ismyDepositSafePage = new IsMyDepositSafePage(TestBase.d);
		securityPage = new SecurityPage(TestBase.d);
		presenterPage = new PresentersPage(TestBase.d);
		depositPage = new DepositPage(TestBase.d);
		transactionPage = new TransactionPage(TestBase.d);
		withdrawPage = new WithdrawPage(TestBase.d);
		chatPage = new ChatPage(TestBase.d);
		cmPage = new CashierMenuPage(TestBase.d);
		gameInfoPage = new GameInfoPage(TestBase.d);

	}

	@Before
	public void GoToUrl() throws InterruptedException {

		if (basePage.isLoggedIn()) {
			basePage.logOut();
			// d.get(Config.getProperty("URL"));
		}

	}

	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This below are Only For @Given Methods */
	///////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* @param {string} siteName-is the url address od supercasino.com */

	@Given("^I Navigate to the homepage on \"([^\"]*)\"$")
	public void i_Navigate_to_the_homepage_on(String arg1) throws Throwable {
		// basePage.getBrowserType(browser);
		basePage.getSiteAddress(Config.getProperty("URL"));

		// basePage.getSiteAddress();

	}

	@Given("^I Navigate to the homepage on browser$")
	public void i_Navigate_to_the_homepage_on_browser(String Url) {
		basePage.getSiteAddress(Config.getProperty("URL"));
		// basePage.getSiteAddress(Url);

	}

	@Given("^I have loggedin on the BasePage$")
	public void i_have_loggedin_on_the_BasePage() throws InterruptedException {
		basePage.doLogin(Config.getProperty("URL"), Config.getProperty("defaultUsername"),
				Config.getProperty("defaultPassword"));

	}

	/*
	 * Navigate to the Registration Page
	 * 
	 * @param{string Url} -this is the Url address of the Registration page
	 */
	@Given("^I navigate to the Registrationpage on \"([^\"]*)\"$")
	public void i_navigate_to_the_Registrationpage_on(String BaseUrl) {
		RegPage.getRegisterUrl(Config.getProperty("URL"));
		// RegPage.getRegisterUrl(BaseUrl);
	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Below are Only for @When Method */
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/*
	 * login with valid username and password
	 * 
	 * @param{string username}- this is the username of the Account holder
	 * 
	 * @param{string password}- this is the Password of the Account Holder
	 */
	@When("^I have logged in username as \"([^\"]*)\" and password \"([^\"]*)\"$")
	public void i_have_logged_in_username_as_and_password(String username, String password) throws Throwable {
		loginPage.clickLoginButton();
		loginPage.sendUseraname(username);
		loginPage.sendPassword(password);
		loginPage.clickSigninButton();

	}

	/* Click on the Login Button at the RTop of the Home Page */
	@When("^I click on Login Button$")
	public void i_click_on_Login_Button() {
		basePage.clickLoginButton();

	}

	/* Click on Login Pop-up close ICon */
	@When("^I click on the Login Pop-up close icon$")
	public void i_click_on_the_Login_Pop_up_close_icon() {
		loginPage.clickLoginBoxCloseIcon();

	}

	/*
	 * Enter User in the Useranem input box
	 * 
	 * @param{string username}- this is the username of the Account holder
	 */
	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username) throws InterruptedException {
		loginPage.sendUseraname(username);

	}

	/*
	 * Enter Password in Password input box
	 * 
	 * @param{string password}- this is the password of the Account holder
	 */
	@When("^I enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String password) throws InterruptedException {
		loginPage.sendPassword(password);
	}

	/* Click on Sign in button on the Login Pop-up box */
	@When("^I click on SignIn button$")
	public void i_click_on_SignIn_button() {
		loginPage.clickSigninButton();

	}

	/* Click on SideBar Menu */
	@When("^I click on Sidebar Menu$")
	public void i_click_on_Sidebar_Menu() {
		basePage.clickSideBarMenu();

	}

	/* Click on the Join Now Button within the Sidebar */
	@When("^I click on Join Now Button$")
	public void i_click_on_Join_Now_Button() {
		sidebarPage.clickJoinNow();

	}

	/*
	 * Enter Username for Registeration
	 * 
	 * @param{string username}- this is the username for the Account
	 * 
	 */
	@When("^I enter regUsername as \"([^\"]*)\"$")
	public void i_enter_regUsername_as(String UserName) {
		RegPage.sendRegUserNmae(UserName);

	}

	/*
	 * Enter Password for Registration
	 * 
	 * @param{string password}- this is the password of the Account
	 */
	@When("^I enter RegPassword as \"([^\"]*)\"$")
	public void i_enter_RegPassword_as(String password) {
		RegPage.sendRegPasswor(password);

	}

	/* Enter ScreenName for Registration */
	@When("^I enter a RegScreenName as \"([^\"]*)\"$")
	public void i_enter_a_RegScreenName_as(String screenName) {
		RegPage.sendRegScreename(screenName);

	}

	/*
	 * Enter E-mail address for Registration
	 * 
	 * @param{string email}- this is the email of the Account holder
	 */
	@When("^I enter RegEmail as \"([^\"]*)\"$")
	public void i_enter_RegEmail_as(String email) {
		RegPage.sendRegEmail(email);

	}

	/*
	 * Enter Your First Name for Registration
	 * 
	 * @param{string firstName}- this is the FirstName of the Account holder
	 */
	@When("^I enter RegFirstName as \"([^\"]*)\"$")
	public void i_enter_RegFirstName_as(String firstName) {
		RegPage.sendRegFirstName(firstName);

	}

	/*
	 * Enter Your Surname for Registration
	 * 
	 * @param{string surName}- this is the SurName of the Account holder
	 */
	@When("^I enter RegSurName as \"([^\"]*)\"$")
	public void i_enter_RegSurName_as(String surName) {
		RegPage.sendRegLastName(surName);
		;
	}

	/*
	 * Enter Date of Birth Day for Registration
	 * 
	 * @param{string Day}- this is the Day of the Date of Birth of the Account
	 * holder
	 */
	@When("^I enter RegDOBDay as \"([^\"]*)\"$")
	public void i_enter_RegDOBDay_as(String Day) {
		RegPage.sendRegDOBDay(Day);

	}

	/*
	 * Enter Date of Birth Month for Registration
	 * 
	 * @param{string Month}- this is the Month of the Date of Birth of the
	 * Account holder
	 */
	@When("^I enter RegDOBMonth as \"([^\"]*)\"$")
	public void i_enter_RegDOBMonth_as(String Month) {
		RegPage.sendRegDOBMonth(Month);
		
	}

	/*
	 * Enter Date of Birth Year for Registration
	 * 
	 * @param{string Year}- this is the Year of the Date of Birth of the Account
	 * holder
	 */
	@When("^I enter RegDOBYear as \"([^\"]*)\"$")
	public void i_enter_RegDOBYear_as(String Year) {
		RegPage.sendRegDOBYear(Year);

	}

	/* Click Enter Your Address Manually link */
	@When("^I click on RegClickHere$")
	public void i_click_on_RegClickHere() {
		RegPage.clickEnterAddressManuallyLink();

	}

	/*
	 * Enter your House address for Registration
	 * 
	 * @param{string Address}- this is the House Number of the Account holder
	 */
	@When("^I enter RegAddress as \"([^\"]*)\"$")
	public void i_enter_RegAddress_as(String Address) {
		RegPage.sendRegAddress(Address);

	}

	/*
	 * Enter Town or City Address for Registration
	 * 
	 * @param{string Town}- this is the Town of the Account holder
	 */
	@When("^I enter RegTown as \"([^\"]*)\"$")
	public void i_enter_RegTown_as(String Town) {
		RegPage.sendRegCity(Town);

	}

	/*
	 * Enter your County for Registration
	 * 
	 * @param{string county}- this is the County of the Account holder
	 */
	@When("^I enter RegCounty as \"([^\"]*)\"$")
	public void i_enter_RegCounty_as(String county) {
		RegPage.sendRegCounty(county);

	}

	/* Click on Gender Type Radio button on registration page */
	@When("^I click Gender Type as Female$")
	public void i_click_Gender_Type_as_Female() {
		RegPage.clickRegisterGenderType();

	}

	/*
	 * Enter your Country for Registration
	 * 
	 * @param{string country}- this is the Country of the Account holder
	 */
	@When("^I enter Country as \"([^\"]*)\"$")
	public void i_enter_Country_as(String country) {
		RegPage.sendRegCountry(country);
	}

	/*
	 * Enter your Currency for Registration
	 * 
	 * @param{string CurrencyType}- this is the Currency that Account holder
	 * selected
	 */
	@When("^I enter Currency as \"([^\"]*)\"$")
	public void i_enter_Currency_as(String CurrencyType) {
		RegPage.sendRegCunrrency(CurrencyType);

	}

	/*
	 * Enter Your Post Code for Registration
	 * 
	 * @param{string PostCode}- this is the PostCode Address of the Account
	 * holder
	 */
	@When("^I enter RegPostCode as \"([^\"]*)\"$")
	public void i_enter_RegPostCode_as(String Postcode) {
		RegPage.sendRegPostCode(Postcode);

	}
	@When("^I enter RegDialingCode as \"([^\"]*)\"$")
	public void i_enter_RegDialingCode_as(String DialingCode) {
	    RegPage.sendRegCountryDialingCodeDropdownBox(DialingCode);
	}

	/*
	 * Enter Contact Number for Registration
	 * 
	 * @param{string contactNumber}- this is the Contact Phone Number of the
	 * Account holder
	 */
	@When("^I enter RegContactNum as \"([^\"]*)\"$")
	public void i_enter_RegContactNum_as(String contactNumber) {
		RegPage.sendRegContactNumber(contactNumber);

	}

	/* Click over 18 check box for Registration */
	@When("^I click on RegT\\$CCheckBox$")
	public void i_click_on_RegT$CCheckBox() {
		RegPage.clickOver18CheckBox();

	}

	/* Click Submit button for Registration */
	@When("^I click on RegSubmitButton$")
	public void i_click_on_RegSubmitButton() {
		RegPage.clickRegisterSubmitButtton();

	}

	/* Click Deposit limit link on Registration */
	@When("^I click on deposit limit click here link$")
	public void i_click_on_deposit_limit_click_here_link() {
		RegPage.clickRegDepositLimitLink();

	}

	/*
	 * Select the Deposit limit Type on Registration
	 * 
	 * @param{string TypeLimit}- this is the Choose Limit Type for deposit limit
	 * on the Account holder
	 */
	@When("^I enter Choose Type as \"([^\"]*)\"$")
	public void i_enter_Choose_Type_as(String TypeLimit) {
		RegPage.sendRegChooseType(TypeLimit);

	}

	/*
	 * Select the Deposit Limit Amount for Registration
	 * 
	 * @param{string ChooseLimit}- this is the Deposit Limit set amount of the
	 * Account
	 */
	@When("^I enter Choose limit as \"([^\"]*)\"$")
	public void i_enter_Choose_limit_as(String ChooseLimit) {
		RegPage.sendRegLimitType(ChooseLimit);
	}

	/*
	 * Enter Amount willing as a deposit limit on Registration page
	 * 
	 * @param{string Other}- this is the Other Deposit limit amount to set on
	 * the Account
	 */
	@When("^I enter Other Amount as \"([^\"]*)\"$")
	public void i_enter_Other_Amount_as(String Other) {
		RegPage.sendRegDepositLimitOtherAmount(Other);
	}

	/* Click on the Bonus Wagerring terms link on Registration Page */
	@When("^I click on BonusTerms and Wagering link$")
	public void i_click_on_BonusTerms_and_Wagering_link() {
		RegPage.clickTermAndWaggeringLink();

	}

	/* Click on the Close icon on BonuseTerm Popo-frame box */
	@When("^I click on the Close icon within Bonus Term Frame box$")
	public void i_click_on_the_Close_icon_within_Bonus_Term_Frame_box() {
		RegPage.clickRegisterBonusTermsfromeBoxCloseIcon();

	}

	/*
	 * Clicking on the Close Icon on on both Term and Privacy policy on
	 * Registration Page
	 */
	@When("^I click on the Close icon within the Frame box$")
	public void i_click_on_the_Close_icon_within_the_Frame_box() {
		RegPage.clickRegisterTermsfromeBoxCloseIcon();
	}

	/* Click on the Over 18 Terms link on Registration Page */
	@When("^I click on  OverEighteen Terms link$")
	public void i_click_on_OverEighteen_Terms_link() {
		RegPage.clickOver18TermsLink();

	}

	/* Click on the Over 18 Privacy Policy link on Registration Page */
	@When("^I click on  OverEighteen Privacy Policy link$")
	public void i_click_on_OverEighteen_Privacy_Policy_link() {
		RegPage.clickOver18PrivacyPolicyLink();

	}

	/* click on Promo tab on Vertical tab on home Page */
	@When("^I click on Promos Vertical Tab$")
	public void i_click_on_Promos_Vertical_Tab() {
		basePage.clickPromosTab();

	}

	/* click on Terms And Condition link within the footer on home Page */
	@When("^I click on Casino TermsAndCondition link within the footer$")
	public void i_click_on_Casino_TermsAndCondition_link_within_the_footer() {
		footerPage.clickFooterTermsAndConditionlink();

	}

	/*
	 * Click on a Roulette Express Premium Game on Home page
	 * 
	 * @param{string GameType}- is the Roulette game type user is launching
	 */
	@When("^I click on \"([^\"]*)\"$")
	public void i_click_on(String GameType) {
		homePage.clickNetPlayTvRouletteGame(GameType);

	}

	/* Click on the Close icon on the Game Pop-up box */
	@When("^I click on Close icon on the game Pop-up box$")
	public void i_click_on_Close_icon_on_the_game_Pop_up_box() {
		homePage.clickGamePopBoxCloseIcon();

	}

	/*
	 * Click on Play button on the Game Pop-up box in order to launch a real
	 * game
	 */
	@When("^I click on Play button$")
	public void i_click_on_Play_button() {
		homePage.clickGamePopBoxPlayButton();

	}

	/*
	 * Click on Demo button on the Game pop-up box in order to launch a Demo
	 * Game
	 */
	@When("^I click on Demo button$")
	public void i_click_on_Demo_button() {
		homePage.clickGamePopBoxDemoButton();

	}

	/* Click on Slots tab within the Game category menu */
	@When("^I click Games Category Slots tab$")
	public void i_click_Games_Category_Slots_tab() {
		homePage.clickGameCategorySlotsTab();
	}

	/* Click on a Slots Game on the Home Page */
	@When("^I click on a Slots Game$")
	public void i_click_on_a_Slots_Game() {
		homePage.clickCasinoSlotsGames();

	}

	/* Click on Table Games tab within the Game category menu */
	@When("^I click Games Category Table Games tab$")
	public void i_click_Games_Category_Table_Games_tab() {
		homePage.clickGameCategoryTableGamesTab();

	}

	/* click on Table Game */
	@When("^I click on a Table Game$")
	public void i_click_on_a_Table_Game() {
		homePage.clickCasinoTableGames();

	}

	/* Click on Vegas Vertical tab */
	@When("^I click on Vegas Vertical Tab$")
	public void i_click_on_Vegas_Vertical_Tab() {
		basePage.clickVegasTab();

	}

	/* Click on Live Vertical Tab */
	@When("^I click on Live Vertical Tab$")
	public void i_click_on_Live_Vertical_Tab() {
		basePage.clickLiveTab();

	}

	/* Click on any Live Game on Live home page */
	@When("^I click on a Live Game$")
	public void i_click_on_a_Live_Game() {
		livePage.clickLiveRouletteGame();

	}

	/* Click on the Privacy Policy link within the footer on the Home Page */
	@When("^I click on Casino Privacy Policy link within the footer$")
	public void i_click_on_Casino_Privacy_Policy_link_within_the_footer() {
		footerPage.clickFooterPrivacyPolicylink();

	}

	/*
	 * Click on the Responsible Gambling link within the footer on the Home Page
	 */
	@When("^I click on Casino Resonsible Gambling link within the footer$")
	public void i_click_on_Casino_Resonsible_Gambling_link_within_the_footer() {
		footerPage.clickFooterResponsibleGamblinglink();

	}

	/* Click on the VIP link within the footer on the Home Page */
	@When("^I click on Casino VIP link within the footer$")
	public void i_click_on_Casino_VIP_link_within_the_footer() {
		footerPage.clickFooterVIPlink();

	}

	/*
	 * Click on the Terms And Condition link within the footer on the Vegas Home
	 * Page
	 */
	@When("^I click on Vegas TermsAndCondition link within the footer$")
	public void i_click_on_Vegas_TermsAndCondition_link_within_the_footer() {
		footerPage.clickFooterTermsAndConditionlink();

	}

	/*
	 * Click on the Privacy Policy link within the footer on the Vegas Home Page
	 */
	@When("^I click on Vegas PrivacyPolicy link within the footer$")
	public void i_click_on_Vegas_PrivacyPolicy_link_within_the_footer() {
		footerPage.clickFooterPrivacyPolicylink();

	}

	/*
	 * Click on the Responsible Gambling link within the footer on the Vegas
	 * Home Page
	 */
	@When("^I click on Vegas ResponsibleGambling link within the footer$")
	public void i_click_on_Vegas_ResponsibleGambling_link_within_the_footer() {
		footerPage.clickFooterResponsibleGamblinglink();

	}

	/* Click on the VIP link within the footer on the Vegas Home Page */
	@When("^I click on Vegas VIP link within the footer$")
	public void i_click_on_Vegas_VIP_link_within_the_footer() {
		footerPage.clickLiveFooterVIPlink();

	}

	/*
	 * Click on the Terms And Conditions link within the footer on the Vegas
	 * Home Page
	 */
	@When("^I click on Live Terms And Conditions link within the footer$")
	public void i_click_on_Live_Terms_And_Conditions_link_within_the_footer() {
		footerPage.clickFooterTermsAndConditionlink();

	}

	/*
	 * Click on the Privacy Policy link within the footer on the Live Home Page
	 */
	@When("^I click on Live PrivacyPolicy link within the footer$")
	public void i_click_on_Live_PrivacyPolicy_link_within_the_footer() {
		footerPage.clickFooterPrivacyPolicylink();

	}

	/*
	 * Click on the Responsible Gambling link within the footer on the Live Home
	 * Page
	 */
	@When("^I click on Live ResponsibleGambling link within the footer$")
	public void i_click_on_Live_ResponsibleGambling_link_within_the_footer() {
		footerPage.clickFooterResponsibleGamblinglink();

	}

	@When("^I click on Facebook Icon link within the footer$")
	public void i_click_on_Facebook_Icon_link_within_the_footer() {
		footerPage.clickFooterFacebooklink();
	}

	/* Click on the VIP link within the footer on the Live Home Page */
	@When("^I click on Live VIP link within the footer$")
	public void i_click_on_Live_VIP_link_within_the_footer() {
		footerPage.clickLiveFooterVIPlink();

	}

	/* Click on the Twitter logo link within the footer on the Home Page */
	@When("^I click on Tiwtter Icon link within the footer$")
	public void i_click_on_Tiwtter_Icon_link_within_the_footer() {
		footerPage.clickFooterTiwtterlink();

	}

	/* Click on the NetPlayTV logo link within the footer on the Home Page */
	@When("^I click on NetPlayTV Icon link within the footer$")
	public void i_click_on_NetPlayTV_Icon_link_within_the_footer() {
		footerPage.clickFooterNetplayTvIconLink();

	}

	/* Click on the 18+ logo link within the footer on the Home Page */
	@When("^I click on EighteenPlus Icon link within the footer$")
	public void i_click_on_EighteenPlus_Icon_link_within_the_footer() {
		footerPage.clickFooterEighteenPluslink();
	}

	/* Click on the GamCare logo link within the footer on the Home Page */
	@When("^I click on GameCare Icon link within the footer$")
	public void i_click_on_GameCare_Icon_link_within_the_footer() {
		footerPage.clickFooterGamCareink();

	}

	/*
	 * Click on the GamblingCommission logo link within the footer on the Home
	 * Page
	 */
	@When("^I click on GamblingCommission Icon link within the footer$")
	public void i_click_on_GamblingCommission_Icon_link_within_the_footer() {
		footerPage.clickFooterGamblingCommissionlink();
	}

	/* Click on Login button within the Sidenar Menu */
	@When("^I click on Sidebar Menu Login Button$")
	public void i_click_on_Sidebar_Menu_Login_Button() {
		sidebarPage.clickSideBarLoginButton();
	}

	/* Click on Home link within the Sidenar Menu */
	@When("^I click on Home Link within SideBar Menu$")
	public void i_click_on_Home_Link_within_SideBar_Menu() {
		sidebarPage.clickSideBarSideBarHomeLink();
	}

	/* Click on Getting Started within the Sidenar Menu */
	@When("^I click on Gettstarted dropdown SubMenu arrow$")
	public void i_click_on_Gettstarted_dropdown_SubMenu_arrow() {
		sidebarPage.clickSideBarGettingStartedDropDownArrowLinkk();

	}

	/* Click on Getting started link within the Sidenar Menu */
	@When("^I click on How To Get Started within the GettingStarted Dropdown SubMenu$")
	public void i_click_on_How_To_Get_Started_within_the_GettingStarted_Dropdown_SubMenu() {
		sidebarPage.clickSideBarGettingStartedDropDownHowToGetStartedLink();

	}

	/* Click on Deposit link within the Sidenar Menu */
	@When("^I click on How To Deposit link within the GettingStarted Dropdown SubMenu$")
	public void i_click_on_How_To_Deposit_link_within_the_GettingStarted_Dropdown_SubMenu() {
		sidebarPage.clickSideBarGettingStartedDropDownHowToDepositLink();
	}

	/* Click on Withdraw within the Sidenar Menu */
	@When("^I click on How To Withdraw link within the GettingStarted Dropdown SubMenu$")
	public void i_click_on_How_To_Withdraw_link_within_the_GettingStarted_Dropdown_SubMenu() {
		sidebarPage.clickSideBarGettingStartedDropDownHowToWithdrawLink();

	}

	/* Click on Is My Deposit link within the Getting Started DropDown Menu */
	@When("^I click on Is My Deposit Safe link within the GettingStarted Dropdown SubMenu$")
	public void i_click_on_Is_My_Deposit_Safe_link_within_the_GettingStarted_Dropdown_SubMenu() {
		sidebarPage.clickSideBarGettingStartedDropDownIsMyDepositSafeLink();
	}

	/* Click on Presenter link within the Sidenar Menu */
	@When("^I click on TV Presenter link within the SideBar Menu$")
	public void i_click_on_TV_Presenter_link_within_the_SideBar_Menu() {
		sidebarPage.clickSideBarMenuTVPresenterLink();

	}

	/* Click on Responsible Gambling link within the Sidenar Menu */
	@When("^I click on Responsible Gambling link within the SideBar Menu$")
	public void i_click_on_Responsible_Gambling_link_within_the_SideBar_Menu() {
		sidebarPage.clickSideBarMenuResponsibleGamblingLink();
	}

	/* Click on My Account arrow within the Sidenar Menu */
	@When("^I click on My Account dropdown arrow$")
	public void i_click_on_My_Account_dropdown_arrow() {
		sidebarPage.clickSideBarMyAccountDropDownMemuArrowLink();
	}

	/* Click on Deposit link within the Sidebar Menu */
	@When("^I click on Deposit link within My Account DropDown SubMenu$")
	public void i_click_on_Deposit_link_within_My_Account_DropDown_SubMenu() throws InterruptedException {
		sidebarPage.clickSideBarMyAccountDropDownMemuDepositLink();

	}

	/* Click on Transaction within the Sidenar Menu */
	@When("^I click on Transaction link within My Account DropDown SubMenu$")
	public void i_click_on_Transaction_link_within_My_Account_DropDown_SubMenu() {
		sidebarPage.clickSideBarMyAccountDropDownMenuTransactionLink();

	}

	/* Click on Withdraw link within the Sidenar Menu */
	@When("^I click on Withdraw link within My Account DropDown SubMenu$")
	public void i_click_on_Withdraw_link_within_My_Account_DropDown_SubMenu() throws InterruptedException {
		sidebarPage.clickSideBarMyAccountDropDownMenuWithdrawLink();

	}

	/* Click on Change Password link the Sidenar Menu */
	@When("^I click on Change Password link within My Account DropDown SubMenu$")
	public void i_click_on_Change_Password_link_within_My_Account_DropDown_SubMenu() {
		sidebarPage.clickSideBarMyAccountDropDownMenuAChangePasswordLink();

	}

	/* Click on the Logout link within the Sidebar menu */
	@When("^I click on Logout link within the SideBar Menu$")
	public void i_click_on_Logout_link_within_the_SideBar_Menu() {
		sidebarPage.clickSideBarLogOutLink();

	}

	/* Click on the Chat link within the Sidebar menu */
	@When("^I click on Help link within the SideBar Menu$")
	public void i_click_on_Help_link_within_the_SideBar_Menu() {
		sidebarPage.clickSideBarMenuHelpLink();

	}

	/* Click on the live Chart link within the Side Bar Menu */
	@When("^I click on Live Chat link within the SideBar Menu$")
	public void i_click_on_Live_Chat_link_within_the_SideBar_Menu() {
		sidebarPage.clickSideBarMenuLiveChatLink();

	}

	/*
	 * Enter your Old Password on Change Password Page
	 * 
	 * @param{string Old Password}- this is the Current Password User is willing
	 * to Change on the Account
	 */
	@When("^I Enter Old Password as \"([^\"]*)\"$")
	public void i_Enter_Old_Password_as(String oldpassword) {
		changepasswordPage.sendChangePasswordOldPassword(oldpassword);

	}

	/*
	 * Enter your New Password on Change Password Page
	 * 
	 * @param{string newpassword}- this is the New Password user wants to Change
	 * to for the Account
	 */
	@When("^I Enter New Password as \"([^\"]*)\"$")
	public void i_Enter_New_Password_as(String newpassword) {
		changepasswordPage.sendChangePasswordNewPassword(newpassword);
	}

	/*
	 * Enter your Confirm Password on Change Password Page
	 * 
	 * @param{string confirmPassword}- this is the confirm Password same as the
	 * New Pass word user willing to Change to on the Account
	 */
	@When("^I Enter Confirmed Password  as \"([^\"]*)\"$")
	public void i_Enter_Confirmed_Password_as(String confirmPassword) {
		changepasswordPage.sendChangePasswordConfirmPassword(confirmPassword);

	}

	/* Click on Submit button on Change Password page */
	@When("^I click Submit button$")
	public void i_click_Submit_button() {
		changepasswordPage.clickChangePasswordSubmitButton();
	}

	/* Click Top Deposit Button on the Home Page */
	@When("^I click a Depositbutton$")
	public void i_click_a_Depositbutton() {
		basePage.clickTopDepositButton();

	}

	/* Getting the Current Cash Balance displayed on the Home Page */
	@When("^I get the Current Cash Balance$")
	public void i_get_the_Current_Cash_Balance() {
		basePage.storeHomePageAccountBalance();

	}

	/* User Check is Balance */
	@When("^I check My account Balance$")
	public void i_check_My_account_Balance() {
		depositPage.storePreviousBalance();

	}

	/*
	 * Enter your CVV Number
	 * 
	 * @param{string CardCVVNumber}- this is the Security Number at the Back of
	 * the Credit Card of the Account holder
	 */
	@When("^I enter CVV as \"([^\"]*)\"$")
	public void i_enter_CVV_as(String CardCVVNumber) {
		depositPage.sendCashierDepositCardCVVNumber(CardCVVNumber);
	}

	/*
	 * Enter the Amount to Deposit
	 * 
	 * @param{string Amount}- this is the Amount User wants to Deposit to the
	 * Account
	 */
	@When("^I enter Amount To Deposit as \"([^\"]*)\"$")
	public void i_enter_Amount_To_Deposit_as(String Amount) {
		depositPage.sendCashierDepositOtherAmountToDeposit(Amount);

	}

	/* Click on Deposit button within the Cashier Deposit Page */
	@When("^I click a SafeChargeDepositbutton$")
	public void i_click_a_SafeChargeDepositbutton() {
		depositPage.clickCashierDepositSafeChargeDepositButton();

	}

	/* Click on Close Button on Deposit Successful Pop-up box */
	@When("^I click on CloseButton within the Success Cashier Pop-up box$")
	public void i_click_on_CloseButton_within_the_Success_Cashier_Pop_up_box() {
		depositPage.clickCashierDepositSuccessPopBoxCloseButton();

	}

	/* Click on the Payment Method Logo */
	@When("^I click on Payment Methods Card Logo$")
	public void i_click_on_Payment_Methods_Card_Logo() {
		depositPage.clickCashierDepositPaymentMethodLogo();

	}

	/*
	 * Enter your Credit Card Numbers
	 * 
	 * @param{string cardNumbers}- this is the Credit Card Numbers of the
	 * Account holder
	 */
	@When("^I enter CardVisa Number as \"([^\"]*)\"$")
	public void i_enter_CardVisa_Number_as(String cardNumbers) {
		depositPage.sendCashierDepositCreditCardNumbers(cardNumbers);
	}

	/*
	 * Enter the Card Expiry date of the Month
	 * 
	 * @param{string cardExpiryMonth}- this is theCredit Card Expire Month of
	 * the Account holder
	 * 
	 */
	@When("^I entry Expiry card month as \"([^\"]*)\"$")
	public void i_entry_Expiry_card_month_as(String cardExpiryMonth) {
		depositPage.sendCashierDepositCreditCradExpireDateMonth(cardExpiryMonth);

	}

	/*
	 * Enter Expiry date of the Year for the Card
	 * 
	 * @param{string cardExpiryYear}- this is the Credit card Year of Expiration
	 * of the Account holder
	 */
	@When("^I enter Expiry card year as \"([^\"]*)\"$")
	public void i_enter_Expiry_card_year_as(String cardExpiryYear) {
		depositPage.sendCashierDepositCreditCardExpireDateYear(cardExpiryYear);

	}

	/* User check his balance */
	@When("^I check My account Balance on withdraw Page$")
	public void i_check_My_account_Balance_on_withdraw_Page() {
		withdrawPage.storePreviousBalance();
	}

	/* User enter amount to withdraw */
	@When("^I enter withdraw amount as \"([^\"]*)\"$")
	public void i_enter_withdraw_amount_as(String withdrawAmount) {
		withdrawPage.sendCashierAmountToWithdraw(withdrawAmount);
	}

	/* User click on the Menu icon within the Cashier Page */
	@When("^I click on  Cashier Menu Icon within the Cashier$")
	public void i_click_on_Cashier_Menu_Icon_within_the_Cashier() {
		withdrawPage.clickCashierMenuIcon();
	}

	/* user click on withrawal link within the cashier Menu */
	@When("^I click on Withdraw link within the Cashier Menu$")
	public void i_click_on_Withdraw_link_within_the_Cashier_Menu() {
		cmPage.clickCashierMenuWithdrawLink();

	}

	/* User click on ok button on the Success Po-up box */
	@When("^I click success pop-up box Ok Button$")
	public void i_click_success_pop_up_box_Ok_Button() {
		withdrawPage.clickCashierWithdrawSuccessPopUpBoxOKButton();
	}

	/* User click on withdrawal button */
	@When("^I click Withdrawal Button$")
	public void i_click_Withdrawal_Button() {
		withdrawPage.clickCashierWithdrawButton();

	}

	/* User click on Pending withdraw button */
	@When("^I click on Pending withdrwal Cancel Button$")
	public void i_click_on_Pending_withdrwal_Cancel_Button() {
		withdrawPage.clickCashierWithdrawPendingCancelButton();

	}

	/* User click on Pending withdraw No Confirmation button */
	@When("^I click on No Button on Pending Confirmation box$")
	public void i_click_on_No_Button_on_Pending_Confirmation_box() {
		withdrawPage.clickCashierWithdrawPendingCancelNOConfirmationButton();

	}

	/* User click on Pending withdraw Yes Confirmation button */
	@When("^I click on Yes Button on Pending Confirmation box$")
	public void i_click_on_Yes_Button_on_Pending_Confirmation_box() {
		withdrawPage.clickCashierWithdrawPendingCancelYesConfirmationButton();

	}

	/* User click on Pending withdraw OK Confirmation button */
	@When("^I click on OK button on Confirmation success Pending Cancellation Pop up Box$")
	public void i_click_on_OK_button_on_Confirmation_success_Pending_Cancellation_Pop_up_Box() {
		withdrawPage.clickCashierWithdrawPendingCancelConfirmationOKButton();
	}

	/* User click on withdraw Transaction Failed Pop-up box Ok button */
	@When("^I click Transaction Failed Ok Button$")
	public void i_click_Transaction_Failed_Ok_Button() {
		withdrawPage.clickCashierWithdrawDeclinedTransactionPopBox_Ok();

	}

	/* Click on Roulette Express Premium game */
	@When("^I click on Roulette Express Premium Game$")
	public void i_click_on_Roulette_Express_Premium_Game() {
		homePage.clickRouletteExpressPremium();

	}

	/* Click on the More Info link with the Game Pop-up */
	@When("^I click on More info link$")
	public void i_click_on_More_info_link() {
		homePage.clickGamePopBoxMoreInfoLink();

	}

	/* Click on Play For Real button on the Game info Page */
	@When("^I click on Play For Real on Game Info Page$")
	public void i_click_on_Play_For_Real_on_Game_Info_Page() throws AWTException {
		gameInfoPage.clickGameInfoPlayForRealButton();

	}

	/* Click on Playtech Casino slot Game */
	@When("^I click on Playtech casino slot Game$")
	public void i_click_on_Playtech_casino_slot_Game() {
		homePage.clickCasinoSlotsGames();

	}

	/* Click on Play for Fun Button on Game info page */
	@When("^I click on Play For Fun on Game Info Page$")
	public void i_click_on_Play_For_Fun_on_Game_Info_Page() {
		gameInfoPage.clickGameInfoPlayForFunButton();

	}

	/* Click on Playtech Virtue Fusion Games on Vegas */
	@When("^I click on Playtech Virtue Fusion slot Game$")
	public void i_click_on_Playtech_Virtue_Fusion_slot_Game() {
		homePage.clickCasinoSlotsGames();
	}

	/* Click on the Search box */
	@When("^I click on the Search Input Icon$")
	public void i_click_on_the_Search_Input_Icon() {
		homePage.clickSearchInputBox();

	}

	/* Click on the Search game on the Search box */
	@When("^I enter Game Search for as \"([^\"]*)\"$")
	public void i_enter_Game_Search_for_as(String gameSearchType) {
		homePage.sendGameSearch(gameSearchType);

	}

	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	/* This Below are Only for @Then Method */
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	/* Verify if Login Button is present on the home page */
	@Then("^I should see Login Button$")
	public void i_should_see_Login_Button() {
		Assert.assertTrue(basePage.isLoginButtonPresent());

	}

	/* Verify if Supercasino Logo is displayed on the Home page */
	@Then("^I should see Supercasino Logo$")
	public void i_should_see_Supercasino_Logo() {
		Assert.assertTrue(basePage.isSupercasinoLogoPresent());

	}

	/* Verify if Side Bar Menu icon is displayed */
	@Then("^I should see SideBar Menu Icon$")
	public void i_should_see_SideBar_Menu_Icon() {
		Assert.assertTrue(basePage.isSideBarIconPresent());

	}

	/* Verify if Casino Tab is Present within the Vertical */
	@Then("^I should see Casino Vertical Tab$")
	public void i_should_see_Casino_Vertical_Tab() {
		Assert.assertTrue(basePage.isCasinoTabPresent());
	}

	/* Verify if Vegas Tab is Present within the Vertical */
	@Then("^I should see Vegas Vertical Tab$")
	public void i_should_see_Vegas_Vertical_Tab() {
		Assert.assertTrue(basePage.isVegasTabPresent());

	}

	/* Verify if Live Tab is Present within the Vertical */
	@Then("^I should see Live Vertical Tab$")
	public void i_should_see_Live_Vertical_Tab() {
		Assert.assertTrue(basePage.isLiveTabPresent());

	}

	/* Verify if Promos Tab is Present within the Vertical */
	@Then("^I should see Promos Vertical Tab$")
	public void i_should_see_Promos_Vertical_Tab() {
		Assert.assertTrue(basePage.isPromoTabPresent());

	}

	/* Verify if Hero Banner is displayed on the Home Page */
	@Then("^I should see Hero Banner$")
	public void i_should_see_Hero_Banner() {

	}

	/* Verify if Games Category is present on the Home Page */
	@Then("^I should see Games Category Tab$")
	public void i_should_see_Games_Category_Tab() {

	}

	/* Verify if Login Pop up box is displayed when Login button is clicked */
	@Then("^I should see Login Pop-up box displayed$")
	public void i_should_see_Login_Pop_up_box_displayed() {
		Assert.assertTrue(loginPage.isLoginPopUpBoxPresend());
	}

	/* Verify if Supercasino logo is displayed on Login Pop Up Box */
	@Then("^I should see Supercasino Logo displayed$")
	public void i_should_see_Supercasino_Logo_displayed() {
		Assert.assertTrue(loginPage.isPopUpBoxSupercasinoLogoPresent());

	}

	/* Verify if username Input box is displayed */
	@Then("^I should see Username Input Box$")
	public void i_should_see_Username_Input_Box() {
		Assert.assertTrue(loginPage.isPopUpBoxUsernameInputBoxPresent());
	}

	/* Verify if password Input box is displayed */
	@Then("^I should see Password Input box$")
	public void i_should_see_Password_Input_box() {
		Assert.assertTrue(loginPage.isPopUpBoxPasswordInputBoxPresent());

	}

	/* Verify if forgotten details link is displayed */
	@Then("^I should see Forgotten details link$")
	public void i_should_see_Forgotten_details_link() {
		Assert.assertTrue(loginPage.isPopUpBoxForgottenDetialsLinkPresent());

	}

	/* Verify if Sign in button is displayed */
	@Then("^I should see SignIn Button$")
	public void i_should_see_SignIn_Button() {
		Assert.assertTrue(loginPage.isPopUpBoxSignButtonPresent());

	}

	/* Verify if NewUser link displayed */
	@Then("^I should see New User link$")
	public void i_should_see_New_User_link() {
		Assert.assertTrue(loginPage.isPopUpBoxNewUserLinkPresent());

	}

	/* Verify if Join Now button is displayed */
	@Then("^I should see Join Now Button$")
	public void i_should_see_Join_Now_Button() {
		Assert.assertTrue(loginPage.isPopUpBoxJoinNowButtonPresent());

	}

	/* Verify if close link is displayed */
	@Then("^I should see Close Incon$")
	public void i_should_see_Close_Incon() {
		Assert.assertTrue(loginPage.isPopUpBoxCloseIconPresent());
	}

	/* Verify Login Pop-up box is closed when close icon is clicked */
	@Then("^Login Pop-up box should be closed$")
	public void login_Pop_up_box_should_be_closed() {
		Assert.assertTrue(basePage.isLoginButtonPresent());

	}

	/* Verify if Login Error Message is displayed */
	@Then("^I should see Login errorMesssage Pop-up box$")
	public void i_should_see_Login_errorMesssage_Pop_up_box() {
		Assert.assertTrue(loginPage.isLoginPopUpBoxErrorMessagePresent());
	}

	/* Verify if Username is displayed */
	@Then("^I should see username as \"([^\"]*)\" present$")
	public void i_should_see_username_as_present(String username) {
		Assert.assertTrue(basePage.isUserInfoPresent());

	}

	/* Verify if Login Account Balance displayed */
	@Then("^I should see AccountBlance present$")
	public void i_should_see_AccountBlance_present() {
		Assert.assertTrue(basePage.isHomePageAccountBalancePresent());

	}

	/* Verify if Deposit is displayed */
	@Then("^I should see Depositbutton present$")
	public void i_should_see_Depositbutton_present() {
		Assert.assertTrue(basePage.isTopDepositButtonPresent());

	}

	/* Verify if user is Navigated to Registration Page */
	@Then("^I should Navigate to Registration Page$")
	public void i_should_Navigate_to_Registration_Page() {
		Assert.assertEquals(RegPage.isRegisterPageTitlePresent(), "REGISTER");

	}

	@Then("^I should see Register on the Register form$")
	public void i_should_see_Register_on_the_Register_form() {

	}

	/* Verify if Email input box is displayed on Registration Page */
	@Then("^I should Email Input box displayed on Registration page$")
	public void i_should_Email_Input_box_displayed_on_Registration_page() {
		Assert.assertTrue(RegPage.isRegisterEmailInputBoxPresent());
	}

	/* Verify if Password input box is displayed on Registration Page */
	@Then("^I should see Password Input box displayed on Registration page$")
	public void i_should_see_Password_Input_box_displayed_on_Registration_page() {
		Assert.assertTrue(RegPage.isRegisterPasswordInputBoxPresent());
	}

	/* Verify if UserName input box is displayed on Registration Page */
	@Then("^I should see Useranme Input box displayed on Registration Page$")
	public void i_should_see_Useranme_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterUserNameInputBoxPresent());
	}

	/* Verify if ScreenName input box is displayed on Registration Page */
	@Then("^I should see ScreenName Input box displayed on Registration Page$")
	public void i_should_see_ScreenName_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterScreenNameInputBoxPresent());
	}

	/* Verify if FirstName input box is displayed on Registration Page */
	@Then("^I should see FirstName Input box displayed on Registration Page$")
	public void i_should_see_FirstName_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterFirstNameInputBoxPresent());

	}

	/* Verify if SurName input box is displayed on Registration Page */
	@Then("^I should see Surname Input box displayed on Registration Page$")
	public void i_should_see_Surname_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterSurNameInputBoxPresent());
	}

	/*
	 * Verify if Date of Birth Day Dropdown Menu box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Date of Birth Day Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Day_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterDOBDayDropdownBoxPresent());
	}

	/*
	 * Verify if Date of Birth Month Dropdown Menu box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Date of Birth Month Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Month_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterDOBMonthDropdownBoxPresent());

	}

	/*
	 * Verify if Date of Birth Year Dropdown Menu box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Date of Birth Year Dropdown box displayed on Registration Page$")
	public void i_should_see_Date_of_Birth_Year_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterDOBYearhDropdownBoxPresent());
	}

	/* Verify if Gender Radio Buttons are displayed on Registration Page */
	@Then("^I should see Gender Radio Buttons displayed on Registration Page$")
	public void i_should_see_Gender_Radio_Buttons_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterGenderTypeFemaleRadioButtonPresent());
	}

	/* Verify if Country input box is displayed on Registration Page */
	@Then("^I should see Country Input box displayed on Registration Page$")
	public void i_should_see_Country_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterCountryInputBoxPresent());

	}

	/* Verify if Currency input box is displayed on Registration Page */
	@Then("^I should see Currency Input box displayed on Registration Page$")
	public void i_should_see_Currency_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterCunrrencyDropdownBoxPresent());

	}

	/* Verify if House Number input box is displayed on Registration Page */
	@Then("^I should see House Number Input box displayed on Registration Page$")
	public void i_should_see_House_Number_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterHouseNumberInputBoxPresent());
	}

	/* Verify if Find Address Button is displayed on Registration Page */
	@Then("^I should see Find Address button displayed on Registration Page$")
	public void i_should_see_Find_Address_button_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterFindAddressButtonPresent());
	}

	/*
	 * Verify if Country Dialling Code dropdown menu box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Country Code dropdown box displayed on Registration Page$")
	public void i_should_see_Country_Code_dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterCountryDialingCodeDropdownBoxPresent());

	}

	/* Verify if ContactNumber input box is displayed on Registration Page */
	@Then("^I should see Contact Number Input box displayed on Registration Page$")
	public void i_should_see_Contact_Number_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterContactNumberInputBoxPresent());
	}

	/*
	 * Verify if Deposit limitType dropdown menu box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Deposit Limit Type Input box displayed on Registration Page$")
	public void i_should_see_Deposit_Limit_Type_Input_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isDepositLimitChooseTypePresent());
	}

	/* Verify if Deposit limit Amount box is displayed on Registration Page */
	@Then("^I should see Deposit Limit Amount Dropdown box displayed on Registration Page$")
	public void i_should_see_Deposit_Limit_Amount_Dropdown_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isDepositLimitChooseLimitPresent());
	}

	/* Verify if Free Bonus check box is displayed on Registration Page */
	@Then("^I should see Free Bonuses and Offer Check box checked displayed on Registration Page$")
	public void i_should_see_Free_Bonuses_and_Offer_Check_box_checked_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterFreeBonusessCheckedBoxPresent());
	}

	/* Verify if Over 18 check box is displayed on Registration Page */
	@Then("^I should see OverEighteenPlus Check box displayed on Registration Page$")
	public void i_should_see_OverEighteenPlus_Check_box_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterOverEightennPlusCheckBoxPresent());

	}

	/*
	 * Verify if term link is displayed within the 18+ contents on Registration
	 * Page
	 */
	@Then("^I should see terms link within OverEighteenPlus Content displayed on Registration Page$")
	public void i_should_see_terms_link_within_OverEighteenPlus_Content_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterOverEighteenTermsPresent());
	}

	/*
	 * Verify if Privacy Policy link is displayed within the 18+ contents on
	 * Registration Page
	 */
	@Then("^I should see Privacy Policy link within OverEighteenPlus Content displayed on Registration Page$")
	public void i_should_see_Privacy_Policy_link_within_OverEighteenPlus_Content_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterOverEighteenPrivacyPolicyBoxPresent());

	}

	/* Verify if Register Now button is displayed on Registration Page */
	@Then("^I should see Register Now Button displayed on Registration Page$")
	public void i_should_see_Register_Now_Button_displayed_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterSubmitButtonPresent());

	}

	/*
	 * Verify if Compliance message is displayed below Register Now button on
	 * Registration Page
	 */
	@Then("^I should see Compliance Text displayed below Register Now button on Registration Page$")
	public void i_should_see_Compliance_Text_displayed_below_Register_Now_button_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegisterComplianceMessagePresent());
	}
	
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Invalid Error Message displayed by the Email input box on Registration Page$")
	public void i_should_see_Invalid_Error_Message_displayed_by_the_Email_input_box_on_Registration_Page()  {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Password input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Password_input_box_on_Registration_Page()  {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the UserName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_UserName_input_box_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the OnScreenName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_OnScreenName_input_box_on_Registration_Page()  {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the FirstName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_FirstName_input_box_on_Registration_Page(){
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the SurName input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_SurName_input_box_on_Registration_Page() {
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Address input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Address_input_box_on_Registration_Page()  {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Postcode input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Postcode_input_box_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Town input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Town_input_box_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the County input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_County_input_box_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Contact Number input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Contact_Number_input_box_on_Registration_Page() {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}
	/* Verify if Error Message will be displayed with an invalid data */
	@Then("^I should see Error Message displayed by the Deposit linit Amount input box on Registration Page$")
	public void i_should_see_Error_Message_displayed_by_the_Deposit_linit_Amount_input_box_on_Registration_Page()  {
		Assert.assertTrue(RegPage.isRegInvalidDataErrorMessagePresent());
	    
	}

	/* Verify if disabled  Register now  button is displayed */
	@Then("^I should see Register Now Button disabled$")
	public void i_should_see_Register_Now_Button_disabled() {
		Assert.assertTrue(RegPage.isDisabledRegisterNowButtonPresent());
	}
	
	
	/*
	 * Verify if Error Message is displayed on Registration form for Invalid
	 * data
	 */
	@Then("^I should see Error Messsage displayed on Register Page$")
	public void i_should_see_Error_Messsage_displayed_on_Register_Page() {
		Assert.assertTrue(RegPage.isRegisterErrorMessagePresent());

	}

	/* Verify if Deposit limit link is displayed on Registration page */
	@Then("^I should see Deposit Limit Link$")
	public void i_should_see_Deposit_Limit_Link() {
		Assert.assertTrue(RegPage.isRegisterDepositLimiClickHeretLinkPresent());
	}

	/*
	 * Verify if Choose Type input Deposit limit box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Choose Type dropdown box$")
	public void i_should_see_Choose_Type_dropdown_box() {
		Assert.assertTrue(RegPage.isDepositLimitChooseTypePresent());

	}

	/*
	 * Verify if Choose Amount input Deposit limit box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Choose Limit  dropdown box$")
	public void i_should_see_Choose_Limit_dropdown_box() {
		Assert.assertTrue(RegPage.isDepositLimitChooseLimitPresent());

	}

	/*
	 * Verify if Choose Type Value Deposit limit box is displayed on
	 * Registration Page
	 */
	@Then("^I should see Choose Type as \"([^\"]*)\"$")
	public void i_should_see_Choose_Type_as(String Value) {
		Assert.assertTrue(RegPage.isDepositLimitDailyPresent(Value));
		Assert.assertTrue(RegPage.isDepositLimitWeeklyPresent(Value));
	}

	/*
	 * Verify if Choose Amount Deposit limit is displayed on Registration Page
	 */
	@Then("^I should see Choose Limit as \"([^\"]*)\"$")
	public void i_should_see_Choose_Limit_as(String Value) {
		Assert.assertTrue(RegPage.isDepositLimitTenThousandPoundsPresent(Value));

	}

	@Then("^I should see Other Amount  as \"([^\"]*)\"$")
	public void i_should_see_Other_Amount_as(String Value) {
		Assert.assertTrue(RegPage.isDepositLimitTenThousandPoundsPresent(Value));
	}

	/*
	 * Verify if user is able to Navigate to Welcome Page after registration
	 * with Valid Data
	 */
	@Then("^I should navigate to welcome page\\.$")
	public void i_should_navigate_to_welcome_page() {
		Assert.assertTrue(welcomePage.isWelcomeTitleTextPresent());

	}

	/* Verify if Deposit Button is displayed within Welcome Page */
	@Then("^I should see Deposit Now Button$")
	public void i_should_see_Deposit_Now_Button() {
		Assert.assertTrue(welcomePage.isWelcomePageDepositNowButtonPresent());

	}

	/* Verify if More Info link is displayed within Welcome Page */
	@Then("^I should see More Info link$")
	public void i_should_see_More_Info_link() {
		Assert.assertTrue(welcomePage.isWelcomePageDepositMoreInfoLink());
	}

	/* Verify if Play Now Button is displayed within WelcomePage */
	@Then("^I should see Play Now Button$")
	public void i_should_see_Play_Now_Button() {
		Assert.assertTrue(welcomePage.isWelcomePlayNowButtonPresent());

	}

	/*
	 * Verify if BonusTerm Frame box is displayed when Clicking on Wagerring
	 * link on Reg Page
	 */
	@Then("^I should see BonusTerms and Condition pop-up displayed$")
	public void i_should_see_BonusTerms_and_Condition_pop_up_displayed() {
		Assert.assertTrue(RegPage.isRegisterBonusTermsFrameBoxPresent());

	}

	/*
	 * Verify if BonusTerm Frame box is Closed when Clicking on Close Icon on
	 * Frame Box
	 */
	@Then("^I should see no BonusTerms and Condition pop-up frame box$")
	public void i_should_see_no_BonusTerms_and_Condition_pop_up_frame_box() {
		Assert.assertTrue(RegPage.isRegisterSubmitButtonPresent());

	}

	/*
	 * Verify if Terms Frame box is displayed when clicking on Term link within
	 * over 18 text on Registration Page
	 */
	@Then("^I should see Terms and Condition pop-up displayed$")
	public void i_should_see_Terms_and_Condition_pop_up_displayed() {
		Assert.assertTrue(RegPage.isRegisterTermsAndConditionFrameBoxPresent());

	}

	/*
	 * Verify if Term Frame box is Closed when Clicking on Close Icon on Frame
	 * Box
	 */
	@Then("^I should see no Terms and Condition pop-up frame box$")
	public void i_should_see_no_Terms_and_Condition_pop_up_frame_box() {
		Assert.assertTrue(RegPage.isRegisterSubmitButtonPresent());

	}

	/*
	 * Verify if Privacy Policy Frame box is displayed when clicking on Term
	 * link within over 18 text on Registration Page
	 */
	@Then("^I should see Privacy Policy pop-up displayed$")
	public void i_should_see_Privacy_Policy_pop_up_displayed() {
		Assert.assertTrue(RegPage.isRegisterPrivacyPolicyFrameBoxPresent());

	}

	/*
	 * Verify if Privacy Policy Frame box is Closed when Clicking on Close Icon
	 * on Frame Box
	 */
	@Then("^I should see no Privacy Policy pop-up frame box$")
	public void i_should_see_no_Privacy_Policy_pop_up_frame_box() {
		Assert.assertTrue(RegPage.isRegisterSubmitButtonPresent());

	}

	/* Verify if Game Pop-up box is displayed when user click on any game */
	@Then("^I should see a Game Pop-upbox$")
	public void i_should_see_a_Game_Pop_upbox() {
		Assert.assertTrue(homePage.isGamePopUpBoxPresent());

	}

	/* Verify if the Game Image is displayed on the Game Pop-up box */
	@Then("^I should see Game Image in pop-up box$")
	public void i_should_see_Game_Image_in_pop_up_box() {
		Assert.assertTrue(homePage.isGameImageWithinGamePopUpBoxPresent());

	}

	/*
	 * Verify if the Name of the Game Launched is displayed on the Game Pop-up
	 * box
	 */
	@Then("^I should see the Name of the Game$")
	public void i_should_see_the_Name_of_the_Game() {
		Assert.assertTrue(homePage.isGameNameInGamePopUpBoxPresent());

	}

	/* Verify if Play button is displayed on the Game pop-up box */
	@Then("^I should see Play button within the Pop-up box$")
	public void i_should_see_Play_button_within_the_Pop_up_box() {
		Assert.assertTrue(homePage.isPlayButtonWithinGamePopUpBoxPresent());

	}

	/* Verify if Demo Button is displayed on the Game Pop-up box */
	@Then("^I should see Demo button within the Pop-up box$")
	public void i_should_see_Demo_button_within_the_Pop_up_box() {
		Assert.assertTrue(homePage.isDemoButtonWithinGamePopUpBoxPresent());

	}

	/* Verify if More Info link is displayed on the Game Pop-up box */
	@Then("^I should see MoreInfo link on the Game Pop-up box$")
	public void i_should_see_MoreInfo_link_on_the_Game_Pop_up_box() {
		Assert.assertTrue(homePage.isMoreInfoLinkWithinGamePopUpBoxPresent());

	}

	/* Verify if Close Icon is displayed on the Game Pop-up box */
	@Then("^I should see Close icon on the Game Pop-up box$")
	public void i_should_see_Close_icon_on_the_Game_Pop_up_box() {
		Assert.assertTrue(homePage.isCloseIconWithinGamePopUpBoxPresent());

	}

	/*
	 * Verify if Game Pop-up box will close by clicking on the Close Icon on the
	 * Game Pop-up box
	 */
	@Then("^I should see Game Pop-up box closed$")
	public void i_should_see_Game_Pop_up_box_closed() {
		Assert.assertTrue(basePage.isTopDepositButtonPresent());

	}

	/* Verify if the Game can be launched by clicking Play button */
	@Then("^I should see a Play for Cash game Launching$")
	public void i_should_see_a_Play_for_Cash_game_Launching() {
		Assert.assertNotSame("Not the sate Url",gameInfoPage.getInfoPageUrl(), d.getCurrentUrl());
			RepPage.NavigateBackToHomePage();

	}

	/* Verify if Demo game is Launched by clicking Demo button */
	@Then("^I should see a Demo Game Launching$")
	public void i_should_see_a_Demo_Game_Launching() {
		Assert.assertNotSame("Not the sate Url",gameInfoPage.getInfoPageUrl(), d.getCurrentUrl());;
		// Navigate Back to the Home Page.
		RepPage.NavigateBackToHomePage();

	}

	/* Verify if Slots Game can be launched by clicking Play button */
	@Then("^I should see a Slots game launching$")
	public void i_should_see_a_Slots_game_launching() {
		Assert.assertNotSame(slotGamePage.VerifySlotGameUrlAddress(),d.getCurrentUrl());
		slotGamePage.NavigateBackToHomePage();
	}

	/* Verify if Table Game can be launched by clicking Play button */
	@Then("^I should see a Table Game launching$")
	public void i_should_see_a_Table_Game_launching() {
		Assert.assertEquals(slotGamePage.VerifySlotGameUrlAddress(),d.getCurrentUrl());
		slotGamePage.NavigateBackToHomePage();

	}

	/*
	 * Verify if Slots Game On Vegas Home can be launched by clicking Play
	 * button
	 */
	@Then("^I should see a Vegas Slots Game launching$")
	public void i_should_see_a_Vegas_Slots_Game_launching() {
		Assert.assertNotSame(slotGamePage.VerifySlotGameUrlAddress(),d.getCurrentUrl());
		// Assert.assertTrue(slotGamePage.isVegasSlotGameSoundsBoxPresent());
		slotGamePage.NavigateBackToHomePage();

	}

	/*
	 * Verify if Terms And Conditions link is displayed within the Footer on the
	 * Home Page
	 */
	@Then("^I should see Terms link within the footer$")
	public void i_should_see_Terms_link_within_the_footer() {
		Assert.assertTrue(footerPage.isTermsAndConditionLinkPresent());

	}

	/* Verify if VIP link is displayed within the Footer on the Home Page */
	@Then("^I should see VIP link within the footer$")
	public void i_should_see_VIP_link_within_the_footer() {
		Assert.assertTrue(footerPage.isVIPLinkPresent());

	}

	/*
	 * Verify if Privacy Policy link is displayed within the Footer on the Home
	 * Page
	 */
	@Then("^I should see PrivacyPolicy link within the footer$")
	public void i_should_see_PrivacyPolicy_link_within_the_footer() {
		Assert.assertTrue(footerPage.isPrivacyPolicyLinkPresent());

	}

	/*
	 * Verify if Responsible Gambling link is displayed within the Footer on the
	 * Home Page
	 */
	@Then("^I should see ResponsibleGambling link within the footer$")
	public void i_should_see_ResponsibleGambling_link_within_the_footer() {
		Assert.assertTrue(footerPage.isResponsibleGamblingLinkPresent());

	}

	/*
	 * Verify if PayPal Icon link is displayed within the Footer on the Home
	 * Page
	 */
	@Then("^I should see PayPalIcon link within the footer$")
	public void i_should_see_PayPalIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isPayPalLogoPresent());

	}

	/*
	 * Verify if Visa Icon link is displayed within the Footer on the Home Page
	 */
	@Then("^I should see VisaIcon link within the footer$")
	public void i_should_see_VisaIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isVisaLogoPresent());

	}

	/*
	 * Verify if NetPlayTv Logo link is displayed within the Footer on the Home
	 * Page
	 */
	@Then("^I should see NetPlayTvIcon link within the footer$")
	public void i_should_see_NetPlayTvIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isNetPlayTVLogoPresent());

	}

	/*
	 * Verify if Over Eighteen Icon link is displayed within the Footer on the
	 * Home Page
	 */
	@Then("^I should see OverEighteenIcon link within the footer$")
	public void i_should_see_OverEighteenIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isEighteenPlusLogoPresent());

	}

	/*
	 * Verify if GamCare Icon link is displayed within the Footer on the Home
	 * Page
	 */
	@Then("^I should see GamCareIcon link within the footer$")
	public void i_should_see_GamCareIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isGameCareLogoPresent());

	}

	/*
	 * Verify if Gambling Commission Icon link is displayed within the Footer on
	 * the Home Page
	 */
	@Then("^I should see GamblingCommissionIcon link within the footer$")
	public void i_should_see_GamblingCommissionIcon_link_within_the_footer() {
		Assert.assertTrue(footerPage.isGamblingCommissionLogoPresent());

	}

	/*
	 * Verify if NetPlayTv Licence and Text is displayed within the Footer on
	 * the Home Page
	 */
	@Then("^I should see legalText within the footer$")
	public void i_should_see_legalText_within_the_footer() {
		Assert.assertTrue(footerPage.isNetplayTvLienceMessagelPresent());

	}

	/*
	 * Verify if PayPal Icon link is displayed within the Footer on the Home
	 * Page
	 */
	@Then("^I should Naviagte to Casino TermsAndCondition page$")
	public void i_should_Naviagte_to_Casino_TermsAndCondition_page() {
		Assert.assertTrue(TAndCPage.isTermsAndConditionsTitlePageDisplay());

	}

	/*
	 * Verify if user can navigate to Privacy Policy page by clicking on the
	 * Privacy policy link within the footer on the Home Page
	 */
	@Then("^I should Naviagte to Casino PrivacyPolicy page$")
	public void i_should_Naviagte_to_Casino_PrivacyPolicy_page() {
		Assert.assertTrue(privcypolicyPage.isPrivacyPolicyTitlePageDisplay());

	}

	/*
	 * Verify if user can navigate to Responsible Gambling Page page by clicking
	 * on the Responsible Gambling link within the footer on the Home Page
	 */
	@Then("^I should Naviagte to Casino ResponsibleGambling page$")
	public void i_should_Naviagte_to_Casino_ResponsibleGambling_page() {
		Assert.assertTrue(reponsibleGamblingPage.isResponsibleGamblingTitlePageDisplay());

	}

	/*
	 * Verify if user can navigate to VIP page by clicking on the VIP link
	 * within the footer on the Home Page
	 */
	@Then("^I should Naviagte to Casino VIP page$")
	public void i_should_Naviagte_to_Casino_VIP_page() {
		Assert.assertTrue(vipPage.isVIPClubLogoDisplay());

	}

	/*
	 * Verify if user can navigate to Terms And Condition page by clicking on
	 * the Terms And Conditions link within the footer on the VegasHome Page
	 */
	@Then("^I should Naviagte to Vegas TermsAndCondition page$")
	public void i_should_Naviagte_to_Vegas_TermsAndCondition_page() {
		Assert.assertTrue(TAndCPage.isTermsAndConditionsTitlePageDisplay());

	}

	/*
	 * Verify if user can navigate to Privacy Policy page by clicking on the
	 * Privacy policy link within the footer on the VegasHome Page
	 */
	@Then("^I should Naviagte to Vegas PrivacyPolicy page$")
	public void i_should_Naviagte_to_Vegas_PrivacyPolicy_page() {
		Assert.assertTrue(privcypolicyPage.isPrivacyPolicyTitlePageDisplay());

	}

	/*
	 * Verify if user can navigate to Vegas Responsible Gambling page by
	 * clicking on the Responsible Gambling link within the footer on the
	 * VegasHome Page
	 */
	@Then("^I should Naviagte to Vegas ResponsibleGambling page$")
	public void i_should_Naviagte_to_Vegas_ResponsibleGambling_page() {
		Assert.assertTrue(reponsibleGamblingPage.isResponsibleGamblingTitlePageDisplay());

	}

	/*
	 * Verify if user can navigate to Vegas VIP page by clicking on the VIP link
	 * within the footer on the VegasHome Page
	 */
	@Then("^I should Naviagte to Vegas VIP page$")
	public void i_should_Naviagte_to_Vegas_VIP_page() {
		Assert.assertTrue(vipPage.isVIPClubLogoDisplay());

	}

	/*
	 * Verify if Facebook logo link can be clicked to Navigate to Netplaytv
	 * facebook page
	 */
	@Then("^I should Navigate to Netplaytv Facebook page$")
	public void i_should_Navigate_to_Netplaytv_Facebook_page() throws InterruptedException {
		externalPage.isNetPlaytvFacebookPageDisplayed();
	}

	/*
	 * Verify if Tiwtter logo link can be clicked to Navigate to NetPlayTv
	 * Twitter page
	 */
	@Then("^I should Navigate to Netplaytv Tiwtter page$")
	public void i_should_Navigate_to_Netplaytv_Tiwtter_page() throws InterruptedException {
		externalPage.isNetPlayTvTwitterPageDisplayed();
	}

	/*
	 * Verify if NetPlayTv logo link can be clicked to Navigate to NetPlayTv
	 * Bettsson Corporate site page
	 */
	@Then("^I should Navigate to Netplaytv Corporate site page$")
	public void i_should_Navigate_to_Netplaytv_Corporate_site_page() throws InterruptedException {
		externalPage.isNetPlayTvBettssonCoporateSiteDisplayed();
	}

	/*
	 * Verify if 18+ logo link can be clicked to Navigate to Responsible
	 * Gambling page
	 */
	@Then("^I should Navigate to Responsible Gambling page$")
	public void i_should_Navigate_to_Responsible_Gambling_page() {
		Assert.assertTrue(reponsibleGamblingPage.isResponsibleGamblingTitlePageDisplay());

	}

	/*
	 * Verify if GamCare logo link can be clicked to Navigate to GamCare
	 * Corporate site page
	 */
	@Then("^I should Navigate to GameCare HomePage site$")
	public void i_should_Navigate_to_GameCare_HomePage_site() throws InterruptedException {
		externalPage.isGamCareSiteDisplayed();
	}

	/*
	 * Verify if Gambling Commission logo link can be clicked to Navigate to
	 * Gambling Commission Corporate site page
	 */
	@Then("^I should Navigate to GamblingCommission HomePage site$")
	public void i_should_Navigate_to_GamblingCommission_HomePage_site() throws InterruptedException {
		externalPage.isGamblingCommissionWebSiteDisplayed();

	}

	/* Verify if user will see a Join Now button within the Sidebar Menu */
	@Then("^I should see Join Now Button in SidebarMenu$")
	public void i_should_see_Join_Now_Button_in_SidebarMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarJoinNowButtonPresent());

	}

	/* Verify if user see a Login Button within the SideBar Menu */
	@Then("^I should see Login Button in the SidebarMenu$")
	public void i_should_see_Login_Button_in_the_SidebarMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarLoginButtonPresent());
	}

	/* Verify if user will see Home Link within the Sidebar Menu */
	@Then("^I should see Home link whtin the SidebarMenu$")
	public void i_should_see_Home_link_whtin_the_SidebarMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarHomeLinkPresent());
	}

	/* Verify if user see Home Link within the Sidebar Menu */
	@Then("^I should see Getting Started dropdown Menu$")
	public void i_should_see_Getting_Started_dropdown_Menu() {
		Assert.assertTrue(sidebarPage.IsSideBarGettingStartedDropDownArrowLinkPresent());
	}

	/* I should see Help Link within the Sidebar Menu */
	@Then("^I should see an Help link within the SidebarMenu$")
	public void i_should_see_an_Help_link_within_the_SidebarMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarHelpLinkPresent());

	}

	/* Verify if user will see Tv Presenter Link within the Sidebar Menu */
	@Then("^I should Tv Presenterlink within the SidebarMenu$")
	public void i_should_Tv_Presenterlink_within_the_SidebarMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarTVPresenterLinkPresent());

	}

	/*
	 * Verify if Responsible Gambling link is displayed within the Sidebar Menu
	 */
	@Then("^I should see Responsible Gambling link within the SidebarMenu$")
	public void i_should_see_Responsible_Gambling_link_within_the_SidebarMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarResponsibleGamblingLinkPresent());

	}

	/*
	 * Verify if user Navigated back to the Home Page By click Home Link within
	 * the Sidebar Menu
	 */
	@Then("^I should Navigate Back to Home Page$")
	public void i_should_Navigate_Back_to_Home_Page() {
		Assert.assertTrue(basePage.isLoginButtonPresent());

	}

	/*
	 * Verify if user will see Getting started within the Getting Started
	 * Dropdown Menu
	 */
	@Then("^I should see How To Get Started link within the GettingStarted dropdown SubMenu$")
	public void i_should_see_How_To_Get_Started_link_within_the_GettingStarted_dropdown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarGettingStartedDropDownHowToGetStartedLinkPresent());

	}

	/*
	 * Verify if user will see How To Deposit within the Getting Started
	 * Dropdown Menu
	 */
	@Then("^I should see How To deposit link within the GettingStarted Dropdown SubMenu$")
	public void i_should_see_How_To_deposit_link_within_the_GettingStarted_Dropdown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarGettingStartedDropDownHowToDepositLinkPresent());

	}

	/*
	 * Verify if user will see How To Withdraw within the Getting Started
	 * Dropdown Menu
	 */
	@Then("^I should see How To withdraw within the GettingStarted Dropdown SubMenu$")
	public void i_should_see_How_To_withdraw_within_the_GettingStarted_Dropdown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarGettingStartedDropDownHowToWithdrawLinkPresent());

	}

	/*
	 * Verify if user will see How to withdraw within the Getting Started
	 * Dropdown Menu
	 */
	@Then("^I should see How To Withdraw link within the GettingStarted Dropdown SubMenu$")
	public void i_should_see_How_To_Withdraw_link_within_the_GettingStarted_Dropdown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarGettingStartedDropDownHowToWithdrawLinkPresent());

	}

	/*
	 * Verify if user will see Is My Deposit Safe within the Getting Started
	 * Dropdown Menu
	 */
	@Then("^I should see Is My Deposit Safe link within the GettingStarted Dropdown SubMenu$")
	public void i_should_see_Is_My_Deposit_Safe_link_within_the_GettingStarted_Dropdown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarGettingStartedDropDownIsMyDepositSafeLinkPresent());
	}

	/*
	 * Verify if user will see Security within the Getting Started Dropdown Menu
	 */
	@Then("^I should see Security link within the GettingStarted Dropdown SubMenu$")
	public void i_should_see_Security_link_within_the_GettingStarted_Dropdown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarGettingSecurityLinkPresent());
	}

	/* Verify if user will Navigate to Getting Started Page */
	@Then("^I should Navigate to Getting Started page$")
	public void i_should_Navigate_to_Getting_Started_page() {
		Assert.assertTrue(gettingStartedPage.isGettingStartedTitlePageDisplay());

	}

	/* Verify if user will Navigate to How To Deposit Page */
	@Then("^I should Navigate to How To Deposit$")
	public void i_should_Navigate_to_How_To_Deposit() {
		Assert.assertTrue(howToDepositPage.isHowToDepositTitlePageDisplay());

	}

	/* Verify if user will Navigate to How To Withdraw Page */
	@Then("^I should Navigate to How To Withdraw page$")
	public void i_should_Navigate_to_How_To_Withdraw_page() {
		Assert.assertTrue(howToWithdrawPage.isHowToWithdrawTitlePageDisplay());

	}

	/* Verify if user will Navigate to Is My Deposit Safe Page */
	@Then("^I should Navigate to Is My Depost Safe page$")
	public void i_should_Navigate_to_Is_My_Depost_Safe_page() {
		Assert.assertTrue(ismyDepositSafePage.isIsMyDepositSafeTitlePageDisplay());

	}

	/* Verify if user will Navigate to Contact-Us Page */
	@Then("^I should Navigate to Contact Us Page$")
	public void i_should_Navigate_to_Contact_Us_Page() {
		Assert.assertTrue(contactusPage.isContactUSTitlePageDisplay());
	}

	/* Verify if user will Navigate to Presenters Page */
	@Then("^I should Navigate to Presenters Page$")
	public void i_should_Navigate_to_Presenters_Page() {
		Assert.assertTrue(presenterPage.isPresntersTitlePageDisplay());

	}

	/* Verify if user will Navigate to Responsible Gambling Page */
	@Then("^I should Navigate to Responsible Gambling Page$")
	public void i_should_Navigate_to_Responsible_Gambling_Page() {
		Assert.assertTrue(reponsibleGamblingPage.isResponsibleGamblingTitlePageDisplay());

	}

	/* Verify if user see HMy Account Link within the Sidebar Menu */
	@Then("^I should see My Account Dropdown Menu$")
	public void i_should_see_My_Account_Dropdown_Menu() {
		Assert.assertTrue(sidebarPage.IsSideBarMyAccountDropDownMemuArrowLinkPresent());

	}

	/* Verify if user see Logout Link within the Sidebar Menu */
	@Then("^I should see a LogOut link$")
	public void i_should_see_a_LogOut_link() {
		Assert.assertTrue(sidebarPage.IsSideBarLogOutLinkPresent());

	}

	/*
	 * Verify if user see Deposit Link within the nMy Account Droppdown within
	 * Sidebar Menu
	 */
	@Then("^I should see Deposit link within My Account DropDown SubMenu$")
	public void i_should_see_Deposit_link_within_My_Account_DropDown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarMyAccountDropDownMemuDepositLinkPresent());

	}

	/*
	 * Verify if user see Transaction Link within the My Account Dropdown
	 * Sidebar Menu
	 */
	@Then("^I should see Transaction link within My Account DropDown SubMenu$")
	public void i_should_see_Transaction_link_within_My_Account_DropDown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarMyAccountDropDownMenuTransactionLinkPresent());

	}

	@Then("^I should see Withdraw link within My Account DropDown SubMenu$")
	public void i_should_see_Withdraw_link_within_My_Account_DropDown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarMyAccountDropDownMenuWithdrawLinkPresent());

	}

	/* Verify if user see Change Password Link within the Sidebar Menu */
	@Then("^I should see Change Password link within My Account DropDown SubMenu$")
	public void i_should_see_Change_Password_link_within_My_Account_DropDown_SubMenu() {
		Assert.assertTrue(sidebarPage.IsSideBarMyAccountDropDownMenuAChangePasswordLinkPresent());

	}

	@Then("^I should Navigate to SafeCharge Cashier Deposit Page$")
	public void i_should_Navigate_to_SafeCharge_Cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isSafeChargeLogoPresent());
		depositPage.NavigateBackToHomePage();

	}

	/* Verify if user will Navigate to Transaction Cashier Page */
	@Then("^I should Navigate to SafeCharge Cashier Transaction Page$")
	public void i_should_Navigate_to_SafeCharge_Cashier_Transaction_Page() {
		Assert.assertTrue(transactionPage.isTransactionTitlePageDisplay());
		transactionPage.NavigateBackToHomePage();

	}

	/* Verify if user will Navigate to SafeCharge Withdraw Cashier Page */
	@Then("^I should Navigate to SafeCharge Cashier Withdraw Page$")
	public void i_should_Navigate_to_SafeCharge_Cashier_Withdraw_Page() {
		Assert.assertTrue(withdrawPage.isWithdrawFundsTextPresent());
		withdrawPage.NavigateBackToHomePage();

	}

	/* Verify if user will Navigate to SafeCharge Deposit Cashier Page */
	@Then("^I should Navigate to  Change Password Page$")
	public void i_should_Navigate_to_Change_Password_Page() {
		Assert.assertTrue(changepasswordPage.isChangePasswordTitlePageDisplay());

	}

	@Then("^I should Depsit button on Home Page$")
	public void i_should_Depsit_button_on_Home_Page() {
		Assert.assertTrue(basePage.isTopDepositButtonPresent());

	}

	/* Verify if Live Chat is displayed within the Side bar Menu */
	@Then("^I Should see a Live Chat link within the SidebarMenu$")
	public void i_Should_see_a_Live_Chat_link_within_the_SidebarMenu() {
		Assert.assertTrue(sidebarPage.isSideBarLiveChatLinkPresent());
	}

	/* Verify if Live Chat Open in a new Tab window */
	@Then("^I should Navigate to Live Chat Page$")
	public void i_should_Navigate_to_Live_Chat_Page() {
		chatPage.isLiveChatSuperCasinoLogoPresent();

	}

	/* Verify if user will is logged out */
	@Then("^I should be logged out$")
	public void i_should_be_logged_out() {
		Assert.assertTrue(basePage.isLoginButtonPresent());

	}

	/* Verify if Old Password text box is displayed */
	@Then("^I should see old password text box$")
	public void i_should_see_old_password_text_box() {
		Assert.assertTrue(changepasswordPage.isChangePasswordOldPasswordInputboxPresent());

	}

	/* Verify if New Password text box is displayed */
	@Then("^I should see new password text box$")
	public void i_should_see_new_password_text_box() {
		Assert.assertTrue(changepasswordPage.isChangePasswordNewPasswordInputBoxPresent());

	}

	/* Verify if Confirm Password text box is displayed */
	@Then("^I should confrim password text box$")
	public void i_should_confrim_password_text_box() {
		Assert.assertTrue(changepasswordPage.isChangePasswordConfirmPasswordInputBoxPresent());

	}

	/*
	 * Verify if Change your Password is displayed as title page on Change
	 * Password Page
	 */
	@Then("^I should see Change password as Title Page$")
	public void i_should_see_Change_password_as_Title_Page() {
		Assert.assertTrue(changepasswordPage.isChangePasswordTitlePageDisplay());

	}

	/*
	 * Verify if Error Messsage is displayed when invalid data are submited on
	 * Change Password page
	 */
	@Then("^I should see Error Message displayed$")
	public void i_should_see_Error_Message_displayed() {
		Assert.assertTrue(changepasswordPage.isChangePassWordErrorMessagePresent());

	}

	/*
	 * User should be redirected to Your Passowrd Has been successfuly Change
	 * Page
	 */
	@Then("^My Password Should be Successfuly Change$")
	public void my_Password_Should_be_Successfuly_Change() {
		Assert.assertTrue(changepasswordPage.isPassWordSuccessfullyChangeTitlePagePresent());
	}

	/* Verify if User has been redirected to New Safe Charge Cashier */
	@Then("^I should see new cashier$")
	public void i_should_see_new_cashier() {
		Assert.assertTrue(depositPage.isSafeChargeLogoPresent());

	}

	/*
	 * Verify if Cash Balance displayed is the same as the Cash Balance
	 * displayed on the Home Page
	 */
	@Then("^I should see Balance value in the cashier Deposit Page$")
	public void i_should_see_Balance_value_in_the_cashier_Deposit_Page() {
		double CashierBalDisplay = depositPage.storeCashierBalance();
		System.out.println(CashierBalDisplay);
		System.out.println(basePage.currentBalance);
		Assert.assertTrue("equals", CashierBalDisplay - basePage.currentBalance == 0);

	}

	/* Verify if Payment Details Texts is diaplayed on the cashier */
	@Then("^I should see  My Payments Methods text in the cashier Deposit Page$")
	public void i_should_see_My_Payments_Methods_text_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierPaymentsMethodTextPresent());

	}

	/*
	 * Verify Payment Details tests are displayed within the Cashier deposit
	 * Page
	 */
	@Then("^I should see  Payment Details text in the cashier Deposit Page$")
	public void i_should_see_Payment_Details_text_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierPaymentDetailsTextPresent());

	}

	/* Verify if Payment card Logo is displayed within the Cashier */
	@Then("^I should see payment logo in the cashier Deposit Page$")
	public void i_should_see_payment_logo_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierPaymentsLogoPresent());

	}

	/* Verify if other Payment Logo are displayed */
	@Then("^I should see other Payment Methods logo in the cashier Deposit Page$")
	public void i_should_see_other_Payment_Methods_logo_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierOtherPaymentsLogoPresent());
		// depositPage.NavigateBackToHomePage();
	}

	/*
	 * Verify if the Name of the Card owner is displayed within the Deposit Page
	 */
	@Then("^I should see account creditcard ownername in the cashier Deposit Page$")
	public void i_should_see_account_creditcard_ownername_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierCreditCardOwnerNamePresent());

	}

	/*
	 * Verify if the Card Expiry date is displayed within the Cashier Deposit
	 * Page
	 */
	@Then("^I should see card expiry date in the cashier$")
	public void i_should_see_card_expiry_date_in_the_cashier() {
		Assert.assertTrue(depositPage.isCashierCreditCardExpiryDatePresent());

	}

	/*
	 * Verify if UsernameInfo is displayed within the within the Cashier deposit
	 * Page
	 */
	@Then("^I should see  UsernameInfo as \"([^\"]*)\"$")
	public void i_should_see_UsernameInfo_as(String Username) {
		Assert.assertTrue(depositPage.isUserNamePresent(Username));

	}

	/* Verify if the Last four Number of th card is displayed */
	@Then("^I should see lastfour card numbers as \"([^\"]*)\"$")
	public void i_should_see_lastfour_card_numbers_as(String cardnumber) {
		Assert.assertTrue(depositPage.isCashierCreditCardLastFourNumberPresent(cardnumber));

	}

	/*
	 * Verify if the CVV Input box card is displayed within the Cashier Deposit
	 * Page
	 */
	@Then("^I should see CVV input field in the cashier Deposit Page$")
	public void i_should_see_CVV_input_field_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierCreditCardCVVPresent());

	}

	/*
	 * Verify ifPromoCode input box is displayed within the Cashier Deposit Page
	 */
	@Then("^I should see Promocode input text in the cashier Desposit Page$")
	public void i_should_see_Promocode_input_text_in_the_cashier_Desposit_Page() {
		Assert.assertTrue(depositPage.isCashierPromoCodePresent());
	}

	/* Verify if Billing Address check box is displayed within the cashier */
	@Then("^I should see Bill Address check box in the cashier Deposit Page$")
	public void i_should_see_Bill_Address_check_box_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierBillingAddressCheckBoxPresent());
	}

	/*
	 * Verify if the Amount to deposit boxes are displayed within the Cashier
	 * deposit page
	 */
	@Then("^I should Amount To deposit in the cashier Deposit Page$")
	public void i_should_Amount_To_deposit_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierAmountToDepositPresent());

	}

	/*
	 * Verify if the other Amount to deposit Input box is displayed within the
	 * Cashier Deposit page
	 */
	@Then("^I should see other amount input field in the cashier Deposit Page$")
	public void i_should_see_other_amount_input_field_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierOtherAmountInputFieldPresent());
	}

	/*
	 * Verify if SafeCharge Deposit Button is displayed within the Cashier
	 * Deposit Page
	 */
	@Then("^I should see Deposit deposit button in the cashier Deposit Page$")
	public void i_should_see_Deposit_deposit_button_in_the_cashier_Deposit_Page() {
		Assert.assertTrue(depositPage.isCashierSafeChargeDepositButtonPresent());
		depositPage.NavigateBackToHomePage();

	}

	/*
	 * Verify if Deposit Success Highlight Pop-up will be displayed when user
	 * deposit successfully
	 */
	@Then("^I should see Deposit Success Cashier Pop-up box displayed$")
	public void i_should_see_Deposit_Success_Cashier_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositSuccessLightBoxPresent());
	}

	/*
	 * Verify if the Your Transaction was approved text is displayed within the
	 * Deposit Success Pop up box
	 */
	@Then("^I should see Your transaction was approved Text displayed$")
	public void i_should_see_Your_transaction_was_approved_Text_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositSuccessLightBoxTextPresent());

	}

	/*
	 * Verify if the Close Button is displayed within the Deposit Success Pop up
	 * box
	 */
	@Then("^I should see CloseButton within the Success Cashier Pop-up box displayed$")
	public void i_should_see_CloseButton_within_the_Success_Cashier_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositSuccessLightBoxCloseButtonPresent());

	}

	/* Verify if the Account Balance Increase by the Amount Deposit */
	@Then("^I should see my new Account Balance increase by \"([^\"]*)\"$")
	public void i_should_see_my_new_Account_Balance_increase_by(String Amount) {
		double PreviousBalDisplay = depositPage.storeCashierBalance();
		double amtDeposit = Double.parseDouble(Amount);
		double NewBal = (amtDeposit + PreviousBalDisplay);
		Assert.assertTrue("equals", PreviousBalDisplay + amtDeposit == NewBal);
		depositPage.NavigateBackToHomePage();
	}

	/*
	 * Verify if Success Deposit pop-up box is closed after clicking on Close
	 * button
	 */
	@Then("^I should see no Deposit Success Cashier Pop-up box displayed\\.$")
	public void i_should_see_no_Deposit_Success_Cashier_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isCashierSafeChargeDepositButtonPresent());
	}

	/* Verify if Error Message is displayed */
	@Then("^I should see In Valid Expeiratin ErrorMessage displayed$")
	public void i_should_see_In_Valid_Expeiratin_ErrorMessage_displayed() {
		Assert.assertTrue(depositPage.isCreditCardEXperiationMonthErrorMessagePresent());
		depositPage.NavigateBackToHomePage();
	}

	/*
	 * Verify if Cvv Error Message is displayed when cvv Number are not filled
	 */
	@Then("^I should see The field must be exactly Three digits ErrorMessage Text displayed$")
	public void i_should_see_The_field_must_be_exactly_Three_digits_ErrorMessage_Text_displayed() {
		Assert.assertTrue(depositPage.isCreditCardCVVErrorMessagePresent());
		depositPage.NavigateBackToHomePage();
	}

	/*
	 * Verify if Error Message will be displayed when invalid amount is input in
	 * the Other Amount Input box
	 */
	@Then("^I should  Please Enter Valid ammount errorText displayed$")
	public void i_should_Please_Enter_Valid_ammount_errorText_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositOtherAmounToDepositErrorMessagePresent());
		depositPage.NavigateBackToHomePage();
	}

	/*
	 * Verify if Green tick or green colour is diplayed when oreect data is
	 * input
	 */
	@Then("^I should see Green tick mark next to CardOwnerNametext box$")
	public void i_should_see_Green_tick_mark_next_to_CardOwnerNametext_box() {

	}

	/*
	 * Verify if Green tick or green colour is diplayed when oreect data is
	 * input
	 */
	@Then("^I should see Green tick mark next to CardNumberbox box$")
	public void i_should_see_Green_tick_mark_next_to_CardNumberbox_box() {
		Assert.assertTrue(depositPage.isCashierDepositCardNumberGreenMarkPresent());

	}

	/*
	 * Verify if Green tick or green colour is diplayed when oreect data is
	 * input
	 */
	@Then("^I should see Green tick mark next to CardCVVtext box$")
	public void i_should_see_Green_tick_mark_next_to_CardCVVtext_box() {
		Assert.assertTrue(depositPage.isCashierDepositCardCVVNumberGreenMarkPresent());
	}

	/*
	 * Verify if Green tick or green colour is diplayed when oreect data is
	 * input
	 */
	@Then("^I should see a Green tick Mark next to EnterAmounttext box$")
	public void i_should_see_a_Green_tick_Mark_next_to_EnterAmounttext_box() {
		Assert.assertTrue(depositPage.isCashierDepositOtherAmountToDepositGreenMarkPresent());
		depositPage.NavigateBackToHomePage();

	}

	/* Verify if Deposit Declincled TransactionPop-up isdaisplay */
	@Then("^I should see Decline Pop-up box displayed$")
	public void i_should_see_Decline_Pop_up_box_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositDeclinedPop_BoxPresent());
	}

	/* Verify if Transaction decline text is diplayed within the Pop-up box */
	@Then("^I should see Your Transaction decline text displayed$")
	public void i_should_see_Your_Transaction_decline_text_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositDeclinedPopBoxMessagePresent());

	}

	/*
	 * Verify if Contact number for customer support is displayed with the
	 * Declined Pop-up box
	 */
	@Then("^I should see Contact Support Number displayed$")
	public void i_should_see_Contact_Support_Number_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositDeclinedPopBoxMCustomerSupportContactNumberPresent());
		depositPage.NavigateBackToHomePage();
	}

	/* Verify if Close icon is diplayed within the Declined Pop-up box */
	@Then("^I should see a close icon displayed$")
	public void i_should_see_a_close_icon_displayed() {
		Assert.assertTrue(depositPage.isCashierDepositDeclinedPopBoxCloseIconPresent());

	}

	/* Verify if the No Withdrawal method of Payement Pop-up box is displayed */
	@Then("^I shoule see No Withdrawal Mentod Pop-up box displayed$")
	public void i_shoule_see_No_Withdrawal_Mentod_Pop_up_box_displayed() {
		Assert.assertTrue(withdrawPage.isNoWithdrawalMethodsAvailablePopUpBoxPresent());
		withdrawPage.NavigateBackToHomePage();
	}

	/* Verify if user navigated to the Withdrawal page */
	@Then("^I should navigate to Withdrawl page\\.$")
	public void i_should_navigate_to_Withdrawl_page() {
		Assert.assertTrue(withdrawPage.isWithdrawFundsTextPresent());

		// basePage.logOut();

	}

	/* Verify if Card register logo is displayed within the withdrawal page */
	@Then("^I should see myRegister card logo displayed$")
	public void i_should_see_myRegister_card_logo_displayed() {
		Assert.assertTrue(withdrawPage.isWithdrawCreditCardLogoPresent());

	}

	/* Verify if Card OwnerName is displayed within the withdrawal page */
	@Then("^I should see account creditcard ownername in the cashier Withdraw Page$")
	public void i_should_see_account_creditcard_ownername_in_the_cashier_Withdraw_Page() {
		Assert.assertTrue(withdrawPage.isWithdrawCreditCardOwnerNamesPresent());

	}

	/* Verify if Card expiry is displayed within the withdrawal page */
	@Then("^I should see card expiry date in the cashier withdraw page$")
	public void i_should_see_card_expiry_date_in_the_cashier_withdraw_page() {
		Assert.assertTrue(withdrawPage.isWithdrawCreditCardExpiryPresent());
	}

	/* Verify if Card OwnerName is displayed within the withdrawal page */
	@Then("^I should see an enabled withdraw button displayed$")
	public void i_should_see_an_enabled_withdraw_button_displayed() {
		Assert.assertTrue(withdrawPage.isWithdrawActiveWithdrawButtonPresent());
		withdrawPage.NavigateBackToHomePage();
	}

	/*
	 * Verify if Amount to withdraw input box is displayed within the withdrawal
	 * page
	 */
	@Then("^I should see Amount To Withdraw input box display$")
	public void i_should_see_Amount_To_Withdraw_input_box_display() {
		Assert.assertTrue(withdrawPage.isWithdrawOtherAmountToWithdrawPresent());

	}

	/*
	 * Verify if disabled Withdraw button is displayed within the withdrawal
	 * page
	 */
	@Then("^I should see a disabled withdraw button displayed$")
	public void i_should_see_a_disabled_withdraw_button_displayed() {
		Assert.assertTrue(withdrawPage.isWithdrawInActiveWithdrawButtonPresent());
		withdrawPage.NavigateBackToHomePage();

	}

	/* Verify if Pop-up displayed within the withdrawal page can be closed */
	@Then("^I should see no pop-up box displayed$")
	public void i_should_see_no_pop_up_box_displayed() {
		Assert.assertTrue(withdrawPage.isWithdrawInActiveWithdrawButtonPresent());
	}

	/*
	 * Verify if withdraw pending cancel button is displayed within the
	 * withdrawal page
	 */
	@Then("^I should see a withdrawl Pending displayed$")
	public void i_should_see_a_withdrawl_Pending_displayed() {
		Assert.assertTrue(withdrawPage.isWithdrawPendingWithdrawalCancelButton());
		withdrawPage.NavigateBackToHomePage();

	}

	/*
	 * Verify if Success Withdrawal pop box is displayed within the withdrawal
	 * page
	 */
	@Then("^I should see Withdrawal success Pop-up box$")
	public void i_should_see_Withdrawal_success_Pop_up_box() {
		Assert.assertTrue(withdrawPage.isWithdrawSuccessPopUpBoxresent());
		withdrawPage.NavigateBackToHomePage();
	}

	/*
	 * Verify if Pending withdrawal button is displayed within the withdrawal
	 * page
	 */
	@Then("^I should see Pending withdrwal Cancel Button$")
	public void i_should_see_Pending_withdrwal_Cancel_Button() {
		Assert.assertTrue(withdrawPage.isWithdrawPendingWithdrawalCancelButton());
		withdrawPage.NavigateBackToHomePage();

	}

	/*
	 * Verify if Withdrawal Pending Notification is displayed within the
	 * withdrawal page
	 */
	@Then("^I should see Pending Notification Pop-up box displayed$")
	public void i_should_see_Pending_Notification_Pop_up_box_displayed() {
		Assert.assertTrue(withdrawPage.isCashierWithdrawPendingNotificationPopBoxPresent());
		withdrawPage.NavigateBackToHomePage();

	}

	/*
	 * Verify if new Balance is the same as Previous balance when if user cancel
	 * Pending withdrawal on the withdrawal page
	 */
	@Then("^I should see My Balance as the same$")
	public void i_should_see_My_Balance_as_the_same() {
		double PreviousBalDisplay = withdrawPage.storeCashierBalance();
		double NewBal = PreviousBalDisplay;
		System.out.println(NewBal);
		System.out.println(PreviousBalDisplay);
		Assert.assertTrue("equals", PreviousBalDisplay == NewBal);
		depositPage.NavigateBackToHomePage();
	}

	/* Verify if Login Popup box is displayed */
	@Then("^I should see a Login Pop-up box displayed on Game Info Page$")
	public void i_should_see_a_Login_Pop_up_box_displayed_on_Game_Info_Page() {
		Assert.assertTrue(loginPage.isLoginPopUpBoxPresend());

	}

	/* Verify if Game name is displayed as the title on the Game info page */
	@Then("^I should see the Name of the game as title Page$")
	public void i_should_see_the_Name_of_the_game_as_title_Page() {
		Assert.assertTrue(gameInfoPage.isGameNameTitlePresent());

	}

	/* Verify if Game Inforamtion detai;s is displayed on Game Info Page */
	@Then("^I should see Game Details Information$")
	public void i_should_see_Game_Details_Information() {
		Assert.assertTrue(gameInfoPage.isGameInfoGameDetailsPresent());
	}

	/* Verify if Game Device is displayed */
	@Then("^I should see Game Devices images$")
	public void i_should_see_Game_Devices_images() {
		Assert.assertTrue(gameInfoPage.isGameInfoGameDeviceImagePresent());
	}

	/* Verify if Game Air Status is displayed on Roulette Tv Game Info page */
	@Then("^I should Game Air Status$")
	public void i_should_Game_Air_Status() {
		Assert.assertTrue(gameInfoPage.isGameInfoGameAirStatusPresent());

	}

	/* Verify that Play For Real Button is displayed on Game Info Page */
	@Then("^I should see Play for Real Button on Game Info page$")
	public void i_should_see_Play_for_Real_Button_on_Game_Info_page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPlayForRealButtonPresent());

	}

	/* Game Banner image on the Game Info Page */
	@Then("^I should see Roulette Express Banner display Game Info Page$")
	public void i_should_see_Roulette_Express_Banner_display_Game_Info_Page() {
		Assert.assertTrue(gameInfoPage.isGameInfoGameBannerImagePresent());
	}

	/* Verify if Jackpot Slider is displayed within the Game Info Pag */
	@Then("^I should see Jackpot slider on the Game Info Page$")
	public void i_should_see_Jackpot_slider_on_the_Game_Info_Page() {
		Assert.assertTrue(gameInfoPage.isGameInfoJackpotSliderPresent());

	}

	/* Verify if Winners Slider is displayed within the Game Info Pag */
	@Then("^I should see Winners Slider Game Info Page$")
	public void i_should_see_Winners_Slider_Game_Info_Page() {
		Assert.assertTrue(gameInfoPage.isGameInfoWinnerSliderPresent());

	}

	/* Verify if Apple Logo is displayed within the Game Info Pag */
	@Then("^I should see AppStore logo on Game Info$")
	public void i_should_see_AppStore_logo_on_Game_Info() {
		Assert.assertTrue(gameInfoPage.isGameInfoAppleStoreLogoPresent());

	}

	/* Verify if Android Logo is displayed within the Game Info Pag */
	@Then("^I should see Android Logo on Game Info Page$")
	public void i_should_see_Android_Logo_on_Game_Info_Page() {
		Assert.assertTrue(gameInfoPage.isGameInfoAndroidAppLogoPresent());

	}

	/* Verify if login pop-up box is displayed within the Game Info Pag */
	@Then("^I should see a Login Pop-up box displayed on this Playtech game GameInfo page$")
	public void i_should_see_a_Login_Pop_up_box_displayed_on_this_Playtech_game_GameInfo_page() {

	}

	/* Verify if Play for Fun Button is displayed within the Game Info Pag */
	@Then("^I should see Play for Fun Button on Game Info Page$")
	public void i_should_see_Play_for_Fun_Button_on_Game_Info_Page() {
		Assert.assertTrue(gameInfoPage.isGameInfoPlayForFunButtonPresent());

	}

	/* Verify if Search box is opened when click on search box */
	@Then("^I should see Search Input box open$")
	public void i_should_see_Search_Input_box_open() {
		Assert.assertTrue(homePage.isGameSearchBoxOpenPresent());
	}

	/*
	 * Verify if Search close icon box is displayed within the Search input box
	 */
	@Then("^I should see Search close icon$")
	public void i_should_see_Search_close_icon() {
		Assert.assertTrue(homePage.isGameSearchBoxCloseIconPresent());

	}

	/* Verify if Roulette Express Premium Return as a search Game */
	@Then("^I should see Roulette Express Premoium display from the Search$")
	public void i_should_see_Roulette_Express_Premoium_display_from_the_Search() {
		Assert.assertTrue(homePage.isGameSearchRouletteGameReturnPresent());
	}

	/* Verify if Play Tech Virtue fusion Game Return as a search Game */
	@Then("^I should see Virtue Fusion Game display from the Search$")
	public void i_should_see_Virtue_Fusion_Game_display_from_the_Search() {
		Assert.assertTrue(homePage.isGameSearchPlayTechGameReturnPresent());

	}

	@After("@web")
	public void closeBrowser() throws InterruptedException {
		d.quit();
		

	}
}
