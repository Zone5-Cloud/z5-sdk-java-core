package com.zone5ventures.core.search;

import java.util.List;

import com.zone5ventures.core.activities.VActivity;
import com.zone5ventures.core.enums.ActivityType;
import com.zone5ventures.core.enums.RelativePeriod;

/** This is derived from the original VTeamMultiRidePeriod impl - it is used on aggregate reporting focused endpoints */
public class SearchInputReport {
	
	private ActivityType type;
	
	private Boolean alltime;
	
	// /** Percentages - ie for use with days since last peak within X% */
	// private List<Integer> withinP;
		
	// private AggregatePeriod period;
	
	// private Integer depth;
	
	private List<Long> userIds;
	
	// private Long groupId;
	
	private List<DateRange> ranges;
	
	// private List<VTeamActivity> teamactivities;
	
	private List<VActivity> activities;
	
	/** Only include results related to these activities */
	private List<VActivity> limit;
	
	// private String groupBy;
	
	// private VTeamMultiRidePeriod exclude;
	
	//private Boolean flag1;
	
	//private Boolean flag2;
	
	//private Boolean flag3;
	
	//private Boolean extName;
	
	//private Boolean noCache;
	
	// private Boolean returnIds;
	
	private Boolean in;
	
	private DateRange range;
	
	private Long opts;
	
	/** Option to include zones - defaults to true and used in power curve */
	private Boolean incZones;
	
	private List<RelativePeriod> references;
	
	/** Simple field list */
	private List<String> sfields;
	
	private List<String> isNotNull;
	
	private List<String> isNull;
	
	private List<Order> order;
	
	//private Set<String> tags;
	
	public SearchInputReport() { 
		opts = 3L;
		// search.opts = search.opts | (1 << 0); // set that we don't need the verbose field mapping
		// search.opts = search.opts | (1 << 1); // set a no-cache flag for this search
		// search.opts = search.opts | (1 << 3); // set a no-decorate flag for this search
	}
	
	public List<RelativePeriod> getReferences() {
		return references;
	}
	
	public void setReferences(List<RelativePeriod> references) {
		this.references = references;
	}

	public ActivityType getType() {
		return type;
	}

	public void setType(ActivityType type) {
		this.type = type;
	}

	public Boolean getAlltime() {
		return alltime;
	}

	public void setAlltime(Boolean alltime) {
		this.alltime = alltime;
	}

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

	public List<VActivity> getActivities() {
		return activities;
	}

	public void setActivities(List<VActivity> activities) {
		this.activities = activities;
	}

	public List<VActivity> getLimit() {
		return limit;
	}

	public void setLimit(List<VActivity> limit) {
		this.limit = limit;
	}

	public Boolean getIn() {
		return in;
	}

	public void setIn(Boolean in) {
		this.in = in;
	}

	public DateRange getRange() {
		return range;
	}

	public void setRange(DateRange range) {
		this.range = range;
	}

	public Long getOpts() {
		return opts;
	}

	public void setOpts(Long opts) {
		this.opts = opts;
	}

	public Boolean getIncZones() {
		return incZones;
	}

	public void setIncZones(Boolean incZones) {
		this.incZones = incZones;
	}

	public List<String> getSfields() {
		return sfields;
	}

	public void setSfields(List<String> sfields) {
		this.sfields = sfields;
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

}
