package com.zone5ventures.core.enums;

public enum DataFileChannel {
	
	/** Power */
	pwr,					// 0
	
	/** Heart rate */
	bpm,					// 1
	
	/** Cadence */
	rpm,					// 2
	
	/** % Hb concentrate */
	mo2,					// 3
	
	/** Elevation / Altitude */
	alt,					// 4
	
	speed,					// 5
	
	temperature,			// 6
	
	balance,				// 7
	
	gears,					// 8
	
	/** torque / nm */
	nm,						// 9
	
	/** adjusted / normalized power */
	np,						// 10
			
	/** equated power */
	ep,						// 11
	
	/** The average wattage for each hr point */
	hrpwr,					// 12
	
	/** Simple running averages by km */
	perkm,					// 13
	
	/** Simple running averages by mi */
	permi,					// 14
	
	/** leg string stiffness */
	lss,					// 15
	
	/** pace */
	pace,					// 16
	
	geo,					// 17
	
	distance,				// 18
	
	/** The average pace at each hr point */
	hrpace,					// 19
	
	/** rs pod contact ms */
	contacttimems,			// 20
	
	/** rs pod impact G */
	impactg,				// 21
	
	/** rs pod braking G */
	brakingg,				// 22
	
	/** rs pod foot strike */
	footstrike,				// 23
	
	/** rs pronation degrees */
	pronation,				// 24
	
	/** ms */
	stancetime,				// 25
	
	/** mm */
	verticaloscillation,	// 26
	
	flow,					// 27
	
	respiration,			// 28
	
	grit;					// 29

}
