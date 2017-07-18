Feature: User Should be able to withdraw Money from their account after winning


#@ignore
@Withdraw
Scenario: Navgating to withdraw page as a new User withour Card registered 
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge12" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu 
Then  I shoule see No Withdrawal Mentod Pop-up box displayed

 @ignore
@Withdraw
 Scenario: Click on Withdraw link within the Cashier Menu
Given I Navigate to the homepage on "browser"
When  I have logged in username as "Superch1" and password "Bola123$%^"
 And  I click a Depositbutton
 And I click on  Cashier Menu Icon within the Cashier
 And I click on Withdraw link within the Cashier Menu
 Then I should navigate to Withdrawl page. 

#@ignore
@Withdrawal 
Scenario: Navgating to withdraw page as a new User with Card registered 
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge1" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu 
 Then I should navigate to Withdrawl page. 
  And I should see myRegister card logo displayed
  And I should see account creditcard ownername in the cashier Withdraw Page
  And I should see lastfour card numbers as "6897"
  And I should see card expiry date in the cashier withdraw page
  And I should see Amount To Withdraw input box display
  And I should see a disabled withdraw button displayed
  
  
#@ignore 
@Withdrawal 
Scenario: Verify if Withdrawal button is disable when amount to withdraw that is less than Rquired
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge2" and password "Bola123"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And  I enter withdraw amount as "1" 
Then  I should see a disabled withdraw button displayed

#@ignore 
@Withdrawal 
Scenario: Verify if  withdraw button will be enabled when amount to withdraw is equal or greater than minimum reguire
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge7" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And  I enter withdraw amount as "10" 
Then  I should see an enabled withdraw button displayed
  
  
  	
#@ignore 
@Withdrawal 
Scenario: Verify if user can withdraw successfully
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge2" and password "Bola123"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And  I enter withdraw amount as "10" 
 And  I click Withdrawal Button 
Then I should see Withdrawal success Pop-up box 


#@ignore 
@Withdrawal 
Scenario: Verifying if Pending Withdraw button is displayed
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge1" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And  I enter withdraw amount as "10" 
 And  I click Withdrawal Button 
 And  I click success pop-up box Ok Button 
Then  I should see no pop-up box displayed 
 And  I should see a withdrawl Pending displayed 
 
 
 
#@ignore 
@Withdrawal 
Scenario: Verifying if Pending Withdraw button is displayed if user click No Button within the Cancelling
        Confirmation Pop-u box
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge1" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And I click on Pending withdrwal Cancel Button 
 And I click on No Button on Pending Confirmation box 
Then I should see a withdrawl Pending displayed  


#@ignore 
@Withdrawal 
Scenario: Verifying If user click Yes buttton on Cancelling box Confirmation Pop-up box for Pending withdrawal
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge1" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And I click on Pending withdrwal Cancel Button 
 And I click on Yes Button on Pending Confirmation box 
 And I click on OK button on Confirmation success Pending Cancellation Pop up Box 
Then  I should see a disabled withdraw button displayed

#@ignore 
@Withdrawal 
Scenario: Verifying if Pending Withdrawal Notification Pop box is displayed
        Confirmation Pop-up box
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge1" and password "Bola123$%^"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And  I enter withdraw amount as "10" 
 And  I click Withdrawal Button 
 And  I click success pop-up box Ok Button 
 And I click on  Cashier Menu Icon within the Cashier
 And I click on Deposit link within the Cashier Menu
 Then I should see Pending Notification Pop-up box displayed 
 
#@ignore
@Withdrawal 
Scenario: Verify if user can withdraw Declined Pox box will be displayed
Given I Navigate to the homepage on "browser"
When  I have logged in username as "solomon2014" and password "London01"
 And  I click on Sidebar Menu 
 And  I click on My Account dropdown arrow 
 And  I click on Withdraw link within My Account DropDown SubMenu
 And I check My account Balance on withdraw Page
 And  I enter withdraw amount as "10" 
 And  I click Withdrawal Button 
 And I click Transaction Failed Ok Button 
 Then I should see My Balance as the same
