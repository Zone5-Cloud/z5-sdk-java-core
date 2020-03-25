package com.zone5cloud.core.activities;

public class UserWorkoutResultExt2 {
	/** Respiration - breaths/minute */
	private Short avgResp; 
	
	/** Respiration - breaths/minute */
	private Short maxResp;
	
	/** 0-20+ Garmin MTB dynamics - Flow (double) (0-1 - Smooth, 1-20 Moderate, 20+ rough */
	private Float avgFlow; 
	
	/** 0-20+ Garmin MTB dynamics - Flow (double) (0-1 - Smooth, 1-20 Moderate, 20+ rough */
	private Float maxFlow; 
	
	/** 0-40+ Garmin MTB dynamics - Grit (sum this and /1000) - 0-20 (Easy), 20-40 (moderate), Hard 40+ */
	private Integer avgGrit; //
	
	/** 0-40+ Garmin MTB dynamics - Grit (sum this and /1000) - 0-20 (Easy), 20-40 (moderate), Hard 40+ */
	private Integer maxGrit; 

	/** kGrit - Sum of Garmin MTB dynamics Grit */
	private Integer sumGrit; // kGrit
	
	/** Calories consumed */
	private Integer caloriesIn;
	
	/** Calories deficient - calories in - calories out */
	private Integer caloriesDiff; // calories in - calories out
	
	/** Fluid loss (milliliter) */
	private Integer fluidOut;
	
	/** Fluid consumed (milliliter) */
	private Integer fluidIn;
	
	
	/** Fluid deficient - fluid in - fluid out (milliliter) */
	private Integer fluidDiff; 
	
	public UserWorkoutResultExt2() {}

	public Short getAvgResp() {
		return avgResp;
	}

	public void setAvgResp(Short avgResp) {
		this.avgResp = avgResp;
	}

	public Short getMaxResp() {
		return maxResp;
	}

	public void setMaxResp(Short maxResp) {
		this.maxResp = maxResp;
	}

	public Float getAvgFlow() {
		return avgFlow;
	}

	public void setAvgFlow(Float avgFlow) {
		this.avgFlow = avgFlow;
	}

	public Float getMaxFlow() {
		return maxFlow;
	}

	public void setMaxFlow(Float maxFlow) {
		this.maxFlow = maxFlow;
	}

	public Integer getAvgGrit() {
		return avgGrit;
	}

	public void setAvgGrit(Integer avgGrit) {
		this.avgGrit = avgGrit;
	}

	public Integer getMaxGrit() {
		return maxGrit;
	}

	public void setMaxGrit(Integer maxGrit) {
		this.maxGrit = maxGrit;
	}

	public Integer getSumGrit() {
		return sumGrit;
	}

	public void setSumGrit(Integer sumGrit) {
		this.sumGrit = sumGrit;
	}

	public Integer getCaloriesIn() {
		return caloriesIn;
	}

	public void setCaloriesIn(Integer caloriesIn) {
		this.caloriesIn = caloriesIn;
	}

	public Integer getCaloriesDiff() {
		return caloriesDiff;
	}

	public void setCaloriesDiff(Integer caloriesDiff) {
		this.caloriesDiff = caloriesDiff;
	}

	public Integer getFluidOut() {
		return fluidOut;
	}

	public void setFluidOut(Integer fluidOut) {
		this.fluidOut = fluidOut;
	}

	public Integer getFluidIn() {
		return fluidIn;
	}

	public void setFluidIn(Integer fluidIn) {
		this.fluidIn = fluidIn;
	}

	public Integer getFluidDiff() {
		return fluidDiff;
	}

	public void setFluidDiff(Integer fluidDiff) {
		this.fluidDiff = fluidDiff;
	}

}
