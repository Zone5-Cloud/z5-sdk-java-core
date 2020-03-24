package com.zone5cloud.core.ride;

import java.util.Set;

import com.zone5cloud.core.company.Company;
import com.zone5cloud.core.enums.ActivityType;
import com.zone5cloud.core.enums.Country;
import com.zone5cloud.core.enums.DataAccessRequest;
import com.zone5cloud.core.enums.Equipment;
import com.zone5cloud.core.routes.UserRoute;
import com.zone5cloud.core.users.User;

public class UserScheduledActivity {
		
	private Long id;
	
	/** The user who created this ride - will be the leader in a non community/demo/event */
	private User user;
	
	private Company company;
	
	/** The route associated with this ride */
	private UserRoute route;
	
	/** The ScheduledActivity.id parent - when this ride is a repeated recurrance */
	private Long parentId;
	
	/** Unique UUID for this ride which can be used in share URLs */
	private String uuid;
	
	/** A nice name for the ride */
	private String name;
	
	/** The date/time the ride is scheduled for */
	private DateTime time;
	
	/** The meeting point latitude */
	private Double lat;
	
	/** The meeting point longitude */
	private Double lon;
	
	/** Distance in meters */
	private Double distance;
	
	/** Meeting point address */
	private String address;
	
	/** Description of the ride */
	private String description;
	
	/** Meeting point address name */
	private String meeting;
	
	/** Type of activity - ie ride */
	private ActivityType sport; 
	
	/** Type of ride - ie road, mtb etc (not used for demo/events, see tmask */
	private Equipment type;
	
	/** Effort of the ride (not used for demo/events, see emask */
	private ScheduledActivityEffort effort;
	
	/** Bitmask field where ordinals are from ScheduledActivityMaskOpts - ie community, private, turbo etc */
	private Set<ScheduledActivityMaskOpts> opts;
	
	/** How often the ride is repeated */
	private ScheduledActivityRecurrance recurrence;
	
	/** How long the recurrence is scheduled for */
	private DateTime recurrenceEnd;
	
	/** max number of participants */
	private Integer max;
	
	/** Timezone where this activity will be completed */
	private String tz;
	
	/** Country where this ride is being hosted */
	private Country country;
	
	/** Country where this ride is being hosted */
	private Region region;
	
	/** A short url for sharing this activity */
	private String url;
	
	/** Those that are attending the ride */
	private Set<User> riders;
	
	/** Date range end for a demo/event */
	private DateTime timeEnd;
	
	/** Distance range end for a demo/event */
	private Double distanceHi;
	
	/** Multiple efforts - for demo/events only */
	private Set<ScheduledActivityEffort> efforts;
	
	/** Multiple types - for demo/events only */
	private Set<Equipment> types;
	
	/** An optional URL which this ride/event/demo day relates */
	private String eventUrl;
	
	/** Logo / image URL (max 300 kb, jpg or png) */
	private String imageUrl;
	
	/** Static map URL (if any) */
	private String mapUrl;
	
	/** The activity type - ie group ride, vs demo vs event day */
	private UserScheduledActivityType atype;
	
	private Set<DataAccessRequest> permissions;
	
	public UserScheduledActivity() { }
	
	public Set<DataAccessRequest> getPermissions() {
		return permissions;
	}
	
	public void setPermissions(Set<DataAccessRequest> permissions) {
		this.permissions = permissions;
	}
	
	public String getMapUrl() {
		return mapUrl;
	}
	
	public void setMapUrl(String mapUrl) {
		this.mapUrl = mapUrl;
	}

	public DateTime getTimeEnd() {
		return timeEnd;
	}
	
	public void setTimeEnd(DateTime timeEnd) {
		this.timeEnd = timeEnd;
	}
	
	public Double getDistanceHi() {
		return distanceHi;
	}

	public void setDistanceHi(Double distanceHi) {
		this.distanceHi = distanceHi;
	}

	public String getEventUrl() {
		return eventUrl;
	}

	public void setEventUrl(String eventUrl) {
		this.eventUrl = eventUrl;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public UserScheduledActivityType getAtype() {
		return atype;
	}

	public void setAtype(UserScheduledActivityType atype) {
		this.atype = atype;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public UserRoute getRoute() {
		return route;
	}

	public void setRoute(UserRoute route) {
		this.route = route;
	}

	public Long getParentId() {
		return parentId;
	}

	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}

	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
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

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getMeeting() {
		return meeting;
	}

	public void setMeeting(String meeting) {
		this.meeting = meeting;
	}

	public ActivityType getSport() {
		return sport;
	}

	public void setSport(ActivityType sport) {
		this.sport = sport;
	}

	public Equipment getType() {
		return type;
	}

	public void setType(Equipment type) {
		this.type = type;
	}

	public ScheduledActivityEffort getEffort() {
		return effort;
	}

	public void setEffort(ScheduledActivityEffort effort) {
		this.effort = effort;
	}

	public ScheduledActivityRecurrance getRecurrence() {
		return recurrence;
	}

	public void setRecurrence(ScheduledActivityRecurrance recurrence) {
		this.recurrence = recurrence;
	}

	public Integer getMax() {
		return max;
	}

	public void setMax(Integer max) {
		this.max = max;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public Country getCountry() {
		return country;
	}

	public void setCountry(Country country) {
		this.country = country;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public DateTime getTime() {
		return time;
	}

	public void setTime(DateTime time) {
		this.time = time;
	}

	public DateTime getRecurrenceEnd() {
		return recurrenceEnd;
	}

	public void setRecurrenceEnd(DateTime recurrenceEnd) {
		this.recurrenceEnd = recurrenceEnd;
	}

	public Set<User> getRiders() {
		return riders;
	}

	public void setRiders(Set<User> riders) {
		this.riders = riders;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Set<ScheduledActivityMaskOpts> getOpts() {
		return opts;
	}

	public void setOpts(Set<ScheduledActivityMaskOpts> opts) {
		this.opts = opts;
	}

	public Set<ScheduledActivityEffort> getEfforts() {
		return efforts;
	}

	public void setEfforts(Set<ScheduledActivityEffort> efforts) {
		this.efforts = efforts;
	}

	public Set<Equipment> getTypes() {
		return types;
	}

	public void setTypes(Set<Equipment> types) {
		this.types = types;
	}
	
	public Region getRegion() {
		return region;
	}
	
	public void setRegion(Region region) {
		this.region = region;
	}
}
