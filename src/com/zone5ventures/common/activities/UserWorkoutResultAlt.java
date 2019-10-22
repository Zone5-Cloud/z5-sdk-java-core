package com.zone5ventures.common.activities;

/** Altitude adjusted power */
public class UserWorkoutResultAlt {
	
	private Integer avgWatts;
	private Integer maxWatts;
	private Integer adjWatts;
	private Integer tscore;
	private Integer kj;
	
	public UserWorkoutResultAlt() { }

	public Integer getAvgWatts() {
		return avgWatts;
	}

	public void setAvgWatts(Integer avgWatts) {
		this.avgWatts = avgWatts;
	}

	public Integer getMaxWatts() {
		return maxWatts;
	}

	public void setMaxWatts(Integer maxWatts) {
		this.maxWatts = maxWatts;
	}

	public Integer getAdjWatts() {
		return adjWatts;
	}

	public void setAdjWatts(Integer adjWatts) {
		this.adjWatts = adjWatts;
	}
	
	public Integer getTscore() {
		return tscore;
	}
	
	public void setTscore(Integer tscore) {
		this.tscore = tscore;
	}
	
	public Integer getKj() {
		return kj;
	}
	
	public void setKj(Integer kj) {
		this.kj = kj;
	}
}
