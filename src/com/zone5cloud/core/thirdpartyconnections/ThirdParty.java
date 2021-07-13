package com.zone5cloud.core.thirdpartyconnections;

public class ThirdParty {
	@Deprecated
	public static final String SET_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/set_third_party_token";
	@Deprecated
	public static final String HAS_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/has_third_party_token";
	@Deprecated
	public static final String REM_THIRD_PARTY_CONNECTION = "/rest/users/connections/api/v1/live_activities/delete_third_party_token";
	
	public static final String REGISTER_DEVICE_THIRD_PARTY_CONNECTION = "/rest/users/scheduled/activities/api/v1/push_registrations";
	public static final String DEREGISTER_DEVICE_THIRD_PARTY_CONNECTION = "/rest/users/scheduled/activities/api/v1/push_registrations/{token}";

	public static final String INIT_CONNECTION_PAIRING = "/rest/users/connections/pair/{connectionType}";
	public static final String CONFIRM_CONNECTION_PAIRING ="/rest/files/{connectionType}/confirm";
	public static final String GET_CONNECTIONS = "/rest/users/connections/get";
	public static final String REVOKE_CONNECTION = "/rest/users/connections/rem/{connectionType}";

	private ThirdParty() {}
}
