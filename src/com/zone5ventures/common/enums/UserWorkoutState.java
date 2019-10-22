package com.zone5ventures.common.enums;

/** The state of a workout being completed */
public enum UserWorkoutState {
	/** Workout has been completed */
	completed,
	
	/** Workout is yet to be completed or acknowledged */
	pending,
	
	/** Did not attempt / did not start */
	dns,
	
	/** Did not finish / incomplete */
	dnf
}
