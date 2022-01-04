package WebCommonFunctions;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import net.bytebuddy.utility.RandomString;
import pageObjects.NameRegisterObjects;
import stepDefinitions.Hooks;
import utilities.DriverManager;
import utilities.GenericValuesAndMethods;

public class NameRegisterPage extends NameRegisterObjects {

	String number="";
	String newAccount="";

	public void registerNewAccount(){
		try {	
			DriverManager.driver.get(GenericValuesAndMethods.paraBankApplicationUrl);			
			GenericValuesAndMethods.webDriverWait(DriverManager.driver,By.xpath("//a[contains(text(),'Register')]"));
			registerLink.click();
			Hooks.scenario.attach(((TakesScreenshot)DriverManager.driver).getScreenshotAs(OutputType.BYTES), "image/png", "Screensshot");
			Hooks.scenario.log("Register is successful");
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	public void enterPersonalDetails(String firstNameVal, String lastNameVal){
		try {
			GenericValuesAndMethods.webDriverWait(DriverManager.driver,By.xpath("//a[contains(text(),'Register')]"));
			firstNameTextField.sendKeys(firstNameVal);
			lastNameTextField.sendKeys(lastNameVal);						
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	public void enterAddress(String street, String city, String stateVal){
		try {
			streetTextField.sendKeys(street);
			cityTextField.sendKeys(city);	
			stateTextField.sendKeys(stateVal);					
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	public void enterContactDetails(String code, String number, String ssn){
		try {
			zipCodeTextField.sendKeys(code);
			phoneNumberTextField.sendKeys(number);	
			ssnTextField.sendKeys(ssn);					
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	public void registerUserDetails(String username, String password){
		try {			
			usernameTextField.sendKeys(username+RandomString.make(3));
			passwordTextField.sendKeys(password);	
			confirmTextField.sendKeys(password);	
			confirmRegisterButton.click();
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	public void verifyAccountCreation(){
		try {
			GenericValuesAndMethods.webDriverWait(DriverManager.driver,By.xpath("//*[contains(text(),'Your account was created successfully. You are now logged in.')]"));
			if(confirmRegistration.getText().equalsIgnoreCase(GenericValuesAndMethods.accountConfirmation))
				System.out.println("Account successfully created");
			else {
				Assert.fail("Account is not successfully created");
			}
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
	}

	public String openNewAccount(String accountType){		
		try {
			newAccountLink.click();
			Select accountOption = new Select(accountTypeDropdown);
			accountOption.selectByVisibleText(accountType);
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
		return number;
	}

	public String confirmAccountCreation(){

		try {	
			Thread.sleep(5000);
			submitButton.click();
			if(confirmNewAccount.getText().equalsIgnoreCase(GenericValuesAndMethods.confirmNewAccount))
				System.out.println("New Account opened successfully created");			

			newAccount=newAccountId.getText();
			System.out.println("New Account is created successfully: "+newAccount);
			Hooks.scenario.attach(((TakesScreenshot)DriverManager.driver).getScreenshotAs(OutputType.BYTES), "image/png", "Screensshot");
			Hooks.scenario.log("Account creation is successful");
			
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
		return newAccount;

	}
}