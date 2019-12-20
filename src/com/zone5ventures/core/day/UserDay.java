package com.zone5ventures.core.day;

import java.util.List;

import com.zone5ventures.core.enums.TcmAbilities;
import com.zone5ventures.core.users.User;

public class UserDay {
	
	// a flag used to indicate if we should reprocess data files with a weight change - see UserDayFlags.java
	private Long flags;
	
	private Long id;
	
	private User user;
	
	/** Year (ie 2018) */
	private Integer year;
	
	/** Day of year */
	private Integer day;
			
	private Integer tcm;
	
	private TcmAbilities tcmAbility;
		
	private Integer restingBpm;
	
	private Integer calories;
	
	private Integer caloriesIn;

	private Integer activeMins1;
	
	private Integer activeMins2;
	
	private Integer activeMins3;
	
	private Integer activeMins4;
	
	private Integer steps;	
	
	private Double tcmr1;
	
	private Double tcmr2;
	
	private Double tcmr3;
	
	private Double tcmr4;
	
	private Double tcmr5;
	
	private Double tcmr6;
	
	private Double tcmr7;
	
	private Double tcmr8;
	
	//private VUserDayHRV hrv;
	private UserDayRatings rating; 
	//private VUserSchedule schedule;
	
	private List<UserDayAttribute> atts;
	//private List<VUserWorkoutResult> activities;
	//private List<VTeamActivity> teamactivities;
	private List<UserDaySleep> sleeps;
	//private List<VUserDayFueling> fuelings;
	
	private UserDayAttribute att;
	//private VUserWorkoutResult activity;
	
	//private VUserRoute route;
	//private VUserWorkoutResultByHour hour;
	//private VTeamActivity teamactivity;
	private UserDaySleep sleep;
	//private VUserDayFueling fueling;
	
	// load.ride.tscore.ctl
	//private VUserDayBulkLoad load;
	
	public UserDay() { }

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

	public Integer getTcm() {
		return tcm;
	}

	public void setTcm(Integer tcm) {
		this.tcm = tcm;
	}

	public TcmAbilities getTcmAbility() {
		return tcmAbility;
	}

	public void setTcmAbility(TcmAbilities tcmAbility) {
		this.tcmAbility = tcmAbility;
	}

	public Integer getRestingBpm() {
		return restingBpm;
	}

	public void setRestingBpm(Integer restingBpm) {
		this.restingBpm = restingBpm;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getCaloriesIn() {
		return caloriesIn;
	}

	public void setCaloriesIn(Integer caloriesIn) {
		this.caloriesIn = caloriesIn;
	}

	public Integer getActiveMins1() {
		return activeMins1;
	}

	public void setActiveMins1(Integer activeMins1) {
		this.activeMins1 = activeMins1;
	}

	public Integer getActiveMins2() {
		return activeMins2;
	}

	public void setActiveMins2(Integer activeMins2) {
		this.activeMins2 = activeMins2;
	}

	public Integer getActiveMins3() {
		return activeMins3;
	}

	public void setActiveMins3(Integer activeMins3) {
		this.activeMins3 = activeMins3;
	}

	public Integer getActiveMins4() {
		return activeMins4;
	}

	public void setActiveMins4(Integer activeMins4) {
		this.activeMins4 = activeMins4;
	}

	public Integer getSteps() {
		return steps;
	}

	public void setSteps(Integer steps) {
		this.steps = steps;
	}

	public Double getTcmr1() {
		return tcmr1;
	}

	public void setTcmr1(Double tcmr1) {
		this.tcmr1 = tcmr1;
	}

	public Double getTcmr2() {
		return tcmr2;
	}

	public void setTcmr2(Double tcmr2) {
		this.tcmr2 = tcmr2;
	}

	public Double getTcmr3() {
		return tcmr3;
	}

	public void setTcmr3(Double tcmr3) {
		this.tcmr3 = tcmr3;
	}

	public Double getTcmr4() {
		return tcmr4;
	}

	public void setTcmr4(Double tcmr4) {
		this.tcmr4 = tcmr4;
	}

	public Double getTcmr5() {
		return tcmr5;
	}

	public void setTcmr5(Double tcmr5) {
		this.tcmr5 = tcmr5;
	}

	public Double getTcmr6() {
		return tcmr6;
	}

	public void setTcmr6(Double tcmr6) {
		this.tcmr6 = tcmr6;
	}

	public Double getTcmr7() {
		return tcmr7;
	}

	public void setTcmr7(Double tcmr7) {
		this.tcmr7 = tcmr7;
	}

	public Double getTcmr8() {
		return tcmr8;
	}

	public void setTcmr8(Double tcmr8) {
		this.tcmr8 = tcmr8;
	}

	public UserDayRatings getRating() {
		return rating;
	}

	public void setRating(UserDayRatings rating) {
		this.rating = rating;
	}

	public List<UserDayAttribute> getAtts() {
		return atts;
	}

	public void setAtts(List<UserDayAttribute> atts) {
		this.atts = atts;
	}

	public List<UserDaySleep> getSleeps() {
		return sleeps;
	}

	public void setSleeps(List<UserDaySleep> sleeps) {
		this.sleeps = sleeps;
	}

	public UserDayAttribute getAtt() {
		return att;
	}

	public void setAtt(UserDayAttribute att) {
		this.att = att;
	}

	public UserDaySleep getSleep() {
		return sleep;
	}

	public void setSleep(UserDaySleep sleep) {
		this.sleep = sleep;
	}
}
