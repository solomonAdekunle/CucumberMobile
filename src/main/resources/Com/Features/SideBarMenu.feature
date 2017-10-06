Feature: User should be able to navigate to Register, Login, Getting started Pages, Help and Tv Presenter, 
	Responsible Gambling Page, withdraw , ChangePassword , Deposit page, Transaction page and Game History
            page, and Log-out.

#@ignore           
 @SideBarMenu
Scenario: SideBar Menu for UnAuthenticated User 
	Given I Navigate to the homepage on "browser" 
	When  I click on Sidebar Menu 
	Then  I should see Join Now Button in SidebarMenu 
	And  I should see Login Button in the SidebarMenu 
	And  I should see Home link whtin the SidebarMenu 
	And  I should see Getting Started dropdown Menu 
	And  I should see an Help link within the SidebarMenu 
	And  I should Tv Presenterlink within the SidebarMenu 
	And I should see Responsible Gambling link within the SidebarMenu 
	And I Should see a Live Chat link within the SidebarMenu
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if Clicking on The Join Now Button within the SideBarMenu can Navigate to Registraition page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Join Now Button 
	Then I should Navigate to Registration Page 
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on SideBar Menu Login Button will displayed Login Pop-up box 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Sidebar Menu Login Button 
	Then I should see Login Pop-up box displayed 
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on Home link within SideBar Menu 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Home Link within SideBar Menu 
	Then I should Navigate Back to Home Page 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the Getting Started dropdown will display a submenu 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	Then I should see How To Get Started link within the GettingStarted dropdown SubMenu 
	And I should see How To deposit link within the GettingStarted Dropdown SubMenu 
	And I should see How To withdraw within the GettingStarted Dropdown SubMenu 
	And I should see How To Withdraw link within the GettingStarted Dropdown SubMenu 
	And I should see Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	And I should see Security link within the GettingStarted Dropdown SubMenu 
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To GetStarted link within the dropdown will Navigate to Getting Started Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Get Started within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Getting Started page 
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To Deposit link within the dropdown will Navigate to How To Deposit Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Deposit link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Deposit 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To Withdraw link within the dropdown will Navigate to How To withdraw Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Withdraw link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Withdraw page 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on Is My Deposit Safe link within the dropdown will Navigate to Is My Deposit Safe Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Is My Depost Safe page 

#@ignore 
@SideBarMenu 
Scenario: Verifying if Help link will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Help link within the SideBar Menu 
	Then I should Navigate to Contact Us Page 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if TV Presenter link will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on TV Presenter link within the SideBar Menu 
	Then I should Navigate to Presenters Page 
	
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if Responsible Gambling link will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Responsible Gambling link within the SideBar Menu 
	Then I should Navigate to Responsible Gambling Page 
#	
#@ignore 	
@SideBarMenu 
Scenario: Verifying if Live Chat link will Open a new Tab window
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Live Chat link within the SideBar Menu 
	Then I should Navigate to Live Chat Page
	
#@ignore 
@SideBarMenu 
Scenario: SideBar Menu for Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	Then I should see Home link whtin the SidebarMenu 
	And I should see My Account Dropdown Menu 
	And I should see Getting Started dropdown Menu 
	And I should see an Help link within the SidebarMenu 
	And I should Tv Presenterlink within the SidebarMenu 
	And I should see Responsible Gambling link within the SidebarMenu 
	And I Should see a Live Chat link within the SidebarMenu
	And I should see a LogOut link 
	
#@ignore 
@SideBarMenu 
Scenario: SideBar Menu for Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Home Link within SideBar Menu 
	Then I should Depsit button on Home Page
	
#@ignore 
@SideBarMenu 
Scenario: Clicking My Account Dropdown arrow for Authenticated user 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	Then I should see Deposit link within My Account DropDown SubMenu 
	And I should see Transaction link within My Account DropDown SubMenu 
	And I should see Withdraw link within My Account DropDown SubMenu 
	And I should see Change Password link within My Account DropDown SubMenu 
	
#@ignore 
@SideBarMenu 
Scenario: Clicking on Deposit link with My Account Menu on the Sidebar Menu 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Deposit link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Deposit Page 
#@ignore 
@SideBarMenu 
Scenario: Clicking on Transaction link with My Account Menu on the Sidebar Menu 
	Given I have loggedin on the BasePage 	
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Transaction link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Transaction Page 
	
