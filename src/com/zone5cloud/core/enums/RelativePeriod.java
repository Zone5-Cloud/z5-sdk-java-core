package com.zone5cloud.core.enums;

public enum RelativePeriod {
	
	/** Relative to the all time best - excluding the current activity/period */
	alltime,
	
	/** Relative to the all time best - including the current activity/period */
	bestever,
	
	/** Relative to the time up until this activity/period */
	todate,
	
	/** Relative to the time up until this activity/period minus 1 year */
	todatelastyear,
	
	/** Relative to the given range */
	thisrange,
	
	/** Relative to the given range minus 1 year */
	thisrangelastyear,
	
	/** Relative to the last 28 days prior to this activity/period */
	last28days,
	
	/** Relative to the last 3 months prior to this activity/period */
	last3months,
	
	/** Relative to the last 6 months prior to this activity/period */
	last6months,
	
	/** Relative to the last 12 months prior to this activity/period */
	last12months,
	
	/** Relative to the last 7 days prior to this activity/period */
	last7days;
}
