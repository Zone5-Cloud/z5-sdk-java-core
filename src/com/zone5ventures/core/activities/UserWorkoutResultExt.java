package com.zone5ventures.core.activities;

import com.zone5ventures.core.enums.RunType;
import com.zone5ventures.core.enums.SwimType;
import com.zone5ventures.core.enums.UnitMeasurement;

;

/** Extended result set */
public class UserWorkoutResultExt {
	
	private Double aerobicDec;
	
	/** Compliance score for how well this workout was adhered to (0-100) */
	private Short wscore;
		
	private Double avgPace;
	private Integer avgPaceP;
	
	private Double maxPace;
	private Integer maxPaceP;
	
	private Double avgPaceAboveThres;
	private Double avgPaceBelowThres;
	private Integer secsAbovePaceThres;
	
	private Double adjPace;
	private Double thresholdPace;
	private Double estThresPace;
		
	private Integer avgStrokeCount; // stride or stroke	
	private Float avgStrokeLen; // stride or stroke
	private Integer avgStepLen; // stride or stroke - prolly in cm
	private Integer steps;
	
	private Integer avgFormWatts;
	
	/** Stryd form power - form power ratio: CALCULATED as Form Power / Total Power * 100 */
	private Integer avgFormR;
	
	/** Stryd Leg Spring Stiffness */
	private Double avgLegSS;
	
	private Double avgLegSSKg;
		
	/** Vertical oscillation (run) */
	private Integer avgVertOss;
	
	/** Vertical oscillation ratio - calculated as Vertical oscillation / stride length (run) */
	private Double avgVertOssR;
	
	private Integer avgGroundTime;
	
	private Integer avgStanceTime;
	
	/** Run dynamics */
	private Integer avgStanceTimeP; // stryd non-Ground contact time / stride time (run)
	
	/** Run dynamics */
	private Integer avgStanceTimeBal;
			
	/** Efficiency index (run) - average HR / adjusted pace */
	private Double efPace;
	
	/** Power:Pace ratio - average HR / adjusted pace */
	private Double pwrPaceR;
	
	private Integer avgThrustTime;
	
	private Integer maxThrustTime;
	
	/** Where this file is related to a multisport activity */
	private Long parentId;
	
	// Stryd RSS (for run)
	private Integer rss;
	
	private Integer hss;
	
	private Integer pss;
	
	private SwimType water;
	
	private RunType terrain;
	
	private Integer poolLen;
	
	private UnitMeasurement poolLenUnits;
	
	// average training time per lap
	private Integer avgLap;
	
	// number of swimming laps
	private Integer lapCnt;
	
	// A csv list of SwimStroke ordinals
	private Integer strokeTypes;
	
	private Integer frontTireMin;
	
	private Integer frontTireMax;
	
	private Integer frontTireAvg;
	
	private Integer rearTireMin;
	
	private Integer rearTireMax;
	
	private Integer rearTireAvg;
	
	public UserWorkoutResultExt() { }

	public Double getAerobicDec() {
		return aerobicDec;
	}

	public void setAerobicDec(Double aerobicDec) {
		this.aerobicDec = aerobicDec;
	}

	public Short getWscore() {
		return wscore;
	}

	public void setWscore(Short wscore) {
		this.wscore = wscore;
	}

	public Double getAvgPace() {
		return avgPace;
	}

	public void setAvgPace(Double avgPace) {
		this.avgPace = avgPace;
	}

	public Integer getAvgPaceP() {
		return avgPaceP;
	}

	public void setAvgPaceP(Integer avgPaceP) {
		this.avgPaceP = avgPaceP;
	}

	public Double getMaxPace() {
		return maxPace;
	}

	public void setMaxPace(Double maxPace) {
		this.maxPace = maxPace;
	}

	public Integer getMaxPaceP() {
		return maxPaceP;
	}

	public void setMaxPaceP(Integer maxPaceP) {
		this.maxPaceP = maxPaceP;
	}

	public Double getAvgPaceAboveThres() {
		return avgPaceAboveThres;
	}

	public void setAvgPaceAboveThres(Double avgPaceAboveThres) {
		this.avgPaceAboveThres = avgPaceAboveThres;
	}

	public Double getAvgPaceBelowThres() {
		return avgPaceBelowThres;
	}

	public void setAvgPaceBelowThres(Double avgPaceBelowThres) {
		this.avgPaceBelowThres = avgPaceBelowThres;
	}

	public Integer getSecsAbovePaceThres() {
		return secsAbovePaceThres;
	}

	public void setSecsAbovePaceThres(Integer secsAbovePaceThres) {
		this.secsAbovePaceThres = secsAbovePaceThres;
	}

	public Double getAdjPace() {
		return adjPace;
	}

	public void setAdjPace(Double adjPace) {
		this.adjPace = adjPace;
	}

	public Double getThresholdPace() {
		return thresholdPace;
	}

	public void setThresholdPace(Double thresholdPace) {
		this.thresholdPace = thresholdPace;
	}

	public Double getEstThresPace() {
		return estThresPace;
	}

	public void setEstThresPace(Double estThresPace) {
		this.estThresPace = estThresPace;
	}

	public Integer getAvgStrokeCount() {
		return avgStrokeCount;
	}

	public void setAvgStrokeCount(Integer avgStrokeCount) {
		this.avgStrokeCount = avgStrokeCount;
	}

	public Float getAvgStrokeLen() {
		return avgStrokeLen;
	}

	public void setAvgStrokeLen(Float avgStrokeLen) {
		this.avgStrokeLen = avgStrokeLen;
	}

