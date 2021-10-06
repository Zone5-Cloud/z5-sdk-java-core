package com.zone5cloud.core;

import java.util.List;

import com.zone5cloud.core.oauth.AuthToken;
import com.zone5cloud.core.terms.TermsAndConditions;

public interface Z5AuthorizationDelegate {
	void onAuthTokenUpdated(AuthToken token);
	void onTermsUpdated(List<TermsAndConditions> updatedTerms);
}
