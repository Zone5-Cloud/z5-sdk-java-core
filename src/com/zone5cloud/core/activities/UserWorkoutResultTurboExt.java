package com.zone5cloud.core.activities;

import com.zone5cloud.core.SearchableDataObject;

public class UserWorkoutResultTurboExt extends SearchableDataObject {
	private Integer minBattery1Temperature; // celsius
	private Integer avgBattery1Temperature; // celsius
	private Integer maxBattery1Temperature; // celsius
	
	private Integer minBattery2Temperature; // celsius
	private Integer avgBattery2Temperature; // celsius
	private Integer maxBattery2Temperature; // celsius
	
	private Integer battery1DecayP; // %
	private Integer battery2DecayP; // %
	private Integer battery1DecayWh; // Watt hours
	private Integer battery2DecayWh; // Watt hours
	private Integer batteryTotalDecayP; // %
	private Integer batteryTotalDecayWh; // Watt hours
	
	// Cumulative Wh consumption per assist mode
	private Integer bat1DecayAssist0Wh; // Watt hours
	private Integer bat1DecayAssist1Wh; // Watt hours
	private Integer bat1DecayAssist2Wh; // Watt hours
	private Integer bat1DecayAssist3Wh; // Watt hours
	private Integer bat1DecayAssist4Wh; // Watt hours
	private Integer bat1DecayAssist5Wh; // Watt hours
	private Integer bat1DecayAssist6Wh; // Watt hours
		
	// Cumulative Wh consumption per assist mode
	private Integer bat2DecayAssist0Wh; // Watt hours
	private Integer bat2DecayAssist1Wh; // Watt hours
	private Integer bat2DecayAssist2Wh; // Watt hours
	private Integer bat2DecayAssist3Wh; // Watt hours
	private Integer bat2DecayAssist4Wh; // Watt hours
	private Integer bat2DecayAssist5Wh; // Watt hours
	private Integer bat2DecayAssist6Wh; // Watt hours
	
	// Average support factor in this mode
	private Double supportFactorAssist0; // ratio
	private Double supportFactorAssist1; // ratio
	private Double supportFactorAssist2; // ratio
	private Double supportFactorAssist3; // ratio
	private Double supportFactorAssist4; // ratio
	private Double supportFactorAssist5; // ratio // future proof
	private Double supportFactorAssist6; // ratio // future proof
	
	private Double avgGPSSpeed;
	
	public UserWorkoutResultTurboExt() {}

	public Integer getMinBattery1Temperature() {
		return minBattery1Temperature;
	}

	public void setMinBattery1Temperature(Integer minBattery1Temperature) {
		this.minBattery1Temperature = minBattery1Temperature;
	}

	public Integer getAvgBattery1Temperature() {
		return avgBattery1Temperature;
	}

	public void setAvgBattery1Temperature(Integer avgBattery1Temperature) {
		this.avgBattery1Temperature = avgBattery1Temperature;
	}

	public Integer getMaxBattery1Temperature() {
		return maxBattery1Temperature;
	}

	public void setMaxBattery1Temperature(Integer maxBattery1Temperature) {
		this.maxBattery1Temperature = maxBattery1Temperature;
	}

	public Integer getMinBattery2Temperature() {
		return minBattery2Temperature;
	}

	public void setMinBattery2Temperature(Integer minBattery2Temperature) {
		this.minBattery2Temperature = minBattery2Temperature;
	}

	public Integer getAvgBattery2Temperature() {
		return avgBattery2Temperature;
	}

	public void setAvgBattery2Temperature(Integer avgBattery2Temperature) {
		this.avgBattery2Temperature = avgBattery2Temperature;
	}

	public Integer getMaxBattery2Temperature() {
		return maxBattery2Temperature;
	}

	public void setMaxBattery2Temperature(Integer maxBattery2Temperature) {
		this.maxBattery2Temperature = maxBattery2Temperature;
	}

	public Integer getBattery1DecayP() {
		return battery1DecayP;
	}

	public void setBattery1DecayP(Integer battery1DecayP) {
		this.battery1DecayP = battery1DecayP;
	}

	public Integer getBattery2DecayP() {
		return battery2DecayP;
	}

	public void setBattery2DecayP(Integer battery2DecayP) {
		this.battery2DecayP = battery2DecayP;
	}

	public Integer getBattery1DecayWh() {
		return battery1DecayWh;
	}

	public void setBattery1DecayWh(Integer battery1DecayWh) {
		this.battery1DecayWh = battery1DecayWh;
	}

	public Integer getBattery2DecayWh() {
		return battery2DecayWh;
	}

	public void setBattery2DecayWh(Integer battery2DecayWh) {
		this.battery2DecayWh = battery2DecayWh;
	}

	public Integer getBatteryTotalDecayP() {
		return batteryTotalDecayP;
	}

	public void setBatteryTotalDecayP(Integer batteryTotalDecayP) {
		this.batteryTotalDecayP = batteryTotalDecayP;
	}

	public Integer getBatteryTotalDecayWh() {
		return batteryTotalDecayWh;
	}

	public void setBatteryTotalDecayWh(Integer batteryTotalDecayWh) {
		this.batteryTotalDecayWh = batteryTotalDecayWh;
	}

	public Integer getBat1DecayAssist0Wh() {
		return bat1DecayAssist0Wh;
	}

	public void setBat1DecayAssist0Wh(Integer bat1DecayAssist0Wh) {
		this.bat1DecayAssist0Wh = bat1DecayAssist0Wh;
	}

