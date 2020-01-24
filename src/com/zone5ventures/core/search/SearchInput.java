package com.zone5ventures.core.search;

import java.util.ArrayList;
import java.util.List;

import com.zone5ventures.core.utils.BitwiseUtils;


public class SearchInput<S> {

	/** The actual search criteria */
	private S criteria;
	
	/** A list of dotted field paths to be returned in the response */
	private List<String> fields;
	
	private List<Long> ids;
	
	private String ctx;
	
	// MappedFieldSearchOptions.java bit mask
	/** A bitmask of extra options. Set bit 0 to not return field schema info in the response. Set bit 2 to disable server side decoration */
	private Long opts;
	
	public SearchInput() { }
	
	public SearchInput(S criteria) { 
		this.criteria = criteria; 
		this.fields = new ArrayList<>();
		this.opts = BitwiseUtils.set(0L, 0); // disable including the schema definition in the response
	}

	public S getCriteria() {
		return criteria;
	}

	public void setCriteria(S criteria) {
		this.criteria = criteria;
	}

	public List<String> getFields() {
		return fields;
	}

	public void setFields(List<String> fields) {
		this.fields = fields;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public String getCtx() {
		return ctx;
	}

	public void setCtx(String ctx) {
		this.ctx = ctx;
	}

	public Long getOpts() {
		return opts;
	}

	public void setOpts(Long opts) {
		this.opts = opts;
	}
}
