Feature: Login and address
Scenario Outline: User logins and entering the address for purchasing items

Given user is on the main page
Then user logins into the application by entering "<"Email">" and "<"Password">" and clicks  on signin button
Then user adds a new address "<"First name">" "<"Last name">" "<"Company">" "<"Address">" "<"City">" "<"State">" "<"Zip/Postal Code">" "<"Country">" "<"Home phone">" "<"Mobile phone">" "<"Address Name">"

Examples:

|		 Email		 |Password |First name|Last name|Company| 	Address	   |City | State  |Zip/Postal Code|	   Country	|Home phone|Mobile phone|Address Name|
|faret84833@ptcji.com|vzlys1995|	demo  |	  demo  |  xyz  |No.12,Texas,US|Texas|New York|		10005	  |United States|9856412587| 9856412587 |Home Address|

Scenario Outline: User purchases three items

Given User navigates to womens category


Examples:
||