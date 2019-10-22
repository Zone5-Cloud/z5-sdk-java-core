package com.zone5ventures.common.routes;

import java.util.Set;

import com.zone5ventures.common.enums.ActivityType;
import com.zone5ventures.common.enums.DataAccessRequest;
import com.zone5ventures.common.enums.Equipment;
import com.zone5ventures.common.enums.FileUploadState;
import com.zone5ventures.common.enums.Terrain;
import com.zone5ventures.common.enums.UnitMeasurement;
import com.zone5ventures.common.users.User;

public class UserRoute {

	private Long id;
	
	/** When this object was first created */
	private Long createdTime;
	
	/** When this object was last modified */
	private Long modifedTime;
	
	/** Who created this object */
	private String createdBy;
	
	/** Who last modified this object */
	private String modifedBy;
	
	/** Who owns this object */
	private User user;
	
	// private VCompany company;
	
	/** The number of times this route should be completed */
	private Short rpt;
		
	/** A nice name for this route */
	private String name;
	
	/** The origin of how this route came into the system. ie created manually, cloned from an activity, synced from Strava etc */
	private String source;
	
	/** The original UUID/id of this route in it's origin system */
	private String sourceId;
	
	/** The locality of where this route begins */
	private String locality;
	
	/** The mid locality of this route */
	private String locality1;
	
	/** The locality of where this route ends */
	private String locality2;
	
	/** The language that the way point messages are in */
	private String locale;
	
	/** The metric/imperial that the way point messages are in */
	private UnitMeasurement units;
	
	/** A description of this route */
	private String descr;
	
	/** The total distance (meters) of this route */
	private Double distance;
	
	/** The total elevation gain (meters) of this route */
	private Integer ascent;
	
	/** The total elevation loss (meters) of this route */
	private Integer descent;
	
	/** The estimated time for this route (seconds) */
	private Integer duration;
	
	/** The lowest altitude point in this route (meters) */
	private Integer minAlt;
	
	/** The highest altitude point in this route (meters) */
	private Integer maxAlt;
	
	/** The average altitude point in this route (meters) */
	private Integer avgAlt;
	
	/** Min latitude in this route - for geo boxing */
	private Integer minLatitude;
	
	/** Min longitude in this route - for geo boxing */
	private Integer minLongitude;
	
	/** Max latitude in this route - for geo boxing */
	private Integer maxLatitude;
	
	/** Max longitude in this route - for geo boxing */
	private Integer maxLongitude;
	
	/** The sport type for this route - ie cycling, running etc */
	private ActivityType type;
	
	/** The recommended cycling equipment for this route - ie TT, road, mtb etc */
	private Set<Equipment> equipment;
	
	/** User type of terrain in this route */
	private Set<Terrain> terrain;
	
	/** User defined tags for this route */
	private Set<String> tags;
	
	///** Use for tracking favorite etc */
	//private Long mask;
	
	/** A bitmask used for tracking visibility / sharing of this route - see UserRouteVisibilityMask */
	private Integer vmask;
	
	/** Permissions which the current user has scope to on this object */
	private Set<DataAccessRequest> permissions;
	
	/** The processing state - used when a route is imported or cloned from another source */
	private FileUploadState state;
	
	/** Any processing / import error message (if any) */
	private String message;
	
	/** Start location */
	private Double lat1;
	private Double lon1;
	
	/** End location */
	private Double lat2;
	private Double lon2;
	
	/** My rating of this route (if any) */
	private Short rating;
	
	/** The overall rating of this route (if any) */
	private Short publicRating;
	
	/** The number of public ratings (if any) */
	private Integer publicRatingCnt;
	
	private String uuid;
	
	public UserRoute() {}
	
	public String getUuid() {
		return uuid;
	}
	
	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	public Long getModifedTime() {
		return modifedTime;
	}

	public void setModifedTime(Long modifedTime) {
		this.modifedTime = modifedTime;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getModifedBy() {
		return modifedBy;
	}

	public void setModifedBy(String modifedBy) {
		this.modifedBy = modifedBy;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Short getRpt() {
		return rpt;
	}

	public void setRpt(Short rpt) {
		this.rpt = rpt;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}

	public String getSourceId() {
		return sourceId;
	}

	public void setSourceId(String sourceId) {
		this.sourceId = sourceId;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public String getLocality1() {
		return locality1;
	}

	public void setLocality1(String locality1) {
		this.locality1 = locality1;
	}

	public String getLocality2() {
		return locality2;
	}

	public void setLocality2(String locality2) {
		this.locality2 = locality2;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public UnitMeasurement getUnits() {
		return units;
	}

	public void setUnits(UnitMeasurement units) {
		this.units = units;
	}

	public String getDescr() {
		return descr;
	}

	public void setDescr(String descr) {
		this.descr = descr;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
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

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public Integer getMinAlt() {
		return minAlt;
	}

	public void setMinAlt(Integer minAlt) {
		this.minAlt = minAlt;
	}

	public Integer getMaxAlt() {
		return maxAlt;
	}

	public void setMaxAlt(Integer maxAlt) {
		this.maxAlt = maxAlt;
	}

	public Integer getAvgAlt() {
		return avgAlt;
	}

	public void setAvgAlt(Integer avgAlt) {
		this.avgAlt = avgAlt;
	}

	public Integer getMinLatitude() {
		return minLatitude;
	}

	public void setMinLatitude(Integer minLatitude) {
		this.minLatitude = minLatitude;
	}

	public Integer getMinLongitude() {
		return minLongitude;
	}

	public void setMinLongitude(Integer minLongitude) {
		this.minLongitude = minLongitude;
	}

	public Integer getMaxLatitude() {
		return maxLatitude;
	}

	public void setMaxLatitude(Integer maxLatitude) {
		this.maxLatitude = maxLatitude;
	}

	public Integer getMaxLongitude() {
		return maxLongitude;
	}

	public void setMaxLongitude(Integer maxLongitude) {
		this.maxLongitude = maxLongitude;
	}

	public ActivityType getType() {
		return type;
	}

	public void setType(ActivityType type) {
		this.type = type;
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

	public Set<String> getTags() {
		return tags;
	}

	public void setTags(Set<String> tags) {
		this.tags = tags;
	}

	public Integer getVmask() {
		return vmask;
	}

	public void setVmask(Integer vmask) {
		this.vmask = vmask;
	}

	public Set<DataAccessRequest> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<DataAccessRequest> permissions) {
		this.permissions = permissions;
	}

	public FileUploadState getState() {
		return state;
	}

	public void setState(FileUploadState state) {
		this.state = state;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Double getLat1() {
		return lat1;
	}

	public void setLat1(Double lat1) {
		this.lat1 = lat1;
	}

	public Double getLon1() {
		return lon1;
	}

	public void setLon1(Double lon1) {
		this.lon1 = lon1;
	}

	public Double getLat2() {
		return lat2;
	}

	public void setLat2(Double lat2) {
		this.lat2 = lat2;
	}

	public Double getLon2() {
		return lon2;
	}

	public void setLon2(Double lon2) {
		this.lon2 = lon2;
	}

	public Short getRating() {
		return rating;
	}

	public void setRating(Short rating) {
		this.rating = rating;
	}

	public Short getPublicRating() {
		return publicRating;
	}

	public void setPublicRating(Short publicRating) {
		this.publicRating = publicRating;
	}

	public Integer getPublicRatingCnt() {
		return publicRatingCnt;
	}

	public void setPublicRatingCnt(Integer publicRatingCnt) {
		this.publicRatingCnt = publicRatingCnt;
	}
}
