Feature: Deposit
    User should be able to deposit after login 
    by clicking the Deposit button/
    

  
 
#@ignore
 @Deposit
 Scenario Outline:Deposit
Given I Navigate to the homepage on "browser"
 When I have logged in username as "safecharge7" and password "Bola123$%^"
  And I get the Current Cash Balance
  And  I click a Depositbutton
 Then I should see  UsernameInfo as "SAFECHARGE7" 
 Then I should see new cashier
  And I should see Balance value in the cashier Deposit Page
  And I should see  My Payments Methods text in the cashier Deposit Page
  # And I should see  Payment Details text in the cashier Deposit Page
   And I should see payment logo in the cashier Deposit Page
   And I should see other Payment Methods logo in the cashier Deposit Page
   And I should see account creditcard ownername in the cashier Deposit Page
   And I should see lastfour card numbers as "6897"
   And I should see card expiry date in the cashier 
   And I should see CVV input field in the cashier Deposit Page
   And I should see Promocode input text in the cashier Desposit Page
   And I should see Bill Address check box in the cashier Deposit Page
   And I should Amount To deposit in the cashier Deposit Page
   And I should see other amount input field in the cashier Deposit Page
   And I should see Deposit deposit button in the cashier Deposit Page

 Examples:  
 	|browser	| 
 	| Chrome	|
 
 @ignore
 @DepositAppoved
 Scenario: Checking if Success Cashier deposit pop-up will be displayed
Given I Navigate to the homepage on "browser"
When I have logged in username as "Safecharge7" and password "Bola123$%^"
 And  I click a Depositbutton
 And I check My account Balance
 And I enter CVV as "275"
 And I enter Amount To Deposit as "200.12"
 And  I click a SafeChargeDepositbutton
Then I should see Deposit Success Cashier Pop-up box displayed
 And I should see Your transaction was approved Text displayed
 And I should see CloseButton within the Success Cashier Pop-up box displayed
 
#@ignore
 @DepositAppoved
 Scenario: Closing the Success Cashier Pop-up box
Given I Navigate to the homepage on "browser"
When I have logged in username as "Superch1" and password "Bola123$%^"
 And  I click a Depositbutton
 And I check My account Balance
 And I enter CVV as "275"
 And I enter Amount To Deposit as "200.12"
 And  I click a SafeChargeDepositbutton
 And I click on CloseButton within the Success Cashier Pop-up box
 Then I should see no Deposit Success Cashier Pop-up box displayed.
 And I should see my new Account Balance increase by "200.12"
  
  
  
@ignore
  @RegisterNewCard
Scenario: Verifying if expiration date will displayed error message when not  date month selected.
Given I Navigate to the homepage on "browser"
When I have logged in username as "safecharge13" and password "Bola123"
 And  I click a Depositbutton
 And I click on Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as ""
 And I enter Expiry card year as "2020"
 And  I click a SafeChargeDepositbutton
 Then I should see In Valid Expeiratin ErrorMessage displayed
 
@ignore
 @RegisterNewCard
 Scenario: Verifying if expiration date  will displayed error message when not  date year selected.
Given I Navigate to the homepage on "browser"
When I have logged in username as "safecharge7" and password "Bola123$%^"
 And  I click a Depositbutton
 And I click on Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as ""
 And  I click a SafeChargeDepositbutton
 Then I should see In Valid Expeiratin ErrorMessage displayed
 
@ignore
  @RegisterNewCard
Scenario: Checking if CVV error message will be displayed when cvv text box is ommited or incompeleted
Given I Navigate to the homepage on "browser"
 When I have logged in username as "safecharge7" and password "Bola123$%^"
 And  I click a Depositbutton
 And I click on Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as "2020"
 And I enter CVV as "1"
 And  I click a SafeChargeDepositbutton
 Then I should see The field must be exactly Three digits ErrorMessage Text displayed
 
@ignore
@RegisterNewCard
 Scenario: Checking if Enter amount to deposit  will display error text if user enter amount less than 5
Given I Navigate to the homepage on "browser"
When I have logged in username as "safecharge13" and password "Bola123"
 And  I click a Depositbutton
 And I click on Payment Methods Card Logo
  And I enter CardVisa Number as "4539219590667240"
  And I entry Expiry card month as "06"
  And I enter Expiry card year as "2020"
  And I enter CVV as "123"
  And I enter Amount To Deposit as "2"
  And  I click a SafeChargeDepositbutton
  Then I should  Please Enter Valid ammount errorText displayed

 @ignore 
  @RegisterNewCard   
