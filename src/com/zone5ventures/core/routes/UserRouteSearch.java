package com.zone5ventures.core.routes;

import java.util.List;
import java.util.Map;

import com.zone5ventures.core.search.Order;

/**
 * A Search criteria for user routes.<p>
 * 
 * @author andrewhall
 *
 */
public class UserRouteSearch {

	/** Field name to a numeric range. ie minAlt: [1000,1500] - used to search a range for numeric fields */
	private Map<String, List<Double>> ranges;
	
	/** Limit the search to attributes within a route */
	private UserRoute route;
	
	/** Limit the search to routes owned/created by these userIds */
	private List<Long> userIds;
	
	/** Order by fields ascending/descending */
	private List<Order> orderBy;
	
	/** Specific UserRoute id's to limit the search results to */
	private List<Long> ids;
		
	/** Geobound the search - use in conjunction of the route.lat1, route.lon1 etc (km) */
	private Integer radius;
	
	public UserRouteSearch() {}

	public Map<String, List<Double>> getRanges() {
		return ranges;
	}

	public void setRanges(Map<String, List<Double>> ranges) {
		this.ranges = ranges;
	}

	public UserRoute getRoute() {
		return route;
	}

	public void setRoute(UserRoute route) {
		this.route = route;
	}

	public List<Long> getUserIds() {
		return userIds;
	}

	public void setUserIds(List<Long> userIds) {
		this.userIds = userIds;
	}

	public List<Order> getOrderBy() {
		return orderBy;
	}

	public void setOrderBy(List<Order> orderBy) {
		this.orderBy = orderBy;
	}

	public List<Long> getIds() {
		return ids;
	}

	public void setIds(List<Long> ids) {
		this.ids = ids;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}
}
