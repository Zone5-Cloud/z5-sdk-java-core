package com.zone5ventures.core.users;

public class Users {
	
	public static final String NEW_ACCESS_TOKEN = "/rest/oauth/access_token";
	public static final String ME = "/rest/users/me";
	public static final String DELETE_USER = "/rest/users/delete/{userId}";
	public static final String SET_USER = "/rest/users/set/User";
	
	public static final String REGISTER_USER = "/rest/auth/register";
	public static final String PRE_REGISTER_USER = "/rest/auth/preregister";
	
	public static final String LOGIN = "/rest/auth/login";
	public static final String LOGOUT = "/rest/auth/logout";
	public static final String EMAIL_EXISTS = "/rest/auth/exists";
	public static final String PASSWORD_RESET = "/rest/auth/reset";
	public static final String CHANGE_PASSWORD_SPECIALIZED = "/rest/auth/set/password"; 
	public static final String REFRESH_TOKEN = "/rest/auth/refresh";
	
	
	// Calls related to storing, retrieving and removing 3rd party OAuth connections
	public static final String SET_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/set_third_party_token";
	public static final String HAS_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/has_third_party_token";
	public static final String REM_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/delete_third_party_token";

}
