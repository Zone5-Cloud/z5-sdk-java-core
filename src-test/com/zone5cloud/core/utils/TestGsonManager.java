package com.zone5cloud.core.utils;

import static org.junit.Assert.assertEquals;

import java.lang.reflect.Type;

import org.junit.Test;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class TestGsonManager {

	class TestModel {
		TestModel(int i) {
			object = i;
		}
		private Integer object;
		public Integer getObject() { return object; }
		public void setObject(Integer obj) { this.object = obj; }
	}
	
	/** all TestModel objects serialize and deserialize to a constant */
	class TestSerializer implements JsonDeserializer<TestModel>, JsonSerializer<TestModel> { 
		
		@Override
		public JsonElement serialize(TestModel src, Type typeOfSrc, JsonSerializationContext context) {
			return new JsonPrimitive(55);
		}
		
		@Override
		public TestModel deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) {
			return new TestModel(55);
		}
	}
	
	@Test
	public void testRegister() {
		// test that we can override the gson serialisation
		GsonManager.registerTypeAdapter(TestModel.class, new TestSerializer());
		
		assertEquals("55", GsonManager.getInstance().toJson(new TestModel(6)));
	}

}
