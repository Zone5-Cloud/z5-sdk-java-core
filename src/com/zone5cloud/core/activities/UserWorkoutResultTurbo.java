package com.zone5cloud.core.activities;

import com.zone5cloud.core.SearchableDataObject;

public class UserWorkoutResultTurbo extends SearchableDataObject {
	
	private String product; // ie file_id.product_name --> SPECIALIZED_WSBC601160149N
	
	private Integer numAssistChanges;
	
	private Integer avgMotorPower;
	private Integer maxMotorPower;
	
	private Integer minMotorTemp;
	private Integer avgMotorTemp;
	private Integer maxMotorTemp;
	
	private Integer minBattery1;
	private Integer avgBattery1;
	private Integer maxBattery1;
	
	private Integer minBattery2;
	private Integer avgBattery2;
	private Integer maxBattery2;

	private Integer minBatteryWh1;
	private Integer avgBatteryWh1;
	private Integer maxBatteryWh1;
	
	private Integer minBatteryWh2;
	private Integer avgBatteryWh2;
	private Integer maxBatteryWh2;
	
	private Integer minProfileScale;
	private Integer avgProfileScale;
	private Integer maxProfileScale;
	
	private Integer minCurrentScale;
	private Integer avgCurrentScale;
	private Integer maxCurrentScale;
	
	private Double avgSupportFactor;
	private Double maxSupportFactor;
	
	private Integer minAssist;
	private Integer avgAssist;
	private Integer maxAssist;
	
	// Percentage time in this mode
	private Double timeInAssist0P;
	private Double timeInAssist1P;
	private Double timeInAssist2P;
	private Double timeInAssist3P;
	private Double timeInAssist4P;
	private Double timeInAssist5P;
	private Double timeInAssist6P;
	
	// Cumulative % decay per assist mode
	private Integer bat1DecayAssist0P;
	private Integer bat1DecayAssist1P;
	private Integer bat1DecayAssist2P;
	private Integer bat1DecayAssist3P;
	private Integer bat1DecayAssist4P;
	private Integer bat1DecayAssist5P;
	private Integer bat1DecayAssist6P;
	
	// Cumulative % decay per assist mode
	private Integer bat2DecayAssist0P;
	private Integer bat2DecayAssist1P;
	private Integer bat2DecayAssist2P;
	private Integer bat2DecayAssist3P;
	private Integer bat2DecayAssist4P;
	
	private Integer bat2DecayAssist5P;
	private Integer bat2DecayAssist6P;

	public UserWorkoutResultTurbo() { }

	public String getProduct() {
		return product;
	}

	public void setProduct(String product) {
		this.product = product;
	}

	public Integer getAvgMotorPower() {
		return avgMotorPower;
	}

	public void setAvgMotorPower(Integer avgMotorPower) {
		this.avgMotorPower = avgMotorPower;
	}

	public Integer getMaxMotorPower() {
		return maxMotorPower;
	}

	public void setMaxMotorPower(Integer maxMotorPower) {
		this.maxMotorPower = maxMotorPower;
	}

	public Integer getMinMotorTemp() {
		return minMotorTemp;
	}

	public void setMinMotorTemp(Integer minMotorTemp) {
		this.minMotorTemp = minMotorTemp;
	}

	public Integer getAvgMotorTemp() {
		return avgMotorTemp;
	}

	public void setAvgMotorTemp(Integer avgMotorTemp) {
		this.avgMotorTemp = avgMotorTemp;
	}

	public Integer getMaxMotorTemp() {
		return maxMotorTemp;
	}

	public void setMaxMotorTemp(Integer maxMotorTemp) {
		this.maxMotorTemp = maxMotorTemp;
	}

	public Integer getMinBattery1() {
		return minBattery1;
	}

	public void setMinBattery1(Integer minBattery1) {
		this.minBattery1 = minBattery1;
	}

	public Integer getAvgBattery1() {
		return avgBattery1;
	}

	public void setAvgBattery1(Integer avgBattery1) {
		this.avgBattery1 = avgBattery1;
	}

	public Integer getMaxBattery1() {
		return maxBattery1;
	}

	public void setMaxBattery1(Integer maxBattery1) {
		this.maxBattery1 = maxBattery1;
	}

	public Integer getMinBattery2() {
		return minBattery2;
	}

	public void setMinBattery2(Integer minBattery2) {
		this.minBattery2 = minBattery2;
	}

