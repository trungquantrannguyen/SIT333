package web.service;

import static org.junit.Assert.*;
import org.junit.Test;

public class LoginUnitTest {
	@Test
    public void testValidLogin() {
        assertTrue(LoginService.login("trungquan", "2209quan", "2003-09-22"));
    }

    @Test
    public void testInvalidUsername() {
        assertFalse(LoginService.login("wronguser", "2209quan", "2003-09-22"));
    }

    @Test
    public void testInvalidPassword() {
        assertFalse(LoginService.login("trungquan", "wrongpass", "2003-09-22"));
    }

    @Test
    public void testInvalidDob() {
        assertFalse(LoginService.login("trungquan", "2209quan", "1999-01-01"));
    }

    @Test
    public void testEmptyFields() {
        assertFalse(LoginService.login("", "", ""));
    }

    @Test
    public void testNullFields() {
        assertFalse(LoginService.login(null, null, null));
    }
}
