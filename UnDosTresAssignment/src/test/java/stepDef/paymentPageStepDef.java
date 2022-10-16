package stepDef;

import org.junit.Assert;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.celularRechargeMethods;
import methods.paymentPageMethods;

public class paymentPageStepDef {
	
	paymentPageMethods paymentpagemethods = new paymentPageMethods();
	celularRechargeMethods celularrechargemethods = new celularRechargeMethods();

	@When("user enters details for mobile recharge")
	public void user_enters_details_for_mobile_recharge() {
		celularrechargemethods.enterMobileOperator();
		celularrechargemethods.selectOperator();
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickRechargeAmountField();
		celularrechargemethods.selectAmount();
	}
	
	@And("user clicks on Siguiente")
	public void user_clicks_on_siguiente() {
		celularrechargemethods.clickOutside();
		celularrechargemethods.clickFollowingButton();	
	}

	@Then("user should be navigated to payment page")
	public void user_should_be_navigated_to_payment_page() throws InterruptedException {
		paymentpagemethods.verifyPaymentPageLogo();
		paymentpagemethods.verifyMonedero();
		paymentpagemethods.verifyTarjeta();
		paymentpagemethods.verifyPayPal();
		paymentpagemethods.verifySPEI();
		paymentpagemethods.verifyEfectivo();
		paymentpagemethods.verifyAmountInformation();
	}
	
	@Given("user is on payment page")
    public void user_is_on_payment_page() throws Throwable {
		celularrechargemethods.openURI();
		celularrechargemethods.openMobileRechargePage();
		celularrechargemethods.enterMobileOperator();
		celularrechargemethods.selectOperator();
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickRechargeAmountField();
		celularrechargemethods.selectAmount();
		celularrechargemethods.clickOutside();
		celularrechargemethods.clickFollowingButton();	
    }

    @When("user clicks on Tarjeta")
    public void user_clicks_on_tarjeta() throws Throwable {
    	paymentpagemethods.clickTarjeta();
    }
    
    @And("user click on Usar nueva tarjeta")
    public void user_click_on_usar_nueva_tarjeta() throws Throwable {
    	paymentpagemethods.clickuserNuevaTarjeta();
    }


    @Then("user should be able to add card details with expiry date, cvv and emailid")
    public void user_should_be_able_to_add_card_details_with_expiry_date_cvv_and_emailid() {
    	paymentpagemethods.enterCardDetails();
    }
    
    @Given("user entered card details under Usar nueva tarjeta")
    public void user_entered_card_details_under_usar_nueva_tarjeta() throws Throwable {
    	celularrechargemethods.openURI();
		celularrechargemethods.openMobileRechargePage();
    	celularrechargemethods.enterMobileOperator();
		celularrechargemethods.selectOperator();
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickRechargeAmountField();
		celularrechargemethods.selectAmount();
		celularrechargemethods.clickOutside();
		celularrechargemethods.clickFollowingButton();
		paymentpagemethods.clickTarjeta();
		paymentpagemethods.clickuserNuevaTarjeta();
		paymentpagemethods.enterCardDetails();
		
    }
    
    @When("user clicks pagar con tarjeta")
    public void user_clicks_pagar_con_tarjeta() throws InterruptedException{
    	paymentpagemethods.clickPagarConTarjeta();
    }
    
    @Then("user should get the login form")
    public void user_should_get_the_login_form() {
    	paymentpagemethods.verifyLoginModal();
    }

    @Given("user is in the login form")
    public void user_is_in_the_login_form() throws Throwable {
    	celularrechargemethods.openURI();
		celularrechargemethods.openMobileRechargePage();
    	celularrechargemethods.enterMobileOperator();
		celularrechargemethods.selectOperator();
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickRechargeAmountField();
		celularrechargemethods.selectAmount();
		celularrechargemethods.clickOutside();
		celularrechargemethods.clickFollowingButton();
		paymentpagemethods.clickTarjeta();
		paymentpagemethods.clickuserNuevaTarjeta();
		paymentpagemethods.enterCardDetails();
		paymentpagemethods.clickPagarConTarjeta();
    }
    
    @When("user enters loginid and password")
    public void user_enters_loginid_and_password() throws Throwable {
    	paymentpagemethods.enterUsernameAndPass();
    }
    
    @And("user checks the captcha")
    public void user_checks_the_captcha() throws Throwable {
    	paymentpagemethods.userClicksCaptacha();
    }

    @And("user clicks on Acceso")
    public void user_clicks_on_acceso() throws Throwable {
    	paymentpagemethods.userClicksAcceso();
    }

    @Then("verify that payment should be successfull")
    public void verify_that_payment_should_be_successfull() throws Throwable {
    	Assert.fail("Could not able to simulate success scenario with the provided test data");
    	//System.out.println("Successfull");
    }
    
    @Given("user is in Tarjeta option in payment page")
    public void user_is_in_tarjeta_option_in_payment_page() throws Throwable {
    	celularrechargemethods.openURI();
		celularrechargemethods.openMobileRechargePage();
    	celularrechargemethods.enterMobileOperator();
		celularrechargemethods.selectOperator();
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickRechargeAmountField();
		celularrechargemethods.selectAmount();
		celularrechargemethods.clickOutside();
		celularrechargemethods.clickFollowingButton();
		paymentpagemethods.clickTarjeta();
		paymentpagemethods.clickuserNuevaTarjeta();
    }

    @When("user tries to enter expiry month with out giving car number")
    public void user_tries_to_enter_expiry_month_with_out_giving_car_number() throws Throwable {
    	paymentpagemethods.enterexpiryWithoutCard();
    }
    
    @Then("user should get error message for cardNumber")
    public void user_should_get_error_message_for_cardnumber() throws Throwable {
    	paymentpagemethods.verifyErrorMessageForCard();
    }

    @When("user tries to enter CVV with out giving expiry month")
    public void user_tries_to_enter_cvv_with_out_giving_expiry_month() throws Throwable {
    	paymentpagemethods.enterCvvWithoutExpiry();
    }
    
    @Then("user should get error message for expiry date")
    public void user_should_get_error_message_for_expiry_date() throws Throwable {
    	paymentpagemethods.verifyErrorMessageForExpiry();
    }

    @When("user tries to enter email with out giving CVV")
    public void user_tries_to_enter_email_with_out_giving_cvv() throws Throwable {
    	paymentpagemethods.enterEmailWithoutCVV();
    }
    
    @Then("user should get error message for cvv")
    public void user_should_get_error_message_for_cvv() throws Throwable {
    	paymentpagemethods.verifyErrorMessageForCVV();
    }

    @When("user tries to click Pagar con tarjeta without giving proper email")
    public void user_tries_to_click_pagar_con_tarjeta_without_giving_proper_email() throws Throwable {
    	paymentpagemethods.enterInvalidEmail();
    }

    @Then("user should get error message for email")
    public void user_should_get_error_message_for_email() throws Throwable {
    	paymentpagemethods.verifyErrorMessageForEmail();
    }
    
    @When("^user enters wrong userid and password$")
    public void user_enters_wrong_userid_and_password() throws Throwable {
    	paymentpagemethods.enterWrongUserIdPass();
    	paymentpagemethods.userClicksCaptacha();
    	paymentpagemethods.userClicksAcceso();
    }
    
    @Then("^user should get error message for wrong credentials$")
    public void user_should_get_error_message_for_wrong_credentials() throws Throwable {
        paymentpagemethods.verifyErrorMessageForWrongCreds();
    }


}
