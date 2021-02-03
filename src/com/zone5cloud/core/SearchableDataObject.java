package com.zone5cloud.core;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public abstract class SearchableDataObject {
	/**
	 * Get the list of all field names that can be selected in a search
	 * @return the list of field names that can be selected in a search
	 */
	public List<String> getFieldNames() {
		return getFieldNames(null);
	}
	
	public List<String> getFieldNames(String prefix) {
		List<String> fieldNames = new ArrayList<String>();
		Field[] fields = this.getClass().getDeclaredFields();
		
		for(Field f: fields) {
			fieldNames.add((prefix != null ? prefix + "." : "") + f.getName());
		}
		
		return fieldNames;
	}
}
