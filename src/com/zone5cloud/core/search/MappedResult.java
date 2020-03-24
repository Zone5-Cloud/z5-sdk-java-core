package com.zone5cloud.core.search;

import java.util.List;

public class MappedResult<R> {
	
	// private Map<String,MappedField> fields;
		
	/** The collection of sorted results */
	private List<R> results;
	
	public MappedResult() {
		
	}

	public List<R> getResults() {
		return results;
	}

	public void setResults(List<R> results) {
		this.results = results;
	}
	
	
}
