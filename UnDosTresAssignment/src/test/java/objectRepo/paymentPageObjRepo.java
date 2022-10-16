package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class paymentPageObjRepo {
	
	public WebDriver driver;
	
	public paymentPageObjRepo(WebDriver driver) {
		this.driver=driver;
        PageFactory.initElements(driver,this);
        
    }
	
	@FindBy(xpath = "//img[@class='logo']")
    WebElement unDosTresLogo;
    
    public WebElement getunDosTresLogo() {
    	return unDosTresLogo;
    }
    
    @FindBy(xpath = "//div[@class='legend-security-space']//div[@class='img-responsive'][1]/img")
    WebElement mcAfeeLogo;
    
    public WebElement getmcAfeeLogo() {
    	return mcAfeeLogo;
    }
    
    @FindBy(xpath = "//div[@class='legend-security-space']//div[@class='img-responsive'][2]/img")
    WebElement PCILogo;
    
    public WebElement getPCILogo() {
    	return PCILogo;
    }
    
    @FindBy(xpath = "//div[@class='security-text-style']/p")
    WebElement securityText;
    
    public WebElement getsecurityText() {
    	return securityText;
    }
    
    @FindBy(xpath = "//div[@class='legend-security-space']//b")
    WebElement securityText2;
    
    public WebElement getsecurityText2() {
    	return securityText2;
    }
    
    //=================For Monedero=======================================================
    
    @FindBy(xpath = "//*[@id='wallet-toggle']//p")
    WebElement monederoText;
    
    public WebElement getmonederoText() {
    	return monederoText;
    }
    
    @FindBy(className = "walletamount")
    WebElement monederoAmount;
    
    public WebElement getmonederoAmount() {
    	return monederoAmount;
    }
    
    @FindBy(id = "walletGly")
    WebElement monederoArrow;
    
    public WebElement getmonederoArrow() {
    	return monederoArrow;
    }
    
    //=============================For Tarjeta ========================================
    
    @FindBy(xpath = "//*[@data-qa='tarjeta-tab']")
    WebElement tarjetaText;
    
    public WebElement gettarjetaText() {
    	return tarjetaText;
    }
    
    @FindBy(id = "cardGly")
    WebElement tarjetaArrow;
    
    public WebElement gettarjetaArrow() {
    	return tarjetaArrow;
    }
    
    @FindBy(id = "new-card-toggle")
    WebElement tarjetaOption;
    
    public WebElement clickTarjetaOption() {
    	return tarjetaOption;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Usar nueva')]")
    WebElement usarNuevaTarjeta;
    
    public WebElement getUsarNuevaText() {
    	return usarNuevaTarjeta;
    }
    
    @FindBy(xpath = "//label[@for='radio-c']")
    WebElement usarNuevaTarjetaradio;
    
    public WebElement getUsarNuevaRadio() {
    	return usarNuevaTarjetaradio;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Usar tarjeta')]")
    WebElement usarTarjetaText;
    
    public WebElement getUsarTarjetaText() {
    	return usarTarjetaText;
    }
    
    @FindBy(xpath = "//label[@for='radio-save-card']")
    WebElement usarTarjetaRadio;
    
    public WebElement getUsarTarjetaRadio() {
    	return usarTarjetaRadio;
    }
    
    @FindBy(id = "promocodechkcardsaved")
    WebElement promoCodeField;
    
    public WebElement getPromoCodeField() {
    	return promoCodeField;
    }
    
    @FindBy(id = "applypromocardsaved")
    WebElement promoCodeButton;
    
    public WebElement getPromoCodeButton() {
    	return promoCodeButton;
    }
    
    
  //=============================For PayPal ========================================
  
    @FindBy(xpath = "//*[@data-qa='paypal-tab']")
    WebElement payPalText;
    
    public WebElement getpayPalText() {
    	return payPalText;
    }
    
    @FindBy(id = "paypalGly")
    WebElement payPalArrow;
    
    public WebElement getpayPalArrow() {
    	return payPalArrow;
    }
    
    @FindBy(id = "paypal-toggle")
    WebElement payPalOption;
    
    public WebElement clickPaypalOption() {
    	return payPalOption;
    }
    
    @FindBy(id = "email_paypal")
    WebElement payPalEmail;
    
    public WebElement clickPaypalEmail() {
    	return payPalEmail;
    }
    
    @FindBy(xpath = "//*[@id='email_block']//p[contains(text(),'Enviaremos tu')]")
    WebElement payPalmessage1;
    
    public WebElement getpayPalmessage1() {
    	return payPalmessage1;
    }
    
    @FindBy(xpath = "//p[contains(text(),'Correo incompleto')]")
    WebElement payPalmessage2;
    
    public WebElement getpayPalmessage2() {
    	return payPalmessage2;
    }
    
    @FindBy(className = "checkbox-inline")
    WebElement payPalCheckbox;
    
    public WebElement clickPaypalcheckBox() {
    	return payPalCheckbox;
    }
    
    @FindBy(className = "saveCredentials")
    WebElement payPalSaveCreds;
    
    public WebElement getpayPalSaveCreds() {
    	return payPalSaveCreds;
    }
    
    @FindBy(id = "promocodechk_paypal")
    WebElement payPalPromoCode;
    
    public WebElement clickPaypalPromoCode() {
    	return payPalPromoCode;
    }
    
    @FindBy(id = "applypromo_paypal")
    WebElement payPalPromo;
    
    public WebElement PaypalPromoButton() {
    	return payPalPromo;
    }
    
  //====================================For SPEI=========================================================
    
    @FindBy(xpath = "//*[@id='stp-toggle']//p")
    WebElement speiText;
    
    public WebElement getspeiText() {
    	return speiText;
    }
    
    @FindBy(id = "stpGly")
    WebElement speiArrow;
    
    public WebElement getspeiArrow() {
    	return speiArrow;
    }
    
  //======================================For Efectivo========================================================
    
    @FindBy(xpath = "//*[@data-qa='efectivo-tab']")
    WebElement efectivoText;
    
    public WebElement getefectivoText() {
    	return efectivoText;
    }
    
    @FindBy(id = "paypalGly")
    WebElement efectivoArrow;
    
    public WebElement getefectivoArrow() {
    	return efectivoArrow;
    }
    
   //============================Summary Modal Verification=====================================================
    
    @FindBy(className = "summary-message-top")
    WebElement summaryMessage;
    
    public WebElement getsummaryMessage() {
    	return summaryMessage;
    }
    
    @FindBy(className = "desktop-operator-summary-img")
    WebElement summaryImage;
    
    public WebElement getsummaryImage() {
    	return summaryImage;
    }
    
    @FindBy(xpath = "//span[contains(text(),'Recarga Saldo')]")
    WebElement rechargeInfo;
    
    public WebElement getrechargeInfo() {
    	return rechargeInfo;
    }
    
    @FindBy(xpath = "//b[contains(text(),'Total')]")
    WebElement totalText;
    
    public WebElement gettotalText() {
    	return totalText;
    }
    
    @FindBy(xpath = "//span[contains(text(),'$10.00')]")
    WebElement amountText;
    
    public WebElement getamountText() {
    	return amountText;
    }
    
    @FindBy(className = "sumTxtAmount")
    WebElement totalAmount;
    
    public WebElement gettotalAmount() {
    	return totalAmount;
    }
    
 //================login button=============================================
    
    @FindBy(id = "loginBtn")
    WebElement loginBtn;
    
    public WebElement clickLoginBtn() {
    	return loginBtn;
    }
    
    @FindBy(name = "email")
    WebElement username;
    
    public WebElement setUsername() {
    	return username;
    }
    
    @FindBy(name = "password")
    WebElement password;
    
    public WebElement setPassword() {
    	return password;
    }
  
  //=======captcha related xpaths===========================================
    
    @FindBy(xpath = "//iframe[starts-with(@name, 'a-') and starts-with(@src, 'https://www.google.com/recaptcha')]")
    WebElement captchaFrame;
    
    public WebElement moveToCaptchaFrame() {
    	return captchaFrame;
    }
    
    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border']")
    WebElement captchaCheckBox;
    
    public WebElement clickCaptchaCheckBox() {
    	return captchaCheckBox;
    }
    
    @FindBy(id = "recaptcha-anchor-label")
    WebElement captchaLabel;
    
    public WebElement getcaptchaLabel() {
    	return captchaLabel;
    }
   
    //===================== Card details for tarjeta================================================
    
    @FindBy(id = "cardnumberunique")
    WebElement cardNumber;
    
    public WebElement setCardNumber() {
    	return cardNumber;
    }
    
    @FindBy(xpath = "//*[@data-qa='mes-input']")
    WebElement month;
    
    public WebElement setMonth() {
    	return month;
    }
    
    @FindBy(xpath = "//*[@data-qa='expyear-input']")
    WebElement year;
    
    public WebElement setYear() {
    	return year;
    }
    
    @FindBy(xpath = "//*[@data-qa='cvv-input']")
    WebElement cvv;
    
    public WebElement setCvv() {
    	return cvv;
    }
    
    @FindBy(xpath = "//span[contains(text(),'/')]")
    WebElement formatCheck;
    
    public WebElement checkFormat() {
    	return formatCheck;
    }
    
    @FindBy(name = "txtEmail")
    WebElement txnEmail;
    
    public WebElement settxnEmail() {
    	return txnEmail;
    }
    
    @FindBy(xpath = "//*[@id='paylimit']/span")
    WebElement submitBtntxt;
    
    public WebElement getSubmitBtntxt() {
    	return submitBtntxt;
    }
    
    @FindBy(id = "paylimit")
    WebElement submitBtn;
    
    public WebElement clickSubmitBtn() {
    	return submitBtn;
    }
    
   //===========verification of login modal=====================================================
    
    @FindBy(xpath = "//div[contains(text(),'Para pagar')]")
    WebElement loginHeaderMessage;
    
    public WebElement getloginHeaderMessage() {
    	return loginHeaderMessage;
    }
    
    @FindBy(xpath = "//*[@id='login']//div[2]/div/button")
    WebElement crossBtn;
    
    public WebElement checkcrossBtn() {
    	return crossBtn;
    }
    
    @FindBy(id = "loginTabBtn")
    WebElement assecoBtn;
    
    public WebElement checkAssecoBtn() {
    	return assecoBtn;
    }
    
    @FindBy(id = "regTabBtn")
    WebElement registrateBtn;
    
    public WebElement checkRegistrateBtn() {
    	return registrateBtn;
    }
    
    @FindBy(className = "fbloginButton")
    WebElement fbLoginBtn;
    
    public WebElement clickfbLoginBtn() {
    	return fbLoginBtn;
    }
    
    @FindBy(className = "googleRegisterButton")
    WebElement googleBtn;
    
    public WebElement clickgoogleBtn() {
    	return googleBtn;
    }
    
    @FindBy(xpath = "//span[contains(text(),'o Acceso')]")
    WebElement query1;
    
    public WebElement getquery1() {
    	return query1;
    }
    
    @FindBy(xpath = "//*[@id='loginForm']/p/a")
    WebElement query2;
    
    public WebElement getquery2() {
    	return query2;
    }
    
    @FindBy(xpath = "//a[contains(text(),'¿No tienes cuenta?')]")
    WebElement query3;
    
    public WebElement getquery3() {
    	return query3;
    }
    
    
    //=====xpaths for error messages ==============================================================
    
    @FindBy(xpath = "//p[contains(text(),'Error en Número')]")
    WebElement cardError;
    
    public WebElement getCardError() {
    	return cardError;
    }
    
    @FindBy(xpath = "//p[contains(text(),'Error en')]")
    WebElement expiryError;
    
    public WebElement getExpiryError() {
    	return expiryError;
    }
    
    @FindBy(xpath = "//p[contains(text(),'Escriba los')]")
    WebElement cvvError;
    
    public WebElement getCvvError() {
    	return cvvError;
    }
    
    @FindBy(xpath = "//p[contains(text(),'Correo incompleto')]")
    WebElement emailError;
    
    public WebElement getEmailError() {
    	return emailError;
    }
    
    @FindBy(id = "add_err")
    WebElement invalidCredError;
    
    public WebElement getInvalidCredError() {
    	return invalidCredError;
    }
    
    @FindBy(className = "fbloginButton")
    WebElement fblogin;
    
    public WebElement clickFBlogin() {
    	return fblogin;
    }
}