	public Integer getAvgBattery2() {
		return avgBattery2;
	}

	public void setAvgBattery2(Integer avgBattery2) {
		this.avgBattery2 = avgBattery2;
	}

	public Integer getMaxBattery2() {
		return maxBattery2;
	}

	public void setMaxBattery2(Integer maxBattery2) {
		this.maxBattery2 = maxBattery2;
	}

	public Integer getMinProfileScale() {
		return minProfileScale;
	}

	public void setMinProfileScale(Integer minProfileScale) {
		this.minProfileScale = minProfileScale;
	}

	public Integer getAvgProfileScale() {
		return avgProfileScale;
	}

	public void setAvgProfileScale(Integer avgProfileScale) {
		this.avgProfileScale = avgProfileScale;
	}

	public Integer getMaxProfileScale() {
		return maxProfileScale;
	}

	public void setMaxProfileScale(Integer maxProfileScale) {
		this.maxProfileScale = maxProfileScale;
	}

	public Integer getMinCurrentScale() {
		return minCurrentScale;
	}

	public void setMinCurrentScale(Integer minCurrentScale) {
		this.minCurrentScale = minCurrentScale;
	}

	public Integer getAvgCurrentScale() {
		return avgCurrentScale;
	}

	public void setAvgCurrentScale(Integer avgCurrentScale) {
		this.avgCurrentScale = avgCurrentScale;
	}

	public Integer getMaxCurrentScale() {
		return maxCurrentScale;
	}

	public void setMaxCurrentScale(Integer maxCurrentScale) {
		this.maxCurrentScale = maxCurrentScale;
	}

	public Double getAvgSupportFactor() {
		return avgSupportFactor;
	}

	public void setAvgSupportFactor(Double avgSupportFactor) {
		this.avgSupportFactor = avgSupportFactor;
	}

	public Double getMaxSupportFactor() {
		return maxSupportFactor;
	}

	public void setMaxSupportFactor(Double maxSupportFactor) {
		this.maxSupportFactor = maxSupportFactor;
	}

	public Integer getNumAssistChanges() {
		return numAssistChanges;
	}

	public void setNumAssistChanges(Integer numAssistChanges) {
		this.numAssistChanges = numAssistChanges;
	}

	public Integer getMinBatteryWh1() {
		return minBatteryWh1;
	}

	public void setMinBatteryWh1(Integer minBatteryWh1) {
		this.minBatteryWh1 = minBatteryWh1;
	}

	public Integer getAvgBatteryWh1() {
		return avgBatteryWh1;
	}

	public void setAvgBatteryWh1(Integer avgBatteryWh1) {
		this.avgBatteryWh1 = avgBatteryWh1;
	}

	public Integer getMaxBatteryWh1() {
		return maxBatteryWh1;
	}

	public void setMaxBatteryWh1(Integer maxBatteryWh1) {
		this.maxBatteryWh1 = maxBatteryWh1;
	}

	public Integer getMinBatteryWh2() {
		return minBatteryWh2;
	}

	public void setMinBatteryWh2(Integer minBatteryWh2) {
		this.minBatteryWh2 = minBatteryWh2;
	}

	public Integer getAvgBatteryWh2() {
		return avgBatteryWh2;
	}

	public void setAvgBatteryWh2(Integer avgBatteryWh2) {
		this.avgBatteryWh2 = avgBatteryWh2;
	}

	public Integer getMaxBatteryWh2() {
		return maxBatteryWh2;
	}

	public void setMaxBatteryWh2(Integer maxBatteryWh2) {
		this.maxBatteryWh2 = maxBatteryWh2;
	}

	public Integer getMinAssist() {
		return minAssist;
	}

	public void setMinAssist(Integer minAssist) {
		this.minAssist = minAssist;
	}

	public Integer getAvgAssist() {
		return avgAssist;
	}

	public void setAvgAssist(Integer avgAssist) {
		this.avgAssist = avgAssist;
	}

	public Integer getMaxAssist() {
		return maxAssist;
	}

	public void setMaxAssist(Integer maxAssist) {
		this.maxAssist = maxAssist;
	}

	public Double getTimeInAssist0P() {
		return timeInAssist0P;
	}

	public void setTimeInAssist0P(Double timeInAssist0P) {
		this.timeInAssist0P = timeInAssist0P;
	}

