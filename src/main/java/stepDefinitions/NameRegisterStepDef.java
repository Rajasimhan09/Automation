package stepDefinitions;

import WebCommonFunctions.NameRegisterPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import utilities.DriverManager;

public class NameRegisterStepDef {

	NameRegisterPage userRegistartionTestObject = new NameRegisterPage();

	@Given("^user launches the Parabank application with (.+)$")
	public void launchBrowser(String browser){		
		DriverManager.setDriver();		
	}

	@And("^user clicks on register button to create new account$")
	public void registerNewAccount(){
		userRegistartionTestObject.registerNewAccount();		
	}

	@Then("^user enters first and Last name as (.+),(.+)$")
	public void enterPersonalDetails(String firstNameVal, String lastNameVal){
		userRegistartionTestObject.enterPersonalDetails(firstNameVal, lastNameVal);	
	}

	@Then("^user enters address details as (.+),(.+),(.+)$")
	public void enterAddress(String street, String city, String stateVal){
		userRegistartionTestObject.enterAddress(street, city, stateVal);	
	}
	
	@Then("^user enters contact details as (.+),(.+),(.+)$")
	public void enterContacts(String code, String number, String ssn){
		userRegistartionTestObject.enterContactDetails(code, number, ssn);	
	}
	
	@Then("^user enters username and password as (.+),(.+)$")
	public void enterContacts(String username, String password){
		userRegistartionTestObject.registerUserDetails(username, password);	
		
	}

	@And("^user confirms new account is created$")
	public void selectItemAndCreateCart(){
		userRegistartionTestObject.verifyAccountCreation();		
	}
	
	@And("^user opens new account for (.+)$")
	public void selectItemAndCreateCart(String accountType){
		userRegistartionTestObject.openNewAccount(accountType);		
	}

	@And("^user confirms the new account is created and funds transferred$")
	public void checkoutAndConfirmOrder() throws InterruptedException{	
		userRegistartionTestObject.confirmAccountCreation();
	}	
}