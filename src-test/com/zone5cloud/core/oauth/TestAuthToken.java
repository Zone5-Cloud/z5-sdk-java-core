package com.zone5cloud.core.oauth;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import java.net.MalformedURLException;
import java.net.URL;

import org.junit.Test;

import com.zone5cloud.core.ClientConfig;
import com.zone5cloud.core.Types;
import com.zone5cloud.core.utils.DefaultLogger;
import com.zone5cloud.core.utils.GsonManager;
import com.zone5cloud.core.utils.ILogger;

public class TestAuthToken {

	@Test
	public void testExpiry() {
		OAuthToken token = new OAuthToken();
		token.setToken("123");
		
		assertFalse(token.isExpired());
		assertFalse(token.requiresRefresh()); // not refreshable
		
		token.setRefreshToken("zxc");
		assertFalse(token.isExpired());
		assertTrue(token.requiresRefresh()); // is refreshable and no tokenExp will prompt refresh
		
		token.setRefreshToken(null);
		token.setTokenExp(System.currentTimeMillis());
		assertTrue(token.isExpired());
		assertFalse(token.requiresRefresh()); // even though expired, not refreshable
		
		token.setRefreshToken("zxc");
		assertTrue(token.isExpired());
		assertTrue(token.requiresRefresh()); // refreshable and expired
		
		token.setTokenExp(System.currentTimeMillis() + 60000);
		assertFalse(token.isExpired());
		assertFalse(token.requiresRefresh()); // refreshable, but not expired
	}
	
	@Test
	public void Equality() {
		String token = "asd";
		String refresh = "zcc";
		long expiresAt = 777;
		
		OAuthToken token1 = new OAuthToken();
		token1.setToken(token);
		
		OAuthToken token2 = new OAuthToken();
		token2.setToken(token);
		
		// tokens are the same
		assertEquals(token1, token2);
		assertEquals(token2, token1);
		assertEquals(token1.hashCode(), token2.hashCode());
		
		token1.setTokenExp(expiresAt);
		
		// expiry is different
		assertNotEquals(token1, token2);
		assertNotEquals(token2, token1);
		assertNotEquals(token1.hashCode(), token2.hashCode());
		
		token2.setTokenExp(expiresAt);
		
		// expiry is the same
		assertEquals(token1, token2);
		assertEquals(token2, token1);
		assertEquals(token1.hashCode(), token2.hashCode());
		
		token1.setRefreshToken(refresh);
		
		// refresh differs
		assertNotEquals(token1, token2);
		assertNotEquals(token2, token1);
		assertNotEquals(token1.hashCode(), token2.hashCode());
		
	}
	
	@Test
	public void EqualityNulls() {
		OAuthToken token1 = new OAuthToken();
		token1.setToken("123");
		
		assertNotEquals(token1, null);
		assertNotEquals(token1, new Object());
		
		token1.setToken(null);
		
		OAuthToken token2 = new OAuthToken();
		
		// assert the everything null case
		assertEquals(token1, token2);
		assertEquals(token2, token1);
		
		// assert false no exceptions when one is all nulls
		token2.setToken("123");
		token2.setRefreshToken("asd");
		token2.setTokenExp(77l);
		
		assertNotEquals(token1, token2);
		assertNotEquals(token2, token1);
	}
	
	@SuppressWarnings("deprecation")
	@Test
	public void testDecode() {
		OAuthTokenAlt alt = new OAuthTokenAlt();
		alt.setToken("123");
		alt.setTokenExp(10l);
		String json = GsonManager.getInstance().toJson(alt);
		
		OAuthToken token = GsonManager.getInstance().fromJson(json, Types.OAUTHTOKEN);
		
		assertEquals("123", token.getToken());
		assertEquals(10l, token.getTokenExp().longValue());
	}
	
	@Test
	public void testSerialise() throws MalformedURLException {
		ClientConfig config = new ClientConfig();
		config.setClientID("testID");
		config.setClientSecret("testSecret");
		config.setUserName("test@username");
		config.setToken(new OAuthToken("test-token", "test-refresh", 40000l));
		config.setZone5BaseUrl(new URL("https://test.com"));
		config.setLogger(new DefaultLogger());
		
		String configStr = GsonManager.getInstance().toJson(config);
		
		ClientConfig decoded = GsonManager.getInstance().fromJson(configStr, ClientConfig.class);
		
		assertEquals("testID", decoded.getClientID());
		assertEquals("testSecret", decoded.getClientSecret());
		assertEquals("test@username", decoded.getUserName());
		assertEquals("test-token", decoded.getToken().getToken());
		assertEquals("test-refresh", decoded.getToken().getRefreshToken());
		assertEquals("https://test.com", decoded.getZone5BaseUrl().toString());
		assertEquals(40000l, decoded.getToken().getTokenExp().longValue());
		assertNull(decoded.getLogger()); // logger is transient
		
	}
}
