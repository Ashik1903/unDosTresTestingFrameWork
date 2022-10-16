package methods;



import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import java.time.Duration;
import java.util.List;

import objectRepo.celularRechargeObjRepo;
import resources.base;
import resources.constants;

public class celularRechargeMethods extends base{
	
	celularRechargeObjRepo celularrechargeObjRepo = new celularRechargeObjRepo(driver);
	
	Actions action = new Actions(driver);
	List<WebElement> list;
	
	
	public void openURI() {
		driver.get(prop.getProperty("url"));
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
	}
	
	public void openMobileRechargePage() {		
		celularrechargeObjRepo.getMobileRecharge().click();		
	}
	
	public void verifyFields() {
		Assert.assertEquals(celularrechargeObjRepo.getNumberText().getText().trim(), "Número de celular (10 dígitos)");
		Assert.assertEquals(celularrechargeObjRepo.getOperadorText().getText(), "Operador");
		Assert.assertEquals(celularrechargeObjRepo.getRechargeText().getText().trim(), "Monto de Recarga");
	}
	
	public void selectMobileNumber() {
		celularrechargeObjRepo.verifyMobileNumberText().click();	
	}
	
	public void enterMobileNumber() {
		celularrechargeObjRepo.verifyMobileNumberText().sendKeys(constants.phoneNumber);
	}
	
	public void enterMobileOperator() {
		celularrechargeObjRepo.getmobileOperator().click();
	}
	
	public void clickFollowingButton() {
		celularrechargeObjRepo.pressFollowingButton().click();
	}
	
	public void verifyErrorMessageForBlankMobileNumber() {
		Assert.assertEquals(celularrechargeObjRepo.getBlankError().getText(),"El campo no puede estar vacío");
	}
	
	public void verifyErrorMessageForBlankMobileOperator() {
		Assert.assertEquals(celularrechargeObjRepo.getBlankError().getText(),"El campo no puede estar vacío");
	}
	
	public void selectOperator() {
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"col-sm-12\"]//li[2]//ul/li"));
		for( WebElement i: list){
	         if(i.getText().equalsIgnoreCase(constants.operator)) {
	        	 i.click();
	        	 break;
	         }
	    }
	}
	
	public void clickRechargeAmountField() {
		celularrechargeObjRepo.clickRechargeAmount().click();
	}
	
	public void selectAmount() {
		List<WebElement> list = driver.findElements(By.xpath("//*[@id=\"col-sm-12\"]//li[3]//ul[1]/li"));
		for( WebElement i: list){
	         if(i.getText().contains(constants.Amount)) {
	        	 i.click();
	        	 break;
	         }
	    }
	}
	
	public void clickOutside() {
        action.moveByOffset(0, 0).click().build().perform();
    }
	
	public void verifyErrorMessageForBlankRechargeAmount() {
		Assert.assertEquals(celularrechargeObjRepo.getblankRchargeAmountError().getText(),"El monto debe ser superior o igual a $10");
	}

}
