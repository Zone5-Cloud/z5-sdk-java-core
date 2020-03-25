package com.zone5cloud.core.day;

import java.util.Map;

import com.zone5cloud.core.enums.ActivityType;

public class UserDayAttribute {
	
	// a flag used to indicate if we should reprocess data files with a weight change - see UserDayFlags.java
	private Long flags;
	
	private Long id;
	
	private Long ts;
	
    private Long dob;
    	
	private Integer height;
	
	private Double weight;
		
	private String source;
	
	/** percentage */
	private Double fat;
	
	private Double bmi;
	
	/** percentage */
	private Double hydration;
	
	private Double boneMass;
	
	private Double fatMass;
	
	private Double muscleMass;

	private Double activeMet;
	
	private Short physiqueRating;
	
	private Short metabolicAge;
	
	private Short visceralFatRating;
	
	private Double basalMet;
	
	private Double visceralFatMass;
	
	private Long modifedTime;
	
	private Boolean fill;
	
	private Integer thresholdWatts;
	
	private Integer thresholdBpm;
	
	private Integer maxHr;
	
	private String tz;
	
	private Integer initialCtl;
	
	private Map<ActivityType, Integer> thresholdsPwr;
	
	private Map<ActivityType, Integer> thresholdsBpm;
	
	private Map<ActivityType, Double> thresholdsPace;
	
	private Map<ActivityType, Integer> maxHrs;
	
	public UserDayAttribute() { }

	public Long getFlags() {
		return flags;
	}

	public void setFlags(Long flags) {
		this.flags = flags;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public Long getDob() {
		return dob;
	}

	public void setDob(Long dob) {
		this.dob = dob;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public Double getFat() {
		return fat;
	}

	public void setFat(Double fat) {
		this.fat = fat;
	}

	public Double getBmi() {
		return bmi;
	}

	public void setBmi(Double bmi) {
		this.bmi = bmi;
	}

	public Double getHydration() {
		return hydration;
	}

	public void setHydration(Double hydration) {
		this.hydration = hydration;
	}

	public Double getBoneMass() {
		return boneMass;
	}

	public void setBoneMass(Double boneMass) {
		this.boneMass = boneMass;
	}

	public Double getFatMass() {
		return fatMass;
	}

	public void setFatMass(Double fatMass) {
		this.fatMass = fatMass;
	}

	public Double getMuscleMass() {
		return muscleMass;
	}

	public void setMuscleMass(Double muscleMass) {
		this.muscleMass = muscleMass;
	}

	public Double getActiveMet() {
		return activeMet;
	}

	public void setActiveMet(Double activeMet) {
		this.activeMet = activeMet;
	}

	public Short getPhysiqueRating() {
		return physiqueRating;
	}

	public void setPhysiqueRating(Short physiqueRating) {
		this.physiqueRating = physiqueRating;
	}

	public Short getMetabolicAge() {
		return metabolicAge;
	}

	public void setMetabolicAge(Short metabolicAge) {
		this.metabolicAge = metabolicAge;
	}

	public Short getVisceralFatRating() {
		return visceralFatRating;
	}

	public void setVisceralFatRating(Short visceralFatRating) {
		this.visceralFatRating = visceralFatRating;
	}

	public Double getBasalMet() {
		return basalMet;
	}

	public void setBasalMet(Double basalMet) {
		this.basalMet = basalMet;
	}

	public Double getVisceralFatMass() {
		return visceralFatMass;
	}

	public void setVisceralFatMass(Double visceralFatMass) {
		this.visceralFatMass = visceralFatMass;
	}

	public Long getModifedTime() {
		return modifedTime;
	}

	public void setModifedTime(Long modifedTime) {
		this.modifedTime = modifedTime;
	}

	public Boolean getFill() {
		return fill;
	}

	public void setFill(Boolean fill) {
		this.fill = fill;
	}

	public Integer getThresholdWatts() {
		return thresholdWatts;
	}

	public void setThresholdWatts(Integer thresholdWatts) {
		this.thresholdWatts = thresholdWatts;
	}

	public Integer getThresholdBpm() {
		return thresholdBpm;
	}

	public void setThresholdBpm(Integer thresholdBpm) {
		this.thresholdBpm = thresholdBpm;
	}

	public Integer getMaxHr() {
		return maxHr;
	}

	public void setMaxHr(Integer maxHr) {
		this.maxHr = maxHr;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public Integer getInitialCtl() {
		return initialCtl;
	}

	public void setInitialCtl(Integer initialCtl) {
		this.initialCtl = initialCtl;
	}

	public Map<ActivityType, Integer> getThresholdsPwr() {
		return thresholdsPwr;
	}

	public void setThresholdsPwr(Map<ActivityType, Integer> thresholdsPwr) {
		this.thresholdsPwr = thresholdsPwr;
	}

	public Map<ActivityType, Integer> getThresholdsBpm() {
		return thresholdsBpm;
	}

	public void setThresholdsBpm(Map<ActivityType, Integer> thresholdsBpm) {
		this.thresholdsBpm = thresholdsBpm;
	}

	public Map<ActivityType, Double> getThresholdsPace() {
		return thresholdsPace;
	}

	public void setThresholdsPace(Map<ActivityType, Double> thresholdsPace) {
		this.thresholdsPace = thresholdsPace;
	}

	public Map<ActivityType, Integer> getMaxHrs() {
		return maxHrs;
	}

	public void setMaxHrs(Map<ActivityType, Integer> maxHrs) {
		this.maxHrs = maxHrs;
	}

}
