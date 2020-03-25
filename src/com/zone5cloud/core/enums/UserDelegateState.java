package com.zone5cloud.core.enums;

public enum UserDelegateState {

	/** A request is pending - the coach needs to accept this request */
	pending_coach,
	
	/** A request is pending - the client needs to accept this request */
	pending_client,
	
	/** The delegate relationship is active */
	active,
	
	/** The delegate relationship was cancelled or declined */
	declined
}
