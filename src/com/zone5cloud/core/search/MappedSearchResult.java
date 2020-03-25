package com.zone5cloud.core.search;

public class MappedSearchResult<R> {
	
	/** Total number of results available */
	private Integer cnt;
	
	/** This result set offset index */
	private Integer offset;
	
	/** The results */
	private MappedResult<R> result;
	
	public MappedSearchResult() {
		
	}

	public Integer getCnt() {
		return cnt;
	}

	public void setCnt(Integer cnt) {
		this.cnt = cnt;
	}

	public Integer getOffset() {
		return offset;
	}

	public void setOffset(Integer offset) {
		this.offset = offset;
	}

	public MappedResult<R> getResult() {
		return result;
	}

	public void setResult(MappedResult<R> result) {
		this.result = result;
	}	
}
	
