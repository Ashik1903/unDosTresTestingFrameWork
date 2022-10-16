package stepDef;

import resources.base;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class hooks{
	
	static WebDriver driver;
	
	@Before
	public void setUp() throws IOException{
		driver = base.initializeDriver();
	}
	
	@AfterStep
	public void takeScreenshot(Scenario scenario) throws IOException{
		if(scenario.isFailed()) {
			String screeshotName = scenario.getName().replaceAll(" ","_");
			File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
			byte[] fileContent = FileUtils.readFileToByteArray(screenshot);
			scenario.attach(fileContent,"image/png",screeshotName);
		}
	}
	
	@After
	public void tearDown() {
		driver.quit();
	}

}
