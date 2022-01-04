package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utilities.DriverManager;

public class NameRegisterObjects {

	String number="";
	String newAccount="";

	public NameRegisterObjects() {
		PageFactory.initElements(DriverManager.setDriver(), this);
	}

	@FindBy(xpath = "//a[contains(text(),'Register')]")
	public WebElement registerLink;

	@FindBy(id = "customer.firstName")
	public WebElement firstNameTextField;	

	@FindBy(id = "customer.lastName")
	public WebElement lastNameTextField;

	@FindBy(id = "customer.address.street")
	public WebElement streetTextField;

	@FindBy(id = "customer.address.city")
	public WebElement cityTextField;

	@FindBy(id = "customer.address.state")
	public WebElement stateTextField;

	@FindBy(id = "customer.address.zipCode")
	public WebElement zipCodeTextField;

	@FindBy(id = "customer.phoneNumber")
	public WebElement phoneNumberTextField;

	@FindBy(id = "customer.ssn")
	public WebElement ssnTextField;

	@FindBy(id = "customer.username")
	public WebElement usernameTextField;

	@FindBy(id = "customer.password")
	public WebElement passwordTextField;

	@FindBy(id = "repeatedPassword")
	public WebElement confirmTextField;

	@FindBy(xpath = "//*[@value='Register']")
	public WebElement confirmRegisterButton;

	@FindBy(xpath = "//*[contains(text(),'Your account was created successfully. You are now logged in.')]")
	public WebElement confirmRegistration;

	@FindBy(xpath = "//a[contains(text(),'Open New Account')]")
	public WebElement newAccountLink;

	@FindBy(xpath = "//*[@id='type']")
	public WebElement accountTypeDropdown;

	@FindBy(id = "fromAccountId")
	public WebElement accountNumberDropdown;

	@FindBy(xpath = "//*[@value='Open New Account']")
	public WebElement newAccountButton;

	@FindBy(xpath = "//*[contains(text(),'Your new account number:')]")
	public WebElement confirmNewAccount;
	
	@FindBy(xpath = "//input[@type='submit']")
	public WebElement submitButton;

	@FindBy(id = "newAccountId")
	public WebElement newAccountId;
}