package Suite.SupercasinoCucumber_MobilePom;

import java.io.IOException;

import org.junit.Assert;

import Pages.BasePage;
import Pages.HomePage;
import Pages.LiveVerticalPage;
import Pages.LoginErrorPage;
import Pages.LoginPage;
import Pages.RegisterPage;
import Pages.RouletteExpressPremium;
import Pages.SideBarPage;
import Pages.SlotsGamePage;
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

	public StepsDefination() throws IOException {

		super();
		basePage = new BasePage(TestBase.d);
		loginPage = new LoginPage(TestBase.d);
		LEPage = new LoginErrorPage(TestBase.d);
		RegPage = new RegisterPage(TestBase.d);
		sidebarPage = new SideBarPage(TestBase.d);
		welcomePage = new WelcomePage(TestBase.d);
		homePage=new HomePage(TestBase.d);
		RepPage=new  RouletteExpressPremium(TestBase.d);
		slotGamePage= new SlotsGamePage(TestBase.d);
		livePage = new LiveVerticalPage(TestBase.d);

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

	@Given("^I navigate to the homepage on \"([^\"]*)\"$")
	public void i_navigate_to_the_homepage_on(String browser) {
		// basePage.getBrowserType(browser);
		basePage.getSiteAddress(Config.getProperty("URL"));
		// basePage.getSiteAddress();

	}

	@Given("^I Navigate to the homepage on \"([^\"]*)\"$")
	public void i_Navigate_to_the_homepage_on(String browser) {
		basePage.getSiteAddress(Config.getProperty("URL"));
		// basePage.getSiteAddress(browser);

	}

	@Given("^I have loggedin on the BasePage$")
	public void i_have_loggedin_on_the_BasePage() throws InterruptedException  {
		basePage.doLogin(Config.getProperty("URL"), Config.getProperty("defaultUsername"), Config.getProperty("defaultPassword"));

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

	/* Enter User in the Useranem input box */
	@When("^I enter Username as \"([^\"]*)\"$")
	public void i_enter_Username_as(String username) {
		loginPage.sendUseraname(username);

	}

	/* Enter Password in Password input box */
	@When("^I enter Password as \"([^\"]*)\"$")
	public void i_enter_Password_as(String password) {
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

	/* Enter Username for Registeration */
	@When("^I enter regUsername as \"([^\"]*)\"$")
	public void i_enter_regUsername_as(String UserName) {
		RegPage.sendRegUserNmae(UserName);

	}

	/* Enter Password for Registration */
	@When("^I enter RegPassword as \"([^\"]*)\"$")
	public void i_enter_RegPassword_as(String password) {
		RegPage.sendRegPasswor(password);

	}

	/* Enter confirm Password for Registration */
	@When("^I enter RegConfirmPassword as \"([^\"]*)\"$")
	public void i_enter_RegConfirmPassword_as(String ConfPass) {
		RegPage.sendRegCofirmPassword(ConfPass);
	}

	/* Enter ScreenName for Registration */
	@When("^I enter a RegScreenName as \"([^\"]*)\"$")
	public void i_enter_a_RegScreenName_as(String screenName) {
		RegPage.sendRegScreename(screenName);

	}

	/* Enter E-mail address for Registration */
	@When("^I enter RegEmail as \"([^\"]*)\"$")
	public void i_enter_RegEmail_as(String email) {
		RegPage.sendRegEmail(email);

	}

	/* Enter Title for Registration */
	@When("^I enter RegTitle as \"([^\"]*)\"$")
	public void i_enter_RegTitle_as(String title) {
		RegPage.sendRegTitle(title);

	}

	/* Enter Your First Name for Registration */
	@When("^I enter RegFirstName as \"([^\"]*)\"$")
	public void i_enter_RegFirstName_as(String firstName) {
		RegPage.sendRegFirstName(firstName);

	}

	/* Enter Your Surname for Registration */
	@When("^I enter RegSurName as \"([^\"]*)\"$")
	public void i_enter_RegSurName_as(String surName) {
		RegPage.sendRegLastName(surName);
		;
	}

	/* Enter Date of Birth Day for Registration */
	@When("^I enter RegDOBDay as \"([^\"]*)\"$")
	public void i_enter_RegDOBDay_as(String Day) {
		RegPage.sendRegDOBDay(Day);

	}

	/* Enter Date of Birth Month for Registration */
	@When("^I enter RegDOBMonth as \"([^\"]*)\"$")
	public void i_enter_RegDOBMonth_as(String Month) {
		RegPage.sendRegDOBMonth(Month);
		;
	}

	/* Enter Date of Birth Year for Registration */
	@When("^I enter RegDOBYear as \"([^\"]*)\"$")
	public void i_enter_RegDOBYear_as(String Year) {
		RegPage.sendRegDOBYear(Year);

	}

	/* Click Enter Your Address Manually link */
	@When("^I click on RegClickHere$")
	public void i_click_on_RegClickHere() {
		RegPage.clickEnterAddressManuallyLink();

	}

	/* Enter your House address for Registration */
	@When("^I enter RegAddress as \"([^\"]*)\"$")
	public void i_enter_RegAddress_as(String Address) {
		RegPage.sendRegAddress(Address);

	}

	/* Enter Town or City Address for Registration */
	@When("^I enter RegTown as \"([^\"]*)\"$")
	public void i_enter_RegTown_as(String Town) {
		RegPage.sendRegCity(Town);

	}

	/* Enter your County for Registration */
	@When("^I enter RegCounty as \"([^\"]*)\"$")
	public void i_enter_RegCounty_as(String county) {
		RegPage.sendRegCounty(county);

	}

	/* Enter Your Post Code for Registration */
	@When("^I enter RegPostCode as \"([^\"]*)\"$")
	public void i_enter_RegPostCode_as(String Postcode) {
		RegPage.sendRegPostCode(Postcode);

	}

	/* Enter Contact Number for Registration */
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

	/* Select the Deposit limit Type on Registration */
	@When("^I enter Choose Type as \"([^\"]*)\"$")
	public void i_enter_Choose_Type_as(String TypeLimit) {
		RegPage.sendRegChooseType(TypeLimit);

	}

	/* Select the Deposit Limit Amount for Registration */
	@When("^I enter Choose limit as \"([^\"]*)\"$")
	public void i_enter_Choose_limit_as(String ChooseLimit) {
		RegPage.sendRegLimitType(ChooseLimit);
	}

	/* Enter Amount willing as a deposit limit on Registration page */
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
	public void i_click_on_Vegas_Vertical_Tab()  {
		basePage.clickVegasTab();
	   
	}
	/* Click on Live Vertical Tab */
	@When("^I click on Live Vertical Tab$")
	public void i_click_on_Live_Vertical_Tab() {
		basePage.clickLiveTab();
	    
	}
    /* Click on any Live Game on Live home  page */
	@When("^I click on a Live Game$")
	public void i_click_on_a_Live_Game() {
		livePage.clickLiveRouletteGame();
	   
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
		Assert.assertTrue(RepPage.isMenuIconwithinGameSessionPresent());
		// Navigate Back to the Home Page.
		RepPage.NavigateBackToHomePage();

	}

	/* Verify if Demo game is Launched by clicking Demo button */
	@Then("^I should see a Demo Game Launching$")
	public void i_should_see_a_Demo_Game_Launching() {
		Assert.assertTrue(RepPage.isMenuIconwithinGameSessionPresent());
		// Navigate Back to the Home Page.
		RepPage.NavigateBackToHomePage();
		

	}

	/* Verify if Slots Game can be launched by clicking Play button */
	@Then("^I should see a Slots game launching$")
	public void i_should_see_a_Slots_game_launching() {
		
		slotGamePage.NavigateBackToHomePage();
	}

	/* Verify if Table Game can be launched by clicking Play button */
	@Then("^I should see a Table Game launching$")
	public void i_should_see_a_Table_Game_launching() {
		slotGamePage.NavigateBackToHomePage();
		
	}
	
	@Then("^I should see a Vegas Slots Game launching$")
	public void i_should_see_a_Vegas_Slots_Game_launching(){
		Assert.assertTrue(slotGamePage.isVegasSlotGameSoundsBoxPresent());
		slotGamePage.NavigateBackToHomePage();
	    
	}

	    
	

	@After("@web")
	public void closeBrowser() throws InterruptedException {
		d.close();
//		 if(basePage.isLoggedIn()){
//		 basePage.logOut();
//		
//	}
	// Thread.sleep(2000);

	}
}
