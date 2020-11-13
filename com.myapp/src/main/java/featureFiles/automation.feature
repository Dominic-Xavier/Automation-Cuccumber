Feature: Login and addres

Scenario Outline: User logins and entering the address for purchasing items

Given user is on the main page
Then user logins into the application by entering "<Email>" and "<Password>" and clicks  on signin button
Then user adds a new address "<First name>" and "<Last name>" and "<Company>" and "<Address>" and "<City>" and "<State>" and "<Zip/Postal Code>" and "<Country>" and "<Mobile phone>" and "<Address Name>"

Examples:

|		 Email	 	 |Password |First name|Last name|Company| 	Address	   |City | State  |Zip/Postal Code|	   Country	|Mobile phone|Address Name|
|faret84833@ptcji.com|vzlys1995|	demo  |	  demo  |  xyz  |No.12,Texas,US|Texas|New York|		10005	  |United States| 9856412587 |Home Address|

Scenario Outline: User purchases three items

Given User navigates to "<category>" category and selects "<Sub category>"
Then user selects list view and orders first item of "<quantity>" numbers and "<size>" and color Yellow and clicks on add to cart and clicks continue shoppimg and repeats the same process for rest of the two items
Then user proceeds to checkout and conforms the  order
Then user navigates to order details and takes Screenshot

Examples:
|Quantity|size|category| Sub category |
|	5	 |	L | WOMEN  |Summer Dresses|



