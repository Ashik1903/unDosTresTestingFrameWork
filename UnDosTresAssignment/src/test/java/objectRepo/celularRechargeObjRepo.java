package objectRepo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class celularRechargeObjRepo {
	
	public WebDriver driver;

    public celularRechargeObjRepo(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
    
    @FindBy(xpath = "//*[@class='icon-container topSpecialMobileIcon ']")
    WebElement mobileRecharge;
    
    public WebElement getMobileRecharge() {
    	return mobileRecharge;
    }
    
    @FindBy(xpath = "//label[contains(text(),'Número de celular')]")
    WebElement numberText;
    
    public WebElement getNumberText() {
    	return numberText;
    }
    
    @FindBy(xpath = "//li[2]//label[contains(text(),'Operador')]")
    WebElement operadorText;
    
    public WebElement getOperadorText() {
    	return operadorText;
    }
    
    @FindBy(xpath = "//label[contains(text(),'Monto de Recarga')]")
    WebElement rechargeText;
    
    public WebElement getRechargeText() {
    	return rechargeText;
    }
    
    @FindBy(xpath = "//input[@data-qa = 'celular-mobile']")
    WebElement verifymobilenumber;
    
    public WebElement verifyMobileNumberText() {
    	return verifymobilenumber;
    }
    
    @FindBy(xpath = "//input[@data-qa = 'celular-operator']")
    WebElement mobileOperator;
    
    public WebElement  getmobileOperator() {
    	return mobileOperator;
    }
    
    @FindBy(xpath = "//input[@data-qa = 'celular-amount']")
    WebElement rechargeAmount;
    
    public WebElement clickRechargeAmount() {
    	return rechargeAmount;
    }
    
    @FindBy(xpath = "//div[contains(text(),'El campo no puede estar vacío')]")
    WebElement blankError;
    
    public WebElement getBlankError() {
    	return blankError;
    }
    
    @FindBy(xpath="//div[contains(text(),'El monto debe ser superior o igual a $10')]")
    WebElement blankRchargeAmountError;
    
    public WebElement getblankRchargeAmountError() {
    	return blankRchargeAmountError;
    }
    
    @FindBy(xpath = "//button[@data-qa='celular-pay']")
    WebElement followingButton;
    
    public WebElement pressFollowingButton() {
    	return followingButton;
    }
}
