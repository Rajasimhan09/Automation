package utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GenericValuesAndMethods {
	
	public static String browser = "Chrome";
	public static String chromeDriverPath = "C:\\Users\\47685\\Downloads\\chromedriver_win32\\chromedriver.exe";
	public static String ieDriverPath = "C:\\Users\\47685\\Downloads\\";
	public static String firefoxDriverPath = "C:\\Users\\47685\\Downloads\\";	
	public static String paraBankApplicationUrl = "https://parabank.parasoft.com/parabank/index.htm";	
	public static String accountConfirmation = "Your account was created successfully. You are now logged in.";
	public static String confirmNewAccount = "Your new account number:";
	
	public static void webDriverWait(WebDriver driver, By locator) {
	WebDriverWait wait = new WebDriverWait(driver,30);
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
	}
}
