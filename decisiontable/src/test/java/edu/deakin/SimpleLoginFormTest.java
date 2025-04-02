package edu.deakin;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class SimpleLoginFormTest {

	@Test
	public void testValidUserInvalidPass() {
		String result = SimpleLoginForm.login("testuser", "wrong-pass");
		Assert.assertNotEquals(result, "success");
	}

	@Test
	public void testInvalidUserInvalidPass() {
		String result = SimpleLoginForm.login("wrong-user", "wrong-pass");
		Assert.assertNotEquals(result, "success");
	}

	@Test
	public void testInvalidUserValidPass() {
		String result = SimpleLoginForm.login("wrong-user", "testpass");
		Assert.assertNotEquals(result, "success");
	}
	
	@Test
	public void testValidUserValidPass() {
		String result = SimpleLoginForm.login("testuser", "testpass");
		Assert.assertEquals(result, "success");
	}

}
