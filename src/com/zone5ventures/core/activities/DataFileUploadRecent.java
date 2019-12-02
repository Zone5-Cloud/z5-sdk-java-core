package com.zone5ventures.core.activities;

import java.util.List;


public class DataFileUploadRecent {

	/** The next file to be processed / currently processing */
	private DataFileUploadIndex next;
	
	/** A collection of files which were recently uploaded or reprocessed */
	private List<DataFileUploadIndex> recent;
	
	public DataFileUploadRecent() { }

	public DataFileUploadIndex getNext() {
		return next;
	}

	public void setNext(DataFileUploadIndex next) {
		this.next = next;
	}

	public List<DataFileUploadIndex> getRecent() {
		return recent;
	}

	public void setRecent(List<DataFileUploadIndex> recent) {
		this.recent = recent;
	}
}
