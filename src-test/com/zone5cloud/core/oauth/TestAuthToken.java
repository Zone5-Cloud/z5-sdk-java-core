package com.zone5cloud.core.oauth;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestAuthToken {

	@Test
	public void testExpiry() {
		OAuthToken token = new OAuthToken();
		token.setToken("123");
		assertFalse(token.isExpired());
		
		token.setRefreshToken("zxc");
		assertFalse(token.isExpired());
		
		token.setRefreshToken(null);
		token.setTokenExp(System.currentTimeMillis());
		assertTrue(token.isExpired());
		
		token.setRefreshToken("zxc");
		assertTrue(token.isExpired());
		
		token.setTokenExp(System.currentTimeMillis() + 60000);
		assertFalse(token.isExpired());
	}

	@Test
	public void testUsername() {
		OAuthToken token = new OAuthToken();
		token.setToken("123");
		assertNull(token.extractUsername());
		token.setToken("123.345");
		assertNull(token.extractUsername());
		
		token.setToken("eyJraWQiOiJiZUs4UFdWbElRMmRoWjRmOXdad0FRbGFNRXdKNzhRWEl6M01qUlVha1BJPSIsImFsZyI6IlJTMjU2In0.eyJzdWIiOiI5MGRmMmIxYi0xYzE2LTQyNzAtODE0YS0xMGY4NjE3ZjY3ZTYiLCJpc3MiOiJodHRwczpcL1wvY29nbml0by1pZHAudXMtd2VzdC0yLmFtYXpvbmF3cy5jb21cL3VzLXdlc3QtMl9ieE4xRTRQbmwiLCJjb2duaXRvOnVzZXJuYW1lIjoiOTBkZjJiMWItMWMxNi00MjcwLTgxNGEtMTBmODYxN2Y2N2U2IiwiZ2l2ZW5fbmFtZSI6IkplYW4iLCJsb2NhbGUiOiJlbl9BVSIsImF1ZCI6IjFlcjMyMjdzMW1pYTNwa3FybmdudGw0c3Y2IiwiZXZlbnRfaWQiOiI3ZmIyNDc0My03ZjM0LTQzMGMtYjlhMi0xY2NlZGM2Yzg4OGEiLCJ0b2tlbl91c2UiOiJpZCIsImF1dGhfdGltZSI6MTYwNjc4NDk1NSwiZXhwIjoxNjA2Nzg4NTU1LCJpYXQiOjE2MDY3ODQ5NTUsImZhbWlseV9uYW1lIjoiSGFsbCIsImVtYWlsIjoiamVhbisxNjA2Nzg0ODk3MDA5QHRvZGF5c3BsYW4ubmV0In0.kvxf-v2JaP6koMw6CmYPrOT1Ub_I7Txy4tdN9kmVfrpWv4BesJKM_c17a2A8H4E67wlKc47XAgOPsd_bRn1t0_uA6RgxnRi6S6CEAOJ7ElnQSX85QSvwSPCQuxbaA-_wSFDEHAN8ZKYXQlFyYebs7HtzP8UEiAe675l-giEBoJVdlEkeyQGNDkbSzCCXCSfrrwlJ8B1oF9tqCCY5lEXUMfEB7tS5lOkET4xYGFrhgbPL8Ldy0gYagSnKtC8tV1rXlU9cB8_G2yo_BiF6tw0kj1gm0HNh3XhN_zJGOGoGBYVq4p_we1a8cIIfvRBVeJc6UUvl2uDJ-pCY6A62lNCD7w");
		assertEquals("jean+1606784897009@todaysplan.net", token.extractUsername());
	}
	
	@Test
	public void Equality() {
		String token = "asd";
		String refresh = "zcc";
		long expiresAt = 777;
		
		OAuthToken token1 = new OAuthToken();
		token1.setToken(token);
		
		OAuthTokenAlt token2 = new OAuthTokenAlt();
		token2.setToken(token);
		
		// tokens are the same
		assertTrue(token1.equals(token2));
		assertTrue(token2.equals(token1));
		
		token1.setTokenExp(expiresAt);
		
		// expiry is different
		assertFalse(token1.equals(token2));
		assertFalse(token2.equals(token1));
		
		token2.setTokenExp(expiresAt);
		
		// expiry is the same
		assertTrue(token1.equals(token2));
		assertTrue(token2.equals(token1));
		
		token1.setRefreshToken(refresh);
		
		// refresh differs
		assertFalse(token1.equals(token2));
		assertFalse(token2.equals(token1));
	}
	
	@Test
	public void EqualityNulls() {
		OAuthToken token1 = new OAuthToken();
		token1.setToken("123");
		
		assertFalse(token1.equals(null));
		assertFalse(token1.equals(new Object()));
		
		token1.setToken(null);
		
		OAuthToken token2 = new OAuthToken();
		
		// assert the everything null case
		assertTrue(token1.equals(token2));
		assertTrue(token2.equals(token1));
		
		// assert false no exceptions when one is all nulls
		token2.setToken("123");
		token2.setRefreshToken("asd");
		token2.setTokenExp(77l);
		
		assertFalse(token1.equals(token2));
		assertFalse(token2.equals(token1));
	}
}
