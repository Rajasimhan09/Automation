package utilities;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

public class DriverManager {

	public static String browser = "Chrome";
	public static String chromeDriverPath = "C:\\Users\\47685\\Downloads\\chromedriver_win32\\chromedriver.exe";
	public static String ieDriverPath = "C:\\Users\\47685\\Downloads\\";
	public static String firefoxDriverPath = "C:\\Users\\47685\\Downloads\\";	
	public static String paraBankApplicationUrl = "https://parabank.parasoft.com/parabank/index.htm";	
	public static String accountConfirmation = "Your account was created successfully. You are now logged in.";
	public static String confirmNewAccount = "Your new account number:";


	public static WebDriver driver=null;
	//Instantiating Login & Profile page using initElements()

	public static WebDriver setDriver(){		
		try {			
			if(driver==null) {
				if(browser.contains("Chrome")) {
					WebDriverManager.chromedriver().setup();
					driver = new ChromeDriver();
				}
				else if(browser.equalsIgnoreCase("IE")) {
					WebDriverManager.iedriver().browserVersion("11").setup();
					driver = new InternetExplorerDriver();
				}
				else if(browser.equalsIgnoreCase("Firefox")) {
					WebDriverManager.firefoxdriver().setup();
					driver = new FirefoxDriver();
				}
				driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS) ;
				driver.manage().window().maximize();
			}
		}
		catch(Exception e) {
			e.getMessage();
			Assert.fail(e.getMessage());
		}
		return driver;
	}

	public static void webDriverWait(WebDriver driver, WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(element));
	}
	
	public String getReportConfigPath() throws IOException{
		String reportConfigPath = RestAssuredGenericMethods.getValue("reportConfigPath");
		if(reportConfigPath!= null) return reportConfigPath;
		else throw new RuntimeException("Report Config Path not specified in the Configuration.properties file for the Key:reportConfigPath");		
	}
}
