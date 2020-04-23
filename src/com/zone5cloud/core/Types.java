package com.zone5cloud.core;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.zone5cloud.core.activities.DataFileUploadIndex;
import com.zone5cloud.core.activities.DataFileUploadRecent;
import com.zone5cloud.core.activities.UserWorkoutResult;
import com.zone5cloud.core.activities.UserWorkoutResultAggregates;
import com.zone5cloud.core.activities.VActivity;
import com.zone5cloud.core.day.UserDay;
import com.zone5cloud.core.oauth.OAuthToken;
import com.zone5cloud.core.oauth.OAuthTokenAlt;
import com.zone5cloud.core.ride.UserScheduledActivity;
import com.zone5cloud.core.routes.UserRoute;
import com.zone5cloud.core.search.MappedResult;
import com.zone5cloud.core.search.MappedSearchResult;
import com.zone5cloud.core.search.SearchResult;
import com.zone5cloud.core.thirdpartyconnections.ThirdPartyTokenResponse;
import com.zone5cloud.core.users.LoginResponse;
import com.zone5cloud.core.users.User;
import com.zone5cloud.core.users.UserPreferences;
import com.zone5cloud.core.workouts.UserWorkoutSummary;

public class Types {

	public static final Type SEARCH_RESULT_ACTIVITIES = new TypeToken<MappedSearchResult<UserWorkoutResult>>(){}.getType();
	public static final Type SEARCH_RESULT_DAY = new TypeToken<MappedSearchResult<UserDay>>(){}.getType();
	public static final Type MAPPED_RESULT_ACTIVITIES = new TypeToken<MappedResult<UserWorkoutResult>>(){}.getType();
	public static final Type MAPPED_RESULT_AGGREGATES = new TypeToken<MappedResult<UserWorkoutResultAggregates>>(){}.getType();
	public static final Type LIST_RESULT_ACTIVITIES = new TypeToken<List<UserWorkoutResult>>(){}.getType();
	public static final Type LIST_RESULT_AGGREGATES = new TypeToken<List<UserWorkoutResultAggregates>>(){}.getType();
	public static final Type SEARCH_RESULT_ROUTES = new TypeToken<SearchResult<UserRoute>>(){}.getType();
	public static final Type SEARCH_RESULT_RIDES = new TypeToken<SearchResult<UserScheduledActivity>>(){}.getType();
	
	public static final Type DATAFILE_UPLOAD_INDEX = new TypeToken<DataFileUploadIndex>(){}.getType();
	public static final Type DATAFILE_STATUS_INDEX = new TypeToken<DataFileUploadRecent>(){}.getType();
	public static final Type ACTIVITY = new TypeToken<VActivity>(){}.getType();
	public static final Type RESULT_ROUTE = new TypeToken<UserRoute>(){}.getType();
	public static final Type RESULT_RIDE = new TypeToken<UserScheduledActivity>(){}.getType();
	public static final Type USER = new TypeToken<User>(){}.getType();
	public static final Type USER_PREFERENCES = new TypeToken<UserPreferences>(){}.getType();
	public static final Type LOGIN_RESPONSE = new TypeToken<LoginResponse>(){}.getType();
	public static final Type MAP = new TypeToken<Map<String,Object>>(){}.getType();
	public static final Type MAP_BOOLEAN = new TypeToken<Map<String,Boolean>>(){}.getType();
	public static final Type VOID = new TypeToken<Void>(){}.getType();
	public static final Type BOOLEAN = new TypeToken<Boolean>(){}.getType();
	public static final Type STRING = new TypeToken<String>(){}.getType();
	public static final Type OAUTHTOKEN = new TypeToken<OAuthToken>(){}.getType();
	public static final Type OAUTHTOKENALT = new TypeToken<OAuthTokenAlt>(){}.getType();
	public static final Type THIRD_PARTY_TOKEN_RESPONSE = new TypeToken<ThirdPartyTokenResponse>(){}.getType();
	public static final Type USER_WORKOUT_SUMMARY = new TypeToken<UserWorkoutSummary>(){}.getType();
}