#@ignore 
@SideBarMenu 
Scenario: Clicking on Withdraw link with My Account Menu on the Sidebar Menu 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Withdraw link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Withdraw Page 
	
#@ignore 
@SideBarMenu 
Scenario: Clicking on Change Password link with My Account Menu on the Sidebar Menu 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Change Password link within My Account DropDown SubMenu 
	Then I should Navigate to  Change Password Page 
	
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the Getting Started dropdown will display a submenu For Authenticated User
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	Then I should see How To Get Started link within the GettingStarted dropdown SubMenu 
	And I should see How To deposit link within the GettingStarted Dropdown SubMenu 
	And I should see How To Withdraw link within the GettingStarted Dropdown SubMenu 
	And I should see Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	And I should see Security link within the GettingStarted Dropdown SubMenu 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To GetStarted link within the dropdown will Navigate to Getting Started Page For Authenticated User
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Get Started within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Getting Started page 
#@ignore 
@SideBarMenu 
Scenario: 
	Verifying if clicking on the How To Deposit link within the dropdown will Navigate to How To Deposit Page For Authenticated User
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Deposit link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Deposit 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To Withdraw link within the dropdown will Navigate to How To withdraw Page For Authenticated User
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Withdraw link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Withdraw page 
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on Is My Deposit Safe link within the dropdown will Navigate to Is My Deposit Safe Page For Authenticated User
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Is My Depost Safe page 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if Help link will Navigate to Contact Us Page For Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Help link within the SideBar Menu 
	Then I should Navigate to Contact Us Page 
#@ignore 
@SideBarMenu 
Scenario: Verifying if TV Presenter link will Navigate to Contact Us Page For Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on TV Presenter link within the SideBar Menu 
	Then I should Navigate to Presenters Page 
	
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if Responsible Gambling link will Navigate to Contact Us Page For Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Responsible Gambling link within the SideBar Menu 
	Then I should Navigate to Responsible Gambling Page 
#@ignore 	
@SideBarMenu 
Scenario: Verifying if Live Chat link will Open a new Tab window
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Live Chat link within the SideBar Menu 
	Then I should Navigate to Live Chat Page
	
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if Logout link will log user out
	Given I have loggedin on the BasePage 
	When I click on Sidebar Menu 
	And I click on Logout link within the SideBar Menu 
	Then I should be logged out 
	
#@ignore 
@SideBarMenu 
Scenario: SideBar Menu  on Vegas Vertical for UnAuthenticated User 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When  I click on Sidebar Menu 
	Then  I should see Join Now Button in SidebarMenu 
	And  I should see Login Button in the SidebarMenu 
	And  I should see Home link whtin the SidebarMenu 
	And  I should see Getting Started dropdown Menu 
	And  I should see an Help link within the SidebarMenu 
	And  I should Tv Presenterlink within the SidebarMenu 
	And I should see Responsible Gambling link within the SidebarMenu 
	And I Should see a Live Chat link within the SidebarMenu
	
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if Clicking on The Join Now Button within the Vegas SideBarMenu can Navigate to Registraition page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Join Now Button 
	Then I should Navigate to Registration Page 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on Vegas SideBar Menu Login Button will displayed Login Pop-up box 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Sidebar Menu Login Button 
	Then I should see Login Pop-up box displayed 
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on Home link within  Vegas SideBar Menu 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Home Link within SideBar Menu 
	Then I should Navigate Back to Home Page 

#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the Getting Started dropdown on Vegas Sidebar Menu  will display a submenu 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	Then I should see How To Get Started link within the GettingStarted dropdown SubMenu 
	And I should see How To deposit link within the GettingStarted Dropdown SubMenu 
	And I should see How To withdraw within the GettingStarted Dropdown SubMenu 
	And I should see How To Withdraw link within the GettingStarted Dropdown SubMenu 
	And I should see Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	And I should see Security link within the GettingStarted Dropdown SubMenu 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To GetStarted link within the dropdown on Vegas will Navigate to Getting Started Page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Get Started within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Getting Started page 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To Deposit link within the dropdown Menu on Vegas will Navigate to How To Deposit Page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Deposit link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Deposit 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on the How To Withdraw link within the dropdown will Navigate to How To withdraw Page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Withdraw link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Withdraw page 

