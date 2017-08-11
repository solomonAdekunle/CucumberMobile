Feature: User Should be able to search for Games of their choice by using 
         the search functionality on casino and Vegas Vertical
         
         
 @SearchGame       
Scenario: Clicking on the Search input box
Given I Navigate to the homepage on "browser" 
When I click on the Search Input Icon
Then I should see Search Input box open
And I should see Search close icon      



 @SearchGame       
Scenario: Searching for Roulette Game on Casino Vertical
Given I Navigate to the homepage on "browser" 
When I click on the Search Input Icon
 And I enter Game Search for as "Roulette Express Premiun"
 Then I should see Roulette Express Premoium display from the Search
 
 
 
 
  @SearchGame       
Scenario: Searching for Roulette Game on Vegas Vertical
Given I Navigate to the homepage on "browser" 
When I click on Vegas Vertical Tab
 And  I click on the Search Input Icon
 And  I enter Game Search for as "Cleopatra"
Then I should see Virtue Fusion Game display from the Search