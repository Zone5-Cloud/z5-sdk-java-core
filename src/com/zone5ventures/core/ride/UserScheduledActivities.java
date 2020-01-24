package com.zone5ventures.core.ride;

public class UserScheduledActivities {

	public static final String SEARCH 		= "/rest/users/scheduled/activities/search/{offset}/{count}";
	public static final String NEXT 		= "/rest/users/scheduled/activities/page/{offset}/{count}";
	
	public static final String ADD 			= "/rest/users/scheduled/activities";
	public static final String GET 			= "/rest/users/scheduled/activities/{id}";
	public static final String GET_DETAILED = "/rest/users/scheduled/activities/{id}/detailed";
	public static final String UPDATE 		= "/rest/users/scheduled/activities/{id}";
	public static final String DELETE 		= "/rest/users/scheduled/activities/{id}";
	
	public static final String UPLOAD_IMAGE = "/rest/users/scheduled/activities/{id}/{field}";
	public static final String DELETE_IMAGE = "/rest/users/scheduled/activities/{id}/{field}";
	
	public static final String MAP 			= "/rest/users/scheduled/activities/map/{id}";

}


