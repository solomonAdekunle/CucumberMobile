Feature: User should see footer on all pages on the site
         and Footer should contain Term$Conditions, PrivacyPolicy, Responsible Gambling and VIP links
          it should also displayed Method of Payments icons, Facebook icon, twitter icon, Netplaytv icon , over18 icon
          and Gamecare Certified logo, Gamling Commisison icon and Netplay Tv lience texts.
          
 #@ignore
  @Footer	          
Scenario: Verifying Footer contents on Casino Home Page
Given I Navigate to the homepage on "browser" 
Then  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
 #@ignore
  @Footer	 
 Scenario: Verifying Footer contents is on Vegas Home Page
Given I Navigate to the homepage on "browser" 
When  I click on Vegas Vertical Tab
Then  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
  #@ignore
  @Footer	 
Scenario: Verifying Footer contents is on Live Home Page
Given I Navigate to the homepage on "browser" 
When I click on Live Vertical Tab
Then  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
#@ignore
 @Footer	 
 Scenario: Verifying Footer contents is on Promotion Home Page
Given I Navigate to the homepage on "browser" 
When I click on Promos Vertical Tab
Then  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
  #@ignore
  @Footer	 
 Scenario: Verifying if Casino Terms And Condition link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on Casino TermsAndCondition link within the footer
Then I should Naviagte to Casino TermsAndCondition page
 And  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
  #@ignore
  @Footer	 
 Scenario: Verifying if Casino Privacy Policy link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on Casino Privacy Policy link within the footer
Then I should Naviagte to Casino PrivacyPolicy page
Then  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
 #@ignore
  @Footer	 
Scenario: Verifying if Casino Responsible Gambling link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on Casino Resonsible Gambling link within the footer
Then I should Naviagte to Casino ResponsibleGambling page
Then  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
 #@ignore
 @Footer	 
 Scenario: Verifying if Casino VIP link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Casino VIP link within the footer
Then  I should Naviagte to Casino VIP page
Then  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
 
#@ignore
 @Footer	 
Scenario: Verifying if Vegas Terms And Conditions link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Vegas Vertical Tab
 And  I click on Vegas TermsAndCondition link within the footer
Then  I should Naviagte to Vegas TermsAndCondition page
 And  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
#@ignore
 @Footer	 
Scenario: Verifying if Vegas PrivacyPolicylink within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Vegas Vertical Tab
 And  I click on Vegas PrivacyPolicy link within the footer
Then  I should Naviagte to Vegas PrivacyPolicy page
 And  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
 #@ignore
 @Footer	 
Scenario: Verifying if Vegas ResponsibleGambling link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Vegas Vertical Tab
 And  I click on Vegas ResponsibleGambling link within the footer
Then  I should Naviagte to Vegas ResponsibleGambling page
 And  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
@ignore
 @Footer	 
Scenario: Verifying if Vegas VIP link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Vegas Vertical Tab
 And  I click on Vegas VIP link within the footer
Then  I should Naviagte to Vegas VIP page
 And  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 
#@ignore
 @Footer	 
Scenario: Verifying if Live Terms And Conditions link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on Live Vertical Tab
And  I click on Live Terms And Conditions link within the footer
Then  I should see Terms link within the footer 
 And  I should Naviagte to Casino TermsAndCondition page
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 #@ignore
 @Footer	 
 Scenario: Verifying if Live PrivacyPolicy link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Live Vertical Tab
 And  I click on Live PrivacyPolicy link within the footer
Then  I should see Terms link within the footer 
 And  I should Naviagte to Casino PrivacyPolicy page
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer

 #@ignore
 @Footer	 
Scenario: Verifying if Live ResponsibleGambling link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Live Vertical Tab
 And  I click on Live ResponsibleGambling link within the footer
 Then I should Naviagte to Casino ResponsibleGambling page
 And  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 #@ignore
 @Footer
 Scenario: Verifying if Live VIP link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When  I click on Live Vertical Tab
 And  I click on Live VIP link within the footer
 Then I should Naviagte to Casino VIP page
 And  I should see Terms link within the footer 
 And  I should see VIP link within the footer
 And  I should see PrivacyPolicy link within the footer
 And  I should see ResponsibleGambling link within the footer
 And  I should see PayPalIcon link within the footer
 And  I should see VisaIcon link within the footer
 And  I should see NetPlayTvIcon link within the footer
 And  I should see OverEighteenIcon link within the footer
 And  I should see GamCareIcon link within the footer
 And  I should see GamblingCommissionIcon link within the footer
 And  I should see legalText within the footer
 #@ignore
 @Footer	 
 Scenario: Verifying facebook Icon link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on Facebook Icon link within the footer
Then I should Navigate to Netplaytv Facebook page
 #@ignore
 @Footer	 
Scenario: Verifying Tiwtter Icon link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on Tiwtter Icon link within the footer
Then I should Navigate to Netplaytv Tiwtter page

#@ignore
 @Footer	 
 Scenario: Verifying NetPlayTv Icon link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on NetPlayTV Icon link within the footer
Then I should Navigate to Netplaytv Corporate site page
#@ignore
 @Footer	 
Scenario: Verifying 18+ Icon link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on EighteenPlus Icon link within the footer
Then I should Navigate to Responsible Gambling page
#@ignore
@Footer
Scenario: Verifying GameCare Icon link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on GameCare Icon link within the footer
Then I should Navigate to GameCare HomePage site

#@ignore
@Footer
Scenario: Verifying GamblingCommission Icon link within the footer can be clicked
Given I Navigate to the homepage on "browser" 
When I click on GamblingCommission Icon link within the footer
Then I should Navigate to GamblingCommission HomePage site




