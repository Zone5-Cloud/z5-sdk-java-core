package com.zone5ventures.core.search;

import java.util.List;

public class SearchResult<R> {
	
	/** Total number of results available */
	private Integer cnt;
		
	/** The offset where the paginated results were returned from */
	private Integer offset;
		
	/** The paginated result set */
	private List<R> results;
	
	public SearchResult() { }

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

	public List<R> getResults() {
		return results;
	}

	public void setResults(List<R> results) {
		this.results = results;
	}
}
