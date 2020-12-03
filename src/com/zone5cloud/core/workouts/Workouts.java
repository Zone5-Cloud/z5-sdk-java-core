package com.zone5cloud.core.workouts;

public class Workouts {

	public static final String ADD_USER_WORKOUT = "/rest/user/workouts/add";
	public static final String ASSOCIATE_WORKOUT = "/rest/users/activities/associate/{fileId}/workouts/{workoutId}";
	public static final String DISASSOCIATE_WORKOUT_BY_FILEID = "/rest/users/activities/disassociate/files/{fileId}";
	
	private Workouts() {}
}
