package com.zone5ventures.core.activities;

import com.zone5ventures.core.enums.MappedFieldType;

public class UserWorkoutResultChannel {
	
	/** A nice field display name */
	private String name;
		
	/** The mapped field type */
	private MappedFieldType type;
		
	/** The native record number */
	private Integer num;
			
	public UserWorkoutResultChannel() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MappedFieldType getType() {
		return type;
	}

	public void setType(MappedFieldType type) {
		this.type = type;
	}

	public Integer getNum() {
		return num;
	}

	public void setNum(Integer num) {
		this.num = num;
	}
}
