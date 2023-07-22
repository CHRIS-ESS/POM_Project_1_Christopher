package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class ProfilePage extends ProjectSpecificWrappers{
	
public ProfilePage(RemoteWebDriver driver, ExtentTest test) {
		
		this.driver = driver;
		this.test = test;
		if (!verifyTitle("Client Area - PHPTRAVELS")) {
			reportStep("The page is not HomePage", "FAIL");
	
	}
		}

	
		public ProfilePage clickOnServiceTab() {
			clickByXpath("(//a[@data-toggle='dropdown'])[1]");
			return this;
		}
		
		public OrderPage clickOrderNewService() {
			clickByXpath("//a[contains(text(),'Order New Services')]");
			return new OrderPage(driver,test);
			
		}


		public Object clickServices() throws InterruptedException {
			clickByXpath("//li[@menuitemname='Services']");
			Thread.sleep(500);
			clickByXpath("//li[@menuitemname='Order New Services']");
			Thread.sleep(500);

			return new OrderPage(driver, test);
		}

}
