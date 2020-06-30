package com.orgabor;

public class UserValidationService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("Gabor") && password.contentEquals("dummy")) {
			return true;
		}
		return false;
	}
}
