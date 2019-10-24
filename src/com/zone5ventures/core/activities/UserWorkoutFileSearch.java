package com.zone5ventures.core.activities;

import java.util.List;
import java.util.Map;

import com.zone5ventures.core.enums.ActivityType;
import com.zone5ventures.core.enums.Equipment;
import com.zone5ventures.core.enums.ResultReview;
import com.zone5ventures.core.enums.ResultSource;
import com.zone5ventures.core.enums.UserWorkoutFailedReason;
import com.zone5ventures.core.enums.UserWorkoutState;
import com.zone5ventures.core.enums.WorkoutType;
import com.zone5ventures.core.search.DateRange;
import com.zone5ventures.core.search.DayRange;
import com.zone5ventures.core.search.Order;
import com.zone5ventures.core.users.User;

public class UserWorkoutFileSearch {
	
	/** Search for a name or filename which contains this name */
	private String name;
	
	/** Limit search results to activities with localities containing this text */
	private String locality;

	/** Search for files with a start timestamp >= this value. Value is a unix timestamp in milliseconds */
	private Long fromTs;

	/** Search for files with a start timestamp <= this value. Value is a unix timestamp in milliseconds */
	private Long toTs;
	
	/** Search for activities which occurred on or are scheduled on this day of the year" */
	private Integer day;
	
	/** Search for activities which occurred on or are scheduled in this year */
	private Integer year;
	
	/** Search for activities which occurred in these date ranges - use this for unix timestamps + timezone */
	private List<DateRange> rangesTs;
	
	/** Search for activities which occurred in these date ranges - use this for year + day of year */
	private List<DayRange> rangesDay;
	
	// fieldName --> min,max
	/** Search for completed activities which have attributes in the given ranges. ie all rides with a distance between 100 - 150km */
	private Map<String, List<Double>> ranges;
	
	/** Limit the search results to activities of this workout type */
	private WorkoutType workout;
	
	/** Limit the search results to activities of this equipment */
	private Equipment equipment;
			
	/** Limit the search results to activities with this source type */
	private ResultSource source;
	
	/** Limit the search results to activities with this review type */
	private ResultReview review;
	
	/** Limit the search results to activities with this state */
	private UserWorkoutState state;
	
	/** Limit the search results to activities of this workout incomplete reason */
	private UserWorkoutFailedReason reason;
	
	private Integer reviewMask;
	
	/** Limit the search results to activities completed with this power meter */
	//private VUserPowerMeter meter;
	
	/** Limit the search results to activities completed with this headunit meter */
	//private VUserHeadunit headunit;
	
	private String pwrManufacturer;
			
	private String pwrVersion;
	
	private String pwrSerial;
	
	private String pwrProduct;
	
	private String pwrDisplay;
	
	/** Search for files related to the given user */
	private User user;
	
	/** Search for files related to the given group */
	//private VUserGroupingSummary group;
		
	/** Limit the search results to activities who have null entries for the given fields */
	private List<String> isNull;
	
	/** Limit the search results to activities who do not have null entries for the given fields */
	private List<String> isNotNull;
	
	/** Limit the search results to activities related to these userIds */
	private List<Long> userIds;
	
	private String orderBy;
	
	/** Order the results according to these fields */
	private List<Order> order;
	
	/** Limit the search results to these activities. Set the id and type in the VActivity */
	private List<VActivity> activities;

	/** Limit the search results to exclude activities of this workout type */
	private List<WorkoutType> excludeWorkouts;
		
	/** Limit the search results to activities of these sport */
	private List<ActivityType> sports;
	
	private Map<String, String> meta;
	
	public UserWorkoutFileSearch() { }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Long getFromTs() {
		return fromTs;
	}

	public void setFromTs(Long fromTs) {
		this.fromTs = fromTs;
	}

	public Long getToTs() {
		return toTs;
	}

	public void setToTs(Long toTs) {
		this.toTs = toTs;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public List<DateRange> getRangesTs() {
		return rangesTs;
	}

	public void setRangesTs(List<DateRange> rangesTs) {
		this.rangesTs = rangesTs;
	}

	public Map<String, List<Double>> getRanges() {
		return ranges;
	}

	public void setRanges(Map<String, List<Double>> ranges) {
		this.ranges = ranges;
	}

	public WorkoutType getWorkout() {
		return workout;
	}

	public void setWorkout(WorkoutType workout) {
		this.workout = workout;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public ResultSource getSource() {
		return source;
	}

	public void setSource(ResultSource source) {
		this.source = source;
	}

	public ResultReview getReview() {
		return review;
	}

	public void setReview(ResultReview review) {
		this.review = review;
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

	public Integer getReviewMask() {
		return reviewMask;
	}

	public void setReviewMask(Integer reviewMask) {
		this.reviewMask = reviewMask;
	}

	public String getPwrManufacturer() {
		return pwrManufacturer;
	}

	public void setPwrManufacturer(String pwrManufacturer) {
		this.pwrManufacturer = pwrManufacturer;
	}

	public String getPwrVersion() {
		return pwrVersion;
	}

	public void setPwrVersion(String pwrVersion) {
		this.pwrVersion = pwrVersion;
	}

	public String getPwrSerial() {
		return pwrSerial;
	}

	public void setPwrSerial(String pwrSerial) {
		this.pwrSerial = pwrSerial;
	}

	public String getPwrProduct() {
		return pwrProduct;
	}

	public void setPwrProduct(String pwrProduct) {
		this.pwrProduct = pwrProduct;
	}

	public String getPwrDisplay() {
		return pwrDisplay;
	}

	public void setPwrDisplay(String pwrDisplay) {
		this.pwrDisplay = pwrDisplay;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<String> getIsNull() {
		return isNull;
	}

	public void setIsNull(List<String> isNull) {
		this.isNull = isNull;
	}

	public List<String> getIsNotNull() {
		return isNotNull;
	}

	public void setIsNotNull(List<String> isNotNull) {
		this.isNotNull = isNotNull;
	}

	public List<Long> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public String getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(String orderBy) {
		this.orderBy = orderBy;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public List<VActivity> getActivities() {
		return activities;
	}

	public void setActivities(List<VActivity> activities) {
		this.activities = activities;
	}

	public List<WorkoutType> getExcludeWorkouts() {
		return excludeWorkouts;
	}

	public void setExcludeWorkouts(List<WorkoutType> excludeWorkouts) {
		this.excludeWorkouts = excludeWorkouts;
	}

	public List<ActivityType> getSports() {
		return sports;
	}

	public void setSports(List<ActivityType> sports) {
		this.sports = sports;
	}

	public Map<String, String> getMeta() {
		return meta;
	}

	public void setMeta(Map<String, String> meta) {
		this.meta = meta;
	}

	public List<DayRange> getRangesDay() {
		return rangesDay;
	}

	public void setRangesDay(List<DayRange> rangesDay) {
		this.rangesDay = rangesDay;
	}
}