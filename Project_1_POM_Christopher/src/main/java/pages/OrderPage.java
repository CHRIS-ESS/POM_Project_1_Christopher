package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class OrderPage extends ProjectSpecificWrappers{
	
	public OrderPage (RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		if (!verifyTitle("Shopping Cart - PHPTRAVELS")) {
			reportStep("The page is not HomePage", "FAIL");
	
	}}
	
	
	public OrderPage clickOnMobileTab() {
		clickByXpath("//a[contains(text(),'Mobile')]");
		return this;
		
	}
	
	public OrderPage chooseMobileApp() {
		clickByXpath("//a[@id='product1-order-button']");
		return this;
		
	}
	
	public OrderPage clickAddToCartContinue() {
		clickByXpath("//button[@class='btn btn-primary btn-lg']");
		return this;
	}
	
	
	public OrderPage validateIfAdded() {
		verifyTextContainsByXpath("//span[contains(text(),'Mobile Applications')]", "Mobile Applications");
		return this;
	}
	
	
	public OrderPage clickCheckout() {
		clickByXpath("//a[contains(text(),'Checkout')]");
		return this;
		
	}
	
	public InvoicePage clickCompleteOrder() throws InterruptedException {
		WebElement element = getElementByXpath("//button[@id='btnCompleteOrder']");
		scrollToElement(element);
		clickByXpath("//button[@id='btnCompleteOrder']");
		return new InvoicePage(driver,test);
	}

}
