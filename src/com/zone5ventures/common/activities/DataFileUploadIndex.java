package com.zone5ventures.common.activities;

import com.zone5ventures.common.enums.FileUploadState;
import com.zone5ventures.common.users.User;

public class DataFileUploadIndex {
	
	private Long id;
	
	private Long resultId;
	
	private Long ts;
	
	private String filename;
	
	private FileUploadState state;
		
	private String message;
	
	private UserWorkoutResult result;
	
	private User user;
	
	private Long createdTime;
	
	private Long qTs;
	
	public DataFileUploadIndex() {}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getResultId() {
		return resultId;
	}

	public void setResultId(Long resultId) {
		this.resultId = resultId;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public FileUploadState getState() {
		return state;
	}

	public void setState(FileUploadState state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public UserWorkoutResult getResult() {
		return result;
	}

	public void setResult(UserWorkoutResult result) {
		this.result = result;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	public Long getqTs() {
		return qTs;
	}

	public void setqTs(Long qTs) {
		this.qTs = qTs;
	}
}