	public Integer getBat1DecayAssist1Wh() {
		return bat1DecayAssist1Wh;
	}

	public void setBat1DecayAssist1Wh(Integer bat1DecayAssist1Wh) {
		this.bat1DecayAssist1Wh = bat1DecayAssist1Wh;
	}

	public Integer getBat1DecayAssist2Wh() {
		return bat1DecayAssist2Wh;
	}

	public void setBat1DecayAssist2Wh(Integer bat1DecayAssist2Wh) {
		this.bat1DecayAssist2Wh = bat1DecayAssist2Wh;
	}

	public Integer getBat1DecayAssist3Wh() {
		return bat1DecayAssist3Wh;
	}

	public void setBat1DecayAssist3Wh(Integer bat1DecayAssist3Wh) {
		this.bat1DecayAssist3Wh = bat1DecayAssist3Wh;
	}

	public Integer getBat1DecayAssist4Wh() {
		return bat1DecayAssist4Wh;
	}

	public void setBat1DecayAssist4Wh(Integer bat1DecayAssist4Wh) {
		this.bat1DecayAssist4Wh = bat1DecayAssist4Wh;
	}

	public Integer getBat2DecayAssist0Wh() {
		return bat2DecayAssist0Wh;
	}

	public void setBat2DecayAssist0Wh(Integer bat2DecayAssist0Wh) {
		this.bat2DecayAssist0Wh = bat2DecayAssist0Wh;
	}

	public Integer getBat2DecayAssist1Wh() {
		return bat2DecayAssist1Wh;
	}

	public void setBat2DecayAssist1Wh(Integer bat2DecayAssist1Wh) {
		this.bat2DecayAssist1Wh = bat2DecayAssist1Wh;
	}

	public Integer getBat2DecayAssist2Wh() {
		return bat2DecayAssist2Wh;
	}

	public void setBat2DecayAssist2Wh(Integer bat2DecayAssist2Wh) {
		this.bat2DecayAssist2Wh = bat2DecayAssist2Wh;
	}

	public Integer getBat2DecayAssist3Wh() {
		return bat2DecayAssist3Wh;
	}

	public void setBat2DecayAssist3Wh(Integer bat2DecayAssist3Wh) {
		this.bat2DecayAssist3Wh = bat2DecayAssist3Wh;
	}

	public Integer getBat2DecayAssist4Wh() {
		return bat2DecayAssist4Wh;
	}

	public void setBat2DecayAssist4Wh(Integer bat2DecayAssist4Wh) {
		this.bat2DecayAssist4Wh = bat2DecayAssist4Wh;
	}

	public Integer getBat1DecayAssist5Wh() {
		return bat1DecayAssist5Wh;
	}

	public void setBat1DecayAssist5Wh(Integer bat1DecayAssist5Wh) {
		this.bat1DecayAssist5Wh = bat1DecayAssist5Wh;
	}

	public Integer getBat1DecayAssist6Wh() {
		return bat1DecayAssist6Wh;
	}

	public void setBat1DecayAssist6Wh(Integer bat1DecayAssist6Wh) {
		this.bat1DecayAssist6Wh = bat1DecayAssist6Wh;
	}

	public Integer getBat2DecayAssist5Wh() {
		return bat2DecayAssist5Wh;
	}

	public void setBat2DecayAssist5Wh(Integer bat2DecayAssist5Wh) {
		this.bat2DecayAssist5Wh = bat2DecayAssist5Wh;
	}

	public Integer getBat2DecayAssist6Wh() {
		return bat2DecayAssist6Wh;
	}

	public void setBat2DecayAssist6Wh(Integer bat2DecayAssist6Wh) {
		this.bat2DecayAssist6Wh = bat2DecayAssist6Wh;
	}

	public Double getSupportFactorAssist5() {
		return supportFactorAssist5;
	}

	public void setSupportFactorAssist5(Double supportFactorAssist5) {
		this.supportFactorAssist5 = supportFactorAssist5;
	}

	public Double getSupportFactorAssist6() {
		return supportFactorAssist6;
	}

	public void setSupportFactorAssist6(Double supportFactorAssist6) {
		this.supportFactorAssist6 = supportFactorAssist6;
	}

	public Double getSupportFactorAssist0() {
		return supportFactorAssist0;
	}

	public void setSupportFactorAssist0(Double supportFactorAssist0) {
		this.supportFactorAssist0 = supportFactorAssist0;
	}

	public Double getSupportFactorAssist1() {
		return supportFactorAssist1;
	}

	public void setSupportFactorAssist1(Double supportFactorAssist1) {
		this.supportFactorAssist1 = supportFactorAssist1;
	}

	public Double getSupportFactorAssist2() {
		return supportFactorAssist2;
	}

	public void setSupportFactorAssist2(Double supportFactorAssist2) {
		this.supportFactorAssist2 = supportFactorAssist2;
	}

	public Double getSupportFactorAssist3() {
		return supportFactorAssist3;
	}

	public void setSupportFactorAssist3(Double supportFactorAssist3) {
		this.supportFactorAssist3 = supportFactorAssist3;
	}

	public Double getSupportFactorAssist4() {
		return supportFactorAssist4;
	}

	public void setSupportFactorAssist4(Double supportFactorAssist4) {
		this.supportFactorAssist4 = supportFactorAssist4;
	}

	public Double getAvgGPSSpeed() {
		return avgGPSSpeed;
	}

	public void setAvgGPSSpeed(Double avgGPSSpeed) {
		this.avgGPSSpeed = avgGPSSpeed;
	}
}
