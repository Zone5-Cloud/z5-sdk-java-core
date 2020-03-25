package com.zone5cloud.core.enums;

/** The formula we use for estimating / calculating threshold */
public enum PowerThresholdType {

	/** FTP - take a peak X power and multiply by an adjustment to normalize to a peak 60min */
	ftp,
	
	/** Critical power - use a n point regression line to calculate a theoretical sustainable power */
	cp,
	
	/** 40 minute power */
	fp,
	
	none; // disabled
}
