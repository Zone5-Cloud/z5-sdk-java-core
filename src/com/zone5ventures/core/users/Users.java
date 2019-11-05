package com.zone5ventures.core.users;

public class Users {
	
	public static final String NEW_ACCESS_TOKEN = "/rest/oauth/access_token";
	public static final String ME = "/rest/users/me";
	
	// Calls related to storing, retrieving and removing 3rd party OAuth connections
	public static final String SET_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/set_third_party_token";
	public static final String HAS_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/has_third_party_token";
	public static final String REM_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/delete_third_party_token";

}