#@ignore 
@SideBarMenu 
Scenario: Verifying if clicking on Is My Deposit Safe link within the dropdown will Navigate to Is My Deposit Safe Page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Is My Depost Safe page 
	
#@ignore 
@SideBarMenu 
Scenario: Verifying if Help link will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Help link within the SideBar Menu 
	Then I should Navigate to Contact Us Page 
#@ignore 
@SideBarMenu 
Scenario: Verifying if TV Presenter link will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on TV Presenter link within the SideBar Menu 
	Then I should Navigate to Presenters Page 
	
#@ignore 	
@SideBarMenu 	
Scenario: Verifying if Live Chat will Navigate to Live Chat Page
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Live Chat link within the SideBar Menu 
	Then I should Navigate to Live Chat Page

#@ignore 
@SideBarMenu 	
Scenario: Verifying if Responsible Gambling link will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Responsible Gambling link within the SideBar Menu 
	Then I should Navigate to Responsible Gambling Page 
	
#@ignore 
@SideBarMenu 	
Scenario: SideBar Menu on Vegas Vertical for Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Vegas Vertical Tab 
	And I click on Sidebar Menu 
	Then I should see Home link whtin the SidebarMenu 
	And I should see My Account Dropdown Menu 
	And I should see Getting Started dropdown Menu 
	And I should see an Help link within the SidebarMenu 
	And I should Tv Presenterlink within the SidebarMenu 
	And I should see Responsible Gambling link within the SidebarMenu 
	And I Should see a Live Chat link within the SidebarMenu
	And I should see a LogOut link 
#
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Home line within Sidebar Menu on Vegas Vertical for Authenticated User 
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When  I click on Sidebar Menu 
	And I click on Home Link within SideBar Menu 
	Then I should Depsit button on Home Page
	
#@ignore 
@SideBarMenu 	
Scenario: Clicking My Account Dropdown arrow for Authenticated user within Sidebar Menu On Vegas vertical 
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	Then I should see Deposit link within My Account DropDown SubMenu 
	And I should see Transaction link within My Account DropDown SubMenu 
	And I should see Withdraw link within My Account DropDown SubMenu 
	And I should see Change Password link within My Account DropDown SubMenu 
	
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Deposit link with My Account Menu on the Sidebar Menu on Vegas Vertical 
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Deposit link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Deposit Page 

#@ignore 
@SideBarMenu 	
Scenario: Clicking on Transaction link with My Account Menu on the Sidebar Menu on Vegas Vertical 
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Transaction link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Transaction Page 
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Withdraw link with My Account Menu on the Sidebar Menu on Vegas Vertical 
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Withdraw link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Withdraw Page 
	
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Change Password link with My Account Menu on the Sidebar Menu on Vegas Vertical 
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Change Password link within My Account DropDown SubMenu 
	Then I should Navigate to  Change Password Page 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the Getting Started dropdown will display a submenu For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	Then I should see How To Get Started link within the GettingStarted dropdown SubMenu 
	And I should see How To deposit link within the GettingStarted Dropdown SubMenu 
	And I should see How To withdraw within the GettingStarted Dropdown SubMenu 
	And I should see How To Withdraw link within the GettingStarted Dropdown SubMenu 
	And I should see Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	And I should see Security link within the GettingStarted Dropdown SubMenu 

#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To GetStarted link within the dropdown will Navigate to Getting Started Page For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Get Started within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Getting Started page 

#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To Deposit link within the dropdown will Navigate to How To Deposit Page For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Deposit link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Deposit 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To Withdraw link within the dropdown will Navigate to How To withdraw Page For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Withdraw link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Withdraw page 
#	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on Is My Deposit Safe link within the dropdown will Navigate to Is My Deposit Safe Page For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Is My Depost Safe page 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Help link will Navigate to Contact Us Page For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Help link within the SideBar Menu 
	Then I should Navigate to Contact Us Page 

