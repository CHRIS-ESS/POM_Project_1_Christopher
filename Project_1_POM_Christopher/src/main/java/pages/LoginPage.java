package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class LoginPage extends ProjectSpecificWrappers{
	
	public LoginPage (RemoteWebDriver driver, ExtentTest test){
		this.driver = driver;
		this.test = test;

		if(!verifyTitle("Login - PHPTRAVELS")){
			reportStep("This is not Login Page", "Fail");
		}
	}
	
	
	public LoginPage enterUserName(){
		enterById("inputEmail", username);
		return this;
	}
	
	public LoginPage enterPassword(){
		enterById("inputPassword", password);
		return this;
		
	}
	
	public ProfilePage clickLogin() throws InterruptedException{
		Thread.sleep(20000);
		clickById("login");		
		return new ProfilePage(driver, test);
	}

}
