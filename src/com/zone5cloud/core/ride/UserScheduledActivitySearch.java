package com.zone5cloud.core.ride;

import java.util.List;
import java.util.Map;

import com.zone5cloud.core.enums.Country;
import com.zone5cloud.core.search.DateRange;
import com.zone5cloud.core.search.DayRange;
import com.zone5cloud.core.search.Order;

public class UserScheduledActivitySearch {

	/** Search for activities within this lat/lng radius */
	private Double lat;
	
	/** Search for activities within this lat/lng radius */
	private Double lon;
	
	/** km */
	private Integer radius;
	
	/** Limit by distance ranges */
	private Map<String, List<Double>> ranges;
	
	/** Limit to activities which have a start time within this timestamp range */
	private DateRange dateRange;
	
	/** Limit to activities which have a start time within this year/day range */
	private DayRange dayRange;
	
	private String name;
	
	private List<Order> order;
	
	/** Limit the search to these types */
	private List<UserScheduledActivityType> atypes;
	
	/** Limit the search to these regions */
	private List<Region> regions;
	
	/** Limit the search to these countries */
	private List<Country> countries;
	
	public UserScheduledActivitySearch() { }

	public List<Country> getCountries() {
		return countries;
	}
	
	public void setCountries(List<Country> countries) {
		this.countries = countries;
	}
	
	public Double getLat() {
		return lat;
	}

	public void setLat(Double lat) {
		this.lat = lat;
	}

	public Double getLon() {
		return lon;
	}

	public void setLon(Double lon) {
		this.lon = lon;
	}

	public Integer getRadius() {
		return radius;
	}

	public void setRadius(Integer radius) {
		this.radius = radius;
	}

	public Map<String, List<Double>> getRanges() {
		return ranges;
	}

	public void setRanges(Map<String, List<Double>> ranges) {
		this.ranges = ranges;
	}

	public DateRange getDateRange() {
		return dateRange;
	}

	public void setDateRange(DateRange dateRange) {
		this.dateRange = dateRange;
	}

	public DayRange getDayRange() {
		return dayRange;
	}

	public void setDayRange(DayRange dayRange) {
		this.dayRange = dayRange;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Order> getOrder() {
		return order;
	}

	public void setOrder(List<Order> order) {
		this.order = order;
	}

	public List<UserScheduledActivityType> getAtypes() {
		return atypes;
	}

	public void setAtypes(List<UserScheduledActivityType> atypes) {
		this.atypes = atypes;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}
}
