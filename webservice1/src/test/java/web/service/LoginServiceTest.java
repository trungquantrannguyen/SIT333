package web.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class LoginServiceTest {
	
	WebDriver driver;
	
	private void sleep(long sec) {
		try {
			Thread.sleep(sec*1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void performLogin(String username, String password, String dob) {
		
		driver.get("file:///Users/trungquan/eclipse-workspace/SIT333/pages/login.html");
		System.out.println("Driver navigate to website");
		sleep(5);
		
		// Find username element
		//
		WebElement ele = driver.findElement(By.id("username"));
		ele.clear();
		ele.sendKeys(username);
		
		// Find password element
		//
		ele = driver.findElement(By.id("passwd"));
		ele.clear();
		ele.sendKeys(password);

		// Find dob element
		//
		ele = driver.findElement(By.id("dob"));
		ele.clear();
		ele.sendKeys(dob);
		
		// Find Submit button, and click on button.
		//
		ele = driver.findElement(By.cssSelector("[type=submit]"));
		ele.submit();	
	}
	
	@Before
	public void openDriver() {		
		System.setProperty( "webdriver.chrome.driver", "/Users/trungquan/Downloads/chromedriver-mac-arm64/chromedriver");
		
		driver = new ChromeDriver();	
		System.out.println("Driver info: " + driver);
	}
	
	@Test
	public void testLoginSuccess() {
		performLogin("trungquan","2209quan","22-09-2003");
		sleep(3);
		Assert.assertEquals(driver.getTitle(), "success");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Login status: success");
	}
	
	@Test
	public void testLoginFailInvalidUsername() {
		performLogin("wrongusername","2209quan","22-09-2003");
		sleep(3);
		Assert.assertEquals(driver.getTitle(), "fail");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Login status: fail");
	}
	
	@Test
	public void testLoginFailInvalidPassword() {
		performLogin("trungquan","wrongpassword","22-09-2003");
		sleep(3);
		Assert.assertEquals(driver.getTitle(), "fail");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Login status: fail");
	}
	
	@Test
	public void testLoginFailInvalidDob() {
		performLogin("trungquan","2209quan","22-02-2003");
		sleep(3);
		Assert.assertEquals(driver.getTitle(), "fail");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Login status: fail");
	}
	
	@Test
	public void testLoginFailNull() {
		performLogin("","","");
		sleep(3);
		Assert.assertEquals(driver.getTitle(), "fail");
		Assert.assertEquals(driver.findElement(By.tagName("h2")).getText(), "Login status: fail");
	}
	
	@After
	public void closeDriver() {
		driver.close();
		
	}
}
