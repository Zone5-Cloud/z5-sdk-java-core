
package com.zone5ventures.core.enums;

/** Various options for T-Score calculation */
public enum TScoreType {

	/** Cycling TSS power - normalized / avg / adjusted power is a seperate param */
	ctpp,
	
	/** Cycling TSS heart */
	ctph,
	
	/** Cycling Total cycling load score */ 
	tlc,
	
	/** Run Stryd TSS */
	rss,
	
	/** Run t-score power */
	rtpp,
	
	/** Run t-score pace */
	rtpa,
	
	/** Run t-score heart */
	rtph,
	
	/** Plain old heart rate zone trimp */
	trimp,
	
	/** Swim t-score pace */
	stpa;
}