	public Integer getAvgStepLen() {
		return avgStepLen;
	}

	public void setAvgStepLen(Integer avgStepLen) {
		this.avgStepLen = avgStepLen;
	}

	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	public Integer getAvgFormWatts() {
		return avgFormWatts;
	}

	public void setAvgFormWatts(Integer avgFormWatts) {
		this.avgFormWatts = avgFormWatts;
	}

	public Integer getAvgFormR() {
		return avgFormR;
	}

	public void setAvgFormR(Integer avgFormR) {
		this.avgFormR = avgFormR;
	}

	public Double getAvgLegSS() {
		return avgLegSS;
	}

	public void setAvgLegSS(Double avgLegSS) {
		this.avgLegSS = avgLegSS;
	}

	public Double getAvgLegSSKg() {
		return avgLegSSKg;
	}

	public void setAvgLegSSKg(Double avgLegSSKg) {
		this.avgLegSSKg = avgLegSSKg;
	}

	public Integer getAvgVertOss() {
		return avgVertOss;
	}

	public void setAvgVertOss(Integer avgVertOss) {
		this.avgVertOss = avgVertOss;
	}

	public Double getAvgVertOssR() {
		return avgVertOssR;
	}

	public void setAvgVertOssR(Double avgVertOssR) {
		this.avgVertOssR = avgVertOssR;
	}

	public Integer getAvgGroundTime() {
		return avgGroundTime;
	}

	public void setAvgGroundTime(Integer avgGroundTime) {
		this.avgGroundTime = avgGroundTime;
	}

	public Integer getAvgStanceTime() {
		return avgStanceTime;
	}

	public void setAvgStanceTime(Integer avgStanceTime) {
		this.avgStanceTime = avgStanceTime;
	}

	public Integer getAvgStanceTimeP() {
		return avgStanceTimeP;
	}

	public void setAvgStanceTimeP(Integer avgStanceTimeP) {
		this.avgStanceTimeP = avgStanceTimeP;
	}

	public Integer getAvgStanceTimeBal() {
		return avgStanceTimeBal;
	}

	public void setAvgStanceTimeBal(Integer avgStanceTimeBal) {
		this.avgStanceTimeBal = avgStanceTimeBal;
	}

	public Double getEfPace() {
		return efPace;
	}

	public void setEfPace(Double efPace) {
		this.efPace = efPace;
	}

	public Double getPwrPaceR() {
		return pwrPaceR;
	}

	public void setPwrPaceR(Double pwrPaceR) {
		this.pwrPaceR = pwrPaceR;
	}

	public Integer getAvgThrustTime() {
		return avgThrustTime;
	}

	public void setAvgThrustTime(Integer avgThrustTime) {
		this.avgThrustTime = avgThrustTime;
	}

	public Integer getMaxThrustTime() {
		return maxThrustTime;
	}

	public void setMaxThrustTime(Integer maxThrustTime) {
		this.maxThrustTime = maxThrustTime;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public Integer getRss() {
		return rss;
	}

	public void setRss(Integer rss) {
		this.rss = rss;
	}

	public Integer getHss() {
		return hss;
	}

	public void setHss(Integer hss) {
		this.hss = hss;
	}

	public Integer getPss() {
		return pss;
	}

	public void setPss(Integer pss) {
		this.pss = pss;
	}

	public SwimType getWater() {
		return water;
	}

	public void setWater(SwimType water) {
		this.water = water;
	}

	public RunType getTerrain() {
		return terrain;
	}

	public void setTerrain(RunType terrain) {
		this.terrain = terrain;
	}

	public Integer getPoolLen() {
		return poolLen;
	}

	public void setPoolLen(Integer poolLen) {
		this.poolLen = poolLen;
	}

	public UnitMeasurement getPoolLenUnits() {
		return poolLenUnits;
	}

	public void setPoolLenUnits(UnitMeasurement poolLenUnits) {
		this.poolLenUnits = poolLenUnits;
	}

	public Integer getAvgLap() {
		return avgLap;
	}

	public void setAvgLap(Integer avgLap) {
		this.avgLap = avgLap;
	}

	public Integer getLapCnt() {
		return lapCnt;
	}

	public void setLapCnt(Integer lapCnt) {
		this.lapCnt = lapCnt;
	}

	public Integer getStrokeTypes() {
		return strokeTypes;
	}

	public void setStrokeTypes(Integer strokeTypes) {
		this.strokeTypes = strokeTypes;
	}

	public Integer getFrontTireMin() {
		return frontTireMin;
	}

	public void setFrontTireMin(Integer frontTireMin) {
		this.frontTireMin = frontTireMin;
	}

	public Integer getFrontTireMax() {
		return frontTireMax;
	}

	public void setFrontTireMax(Integer frontTireMax) {
		this.frontTireMax = frontTireMax;
	}

	public Integer getFrontTireAvg() {
		return frontTireAvg;
	}

	public void setFrontTireAvg(Integer frontTireAvg) {
		this.frontTireAvg = frontTireAvg;
	}

	public Integer getRearTireMin() {
		return rearTireMin;
	}

	public void setRearTireMin(Integer rearTireMin) {
		this.rearTireMin = rearTireMin;
	}

	public Integer getRearTireMax() {
		return rearTireMax;
	}

	public void setRearTireMax(Integer rearTireMax) {
		this.rearTireMax = rearTireMax;
	}

	public Integer getRearTireAvg() {
		return rearTireAvg;
	}

	public void setRearTireAvg(Integer rearTireAvg) {
		this.rearTireAvg = rearTireAvg;
	}
}
