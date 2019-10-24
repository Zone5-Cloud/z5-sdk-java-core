package com.zone5ventures.core.activities;

import java.util.Arrays;

import com.zone5ventures.core.enums.ActivityResultType;
import com.zone5ventures.core.enums.RelativePeriod;
import com.zone5ventures.core.search.SearchInputReport;

public class Activities {
	
	public static final String SEARCH = "/rest/users/activities/search/{offset}/{count}";
	public static final String NEXT = "/rest/users/activities/page/{offset}/{count}";
	public static final String UPLOAD = "/rest/files/upload";
	public static final String DELETE = "/rest/users/activities/rem/{activityType}/{activityId}/false";
	public static final String FILE_INDEX_STATUS = "/rest/v2/files/get/{indexId}";
	
	public static final String DOWNLOAD_FIT = "/rest/files/download/{fileId}";
	
	public static final String DOWNLOAD_RAW3 = "/rest/users/activities/download/files/{fileId}/raw3";
	public static final String DOWNLOAD_CSV = "/rest/plans/files/csv/{fileId}";
	public static final String DOWNLOAD_MAP = "/rest/users/activities/map/{fileId}";
	
	public static final String TIME_IN_ZONE = "/rest/reports/activity/{zoneType}/get";
	
	public static final String PEAK_POWER = "/rest/reports/activity/maxpeaks/get";
	public static final String PEAK_HEARTRATE = "/rest/reports/activity/maxpeaksbpm/get";
	public static final String PEAK_WKG = "/rest/reports/activity/peakwkg/get";
	public static final String PEAK_PACE = "/rest/reports/activity/peakspace/get";
	public static final String PEAK_LSS = "/rest/reports/activity/peakslss/get";
	public static final String PEAK_LSSKG = "/rest/reports/activity/peakslsskg/get";	
	
	/** Return a SearchInputReport which can be used for reporting endpoints - ie time in zone for a given activity */
    public static SearchInputReport newInstance(ActivityResultType type, long activityId) {
    	SearchInputReport s = new SearchInputReport();
    	s.setOpts(3L);
    	s.setActivities(Arrays.asList(new VActivity(activityId, type)));
    	return s;
    }
    
    /** Return a SearchInputReport which can be used for peak curve reporting endpoionts. The reference period defines the comparison period to be included */
    public static SearchInputReport newInstancePeaksCurve(ActivityResultType type, long activityId, RelativePeriod referencePeriod) {
    	SearchInputReport s = newInstance(type, activityId);
    	if (referencePeriod != null) {
    		s.setReferences(Arrays.asList(referencePeriod));
    		s.setAlltime(true);
    	}    
    	return s;
    }
}
