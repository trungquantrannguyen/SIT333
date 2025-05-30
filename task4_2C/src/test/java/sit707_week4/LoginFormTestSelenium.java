package sit707_week4;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class LoginFormTestSelenium {
	WebDriver driver;

	private void sleep(long sec) {
		try {
			Thread.sleep(sec * 1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Before
	public void openDriver() {
		System.setProperty("webdriver.chrome.driver", "/Users/trungquan/Downloads/chromedriver-mac-arm64/chromedriver");

		driver = new ChromeDriver(
				new ChromeOptions());
		System.out.println("Driver info: " + driver);
	}
	
	private void navigateToPageAndLogin(String email, String password) {
		driver.get("https://www.bunnings.com.au/login");
//		sleep(3);
		driver.findElement(By.id("username")).sendKeys(email);
//		sleep(1);
		driver.findElement(By.id("password")).sendKeys(password);
//		sleep(1);
		
		driver.findElement(By.id("login-submit")).click();
	}
	
	@Test
	public void testLoginSuccess() {
		navigateToPageAndLogin("tranntquan@gmail.com","2209Quan@");
		sleep(5);
		String successUrl = driver.getCurrentUrl();
		System.out.println("Url: " + successUrl);
		Assert.assertEquals(driver.getCurrentUrl(),"https://www.bunnings.com.au/");
	}
	
	@Test
	public void testLoginFailWrongEmail() {

		navigateToPageAndLogin("wrongemail@gmail.com","2209Quan@");
		sleep(5);
		Assert.assertNotSame(driver.getCurrentUrl(),"https://www.bunnings.com.au");
	}
	
	@Test
	public void testLoginFailWrongPassword() {

		navigateToPageAndLogin("tranntquan@gmail.com","wrongpassword");
		sleep(5);
		Assert.assertNotSame(driver.getCurrentUrl(),"https://www.bunnings.com.au");
	}
	
	@Test 
	public void testLoginFailWrongEmailAndPassword() {

		navigateToPageAndLogin("wrongemail@gmail.com","wrongpassword");
		sleep(5);
		Assert.assertNotSame(driver.getCurrentUrl(),"https://www.bunnings.com.au");
	}
	
	@After
	public void quitBrowser() {
		if(driver != null) {
			driver.quit();
		}
	}
}
