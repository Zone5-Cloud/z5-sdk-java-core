package com.zone5ventures.common.activities;

import com.zone5ventures.common.enums.ActivityResultType;
import com.zone5ventures.common.enums.ActivityType;

public class VActivity {
	
	/** The unique activity id. This is also referenced as a workoutId, fileId or eventId. The id is unique when combined with the type below */
	private Long id;
	
	/** The type of activity this id related to. The type + id are unique */
	private ActivityResultType type;
	
	/** The sport type of this activity */
	private ActivityType sport;
	
	public VActivity() { }
	
	public VActivity(Long id, ActivityResultType type) { 
		this.id = id;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public ActivityType getSport() {
		return sport;
	}

	public void setSport(ActivityType sport) {
		this.sport = sport;
	}

	public ActivityResultType getType() {
		return type;
	}

	public void setType(ActivityResultType type) {
		this.type = type;
	}	
}
