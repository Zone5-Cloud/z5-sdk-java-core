package com.zone5cloud.core;

import java.util.HashMap;

import com.zone5cloud.core.terms.Terms;
import com.zone5cloud.core.users.Users;

/**
 * Instead of using this class, use the @Unauthenticated annotation on the request declaration
 * 
 * The use of @Unauthenticated has been implemented in the retrofit library but needs to be done in the Http library.
 * Once it has been done in the http library this class can be deleted
 */
public class Endpoints {
	private static final HashMap<String, Boolean> auth = new HashMap<>(); 
	static {
		auth.put(Users.LOGIN, false);
		auth.put(Users.NEW_ACCESS_TOKEN, false);
		auth.put(Users.PASSWORD_RESET, false);
		auth.put(Users.EMAIL_EXISTS, false);
		auth.put(Users.EMAIL_STATUS, false);
		auth.put(Users.REGISTER_USER, true); // SJ-23 register CAN OPTIONALLY add auth
		auth.put(Users.RECONFIRM,false);
		auth.put(Users.PASSWORD_COMPLEXITY,false);
		auth.put(Users.REFRESH_TOKEN, false);
		auth.put(Terms.REQUIRED, false);
		auth.put(Terms.DOWNLOAD, false);
		auth.put(Users.TEST_PASSWORD, false);
	}
	
	private Endpoints() {}
	
	public static boolean requiresAuth(String path) {
		// default to true
		return !auth.containsKey(path) || auth.get(path);
	}
}
