package com.zone5ventures.core.day;

import com.zone5ventures.core.users.User;

public class UserDayRatings {

	private User user;

	private Integer year;
	
	private Integer day;
	
	/** 1-9 */
	private Short sleep;
	
	/** 1-9 */
	private Short fatigue;
	
	/** 1-9 */
	private Short muscle;
	
	/** 1-9 */
	private Short stress;
	
	/** 1-9 */
	private Short mood;
	
	/** 1-9 */
	private Short diet;
	
	private Short fatigue1; 
	
	private Short fatigue2; 
	
	private Short mood2;
	
	private Short performance; 
	
	public UserDayRatings() { }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Short getSleep() {
		return sleep;
	}

	public void setSleep(Short sleep) {
		this.sleep = sleep;
	}

	public Short getFatigue() {
		return fatigue;
	}

	public void setFatigue(Short fatigue) {
		this.fatigue = fatigue;
	}

	public Short getMuscle() {
		return muscle;
	}

	public void setMuscle(Short muscle) {
		this.muscle = muscle;
	}

	public Short getStress() {
		return stress;
	}

	public void setStress(Short stress) {
		this.stress = stress;
	}

	public Short getMood() {
		return mood;
	}

	public void setMood(Short mood) {
		this.mood = mood;
	}

	public Short getDiet() {
		return diet;
	}

	public void setDiet(Short diet) {
		this.diet = diet;
	}

	public Short getFatigue1() {
		return fatigue1;
	}

	public void setFatigue1(Short fatigue1) {
		this.fatigue1 = fatigue1;
	}

	public Short getFatigue2() {
		return fatigue2;
	}

	public void setFatigue2(Short fatigue2) {
		this.fatigue2 = fatigue2;
	}

	public Short getMood2() {
		return mood2;
	}

	public void setMood2(Short mood2) {
		this.mood2 = mood2;
	}

	public Short getPerformance() {
		return performance;
	}

	public void setPerformance(Short performance) {
		this.performance = performance;
	}
}
