package web.service;

/**
 * Business logic to handle login functions.
 * 
 * @author Ahsan.
 */
public class LoginService {

	/**
	 * Static method returns true for successful login, false otherwise.
	 * @param username
	 * @param password
	 * @return
	 */
	public static boolean login(String username, String password, String dob) {
		// Match a fixed user name and password.
		//
		
        // Sample hardcoded valid credentials
        String validUsername = "trungquan";
        String validPassword = "2209quan";
        String validDob = "2003-09-22";

		
		// Basic validation logic
        return username != null && password != null && dob != null &&
               username.equals(validUsername) &&
               password.equals(validPassword) &&
               dob.equals(validDob);
	}
	
	
}