Scenario: Checking the Green thick Validation mark
Given I Navigate to the homepage on "browser"
When I have logged in username as "safecharge7" and password "Bola123$%^"
 And  I click a Depositbutton
 And I click on Payment Methods Card Logo
 And I enter CardVisa Number as "4539219590667240"
 And I entry Expiry card month as "06"
 And I enter Expiry card year as "2020"
 And I enter CVV as "123"
 And I enter Amount To Deposit as "200"
Then I should see Green tick mark next to CardOwnerNametext box
And  I should see Green tick mark next to CardNumberbox box
And  I should see a Green tick Mark next to EnterAmounttext box
 
 @ignore
  @RegisterNewCard   
Scenario: Existing User should be able to register a new card
Given I Navigate to the homepage on "browser"
When  I have logged in username as "safecharge11" and password "Bola123"
 And  I click a Depositbutton
 And  I click on Payment Methods Card Logo
 And  I enter CardVisa Number as "4265 0382 3262 6897"
 And  I entry Expiry card month as "06"
 And  I enter Expiry card year as "2020"
 And  I enter CVV as "572"
 And  I enter Amount To Deposit as "200.12"  
 And  I click a SafeChargeDepositbutton
Then  I should see Your transaction was approved Text displayed
 And  I should see CloseButton within the Success Cashier Pop-up box displayed
 

  
@ignore
  @DepositAppoved
 Scenario: Checking if  user can change his or her billing address
Given I Navigate to the homepage on "browser"
 When I have logged in username as "safecharge7" and password "Bola123$%^"
  And I click a Depositbutton
  And  I enter CVV as "275"
  And  I enter Amount To Deposit as "200.12"  
  And I click on Change Billing Address Check Box
  And I enter Post code as "Cr0 6jx"
  And I enter House address as "6 Goodhew Road"
  And I click on Change Billing Address Check Box
  And  I click a SafeChargeDepositbutton
  And I click on CloseButton within the Success Cashier Pop-up box
  And I click on close Icon of the Cashier
  And I click a Depositbutton
  And I click on Change Billing Address Check Box
Then  I should  see new Post code as "Cr0 6jx" displayed
  And I should see  House address as "6 Goodhew Road"
  
@ignore
 @DepositAppoved
 Scenario: Checking if Decline Recovery lightbox is displayed when user deposit unsucessful
Given I Navigate to the homepage on "browser"
When I have logged in username as "safecharge7" and password "Bola123$%^"
 And  I click a Depositbutton
 And I click on Payment Methods Card Logo
 And I enter CardVisa Number as "51010830 5421 5127"
  And I entry Expiry card month as "05"
  And I enter Expiry card year as "2019"
  And I enter CVV as "101"
  And I enter Amount To Deposit as "10"
  And I click a SafeChargeDepositbutton
  Then I should see Decline Pop-up box displayed
  And I should see Your Transaction decline text displayed
  And I should see Contact Support Number displayed 
  And I should see a close icon displayed
  


@ignore 
@Register 
Scenario: Registration with valid Data and clicking Deposit Button on Welcome 
	Given I navigate to the Registrationpage on "<browser>" 
	When I enter regUsername as "Safecharge014" 
	And I enter RegPassword as "Bola123$%^" 
	And I enter RegConfirmPassword as "Bola123$%^" 
	And I enter a RegScreenName as "weraq258asw0p12" 
	And I enter RegEmail as "test@playtech.com" 
	And I enter RegTitle as "Ms" 
	And I enter RegFirstName as "first" 
	And I enter RegSurName as "Namesdo" 
	And I enter RegDOBDay as "03" 
	And I enter RegDOBMonth as "Oct" 
	And I enter RegDOBYear as "1980" 
	And I click on RegClickHere 
	And I enter RegAddress as "80" 
	And I enter RegTown as "London" 
	And I enter RegCounty as "London" 
	And I enter RegPostCode as "SW8 3HE" 
	And I enter RegContactNum as "020700070010" 
	And I click on deposit limit click here link 
	And I enter Choose Type as "Daily" 
	And I enter Choose limit as "50,000" 
	And I click on RegT$CCheckBox 
	And I click on RegSubmitButton 
	And I click on deposit Button on Welcome page 
	Then I should see payment logo in the cashier pop-up 




