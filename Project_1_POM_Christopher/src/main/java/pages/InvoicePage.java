package pages;

import org.openqa.selenium.remote.RemoteWebDriver;

import com.relevantcodes.extentreports.ExtentTest;

import wrappers.ProjectSpecificWrappers;

public class InvoicePage extends ProjectSpecificWrappers {

	public InvoicePage(RemoteWebDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		String pagetitle = driver.getTitle();
		if (!verifyTitle(pagetitle)) {
			reportStep("PAGE IS NOT " + pagetitle, "FAIL");

		}
	
	}
	
	

	public InvoicePage getInvoiceNumber() {
		String invoice = getTextByXpath("//h3[contains(text(),'Invoice')]");
		reportStep("INVOICE # : " + invoice, "INFO");
		System.out.println("INVOICE # : " + invoice);

		return this;
	}

}