#@ignore 
@SideBarMenu 	
Scenario: Verifying if TV Presenter link will Navigate to Contact Us Page For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on TV Presenter link within the SideBar Menu 
	Then I should Navigate to Presenters Page 
	
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Responsible Gambling link will Navigate to Contact Us Page For Authenticated User on Vegas Vertical
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Responsible Gambling link within the SideBar Menu 
	Then I should Navigate to Responsible Gambling Page 
	
#@ignore 
@SideBarMenu 
	Scenario: 
	Verifying if Live Chat will Navigate to Live Chat Page
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Live Chat link within the SideBar Menu 
	Then I should Navigate to Live Chat Page 
#	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Logout link will log user out on Vegas Vertical Sidebar Menu
	Given I have loggedin on the BasePage 
	When  I click on Vegas Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Logout link within the SideBar Menu 
	Then I should be logged out 
	
#@ignore 
@SideBarMenu 	
Scenario: SideBar Menu  on Live Vertical for UnAuthenticated User 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When  I click on Sidebar Menu 
	Then  I should see Join Now Button in SidebarMenu 
	And  I should see Login Button in the SidebarMenu 
	And  I should see Home link whtin the SidebarMenu 
	And  I should see Getting Started dropdown Menu 
	And  I should see an Help link within the SidebarMenu 
	And  I should Tv Presenterlink within the SidebarMenu 
	And I Should see a Live Chat link within the SidebarMenu
	And I should see Responsible Gambling link within the SidebarMenu 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Clicking on The Join Now Button within the Live Vertical SideBarMenu can Navigate to Registraition page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Join Now Button 
	Then I should Navigate to Registration Page 
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on Live SideBar Menu Login Button will displayed Login Pop-up box 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Sidebar Menu Login Button 
	Then I should see Login Pop-up box displayed 

#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on Home link within Live SideBar Menu 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Home Link within SideBar Menu 
	Then I should Navigate Back to Home Page 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the Getting Started dropdown on Live Sidebar Menu  will display a submenu 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	Then I should see How To Get Started link within the GettingStarted dropdown SubMenu 
	And I should see How To deposit link within the GettingStarted Dropdown SubMenu 
	And I should see How To withdraw within the GettingStarted Dropdown SubMenu 
	And I should see How To Withdraw link within the GettingStarted Dropdown SubMenu 
	And I should see Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	And I should see Security link within the GettingStarted Dropdown SubMenu 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To GetStarted link within the dropdown on Live will Navigate to Getting Started Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Get Started within the GettingStarted Dropdown SubMenu 
#	Then I should Navigate to Getting Started page 
@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To Deposit link within the dropdown Menu on Live will Navigate to How To Deposit Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Deposit link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Deposit 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To Withdraw link within the Live Vertical Sidebar Menu dropdown will Navigate to How To withdraw Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Withdraw link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Withdraw page 
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on Is My Deposit Safe link within Live Vertical Sidebar Menu the dropdown will Navigate to Is My Deposit Safe Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Is My Depost Safe page 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Help link within the Live Vertical Sidebar Menu will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Help link within the SideBar Menu 
	Then I should Navigate to Contact Us Page 
#@ignore 
@SideBarMenu 	
Scenario:
Verifying if TV Presenter link within the Live Vertical Sidebar Menu will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on TV Presenter link within the SideBar Menu 
	Then I should Navigate to Presenters Page 
#@ignore 	
@SideBarMenu 	
Scenario: Verifying if Live Chat will Navigate to Live Chat Page
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Live Chat link within the SideBar Menu 
	Then I should Navigate to Live Chat Page
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Responsible Gambling link within the Live Sidebar Menu will Navigate to Contact Us Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Live Vertical Tab 
	When  I click on Sidebar Menu 
	And  I click on Responsible Gambling link within the SideBar Menu 
	Then I should Navigate to Responsible Gambling Page 
	
	
	
