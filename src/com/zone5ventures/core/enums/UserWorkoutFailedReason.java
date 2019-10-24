package com.zone5ventures.core.enums;

/** Reasons for not completing a workout */
public enum UserWorkoutFailedReason 
{
	/** workout not completed due to weather */
	weather,
	
	/** workout not completed due to accumulated fatigue */
	fatigue,
	
	/** workout not completed due to injury */
	injury,
	
	/** workout not completed due to health - cold/flu etc */
	health,
	
	/** workout not completed due to misc "life" committments */
	life,
	
	/** workout not completed due to equipment failure */
	equipment;
}
