package com.zone5cloud.core.oauth;

/**
 * @deprecated - please use OAuthToken
 * @author jean
 *
 */
@Deprecated
public class OAuthTokenAlt extends AuthToken {
	@Override
	public String getRefreshToken() {
		// there is no refresh on Gigya tokens
		return null;
	}
}
