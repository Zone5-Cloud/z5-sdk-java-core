package com.zone5ventures.common.enums;

public enum ActivityType {
	ride,
	run,
	swim,
	brick,
	xtrain,
	xcski,
	row,
	gym,
	walk,
	yoga,
	other,
		
	// a special case we use for tagging an outer activity file
	multisport,
	// a special case for tagging transitions in tri files
	transition;
}
