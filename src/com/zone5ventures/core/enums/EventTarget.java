package com.zone5ventures.core.enums;

/** The importance of an event */
public enum EventTarget {
	
	/** This is a high importance target event - pull out all the stops to hit this event */
	high,
	
	/** This is a medium importance event - best effort to be prepared for this event */
	med,
	
	/** This is a low importance event - train through it and don't care about results */
	low
}
