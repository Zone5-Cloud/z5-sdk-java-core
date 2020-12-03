package com.zone5cloud.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zone5cloud.core.activities.Activities;
import com.zone5cloud.core.users.Users;

public class TestEndpoints {

	@Test
	public void testRequiresAuth() {
		assertTrue(Endpoints.requiresAuth(Users.ME));
		assertTrue(Endpoints.requiresAuth(Activities.SEARCH));
		assertTrue(Endpoints.requiresAuth(Users.CHANGE_PASSWORD_SPECIALIZED));
		
		// this is the full list of non authenticated calls at this time. All others are true.
		assertFalse(Endpoints.requiresAuth(Users.LOGIN));
		assertFalse(Endpoints.requiresAuth(Users.NEW_ACCESS_TOKEN));
		assertFalse(Endpoints.requiresAuth(Users.PASSWORD_RESET));
		assertFalse(Endpoints.requiresAuth(Users.EMAIL_EXISTS));
		assertFalse(Endpoints.requiresAuth(Users.EMAIL_STATUS));
		assertFalse(Endpoints.requiresAuth(Users.REGISTER_USER));
	}

}