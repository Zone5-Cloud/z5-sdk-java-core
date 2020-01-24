package com.zone5ventures.core.workouts;

import com.zone5ventures.core.enums.ActivityType;
import com.zone5ventures.core.enums.TimeOfDay;
import com.zone5ventures.core.enums.WorkoutType;
import com.zone5ventures.core.users.User;

public class UserWorkoutSummary {
	
	/** workoutId */
	private Long id;
	
	/** unix timestamp (ms) */
	private Long day;
	
	private WorkoutType workout;
	
	//private WorkoutTag tag;
	
	private ActivityType type;
	
	private TimeOfDay time;
	
	private String name;
	
	private String descr;
	
	private String preDescr;
	
	private String media;
	
	private Double tscorepwr;
		
	private Integer durationSecs;
	
	/** meters */
	private Double distance;
	
	/** seconds */
	private Double pace;
	
	private Long mask;
		
	private Integer intensityFactor;
	
	private Integer intervalCnt;
	
	private User user;
	
	private User author;
	
	private String tz;
	
	//private VUserPlan plan;
	
	//private VUserWorkoutExt ext;
	
	public UserWorkoutSummary() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getDay() {
		return day;
	}

	public void setDay(Long day) {
		this.day = day;
	}

	public WorkoutType getWorkout() {
		return workout;
	}

	public void setWorkout(WorkoutType workout) {
		this.workout = workout;
	}

	public ActivityType getType() {
		return type;
	}

	public void setType(ActivityType type) {
		this.type = type;
	}

	public TimeOfDay getTime() {
		return time;
	}

	public void setTime(TimeOfDay time) {
		this.time = time;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public String getPreDescr() {
		return preDescr;
	}

	public void setPreDescr(String preDescr) {
		this.preDescr = preDescr;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public Double getTscorepwr() {
		return tscorepwr;
	}

	public void setTscorepwr(Double tscorepwr) {
		this.tscorepwr = tscorepwr;
	}

	public Integer getDurationSecs() {
		return durationSecs;
	}

	public void setDurationSecs(Integer durationSecs) {
		this.durationSecs = durationSecs;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getPace() {
		return pace;
	}

	public void setPace(Double pace) {
		this.pace = pace;
	}

	public Long getMask() {
		return mask;
	}

	public void setMask(Long mask) {
		this.mask = mask;
	}

	public Integer getIntensityFactor() {
		return intensityFactor;
	}

	public void setIntensityFactor(Integer intensityFactor) {
		this.intensityFactor = intensityFactor;
	}

	public Integer getIntervalCnt() {
		return intervalCnt;
	}

	public void setIntervalCnt(Integer intervalCnt) {
		this.intervalCnt = intervalCnt;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}
}
