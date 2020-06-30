package com.orgabor.login;

public class LoginService {

	public boolean isUserValid(String user, String password) {
		if(user.equals("Gabor") && password.contentEquals("dummy")) {
			return true;
		}
		return false;
	}
}
