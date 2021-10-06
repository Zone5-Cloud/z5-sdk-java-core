package com.zone5cloud.core;

import static org.junit.Assert.*;

import org.junit.Test;

import com.zone5cloud.core.utils.GsonManager;

public class TestZ5Error {

	@Test
	public void testErrorDecode() {
		Z5Error error = GsonManager.getInstance().fromJson("{\"error\":\"true\",\"message\":\"this is an error\"}", Types.ERROR);
		assertEquals("true", error.getError());
		assertEquals("this is an error", error.getMessage());
		assertNull(error.getErrors());
		assertNull(error.getErrorItem(0));
		
		error = GsonManager.getInstance().fromJson("{\"error\":\"true\",\"message\":\"this is an error\",\"errors\":[{\"field\":\"this is a field\",\"code\":123,\"message\":\"this is a message\"}]}", Types.ERROR);
		assertEquals("true", error.getError());
		assertEquals("this is an error", error.getMessage());
		assertEquals(1, error.getErrors().size());
		assertEquals("this is a field", error.getErrors().get(0).getField());
		assertEquals(123, error.getErrorItem(0).getCode().intValue());
		assertEquals("this is a message", error.getErrorItem(0).getMessage());
	}
	
	@Test
	public void testErrorSimplest() {
		Z5Error error = GsonManager.getInstance().fromJson("{\"message\":\"Unauthorized\"}", Types.ERROR);
		assertNotNull(error);
		assertEquals("Unauthorized", error.getMessage());
	}
	
	@Test
	public void testErrorTerms() {
		Z5Error error = GsonManager.getInstance().fromJson("{\"error\":\"true\",\"message\":\"this is an error\",\"errors\":[{\"field\":\"this is a field\",\"code\":401908,\"message\":\"failed terms\", \"metadata\":{\"required\":[\"terms1\", \"terms2\"]}}]}", Types.ERROR);
		assertEquals("terms1", error.getErrorItem(0).getMetadata().getRequiredTerms().get(0));
		assertEquals("terms2", error.getErrorItem(0).getMetadata().getRequiredTerms().get(1));
	}

}
