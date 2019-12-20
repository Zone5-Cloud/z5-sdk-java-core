package com.zone5ventures.core;

import java.lang.reflect.Type;
import java.util.List;
import java.util.Map;

import com.google.gson.reflect.TypeToken;
import com.zone5ventures.core.activities.DataFileUploadIndex;
import com.zone5ventures.core.activities.DataFileUploadRecent;
import com.zone5ventures.core.activities.UserWorkoutResult;
import com.zone5ventures.core.activities.UserWorkoutResultAggregates;
import com.zone5ventures.core.activities.VActivity;
import com.zone5ventures.core.day.UserDay;
import com.zone5ventures.core.oauth.OAuthToken;
import com.zone5ventures.core.routes.UserRoute;
import com.zone5ventures.core.search.MappedResult;
import com.zone5ventures.core.search.MappedSearchResult;
import com.zone5ventures.core.search.SearchResult;
import com.zone5ventures.core.thirdpartyconnections.ThirdPartyTokenResponse;
import com.zone5ventures.core.users.User;

public class Types {

	public static final Type SEARCH_RESULT_ACTIVITIES = new TypeToken<MappedSearchResult<UserWorkoutResult>>(){}.getType();
	public static final Type SEARCH_RESULT_DAY = new TypeToken<MappedSearchResult<UserDay>>(){}.getType();
	public static final Type MAPPED_RESULT_ACTIVITIES = new TypeToken<MappedResult<UserWorkoutResult>>(){}.getType();
	public static final Type MAPPED_RESULT_AGGREGATES = new TypeToken<MappedResult<UserWorkoutResultAggregates>>(){}.getType();
	public static final Type LIST_RESULT_ACTIVITIES = new TypeToken<List<UserWorkoutResult>>(){}.getType();
	public static final Type LIST_RESULT_AGGREGATES = new TypeToken<List<UserWorkoutResultAggregates>>(){}.getType();
	public static final Type SEARCH_RESULT_ROUTES = new TypeToken<SearchResult<UserRoute>>(){}.getType();
	public static final Type DATAFILE_UPLOAD_INDEX = new TypeToken<DataFileUploadIndex>(){}.getType();
	public static final Type DATAFILE_STATUS_INDEX = new TypeToken<DataFileUploadRecent>(){}.getType();
	public static final Type ACTIVITY = new TypeToken<VActivity>(){}.getType();
	public static final Type RESULT_ROUTE = new TypeToken<UserRoute>(){}.getType();
	public static final Type USER = new TypeToken<User>(){}.getType();
	public static final Type MAP = new TypeToken<Map<String,Object>>(){}.getType();
	public static final Type BOOLEAN = new TypeToken<Boolean>(){}.getType();
	public static final Type OAUTHTOKEN = new TypeToken<OAuthToken>(){}.getType();
	public static final Type THIRD_PARTY_TOKEN_RESPONSE = new TypeToken<ThirdPartyTokenResponse>(){}.getType();
}
