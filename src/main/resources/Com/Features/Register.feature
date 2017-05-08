Feature: User Should be able to Navigate to Registeration Page and Register 

#@ignore
@Reg 
Scenario: Registration Page 
	Given I Navigate to the homepage on "browser" 
	When I click on Sidebar Menu 
	And I click on Join Now Button 
	Then I should Navigate to Registration Page 
	
	
#@ignore 
@Register 
Scenario Outline: Registration with Invalid Data 
	Given I navigate to the Registrationpage on "browser" 
	When I enter regUsername as "<username>" 
	And I enter RegPassword as "<password>" 
	And I enter RegConfirmPassword as "<ConfPass>" 
	And I enter a RegScreenName as "<screenName>" 
	And I enter RegEmail as "<email>" 
	And I enter RegTitle as "<title>" 
	And I enter RegFirstName as "<firstName>" 
	And I enter RegSurName as "<surname>" 
	And I enter RegDOBDay as "<Day>" 
	And I enter RegDOBMonth as "<Month>" 
	And I enter RegDOBYear as "<Year>" 
	And I click on RegClickHere 
	And I enter RegAddress as "<Address>" 
	And I enter RegTown as "<Town>" 
	And I enter RegCounty as "<county>" 
	And I enter RegPostCode as "<Postcode>" 
	And I enter RegContactNum as "<contactNumber>" 
	And I click on RegT$CCheckBox 
	And I click on RegSubmitButton 
	Then I should see Error Messsage displayed on Register Page 
	Examples: 
		|username    			 |password 		        |ConfPass 				|screenName   			|E-mail               |title |firstName  |surname   |Day  |Month |Year |Address             |Town                                              |county 											  |Postcode |contactNumber    |TypeLimit    | ChooseLimit 		|expectedResult	 |
		|mmm12                   |MNNH$1                |MNNH$2                 |mmm12                  |test@playtec.com     |Miss  |MJHGF-12   |MNHGF     |3    |OCT   |1980 |8, silverthorne     |London                                            |l                                                 |SW8 3HE  |0203700700       |             |                   |FAILURE         |
		|NNNNNNNNNNNNNNNNNNNNN1  |GGGGGGGGGGGGGGGGGGGG1 |GGGGGGGGGGGGGGGGGGGG1  |1234543212             |test@playtec.com     |Ms    |GHJUYT'S   |AGGTR'S   |3    |OCT   |1980 |8//                 |L                                                 |Greater LONDON                                    |SW8 3HE  |0207000100       |             |                   |FAILURE         |
		|markge                  |12345678              |12345678               |GGGGGGGGGGGGGGGGGGGG1  |test@playtec.com     |DR    |AGRT BG    |HJUUT12   |3    |OCT   |1980 |8%                  |london1                                           |Greatest of LONDON area of united kingdon europes |SW8 3HE  |0207001000       |             |                   |FAILURE         |
		|12345678                |ADSERTYG              |ADSERTYG               |ASEDCFREEE             |test@playtec.com     |MR    |           |ASEDDR    |3    |OCT   |1980 |8,silverthorne      |Greatest of LONDON area of united kingdon europes |Greatest of LONDON area of united kingdon europes |         |0207100600       |             |                   |FAILURE         |
		|                        |lookjng£*^            |lookjng£*^            |makomi1lbugo            |                     |MR    |asderty    |          |3    |OCT   |1980 |                    |london                                            |London                                            |         |0207100601       |             |                   |FAILURE         |
		|Snetplay-TV             |££££££££££>           |££££££££££>            |adsggtt444^$£          |temmtt               |Miss  |add*add    |122asa^   |23   |Jun   |2018 |£80                 |London&&&                                         |1234555                                           |SW8 3HE  |++U13234803556000|             |                   |FAILURE         |
		|123456£1                |$$$$$%%1a             |$$$$$%%1a              |makomi1lbugo           |testplaytech.com     |DR    |adde$)     |&$£agas   |3    |      |2015 |8                   |greater3LONDON                                    |                                                  |         |                 |             |                   |FAILURE         |
		|{generator}             |Manjuyt               |Manjuyt                |{generator}            |l@.com               |      |           |          |3    |OCT   |1980 |80                  |SDDDD                                             |LONDON                                            |SW8 %67  |9191GGSS         |             |                   |FAILURE         |
		|ScreenName1     		 |Bola123$%^            |Bola123$%^             |ScreenName1            |test@playtech.com    |Mrs   |nav        |look      |3    |OCT   |1980 |80                  |London                                            |London                                            |SW8 3HE  |02071006020      |             |                   |FAILURE         |
		|Snetplaytv$%            |Looking/>             |Looking/>              |yahoonnana             |£££test@playtech.com |      |lao@       |          |3    |OCT   |2001 |                    |LONDON%#                                          |Surrey-london                                     |SW8 3HE+8|london01         |             |                   |FAILURE         |
		
		
		
		#@ignore
		@Register 
		Scenario Outline: Registration with valid Data 
			Given I navigate to the Registrationpage on "browser" 
			When I enter regUsername as "<username>" 
			And I enter RegPassword as "<password>" 
			And I enter RegConfirmPassword as "<ConfPass>" 
			And I enter a RegScreenName as "<screenName>" 
			And I enter RegEmail as "<E-mail>" 
			And I enter RegTitle as "<title>" 
			And I enter RegFirstName as "<firstName>" 
			And I enter RegSurName as "<surname>" 
			And I enter RegDOBDay as "<Day>" 
			And I enter RegDOBMonth as "<Month>" 
			And I enter RegDOBYear as "<Year>" 
			And I click on RegClickHere 
			And I enter RegAddress as "<Address>" 
			And I enter RegTown as "<Town>" 
			And I enter RegCounty as "<county>" 
			And I enter RegPostCode as "<Postcode>" 
			And I enter RegContactNum as "<contactNumber>" 
			And I click on deposit limit click here link 
			And I enter Choose Type as "<TypeLimit>" 
			And I enter Choose limit as "<ChooseLimit>" 
			And I click on RegT$CCheckBox 
			And I click on RegSubmitButton 
			Then I should navigate to welcome page. 
			And I should see Deposit Now Button 
			And I should see More Info link 
			And I should see Play Now Button 
			Examples: 
				|username    	 |password 		        |ConfPass 			|screenName   			|E-mail               |title |firstName  |surname   |Day  |Month |Year |Address             |Town            |county 				 |Postcode |contactNumber    |TypeLimit    | ChooseLimit 		|
				|{generator}     |Bola123$%^            |Bola123$%^         |{generator}            | test@playtech.com   | Ms   |tolu       |lawal     |06   | OCT  |1982 | 6 goodhew Road     |Croydon         |surrey                 |CR0 6JX  |020700070100	  |Daily	   |£1000		        |
				
				
				
				#@ignore 
				@Register 
				Scenario: Deposit Limit link on Registrition Page 
					Given I navigate to the Registrationpage on "browser" 
					Then I should see Deposit Limit Link 
					
				#@ignore 
				@Register 
				Scenario: Deposit Limit link on Registrition Page 
					Given I navigate to the Registrationpage on "browser" 
					When I click on deposit limit click here link 
					Then I should see Choose Type dropdown box 
					And I should see Choose Limit  dropdown box 
					
				#@ignore 
				@Register 
				Scenario Outline: setting a Weekly   deposit limit  on Registration page 
					Given I navigate to the Registrationpage on "<browser>" 
					When I click on deposit limit click here link 
					And I enter Choose Type as "<ChooseType>" 
					And I enter Choose limit as "<ChooseLimit>" 
					Then I should see Choose Type as "<ExpectResultChooseType>" 
					And I should see Choose Limit as "<ExpectResultChooseLimit>" 
					
					Examples: 
						|ChooseType | ChooseLimit| ExpectResultChooseType	|ExpectResultChooseLimit|
						|Weekly		|£10,000	 |Weekly					|£10,000				|
						| Daily		| 1000		 | Daily					|1000					|
						| Daily		|Other	 	 | Other					| 10000					|
						
						#@ignore
						@Register 
						Scenario: setting a Other deposit limit  on Registration page 
							Given I navigate to the Registrationpage on "<browser>" 
							When I click on deposit limit click here link 
							And I enter Choose Type as "Monthly" 
							And I enter Choose limit as "Other" 
							And I enter Other Amount as "£10,000" 
							Then I should see Choose Type as "Monthly" 
							And I should see Choose Limit  as "Other" 
							And I should see Other Amount  as "£10,000" 
							
						#@ignore	
						@Register 
						Scenario: Clicking on BonusTerms And Wagering Requirement link 
							Given I navigate to the Registrationpage on "browser" 
							When I click on BonusTerms and Wagering link 
							Then I should see BonusTerms and Condition pop-up displayed 
							
						#@ignore	
						@Register 
						Scenario: Clicking on Close Icon within the Bonus terms frame box 
							Given I navigate to the Registrationpage on "browser" 
							When I click on BonusTerms and Wagering link 
							And I click on the Close icon within Bonus Term Frame box 
							Then I should see no BonusTerms and Condition pop-up frame box 
							
						#@ignore		
						@Register 
						Scenario: Clicking on Over18Terms link 
							Given I navigate to the Registrationpage on "browser" 
							When I click on  OverEighteen Terms link 
							Then I should see Terms and Condition pop-up displayed 
						#@ignore		
						@Register 
						Scenario: Clicking on Close icon on Over18Term and Condition Frame Box 
							Given I navigate to the Registrationpage on "browser" 
							When I click on  OverEighteen Terms link 
							And I click on the Close icon within the Frame box 
							Then I should see no Terms and Condition pop-up frame box 
						#@ignore		
						@Register 
						Scenario: Clicking on OverEighteen Privacy Policy link 
							Given I navigate to the Registrationpage on "browser" 
							When I click on  OverEighteen Privacy Policy link 
							Then I should see Privacy Policy pop-up displayed 
							
						#@ignore
						@web	
						@Register 
						Scenario: Clicking on Close icon on Over18Term and Condition Frame Box 
							Given I navigate to the Registrationpage on "browser" 
							When I click on  OverEighteen Privacy Policy link 
							And I click on the Close icon within the Frame box 
							Then I should see no Privacy Policy pop-up frame box