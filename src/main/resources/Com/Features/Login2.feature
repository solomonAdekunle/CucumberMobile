  Feature: User should also not be able to login with Invalid data
  
  
  
  @Reg
 Scenario Outline:Login
 Given I am on the Page
  #When I click on Login Button
  When  I enter Username as "<username>"
   And  I enter Password as "<password>"
   And  I click on SignIn button
  Then  I should see username as "<username>" present
   And  I should see AccountBlance present
   And  I should see Depositbutton present
  
 Examples:  
     |	username	| password     |
     | NOBLEBUG228	|Bola123$%^    |
