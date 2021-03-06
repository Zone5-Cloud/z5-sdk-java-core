package com.zone5cloud.core.activities;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TimeZone;

import com.zone5cloud.core.enums.ActivityResultType;
import com.zone5cloud.core.enums.ActivityType;
import com.zone5cloud.core.enums.RelativePeriod;
import com.zone5cloud.core.search.DateRange;
import com.zone5cloud.core.search.SearchInput;
import com.zone5cloud.core.search.SearchInputReport;

public class Activities {
	
	public static final String SEARCH = "/rest/users/activities/search/{offset}/{count}";
	public static final String NEXT = "/rest/users/activities/page/{offset}/{count}";
	public static final String UPLOAD = "/rest/files/upload";
	public static final String DELETE = "/rest/users/activities/rem/{activityType}/{activityId}/false";
	public static final String UPDATE = "/rest/users/activities/set";
	
	public static final String FILE_INDEX_STATUS = "/rest/v2/files/get/{indexId}";
	public static final String FILE_INDEX_DOWNLOAD = "/rest/v2/files/download/{indexId}";
	public static final String FILE_INDEX_CANCEL = "/rest/v2/files/rem/{indexId}";
	public static final String FILE_INDEX_RETRY = "/rest/v2/files/retry/{indexId}";
	public static final String FILE_INDEX_STATUS_RECENT = "/rest/v2/files/get/data/user/{userId}/{secs}";

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
	
	public static final String METRICS = "/rest/reports/metrics/summary/get";
	
	// Specialized only - set/delete bikeId
	public static final String SET_BIKE = "/rest/users/activities/set/bike/{activityType}/{activityId}/{bikeId}";
	public static final String REM_BIKE = "/rest/users/activities/rem/bike/{activityType}/{activityId}";
	
	
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
    
    public static SearchInput<SearchInputReport> newInstanceMetrics(ActivityType sport, List<Long> userIds, List<DateRange> ranges, List<String> fields) {
    	
    	if (sport == null)
    		throw new NullPointerException("sport is a required field");
		
		if (userIds == null || userIds.isEmpty())
			throw new NullPointerException("At least one userId must be set");
		
		if (fields == null || fields.isEmpty())
			throw new NullPointerException("At least one field must be set");
		
		if (ranges == null)
			ranges = new ArrayList<>(1);
		
		if (ranges.isEmpty())
			ranges.add(new DateRange(0L, System.currentTimeMillis(), TimeZone.getDefault().getID()));
		
		SearchInput<SearchInputReport> s = new SearchInput<>();
		s.setCriteria(new SearchInputReport());
		
		s.setOpts(3L);
		s.setFields(fields);
		
		s.getCriteria().setUserIds(userIds);
		s.getCriteria().setRanges(ranges);
		s.getCriteria().setType(sport);
		
		return s;
    }
    
    /** 
     * Build a metrics API query grouped by bike uuids - ie get summary stats by bike 
     * 
     * sport can not be null
     * ranges can be null or empty - will default to all time
     * fields should not be null or empty
     * bikeUids should not be null or empty
     * */
    public static SearchInput<SearchInputReport> newInstanceMetricsBikes(List<DateRange> ranges, List<String> fields, List<String> bikeUids) {
    	    	
    	if (fields == null || fields.isEmpty())
    		throw new NullPointerException("At least one field must be set");
    	
    	if (bikeUids == null || bikeUids.isEmpty())
    		throw new NullPointerException("At least one bike uuid must be set");
    	
    	SearchInput<SearchInputReport> s = new SearchInput<>();
    	s.setCriteria(new SearchInputReport());
		s.setOpts(3L);
		s.setFields(fields);
		s.getCriteria().setRanges(ranges == null || ranges.isEmpty() ? null : ranges);
		s.getCriteria().setType(ActivityType.ride);
		s.getCriteria().setBikeUids(bikeUids);
		s.getCriteria().setGroupBy("bike.bikeUuid");
		
		return s;
    }
    
    private Activities() {}
}
