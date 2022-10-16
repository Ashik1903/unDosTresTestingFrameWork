Feature: Payment Page

@Tag1
Scenario: Payment Page Navigation
	Given user is on undostres homepage
	When user enters details for mobile recharge
	And user clicks on Siguiente
	Then user should be navigated to payment page	
	
Scenario: Entering Card Information
	Given user is on payment page
	When user clicks on Tarjeta
	And user click on Usar nueva tarjeta
	Then user should be able to add card details with expiry date, cvv and emailid
	
Scenario: Checking Login Information
	Given user entered card details under Usar nueva tarjeta
	When user clicks pagar con tarjeta
	Then user should get the login form
	
	## Not geting succefull Payment to test
Scenario: Entering Login Information for final payment
	Given user is in the login form
	When user enters loginid and password
	And user checks the captcha
	And user clicks on Acceso
	Then verify that payment should be successfull
	
Scenario: Checking Wrong login details
	Given user is in the login form
	When user enters wrong userid and password
	Then user should get error message for wrong credentials
	
	
	##Negative Scenarios for Card Details
Scenario: Card Number Negative scenario	
	Given user is in Tarjeta option in payment page
	When user tries to enter expiry month with out giving car number
	Then user should get error message for cardNumber
	
Scenario: expiry date Negative scenario	
	Given user is in Tarjeta option in payment page
	When user tries to enter CVV with out giving expiry month
	Then user should get error message for expiry date
	
Scenario: cvv Negative scenario	
	Given user is in Tarjeta option in payment page
	When user tries to enter email with out giving CVV
	Then user should get error message for cvv
	
Scenario: email Negative Scenario
	Given user is in Tarjeta option in payment page
	When user tries to click Pagar con tarjeta without giving proper email
	Then user should get error message for email
