package stepDef;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import methods.celularRechargeMethods;
import resources.base;

public class celularRechargeStepDef extends base{

	celularRechargeMethods celularrechargemethods = new celularRechargeMethods();
	//====================================================================================================
	@Given("user is on undostres homepage")
	public void user_is_on_undostres_homepage() {
		celularrechargemethods.openURI();
	}

	@When("user clicks Recarga Celular")
	public void user_clicks_recarga_celular() {
		celularrechargemethods.openMobileRechargePage();
	}

	@Then("user should be able to see Numero de celular, operator, Monto de Recarga text field")
	public void user_should_be_able_to_see_numero_de_celular_operator_monto_de_recarga_text_field() {
		celularrechargemethods.verifyFields();
		celularrechargemethods.selectOperator();
	}

	//====================================================================================================
	@Given("user is on Recarga Celular page")
	public void user_is_on_recarga_celular_page() {
		celularrechargemethods.openURI();
		celularrechargemethods.openMobileRechargePage();
	}

	@When("user clicks on Numero de celular text field")
	public void user_clicks_on_nmero_de_celular_text_field() {
		celularrechargemethods.selectMobileNumber();
	}

	@Then("user should be able to enter mobile number")
	public void user_should_be_able_to_enter_mobile_number() {
		celularrechargemethods.enterMobileNumber();
	}

	@And("^user enters mobile number less than 10 digit$")
	public void user_enters_mobile_number_less_than_10_digit() {

	}

	@Then("^user should be able to see error message for invalid field$")
	public void user_should_be_able_to_see_error_message() {
		
	}

	@When("^user clicks on Siguiente without entering mobile number$")
	public void user_clicks_on_siguiente_without_entering_mobile_number() {
		celularrechargemethods.clickFollowingButton();
	}

	@Then("^user should be able to see error message for blank field$")
	public void user_should_be_able_to_see_error_message_blank_field() {
		celularrechargemethods.verifyErrorMessageForBlankMobileNumber();
	}

	//====================================================================================================	

	@When("^user clicks on operator text field$")
	public void user_clicks_on_operator_text_field() {
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.enterMobileOperator();

	}

	@Then("^user should be able to select appropriate operator from the list$")
	public void user_should_be_able_to_select_appropriate_operator_from_the_list() {
		celularrechargemethods.selectOperator();
	}

	@When("^user clicks on Siguiente without selecting mobile operator$")
	public void user_clicks_on_siguiente_without_selecting_mobile_operator() {
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickFollowingButton();
		
	}

	@Then("^user should be able to see error message for mobile operator$")
	public void user_should_be_able_to_see_error_message_for_mobile_operator() {
		celularrechargemethods.verifyErrorMessageForBlankMobileOperator();
	}

	//====================================================================================================

	@When("^user clicks on Monto de Recarga field$")
	public void user_clicks_on_monto_de_recarga_field() {
		celularrechargemethods.enterMobileOperator();
		celularrechargemethods.selectOperator();
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickRechargeAmountField();
	}

	@Then("^user should be able to select appropriate recharge option from the list$")
	public void user_should_be_able_to_select_appropriate_recharge_option_from_the_list() {
		celularrechargemethods.selectAmount();
	}

	@When("^user clicks on Siguiente without selecting Monto de Recarga field$")
	public void user_clicks_on_siguiente_without_selecting_monto_de_recarga_field() {
		
		celularrechargemethods.enterMobileOperator();
		celularrechargemethods.selectOperator();
		celularrechargemethods.selectMobileNumber();
		celularrechargemethods.enterMobileNumber();
		celularrechargemethods.clickOutside();
		celularrechargemethods.clickFollowingButton();
		

	}

	@Then("^user should be able to see error message for recharge amount$")
	public void user_should_be_able_to_see_error_message_for_recharge_amount() {
		celularrechargemethods.verifyErrorMessageForBlankRechargeAmount();
	}

	//====================================================================================================

}
