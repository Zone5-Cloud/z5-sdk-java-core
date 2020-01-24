package com.zone5ventures.core.workouts;

import java.util.List;
import java.util.Set;

import com.zone5ventures.core.enums.ActivityType;
import com.zone5ventures.core.enums.Equipment;
import com.zone5ventures.core.enums.Terrain;
import com.zone5ventures.core.enums.TimeOfDay;
import com.zone5ventures.core.enums.WorkoutType;
import com.zone5ventures.core.users.User;

public class AddUserWorkout {

	//private Long id;
	
	/** The user to add the workout to */
	private User user;
	
	/** Prescribe the workout to multiple users */
	private List<Long> userIds;
	
	/** The media URL or key to be prescribed */
	private String media;
	
	/** The name of the workout */
	private String name;
	
	/** The workout description */
	private String preDescr;
		
	/** The timezone that this workout will be completed in */
	private String tz;
	
	/** The time/date of the workout - unix timestamp in ms */
	private Long ts;
	
	/** Optional time of day to complete the session */
	private TimeOfDay time;
	
	///** The goals of this workout */
	//private Set<Goal> goals;
	
	/** Sport type of this workout */
	private ActivityType type;
	
	/** Workout type - ie training, race etc */
	private WorkoutType workout;
	
	//private WorkoutTag tag;
		
	/** The equipment which can be used for this workout */
	private Set<Equipment> equipment;
	
	/** The terrain to that this workout should be completed on */
	private Set<Terrain> terrain;
	
	/** Send email to user that this workout has been added/modified */
	private Boolean sendEmail;
	
	/** Estimated T-Score for this workout */
	private Double tscorepwr;
	
	/** Estimated duration (secs) for this workout */
	private Integer duration;
	
	/** Estimated distance (meters) for this workout */
	private Double distance;
	
	/** Estimated pace (secs) for this workout */
	private Double pace;
	
	private Long mask;
	
	private Long routeId;
	
	//private UserWorkoutExt ext;
	
	public AddUserWorkout() { }

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Long> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public String getMedia() {
		return media;
	}

	public void setMedia(String media) {
		this.media = media;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPreDescr() {
		return preDescr;
	}

	public void setPreDescr(String preDescr) {
		this.preDescr = preDescr;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public TimeOfDay getTime() {
		return time;
	}

	public void setTime(TimeOfDay time) {
		this.time = time;
	}

	public ActivityType getType() {
		return type;
	}

	public void setType(ActivityType type) {
		this.type = type;
	}

	public WorkoutType getWorkout() {
		return workout;
	}

	public void setWorkout(WorkoutType workout) {
		this.workout = workout;
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

	public Boolean getSendEmail() {
		return sendEmail;
	}

	public void setSendEmail(Boolean sendEmail) {
		this.sendEmail = sendEmail;
	}

	public Double getTscorepwr() {
		return tscorepwr;
	}

	public void setTscorepwr(Double tscorepwr) {
		this.tscorepwr = tscorepwr;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
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

	public Long getRouteId() {
		return routeId;
	}

	public void setRouteId(Long routeId) {
		this.routeId = routeId;
	}
}
