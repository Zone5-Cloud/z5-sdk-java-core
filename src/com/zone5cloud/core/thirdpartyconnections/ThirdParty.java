package com.zone5cloud.core.thirdpartyconnections;

public class ThirdParty {
	public static final String SET_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/set_third_party_token";
	public static final String HAS_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/has_third_party_token";
	public static final String REM_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/delete_third_party_token";
	public static final String REGISTER_DEVICE_THIRD_PARTY_CONNECTION = "/rest/users/scheduled/activities/api/v1/push_registrations";
	public static final String DEREGISTER_DEVICE_THIRD_PARTY_CONNECTION = "/rest/users/scheduled/activities/api/v1/push_registrations/{token}";
	
	private ThirdParty() {}
}
