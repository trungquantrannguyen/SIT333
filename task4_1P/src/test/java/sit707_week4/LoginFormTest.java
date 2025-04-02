package sit707_week4;

import org.junit.Assert;
import org.junit.Test;

/**
 * Tests functions in LoginForm.
 * 
 * @author Ahsan Habib
 */
public class LoginFormTest {

	@Test
	public void testStudentIdentity() {
		String studentId = "225054634";
		Assert.assertNotNull("Student ID is null", studentId);
	}

	@Test
	public void testStudentName() {
		String studentName = "Tran Nguyen Trung Quan";
		Assert.assertNotNull("Student name is null", studentName);
	}

	@Test
	public void testFailEmptyUsernameAndEmptyPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, null);
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	/*
	 * Write more test functions below.
	 */

	@Test
	public void testFailEmptyUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, "wrong-password");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailEmptyUsernameAndCorrectPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login(null, "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailWrongUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("wrong-username", "wrong-password");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}

	@Test
	public void testFailWrongUsernameAndCorrectPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("wrong-username", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}
	
	@Test 
	public void testFailCorrectUsernameAndEmptyPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("ahsan", null);
		Assert.assertTrue(status.isLoginSuccess() == false);
	}
	
	@Test 
	public void testFailCorrectUsernameAndWrongPasswordAndDontCareValCode() {
		LoginStatus status = LoginForm.login("ahsan", "wrong-password");
		Assert.assertTrue(status.isLoginSuccess() == false);
	}
	
	@Test 
	public void testFailCorrectUsernameAndCorrectPasswordAndEmptyValCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == true);
		
		if(status.isLoginSuccess()) {
			Assert.assertTrue(LoginForm.validateCode(null) == false);
		}
	}
	
	@Test
	public void testFailCorrectUsernameAndCorrectPasswordAndWrongValCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == true);
		
		if(status.isLoginSuccess()) {
			Assert.assertTrue(LoginForm.validateCode("654321") == false);
		}
	}
	
	@Test
	public void testSuccessCorrectUsernameAndCorrectPasswordAndCorrectCode() {
		LoginStatus status = LoginForm.login("ahsan", "ahsan_pass");
		Assert.assertTrue(status.isLoginSuccess() == true);
		
		if(status.isLoginSuccess()) {
			Assert.assertTrue(LoginForm.validateCode(status.getErrorMsg()) == true);
		}
	}
}
