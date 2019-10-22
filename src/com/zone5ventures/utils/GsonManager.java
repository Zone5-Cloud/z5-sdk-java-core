package com.zone5ventures.utils;

import java.lang.reflect.Field;
import java.lang.reflect.Type;
import java.util.Base64;
import java.util.Locale;
import java.util.TimeZone;

import com.google.gson.ExclusionStrategy;
import com.google.gson.FieldAttributes;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.JsonPrimitive;
import com.google.gson.JsonSerializationContext;
import com.google.gson.JsonSerializer;

public class GsonManager {
	
	private static final Gson SINGLETON;
	private static final Gson SINGLETON_PRETTY;
	
	public static GsonBuilder decorate(GsonBuilder b) {
		b.setLenient();
		b.addDeserializationExclusionStrategy(new SuperclassExclusionStrategy());
	    b.addSerializationExclusionStrategy(new SuperclassExclusionStrategy());
	    b.registerTypeAdapter(TimeZone.class, new TimezoneSerializer());
	    b.registerTypeAdapter(Locale.class, new LocaleSerializer());
	    b.registerTypeAdapter(Double.class, new DoubleDeSeriaizer());
	    b.registerTypeAdapter(Integer.class, new IntegerDeSeriaizer());
	    b.registerTypeAdapter(Long.class, new LongDeSeriaizer());
	    b.registerTypeAdapter(Float.class, new FloatDeSeriaizer());
        b.registerTypeAdapter(byte[].class, new ByteArrayToBase64TypeAdapter());
        return b;		
	}
	
	static {
		GsonBuilder b = new GsonBuilder();
		b = decorate(b);
	    SINGLETON = b.create();
	    
	    b = new GsonBuilder();
	    b = decorate(b);
	    b.setPrettyPrinting();
	    SINGLETON_PRETTY = b.create();
	}
	
	public static Gson getInstance(boolean pretty) {
		return pretty ? SINGLETON_PRETTY : SINGLETON;
	}
	
	public static Gson getInstance() {
		return SINGLETON;
	}
	
	private GsonManager() {
		
	}
}

class ByteArrayToBase64TypeAdapter implements JsonSerializer<byte[]>, JsonDeserializer<byte[]> {
    public byte[] deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return Base64.getDecoder().decode(json.getAsString());
    }

    public JsonElement serialize(byte[] src, Type typeOfSrc, JsonSerializationContext context) {
        return new JsonPrimitive(Base64.getEncoder().encodeToString(src));
    }
}

class LocaleSerializer implements JsonDeserializer<Locale>, JsonSerializer<Locale> {
	
	@Override
	public Locale deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		if (json != null && !json.isJsonNull()) {
			
			String display = json.getAsString();
			
			if (display == null || display.trim().isEmpty())
				return null;
			
			for(Locale loc : Locale.getAvailableLocales()) {
				if (display.equals(loc.toString()))
					return loc;
			}
			
			for(Locale loc : Locale.getAvailableLocales()) {
				if (loc.getDisplayName().equals(display))
					return loc;
			}
			
			for(Locale loc : Locale.getAvailableLocales()) {
				if (loc.getDisplayLanguage().equals(display))
					return loc;
			}
			
			for(Locale loc : Locale.getAvailableLocales()) {
				if (loc.getDisplayCountry().equals(display))
					return loc;
			}
		}
			
		return null;
	}
  
	@Override
	public JsonElement serialize(Locale tz, Type typeOfT, JsonSerializationContext arg2) {
		if (tz != null)
			return new JsonPrimitive(tz.getDisplayName());
		return null;
	}
}

// Deal with empty strings being set as numbers
class DoubleDeSeriaizer implements JsonDeserializer<Double> {
	
	@Override
	public Double deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		try {
			if (json != null && !json.isJsonNull()) {
				if (json.getAsString().trim().length() == 0)
					return null;
				return json.getAsNumber().doubleValue();
			}
		} catch (Exception e) {
			
		}
		return null;
	}
}

class IntegerDeSeriaizer implements JsonDeserializer<Integer> {
	
	@Override
	public Integer deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		try {
			if (json != null && !json.isJsonNull()) {
				if (json.getAsString().trim().length() == 0)
					return null;
				return json.getAsNumber().intValue();
			}
		} catch (Exception e) {
			
		}
		return null;
	}
}

class LongDeSeriaizer implements JsonDeserializer<Long> {
	
	@Override
	public Long deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		try {
			if (json != null && !json.isJsonNull()) {
				if (json.getAsString().trim().length() == 0)
					return null;
				return json.getAsNumber().longValue();
			}
		} catch (Exception e) {
			
		}
		return null;
	}
}

class FloatDeSeriaizer implements JsonDeserializer<Float> {
	
	@Override
	public Float deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		try {
			if (json != null && !json.isJsonNull()) {
				if (json.getAsString().trim().length() == 0)
					return null;
				return json.getAsNumber().floatValue();
			}
		} catch (Exception e) {
			
		}
		return null;
	}
}

class TimezoneSerializer implements JsonDeserializer<TimeZone>, JsonSerializer<TimeZone> {
	
	@Override
	public TimeZone deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
		if (json != null && !json.isJsonNull())
			return TimeZone.getTimeZone(json.getAsString());
		return null;
	}
  
	@Override
	public JsonElement serialize(TimeZone tz, Type typeOfT, JsonSerializationContext arg2) {
		if (tz != null)
			return new JsonPrimitive(tz.getID());
		return null;
	}
}

class SuperclassExclusionStrategy implements ExclusionStrategy {
   
	@Override
	public boolean shouldSkipClass(Class<?> arg0) {
        return false;
    }

    @Override
	public boolean shouldSkipField(FieldAttributes fieldAttributes) {
        String fieldName = fieldAttributes.getName();
        Class<?> theClass = fieldAttributes.getDeclaringClass();

        return isFieldInSuperclass(theClass, fieldName);            
    }

    private boolean isFieldInSuperclass(Class<?> subclass, String fieldName) {
        Class<?> superclass = subclass.getSuperclass();
        Field field;

        while(superclass != null) {   
            field = getField(superclass, fieldName);

            if(field != null)
                return true;

            superclass = superclass.getSuperclass();
        }

        return false;
    }

    private Field getField(Class<?> theClass, String fieldName) {
        try
        {
            return theClass.getDeclaredField(fieldName);
        }
        catch(Exception e)
        {
            return null;
        }
    }
}