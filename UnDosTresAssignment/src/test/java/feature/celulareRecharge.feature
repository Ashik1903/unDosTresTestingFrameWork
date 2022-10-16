Feature: Recarga Celular Testing

##Validating the Screen
Scenario: Recarga Celular screen validation
  Given user is on undostres homepage
  When user clicks Recarga Celular
  Then user should be able to see Numero de celular, operator, Monto de Recarga text field
  
##Mobile Number field validation
Scenario: Mobile Number Validation
 	Given user is on Recarga Celular page
 	When user clicks on Numero de celular text field
 	Then user should be able to enter mobile number
 	
#Cannot automate since page is going on to session expiry everytime
#Scenario: Mobile number negative testing
 #	Given user is on Recarga Celular page
 #	When user clicks on Número de celular text field
 #	And user enters mobile number less than 10 digit
 #	Then user should be able to see error message for invalid field
 
Scenario: Mobile number blank validation
	Given user is on Recarga Celular page
	When user clicks on Siguiente without entering mobile number
	Then user should be able to see error message for blank field
	
# Mobile operator validation
Scenario: Mobile operator validation
	Given user is on Recarga Celular page
 	When user clicks on operator text field
 	Then user should be able to select appropriate operator from the list
	
Scenario: Mobile operator blank validation 
	Given user is on Recarga Celular page
 	When user clicks on Siguiente without selecting mobile operator
 	Then user should be able to see error message for mobile operator
 	
# Recharge Amount Validation
Scenario: Recharge Amount validation
	Given user is on Recarga Celular page
 	When user clicks on Monto de Recarga field
 	Then user should be able to select appropriate recharge option from the list
 	
Scenario: Recharge Amount blank validation 
	Given user is on Recarga Celular page
 	When user clicks on Siguiente without selecting Monto de Recarga field
 	Then user should be able to see error message for recharge amount
 	