#
#
#
##Credit Card Visa On production
#
##42650314 4370 6897, 2019/06, 275, Visa - Barclays Bank Plc, UK (Gold)
##42650300 3535 6897, 2019/10, 230, Visa - Barclays Bank Plc, UK (Gold)
##42650367 5555 6897, 2019/04, 170, Visa - Barclays Bank Plc, UK (Gold)
##42650376 5786 6897, 2019/10, 472, Visa - Barclays Bank Plc, UK (Gold)
##42650365 0285 6897, 2020/11, 818, Visa - Barclays Bank Plc, UK (Gold)
##42650365 3784 6897, 2020/10, 572, Visa - Barclays Bank Plc, UK (Gold)
##42650304 1014 6897, 2019/12, 647, Visa - Barclays Bank Plc, UK (Gold)
##42650338 3861 6897, 2019/03, 558, Visa - Barclays Bank Plc, UK (Gold)
##42650341 8071 6897, 2019/12, 696, Visa - Barclays Bank Plc, UK (Gold)
##42650345 0058 6897, 2020/07, 148, Visa - Barclays Bank Plc, UK (Gold)
#
##############################################################################
## New Visa Card for live
##4265 0362 4314 6897, 2020/08, 104, Visa - Barclays Bank Plc, UK (Gold)
##4265 0365 0475 6897, 2020/09, 278, Visa - Barclays Bank Plc, UK (Gold)
##4265 0318 7445 6897, 2020/03, 351, Visa - Barclays Bank Plc, UK (Gold)
##4265 0345 1882 6897, 2019/03, 336, Visa - Barclays Bank Plc, UK (Gold)
##4265 0370 8414 6897, 2020/11, 123, Visa - Barclays Bank Plc, UK (Gold)
##4265 0310 6536 6897, 2019/10, 374, Visa - Barclays Bank Plc, UK (Gold)
##4265 0382 3262 6897, 2019/09, 953, Visa - Barclays Bank Plc, UK (Gold)
##4265 0324 1135 6897, 2019/08, 925, Visa - Barclays Bank Plc, UK (Gold)
##4265 0383 2461 6897, 2020/08, 418, Visa - Barclays Bank Plc, UK (Gold)
#4265 0346 8365 6897, 2020/02, 336, Visa - Barclays Bank Plc, UK (Gold)
##4265 0326 7163 6897, 2020/04, 517, Visa - Barclays Bank Plc, UK (Gold)
##4265 0340 3701 6897, 2020/06, 839, Visa - Barclays Bank Plc, UK (Gold)
##4265 0346 2244 6897, 2019/02, 768, Visa - Barclays Bank Plc, UK (Gold)
##4265 0343 6735 6897, 2020/08, 375, Visa - Barclays Bank Plc, UK (Gold)
##4265 0363 6631 6897, 2020/02, 394, Visa - Barclays Bank Plc, UK (Gold)
##4265 0370 2110 6897, 2020/02, 630, Visa - Barclays Bank Plc, UK (Gold)
#4265 0361 2103 6897, 2020/01, 874, Visa - Barclays Bank Plc, UK (Gold)
#4265 0381 0384 6897, 2019/03, 772, Visa - Barclays Bank Plc, UK (Gold)
#4265 0363 4461 6897, 2019/08, 829, Visa - Barclays Bank Plc, UK (Gold)
#4265 0314 8637 6897, 2020/02, 720, Visa - Barclays Bank Plc, UK (Gold)
##4265 0358 1522 6897, 2019/08, 185, Visa - Barclays Bank Plc, UK (Gold)
##4265 0386 5156 6897, 2019/07, 259, Visa - Barclays Bank Plc, UK (Gold)
##4265 0358 1225 6897, 2019/01, 742, Visa - Barclays Bank Plc, UK (Gold)
##4265 0326 8880 6897, 2020/02, 290, Visa - Barclays Bank Plc, UK (Gold)
##4265 0371 5211 6897, 2020/11, 890, Visa - Barclays Bank Plc, UK (Gold)
##4265 0354 3753 6897, 2020/09, 644, Visa - Barclays Bank Plc, UK (Gold)
##4265 0378 0843 6897, 2019/10, 239, Visa - Barclays Bank Plc, UK (Gold)
##4265 0328 4515 6897, 2020/11, 129, Visa - Barclays Bank Plc, UK (Gold)
##4265 0332 3131 6897, 2019/09, 280, Visa - Barclays Bank Plc, UK (Gold)
##4265 0361 3614 6897, 2020/10, 591, Visa - Barclays Bank Plc, UK (Gold)

