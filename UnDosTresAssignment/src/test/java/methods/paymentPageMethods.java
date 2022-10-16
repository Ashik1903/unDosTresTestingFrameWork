package methods;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import objectRepo.paymentPageObjRepo;
import resources.base;
import resources.*;

public class paymentPageMethods extends base {

	paymentPageObjRepo paymentpageObjRepo = new paymentPageObjRepo(driver);
	
	Boolean p;
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
	JavascriptExecutor js = (JavascriptExecutor) driver;
	String str;

	public void verifyPaymentPageLogo() throws InterruptedException {
		Thread.sleep(2000);
		// Javascript executor to check image
		p = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + 
								"&& arguments[0].naturalWidth > 0", paymentpageObjRepo.getunDosTresLogo());

		Assert.assertTrue(p, "UnDosTres Logo is not present");
		
		js.executeScript("window.scrollBy(0,250)", "");
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.getmcAfeeLogo()));
		
		p = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + 
								"&& arguments[0].naturalWidth > 0", paymentpageObjRepo.getmcAfeeLogo());

		Assert.assertTrue(p, "McAfee Security Logo is not present");
		
		p = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + 
								"&& arguments[0].naturalWidth > 0", paymentpageObjRepo.getPCILogo());

		Assert.assertTrue(p, "McAfee Security Logo is not present");
		Assert.assertEquals(paymentpageObjRepo.getsecurityText().getText(),"Tus datos están seguros, usamos seguridad de encriptación de datos a 256 bits bajo el protocolo SSL");
		Assert.assertEquals(paymentpageObjRepo.getsecurityText2().getText().trim(),
				"Pagos procesados por Conekta/Payu/Openpay/MercadoPago/Stripe/PayPal, ellos cumplen con todos los procedimientos necesarios para validar la conformidad con PCI DSS y McAfee Secure.");
	}
	
	// Different Wallets UI verification ===================================================================================
	//Monedero
	public void verifyMonedero() {
		Assert.assertEquals(paymentpageObjRepo.getmonederoText().getText(), "Monedero");
		Assert.assertEquals(paymentpageObjRepo.getmonederoAmount().getText(), "$0.0");
		Assert.assertTrue(paymentpageObjRepo.getmonederoArrow().isDisplayed(), "arrow button is not displayed for Monedero");	
	}
	
	
	//tarjeta
	public void verifyTarjeta() {
		Assert.assertEquals(paymentpageObjRepo.gettarjetaText().getText(), "Tarjeta");
		Assert.assertTrue(paymentpageObjRepo.gettarjetaArrow().isDisplayed(), "arrow button is not displayed for Tarjeta");
		paymentpageObjRepo.clickTarjetaOption().click();
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.getUsarNuevaText()));
		Assert.assertEquals(paymentpageObjRepo.getUsarNuevaText().getText(), "Usar nueva tarjeta");
		Assert.assertTrue(paymentpageObjRepo.getUsarNuevaRadio().isDisplayed(), "Radio button for new card is displayed");
		Assert.assertEquals(paymentpageObjRepo.getUsarTarjetaText().getText(), "Usar tarjeta guardada");
		Assert.assertTrue(paymentpageObjRepo.getUsarTarjetaRadio().isDisplayed(), "Radio button for new card is not displayed");
		Assert.assertTrue(paymentpageObjRepo.getPromoCodeField().isDisplayed(), "promo code text field is not displayed for Tarjeta");
		Assert.assertTrue(paymentpageObjRepo.getPromoCodeButton().isDisplayed(), "Agregar is not displayed for Tarjeta");
		
		
	}
	
	//paypal
	public void verifyPayPal() {
		Assert.assertEquals(paymentpageObjRepo.getpayPalText().getText(), "PayPal");
		Assert.assertTrue(paymentpageObjRepo.getpayPalArrow().isDisplayed(), "arrow button is not displayed for Paypal");
		paymentpageObjRepo.clickPaypalOption().click();
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.getpayPalmessage2()));
		Assert.assertTrue(paymentpageObjRepo.clickPaypalEmail().isDisplayed(), "email field is not displayed for Paypal");
		Assert.assertEquals(paymentpageObjRepo.getpayPalmessage1().getText().trim(), "Enviaremos tu recibo a este correo");
		Assert.assertEquals(paymentpageObjRepo.getpayPalmessage2().getText(), "Correo incompleto, favor de llenar.");
		Assert.assertTrue(paymentpageObjRepo.clickPaypalcheckBox().isDisplayed(), "checkbox is not displayed");
		Assert.assertEquals(paymentpageObjRepo.getpayPalSaveCreds().getText().trim(), "Guardar esta cuenta para mis futuras compras");
		Assert.assertTrue(paymentpageObjRepo.clickPaypalPromoCode().isDisplayed(), "promo code text field is not displayed for Paypal");
		Assert.assertTrue(paymentpageObjRepo.PaypalPromoButton().isDisplayed(), "Agregar is not displayed for Paypal");
        
	}
	
	//SPEI
	public void verifySPEI() {
		Assert.assertEquals(paymentpageObjRepo.getspeiText().getText(), "SPEI");
		Assert.assertTrue(paymentpageObjRepo.getspeiArrow().isDisplayed(), "arrow button is not displayed for SPEI");
	
	}
	
	//Efectivo
	public void verifyEfectivo() {
		Assert.assertEquals(paymentpageObjRepo.getefectivoText().getText(), "Efectivo");
		Assert.assertTrue(paymentpageObjRepo.getefectivoArrow().isDisplayed(), "arrow button is not displayed for Efectivo");

	}
	
	//============================================================================================================================================
	// Total Amount Modal verification
	
	public void verifyAmountInformation() {
		Assert.assertEquals(paymentpageObjRepo.getsummaryMessage().getText(),"Resumen de la compra");
		
		p = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + 
								"&& arguments[0].naturalWidth > 0", paymentpageObjRepo.getsummaryImage());
		
		Assert.assertTrue(p, "operator Logo is not present");
		Assert.assertTrue(paymentpageObjRepo.getrechargeInfo().getText().contains(constants.phoneNumber), 
				"Phone number is not matching");
		Assert.assertEquals(paymentpageObjRepo.gettotalText().getText(), "Total");
		Assert.assertEquals(paymentpageObjRepo.getamountText().getText(), paymentpageObjRepo.gettotalAmount().getText(), 
				"Total Amount is not matching");
	}
	//==============================================================================================================================================
	//Payement using Tarjeta method
	
	public void clickTarjeta() throws InterruptedException {
		paymentpageObjRepo.clickTarjetaOption().click();
		Thread.sleep(2000);
	}
	
	public void clickuserNuevaTarjeta() {
		paymentpageObjRepo.getUsarNuevaText().click();
	}
	
	public void enterCardDetails() {
		paymentpageObjRepo.setCardNumber().sendKeys(constants.cardNumber);
		paymentpageObjRepo.setMonth().sendKeys(constants.month);
		Assert.assertTrue(paymentpageObjRepo.checkFormat().isDisplayed(), "/ is not displayed between year and month");
		paymentpageObjRepo.setYear().sendKeys(constants.year);
		paymentpageObjRepo.setCvv().sendKeys(constants.cvv);
		paymentpageObjRepo.settxnEmail().sendKeys(constants.email);
		Assert.assertEquals(paymentpageObjRepo.getSubmitBtntxt().getText(), "Pagar con Tarjeta");
				
	}
	
	public void clickPagarConTarjeta() throws InterruptedException {
		paymentpageObjRepo.clickSubmitBtn().click();
		Thread.sleep(2000);
	}
	
	//============================================================================================================================================
	//Verification of Login Modal
	
	
	public void verifyLoginModal() {
		Assert.assertEquals(paymentpageObjRepo.getloginHeaderMessage().getText(), "Para pagar por favor Regístrate o Ingresa a tu cuenta");
		Assert.assertEquals(paymentpageObjRepo.checkcrossBtn().getText(), "×");
		Assert.assertTrue(paymentpageObjRepo.checkAssecoBtn().isDisplayed(), "Access is not displayed");
		Assert.assertTrue(paymentpageObjRepo.checkRegistrateBtn().isDisplayed(), "Regístrate is not displayed");
		
		p = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + 
								"&& arguments[0].naturalWidth > 0", paymentpageObjRepo.clickfbLoginBtn());

		Assert.assertTrue(p, "FB Logo is not present");
		
		p = (Boolean) ((JavascriptExecutor)driver)
				.executeScript("return arguments[0].complete " + "&& typeof arguments[0].naturalWidth != \"undefined\" " + 
								"&& arguments[0].naturalWidth > 0", paymentpageObjRepo.clickgoogleBtn());

		Assert.assertTrue(p, "FB Logo is not present");
		
		Assert.assertEquals(paymentpageObjRepo.getquery1().getText(), "o Acceso con correo");
		Assert.assertTrue(paymentpageObjRepo.setUsername().isDisplayed(), "username text field is not displayed");
		Assert.assertTrue(paymentpageObjRepo.setPassword().isDisplayed(), "password text field is not displayed");
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentpageObjRepo.moveToCaptchaFrame()));
		Assert.assertTrue(wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.clickCaptchaCheckBox())).isDisplayed(), "captcha checkbox is not displayed");
		Assert.assertTrue(paymentpageObjRepo.getcaptchaLabel().isDisplayed(), "recaptcha label is not displayed");
		driver.switchTo().defaultContent();
		
		js.executeScript("window.scrollBy(0,250)", "");
		Assert.assertTrue(paymentpageObjRepo.clickLoginBtn().isDisplayed(), "login button is not displayed");
		Assert.assertEquals(paymentpageObjRepo.getquery2().getText(), "¿Olvidaste tu contraseña?");
		Assert.assertEquals(paymentpageObjRepo.getquery3().getText(), "¿No tienes cuenta? Regístrate aquí");
		
	}
	
	public void enterUsernameAndPass() {
		paymentpageObjRepo.setUsername().sendKeys(constants.username);
		paymentpageObjRepo.setPassword().sendKeys(constants.password);
	}
	
	public void userClicksCaptacha() {
		wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(paymentpageObjRepo.moveToCaptchaFrame()));
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.clickCaptchaCheckBox())).click();
		driver.switchTo().defaultContent();
		js.executeScript("window.scrollBy(0,250)", "");
	}
	
	public void userClicksAcceso() {
		paymentpageObjRepo.clickLoginBtn().click();
	}
	
	//===========================Negative Validations ========================================================================
	
	public void enterexpiryWithoutCard() {
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.setMonth()));
		paymentpageObjRepo.setMonth().click();
	}
	
	public void verifyErrorMessageForCard() {
		Assert.assertEquals(paymentpageObjRepo.getCardError().getText(), "Error en Número de tarjeta, favor de verificar");
	}
	
	public void enterCvvWithoutExpiry() {
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.setCvv()));
		paymentpageObjRepo.setCardNumber().sendKeys(constants.cardNumber);
		paymentpageObjRepo.setCvv().click();
	}
	
	public void verifyErrorMessageForExpiry() {
		Assert.assertEquals(paymentpageObjRepo.getExpiryError().getText(), "Error en Vigencia, favor de verificar");
	}
	
	public void enterEmailWithoutCVV() {
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.setCardNumber()));
		paymentpageObjRepo.setCardNumber().sendKeys(constants.cardNumber);
		paymentpageObjRepo.setMonth().sendKeys(constants.month);
		paymentpageObjRepo.setYear().sendKeys(constants.year);
		paymentpageObjRepo.settxnEmail().click();
	}
	
	public void verifyErrorMessageForCVV() {
		Assert.assertEquals(paymentpageObjRepo.getCvvError().getText(), "Escriba los 3 dígitos, favor de verificar");
	}
	
	public void enterInvalidEmail() {
		wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.setCardNumber()));
		paymentpageObjRepo.setCardNumber().sendKeys(constants.cardNumber);
		paymentpageObjRepo.setMonth().sendKeys(constants.month);
		paymentpageObjRepo.setYear().sendKeys(constants.year);
		paymentpageObjRepo.setCvv().sendKeys(constants.cvv);
		paymentpageObjRepo.settxnEmail().sendKeys("test");
		paymentpageObjRepo.setCvv().click();
	}
	
	public void verifyErrorMessageForEmail() {
		Assert.assertEquals(paymentpageObjRepo.getpayPalmessage2().getText(), "Correo incompleto, favor de llenar.");
	}
	
//================================================================================================================================
	
	public void enterWrongUserIdPass() {
		paymentpageObjRepo.setUsername().sendKeys(constants.username1);
		paymentpageObjRepo.setPassword().sendKeys(constants.password1);
		
	}
	
	public void verifyErrorMessageForWrongCreds() throws InterruptedException {
		Thread.sleep(1000);
	//	wait.until(ExpectedConditions.elementToBeSelected(paymentpageObjRepo.getInvalidCredError()));
		Assert.assertEquals(paymentpageObjRepo.getInvalidCredError().getText(), "Correo/Móvil o contraseña no válido");
	}
	
	public void checkForSccessfullPayment() {
		//wait.until(ExpectedConditions.elementToBeClickable(paymentpageObjRepo.getunDosTresLogo()));
		 //if(driver.findElement(By.xpath("//div[contains(text(),'¡Falló')]")).getText().contains("¡Falló la recarga!")) {
			 Assert.fail("Recharge was not successfull");
	//	 }
	}

}
