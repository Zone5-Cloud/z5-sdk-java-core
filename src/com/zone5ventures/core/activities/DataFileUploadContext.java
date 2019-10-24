package com.zone5ventures.core.activities;

import com.zone5ventures.core.enums.ActivityResultType;
import com.zone5ventures.core.enums.ActivityType;
import com.zone5ventures.core.enums.Equipment;
import com.zone5ventures.core.enums.WorkoutType;

public class DataFileUploadContext {

	/** The user id who this file belongs to */
	private Long userId;
	
	/** Override the sport type */
	private ActivityType sport;
				
	/** The original filename */
	private String filename;
	
	/** The activity type this file is to be associate with */
	private ActivityResultType activityType;
	
	/** The activity id this file is to be associated with */
	private Long activityId;
	
	/** Override the timestamps within this file to commence from this value */
	private Long startTs;
	
	/** Alternate display name */
	private String name;
			
	/** The equipment used for this activity */
	private Equipment equipment;
	
	/** The workout type for this activity */
	private WorkoutType workout;
				
	/** A HTTP/HTTPS URL we will call back when the file has been processed */
	private String callbackUrl;
	
	/** A bit mask of UserConnectionsType.java ordinals - which 3rd party sites should be try to upload this file to */
	private Long pushMask;
	
	public DataFileUploadContext() {}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public ActivityType getSport() {
		return sport;
	}

	public void setSport(ActivityType sport) {
		this.sport = sport;
	}

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public ActivityResultType getActivityType() {
		return activityType;
	}

	public void setActivityType(ActivityResultType activityType) {
		this.activityType = activityType;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public Long getStartTs() {
		return startTs;
	}

	public void setStartTs(Long startTs) {
		this.startTs = startTs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public WorkoutType getWorkout() {
		return workout;
	}

	public void setWorkout(WorkoutType workout) {
		this.workout = workout;
	}

	public String getCallbackUrl() {
		return callbackUrl;
	}

	public void setCallbackUrl(String callbackUrl) {
		this.callbackUrl = callbackUrl;
	}

	public Long getPushMask() {
		return pushMask;
	}

	public void setPushMask(Long pushMask) {
		this.pushMask = pushMask;
	}
}