#@ignore 
@SideBarMenu 	
Scenario: SideBar Menu on Live Vertical for Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	And I click on Sidebar Menu 
	Then I should see Home link whtin the SidebarMenu 
	And I should see My Account Dropdown Menu 
	And I should see Getting Started dropdown Menu 
	And I should see an Help link within the SidebarMenu 
	And I should Tv Presenterlink within the SidebarMenu 
	And I should see Responsible Gambling link within the SidebarMenu 
	And I should see a LogOut link 
	
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Home line within Sidebar Menu on Live Vertical for Authenticated User 
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When  I click on Sidebar Menu 
	And I click on Home Link within SideBar Menu 
	Then I should Depsit button on Home Page
#	
#@ignore 
@SideBarMenu 	
Scenario: Clicking My Account Dropdown arrow for Authenticated user within Sidebar Menu On Live vertical 
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	Then I should see Deposit link within My Account DropDown SubMenu 
	And I should see Transaction link within My Account DropDown SubMenu 
	And I should see Withdraw link within My Account DropDown SubMenu 
	And I should see Change Password link within My Account DropDown SubMenu 
	
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Deposit link with My Account Menu on the Sidebar Menu on Live Vertical 
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Deposit link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Deposit Page 
	
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Transaction link with My Account Menu on the Sidebar Menu on Live Vertical 
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Transaction link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Transaction Page 
	
#@ignore 
@SideBarMenu 	
Scenario: Clicking on Withdraw link with My Account Menu on the Sidebar Menu on Live Vertical 
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Withdraw link within My Account DropDown SubMenu 
	Then I should Navigate to SafeCharge Cashier Withdraw Page 
#	
@ignore 
@SideBarMenu 	
Scenario: Clicking on Change Password link with My Account Menu on the Sidebar Menu on Live Vertical 
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on My Account dropdown arrow 
	And I click on Change Password link within My Account DropDown SubMenu 
	Then I should Navigate to  Change Password Page 
#	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the Getting Started dropdown will display a submenu For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	Then I should see How To Get Started link within the GettingStarted dropdown SubMenu 
	And I should see How To deposit link within the GettingStarted Dropdown SubMenu 
	And I should see How To withdraw within the GettingStarted Dropdown SubMenu 
	And I should see How To Withdraw link within the GettingStarted Dropdown SubMenu 
	And I should see Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	And I should see Security link within the GettingStarted Dropdown SubMenu 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To GetStarted link within the dropdown will Navigate to Getting Started Page For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Get Started within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Getting Started page 
#
#@ignore 
@SideBarMenu 	
Scenario: Verifying if clicking on the How To Deposit link within the dropdown will Navigate to How To Deposit Page For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Deposit link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Deposit 
	
#@ignore 
@SideBarMenu 	
Scenario: 
	Verifying if clicking on the How To Withdraw link within the dropdown will Navigate to How To withdraw Page For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on How To Withdraw link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to How To Withdraw page 
#
#@ignore 
@SideBarMenu 	
Scenario: 
	Verifying if clicking on Is My Deposit Safe link within the dropdown will Navigate to Is My Deposit Safe Page For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Gettstarted dropdown SubMenu arrow 
	And I click on Is My Deposit Safe link within the GettingStarted Dropdown SubMenu 
	Then I should Navigate to Is My Depost Safe page 
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Help link will Navigate to Contact Us Page For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Help link within the SideBar Menu 
	Then I should Navigate to Contact Us Page 

#@ignore 
#@SideBarMenu 	
Scenario: Verifying if TV Presenter link will Navigate to Contact Us Page For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on TV Presenter link within the SideBar Menu 
	Then I should Navigate to Presenters Page 
	
	
#@ignore 
@SideBarMenu 	
Scenario: Verifying if Responsible Gambling link will Navigate to Contact Us Page For Authenticated User on Live Vertical
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Responsible Gambling link within the SideBar Menu 
	Then I should Navigate to Responsible Gambling Page 
	

#@ignore 
@SideBarMenu 
	Scenario: Verifying if Live Chat will Navigate to Live Chat Page
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Live Chat link within the SideBar Menu 
	Then I should Navigate to Live Chat Page
	

#@ignore
@web 
@SideBarMenu 
Scenario: Verifying if Logout link will log user out on Live Vertical Sidebar Menu
	Given I have loggedin on the BasePage 
	When I click on Live Vertical Tab 
	When I click on Sidebar Menu 
	And I click on Logout link within the SideBar Menu 
	Then I should be logged out 

 