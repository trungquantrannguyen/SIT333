package sit707_week2;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * This class demonstrates Selenium locator APIs to identify HTML elements.
 * 
 * Details in Selenium documentation https://www.selenium.dev/documentation/webdriver/elements/locators/
 * 
 * @author Ahsan Habib
 */
public class SeleniumOperations {

	public static void sleep(int sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static void officeworks_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/trungquan/Downloads/chromedriver-mac-arm64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		// Find first input field which is firstname
		WebElement firstname = driver.findElement(By.id("firstname"));
		System.out.println("Found firstname: " + firstname);
		// Send first name
		firstname.sendKeys("Quan");
		
		/*
		 * Find following input fields and populate with values
		 */
		// Write code
		
		WebElement lastname = driver.findElement(By.id("lastname"));
		System.out.println("Found lastname: " + lastname);
		// Send first name
		lastname.sendKeys("Tran");
		
		WebElement phoneNumber = driver.findElement(By.id("phoneNumber"));
		System.out.println("Found phoneNumber: " + phoneNumber);
		// Send first name
		phoneNumber.sendKeys("0435355223");
		
		WebElement email = driver.findElement(By.id("email"));
		System.out.println("Found email: " + email);
		// Send first name
		email.sendKeys("tranntquan@gmail.com");
		

		WebElement password = driver.findElement(By.id("password"));
		System.out.println("Found password: " + password);
		// Send first name
		password.sendKeys("1234");
		

		WebElement confirmPassword = driver.findElement(By.id("confirmPassword"));
		System.out.println("Found confirmPassword: " + confirmPassword);
		// Send first name
		confirmPassword.sendKeys("1234");
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		List<WebElement> createAccountButtons = driver.findElements(By.tagName("button"));
		System.out.println("Found button: " + createAccountButtons);
		for (WebElement createButton : createAccountButtons) {
			if(createButton.getText() == "Create account") {
				createButton.click();
			}
		}
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("/Users/trungquan/eclipse-workspace/SIT333/task2_1P_225054634/screenshot.png"));
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
	
	public static void amazon_registration_page(String url) throws IOException {
		// Step 1: Locate chrome driver folder in the local drive.
		System.setProperty("webdriver.chrome.driver", "/Users/trungquan/Downloads/chromedriver-mac-arm64/chromedriver");
		
		// Step 2: Use above chrome driver to open up a chromium browser.
		System.out.println("Fire up chrome browser.");
		WebDriver driver = new ChromeDriver();
		
		System.out.println("Driver info: " + driver);
		
		sleep(2);
	
		// Load a webpage in chromium browser.
		driver.get(url);
		
		/*
		 * How to identify a HTML input field -
		 * Step 1: Inspect the webpage, 
		 * Step 2: locate the input field, 
		 * Step 3: Find out how to identify it, by id/name/...
		 */
		
		WebElement lastname = driver.findElement(By.id("ap_customer_name"));
		System.out.println("Found lastname: " + lastname);
		// Send first name
		lastname.sendKeys("Tran");
		
		WebElement email = driver.findElement(By.id("ap_email"));
		System.out.println("Found email: " + email);
		// Send first name
		email.sendKeys("tranntquan@gmail.com");
		

		WebElement password = driver.findElement(By.id("ap_password"));
		System.out.println("Found password: " + password);
		// Send first name
		password.sendKeys("1234");
		

		WebElement confirmPassword = driver.findElement(By.id("ap_password_check"));
		System.out.println("Found confirmPassword: " + confirmPassword);
		// Send first name
		confirmPassword.sendKeys("1234");
		
		/*
		 * Identify button 'Create account' and click to submit using Selenium API.
		 */
		// Write code
		
		WebElement createAccountButton = driver.findElement(By.id("continue"));
		System.out.println("Found button: " + createAccountButton);
		createAccountButton.click();
		
		/*
		 * Take screenshot using selenium API.
		 */
		// Write code
		
		File scrFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(scrFile, new File("/Users/trungquan/eclipse-workspace/SIT333/task2_1P_225054634/amazon_screenshot.png"));
		
		// Sleep a while
		sleep(2);
		
		// close chrome driver
		driver.close();	
	}
}
