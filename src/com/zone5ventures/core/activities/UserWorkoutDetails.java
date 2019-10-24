package com.zone5ventures.core.activities;

import java.util.Set;

import com.zone5ventures.core.enums.ActivityType;
import com.zone5ventures.core.enums.Equipment;
import com.zone5ventures.core.enums.Terrain;
import com.zone5ventures.core.enums.TimeOfDay;
import com.zone5ventures.core.enums.UserWorkoutFailedReason;
import com.zone5ventures.core.enums.UserWorkoutState;
import com.zone5ventures.core.enums.WorkoutType;
import com.zone5ventures.core.users.User;

public class UserWorkoutDetails {

	/** A workout ID */
	private Long id;
	
	/** Timestamp of when this workout is scheduled */
	private Long day;
	
	/** Test, training or event */
	private WorkoutType workout;
		
	/** Sport */
	private ActivityType type;
	
	private TimeOfDay time;
	
	private String name;
	
	private String descr;
	
	private String preDescr;
	
	private String media;
	
	/** Estimated / scheduled tscore */
	private Double tscorepwr;
		
	/** Estimated / scheduled duration */
	private Integer durationSecs;
	
	/** Estimated / scheduled distance */
	private Double distance;
	
	/** Estimated / scheduled pace */
	private Double pace;
	
	private Long mask;
	
	/** if true, then this is an unstructured workout and has no intervals */
	private Boolean simple;
	
	/** Estimated / scheduled elevation gain */
	private Integer ascent;
	
	/** Estimated / scheduled elevation loss */
	private Integer descent;
	
	/** Estimated / scheduled intensity */
	private Integer intensityFactor;
	
	/** Athlete */
	private User user;
	
	/** Coach who created the workout */
	private User author;
	
	/** timezone */
	private String tz;
			
	//private UserWorkoutExt ext;
	
	private Set<Equipment> equipment;
	
	private Set<Terrain> terrain;
	
	//private Set<Goal> goals;
	
	private UserWorkoutState state;
	
	private UserWorkoutFailedReason reason;
	
	//private List<UserWorkoutInterval> intervals;
	
	/** Number of power zones this workout was designed for */
	private Integer zoneSize;
	
	/** Number of heart rate zones this workout was designed for */
	private Integer zoneHrSize;
	
	/** Number of pace zones this workout was designed for */
	private Integer zonePaceSize;
	
	public UserWorkoutDetails() { }

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

	public Boolean getSimple() {
		return simple;
	}

	public void setSimple(Boolean simple) {
		this.simple = simple;
	}

	public Integer getAscent() {
		return ascent;
	}

	public void setAscent(Integer ascent) {
		this.ascent = ascent;
	}

	public Integer getDescent() {
		return descent;
	}

	public void setDescent(Integer descent) {
		this.descent = descent;
	}

	public Integer getIntensityFactor() {
		return intensityFactor;
	}

	public void setIntensityFactor(Integer intensityFactor) {
		this.intensityFactor = intensityFactor;
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

	public Set<Equipment> getEquipment() {
		return equipment;
	}

	public void setEquipment(Set<Equipment> equipment) {
		this.equipment = equipment;
	}

	public Set<Terrain> getTerrain() {
		return terrain;
	}

	public void setTerrain(Set<Terrain> terrain) {
		this.terrain = terrain;
	}

	public UserWorkoutState getState() {
		return state;
	}

	public void setState(UserWorkoutState state) {
		this.state = state;
	}

	public UserWorkoutFailedReason getReason() {
		return reason;
	}

	public void setReason(UserWorkoutFailedReason reason) {
		this.reason = reason;
	}

	public Integer getZoneSize() {
		return zoneSize;
	}

	public void setZoneSize(Integer zoneSize) {
		this.zoneSize = zoneSize;
	}

	public Integer getZoneHrSize() {
		return zoneHrSize;
	}

	public void setZoneHrSize(Integer zoneHrSize) {
		this.zoneHrSize = zoneHrSize;
	}

	public Integer getZonePaceSize() {
		return zonePaceSize;
	}

	public void setZonePaceSize(Integer zonePaceSize) {
		this.zonePaceSize = zonePaceSize;
	}
	
}
