package com.zone5cloud.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zone5cloud.core.activities.Activities;
import com.zone5cloud.core.terms.Terms;
import com.zone5cloud.core.users.Users;

public class TestEndpoints {

	@Test
	public void testRequiresAuth() {
		assertTrue(Endpoints.requiresAuth(Users.ME));
		assertTrue(Endpoints.requiresAuth(Activities.SEARCH));
		assertTrue(Endpoints.requiresAuth(Users.SET_PASSWORD));
		
		// this is the full list of non authenticated calls at this time. All others are true.
		assertFalse(Endpoints.requiresAuth(Users.LOGIN));
		assertFalse(Endpoints.requiresAuth(Users.NEW_ACCESS_TOKEN));
		assertFalse(Endpoints.requiresAuth(Users.PASSWORD_RESET));
		assertFalse(Endpoints.requiresAuth(Users.EMAIL_EXISTS));
		assertFalse(Endpoints.requiresAuth(Users.EMAIL_STATUS));
		assertFalse(Endpoints.requiresAuth(Users.TEST_PASSWORD));
		
		assertFalse(Endpoints.requiresAuth(Users.REFRESH_TOKEN));
		assertFalse(Endpoints.requiresAuth(Terms.REQUIRED));
		assertFalse(Endpoints.requiresAuth(Terms.DOWNLOAD));
		
		// SJ-23 Register can OPTIONALLY include auth bearer token header
		assertTrue(Endpoints.requiresAuth(Users.REGISTER_USER));
	}

}
