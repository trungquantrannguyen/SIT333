package web.service;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestMathQuestionServiceFunctional {
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

		driver = new ChromeDriver();
		System.out.println("Driver info: " + driver);
	}

	@Test
	public void testFullMathFlow() {
		// Login
		driver.get("http://localhost:8080/login");
		driver.findElement(By.id("username")).sendKeys("trungquan");
		driver.findElement(By.id("passwd")).sendKeys("2209");
		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("h2")).getText().contains("Q1"));

		// Q1: Addition
		driver.findElement(By.id("number1")).sendKeys("5");
		driver.findElement(By.id("number2")).sendKeys("10");
		driver.findElement(By.id("result")).sendKeys("15");
		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("h2")).getText().contains("Q2"));

		// Q2: Subtraction
		driver.findElement(By.id("number1")).sendKeys("20");
		driver.findElement(By.id("number2")).sendKeys("5");
		driver.findElement(By.id("result")).sendKeys("15");
		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("h2")).getText().contains("Q3"));
	}

	@Test
	public void testQ1CorrectAnswer() {
		driver.get("http://localhost:8080/q1");

		driver.findElement(By.id("number1")).sendKeys("5");
		driver.findElement(By.id("number2")).sendKeys("10");
		driver.findElement(By.id("result")).sendKeys("15");
		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("h2")).getText().contains("Q2"));
	}

	@Test
	public void testQ1IncorrectAnswer() {
		driver.get("http://localhost:8080/q1");

		driver.findElement(By.id("number1")).sendKeys("5");
		driver.findElement(By.id("number2")).sendKeys("10");
		driver.findElement(By.id("result")).sendKeys("10");
		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("div")).getText().contains("Wrong answer, try again."));
	}

	@Test
	public void testQ1EmptyInput() {
		driver.get("http://localhost:8080/q1");

		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("div")).getText().contains("Please fill in all fields."));
	}

	@Test
	public void testQ2CorrectAnswer() {
		driver.get("http://localhost:8080/q2");

		driver.findElement(By.id("number1")).sendKeys("10");
		driver.findElement(By.id("number2")).sendKeys("5");
		driver.findElement(By.id("result")).sendKeys("5");
		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("h2")).getText().contains("Q3"));
	}

	@Test
	public void testQ2IncorrectAnswer() {
		driver.get("http://localhost:8080/q2");

		driver.findElement(By.id("number1")).sendKeys("10");
		driver.findElement(By.id("number2")).sendKeys("5");
		driver.findElement(By.id("result")).sendKeys("10");
		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("div")).getText().contains("Wrong answer, try again."));
	}

	@Test
	public void testQ2EmptyInput() {
		driver.get("http://localhost:8080/q2");

		sleep(1);
		driver.findElement(By.cssSelector("[type=submit]")).click();

		sleep(3);

		Assert.assertTrue(driver.findElement(By.tagName("div")).getText().contains("Please fill in all fields."));
	}

	@After
	public void tearDown() {
		if (driver != null) {
			driver.quit();
		}
	}
}
