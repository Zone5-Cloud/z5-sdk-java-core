package com.zone5cloud.core.day;

import java.util.List;
import java.util.Map;

import com.zone5cloud.core.enums.ActivityType;
import com.zone5cloud.core.search.DateRange;
import com.zone5cloud.core.search.Order;

public class UserDaySearch {
	
	private List<Long> userIds;
	
	private List<DateRange> ranges;
	
	private List<String> isNotNull;
	
	private List<String> isNull;
	
	private List<Order> order;
	
	private Integer day;
	
	private Integer year;
	
	private Integer dayOffset;
	
	private List<Long> teamactivityIds;
	
	private Boolean teamactivityStages;
	
	private List<ActivityType> sports;
	
	private Map<String, String> meta;
	
	public UserDaySearch() { }

	public List<Long> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public List<DateRange> getRanges() {
		return ranges;
	}

	public void setRanges(List<DateRange> ranges) {
		this.ranges = ranges;
	}

	public List<String> getIsNotNull() {
		return isNotNull;
	}

	public void setIsNotNull(List<String> isNotNull) {
		this.isNotNull = isNotNull;
	}

	public List<String> getIsNull() {
		return isNull;
	}

	public void setIsNull(List<String> isNull) {
		this.isNull = isNull;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
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

	public Integer getDayOffset() {
		return dayOffset;
	}

	public void setDayOffset(Integer dayOffset) {
		this.dayOffset = dayOffset;
	}

	public List<Long> getTeamactivityIds() {
		return teamactivityIds;
	}

	public void setTeamactivityIds(List<Long> teamactivityIds) {
		this.teamactivityIds = teamactivityIds;
	}

	public Boolean getTeamactivityStages() {
		return teamactivityStages;
	}

	public void setTeamactivityStages(Boolean teamactivityStages) {
		this.teamactivityStages = teamactivityStages;
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

}