	public Double getTimeInAssist1P() {
		return timeInAssist1P;
	}

	public void setTimeInAssist1P(Double timeInAssist1P) {
		this.timeInAssist1P = timeInAssist1P;
	}

	public Double getTimeInAssist2P() {
		return timeInAssist2P;
	}

	public void setTimeInAssist2P(Double timeInAssist2P) {
		this.timeInAssist2P = timeInAssist2P;
	}

	public Double getTimeInAssist3P() {
		return timeInAssist3P;
	}

	public void setTimeInAssist3P(Double timeInAssist3P) {
		this.timeInAssist3P = timeInAssist3P;
	}

	public Double getTimeInAssist4P() {
		return timeInAssist4P;
	}

	public void setTimeInAssist4P(Double timeInAssist4P) {
		this.timeInAssist4P = timeInAssist4P;
	}

	public Integer getBat1DecayAssist0P() {
		return bat1DecayAssist0P;
	}

	public void setBat1DecayAssist0P(Integer bat1DecayAssist0P) {
		this.bat1DecayAssist0P = bat1DecayAssist0P;
	}

	public Integer getBat1DecayAssist1P() {
		return bat1DecayAssist1P;
	}

	public void setBat1DecayAssist1P(Integer bat1DecayAssist1P) {
		this.bat1DecayAssist1P = bat1DecayAssist1P;
	}

	public Integer getBat1DecayAssist2P() {
		return bat1DecayAssist2P;
	}

	public void setBat1DecayAssist2P(Integer bat1DecayAssist2P) {
		this.bat1DecayAssist2P = bat1DecayAssist2P;
	}

	public Integer getBat1DecayAssist3P() {
		return bat1DecayAssist3P;
	}

	public void setBat1DecayAssist3P(Integer bat1DecayAssist3P) {
		this.bat1DecayAssist3P = bat1DecayAssist3P;
	}

	public Integer getBat1DecayAssist4P() {
		return bat1DecayAssist4P;
	}

	public void setBat1DecayAssist4P(Integer bat1DecayAssist4P) {
		this.bat1DecayAssist4P = bat1DecayAssist4P;
	}

	public Integer getBat2DecayAssist0P() {
		return bat2DecayAssist0P;
	}

	public void setBat2DecayAssist0P(Integer bat2DecayAssist0P) {
		this.bat2DecayAssist0P = bat2DecayAssist0P;
	}

	public Integer getBat2DecayAssist1P() {
		return bat2DecayAssist1P;
	}

	public void setBat2DecayAssist1P(Integer bat2DecayAssist1P) {
		this.bat2DecayAssist1P = bat2DecayAssist1P;
	}

	public Integer getBat2DecayAssist2P() {
		return bat2DecayAssist2P;
	}

	public void setBat2DecayAssist2P(Integer bat2DecayAssist2P) {
		this.bat2DecayAssist2P = bat2DecayAssist2P;
	}

	public Integer getBat2DecayAssist3P() {
		return bat2DecayAssist3P;
	}

	public void setBat2DecayAssist3P(Integer bat2DecayAssist3P) {
		this.bat2DecayAssist3P = bat2DecayAssist3P;
	}

	public Integer getBat2DecayAssist4P() {
		return bat2DecayAssist4P;
	}

	public void setBat2DecayAssist4P(Integer bat2DecayAssist4P) {
		this.bat2DecayAssist4P = bat2DecayAssist4P;
	}

	public Integer getBat2DecayAssist5P() {
		return bat2DecayAssist5P;
	}

	public void setBat2DecayAssist5P(Integer bat2DecayAssist5P) {
		this.bat2DecayAssist5P = bat2DecayAssist5P;
	}

	public Double getTimeInAssist6P() {
		return timeInAssist6P;
	}

	public void setTimeInAssist6P(Double timeInAssist6P) {
		this.timeInAssist6P = timeInAssist6P;
	}

	public Integer getBat1DecayAssist6P() {
		return bat1DecayAssist6P;
	}

	public void setBat1DecayAssist6P(Integer bat1DecayAssist6P) {
		this.bat1DecayAssist6P = bat1DecayAssist6P;
	}

	public Integer getBat2DecayAssist6P() {
		return bat2DecayAssist6P;
	}

	public void setBat2DecayAssist6P(Integer bat2DecayAssist6P) {
		this.bat2DecayAssist6P = bat2DecayAssist6P;
	}
}
