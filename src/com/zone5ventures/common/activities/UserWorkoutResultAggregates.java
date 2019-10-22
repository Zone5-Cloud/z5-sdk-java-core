package com.zone5ventures.common.activities;

public class UserWorkoutResultAggregates extends UserWorkoutResult {
	
	private UserWorkoutResult sum;
	private UserWorkoutResult min;
	private UserWorkoutResult max;
	private UserWorkoutResult avg;
	private UserWorkoutResult wavg;
	
	public UserWorkoutResultAggregates() { }

	public UserWorkoutResult getSum() {
		return sum;
	}

	public void setSum(UserWorkoutResult sum) {
		this.sum = sum;
	}

	public UserWorkoutResult getMin() {
		return min;
	}

	public void setMin(UserWorkoutResult min) {
		this.min = min;
	}

	public UserWorkoutResult getMax() {
		return max;
	}

	public void setMax(UserWorkoutResult max) {
		this.max = max;
	}

	public UserWorkoutResult getAvg() {
		return avg;
	}

	public void setAvg(UserWorkoutResult avg) {
		this.avg = avg;
	}

	public UserWorkoutResult getWavg() {
		return wavg;
	}

	public void setWavg(UserWorkoutResult wavg) {
		this.wavg = wavg;
	}

}
