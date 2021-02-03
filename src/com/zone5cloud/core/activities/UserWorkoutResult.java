package com.zone5cloud.core.activities;

import java.util.List;
import java.util.Map;

import com.zone5cloud.core.SearchableDataObject;
import com.zone5cloud.core.enums.ActivityResultType;
import com.zone5cloud.core.enums.ActivityType;
import com.zone5cloud.core.enums.DataAccessRequest;
import com.zone5cloud.core.enums.DataFileChannel;
import com.zone5cloud.core.enums.Equipment;
import com.zone5cloud.core.enums.EventTeamCategory;
import com.zone5cloud.core.enums.LapType;
import com.zone5cloud.core.enums.PowerThresholdType;
import com.zone5cloud.core.enums.ResultReview;
import com.zone5cloud.core.enums.ResultSource;
import com.zone5cloud.core.enums.TScoreType;
import com.zone5cloud.core.enums.UserWorkoutFailedReason;
import com.zone5cloud.core.enums.UserWorkoutState;
import com.zone5cloud.core.enums.WorkoutType;
import com.zone5cloud.core.routes.UserRoute;
import com.zone5cloud.core.users.User;

/**
 * This is a view object related to activity data. It has a lot of possible fields, but most are only populated if a specific field is requested via the Activities API.
 * 
 * Some fields are also sport specific - and will only be set on activities of the relevant sport type.
 * 
 * @author andrewhall
 *
 */
public class UserWorkoutResult extends SearchableDataObject {

	/** UserWorkoutResult.id */
	private Long id;
	
	/** The year that this activity was completed */
	private Integer year;
	
	/** The day of year that this activity was completed */
	private Integer dayOfYear;
	
	/** A unix timestamp (ms) of when this activity was last modified */
	private Long modifedTime;
	
	/** A unix timestamp (ms) of when this activity was created in the system (not the actual activity start time) */
	private Long createdTime;
	
	/** Flag to track if this workout is tagged as a favorite/bookmarked */
	private Boolean favorite;
		
	/** Metadata on the head unit used to complete this activity */
	private UserHeadunit headunit;
	
	/** Metadata on the power meter used to complete this activity */
	private UserPowerMeter powermeter;
	
	/** A generic count param - often used to convey the number of records which comprise an aggregate calculation */
	private Integer count;
	
	/** Metadata related to day attributes on the day this activity was scheduled/completed */
	//private VUserDay day;
	
	/** Metadata related to HRV on the day this activity was scheduled/completed */
	//private VUserDayHRV hrv;
	
	/** Metadata related to sleep on the day this activity was scheduled/completed */
	//private VUserDaySleep sleep;
	
	/** Metadata related to subjective ratings completed on the day this activity was scheduled/completed */
	//private VUserDayRatings rating;
			
	/** Metadata related to route used for this activity */
	private UserRoute route;
	
	/** Rating of the scheduled workout */
	//private VUserWorkoutResultRating sessionrating;
	
	/** Metadata related to a scheduled workout/event */
	private UserWorkoutDetails scheduled;
	
	/** Metadata related to a scheduled workout/event */
	//private VUserEvent event;
	
	/** Metadata related to the training plan this activity relates to */
	//private VUserPlan plan;
		
	/** A flag indicating how this activity result came into the system */
	private ResultSource source;
	
	/** Locality based of geolocation data */
	private String locality;
	
	/** A bitmask tracking which fields have been manually modified in the activity results */
	private Long fieldOverrideMask;
	
	/** A bitmask tracking which fields have been manually modified in the activity results */
	private Long fieldOverrideMask2;
	
	/** A bitmask tracking potential data integrity issues with this activity data */
	private Integer reviewMask;
	
	/** A bitmask tracking which data channels are available in this activity */
	private Integer channelMask;
	
	/**  A bitmask tracking which file processing features have run */
	private Long featureMask;
	
	/** A bitmask tracking which time in zones have been calculated for this activity */
	private Integer zoneMask;
	
	private Integer notes;
	
	private User user;
	
	/** Start location of the activity */
	private Double lat1;
	/** Start location of the activity */
	private Double lon1;
	
	/** End location of the activity */
	private Double lat2;
	/** End location of the activity */
	private Double lon2;
	
	/** Power efficiency - a relation of power to heart rate */
	private Double ef;
		
	/** ascent / training/60/60 */
	private Double vam;
	
	/** subjective rating - rate of perceived effort */
	private Double rpe;
	
	/** subjective rating - pain score / leg quality score */
	private Double pain;
	
	/** subjective rating - total quality recovery */
	private Double tqr;
	
	/** Avg torque (nm) */
	private Integer avgNm;
	
	/** Max torque (nm) */
	private Integer maxNm;
		
	/** Cafe time - time difference between training and elapsed time (seconds) */
	private Integer idle;

	/** Number of seconds where no power was being produced */
	private Integer noPower;
	
	/** avg Power / Heart Rate / RPE * 1000 */
	private Integer gscore;
	
	/** average heart rate / RPE */
	private Double rpeh;
	
	/** aPower:HR (altitude corrected average power / average heart rate) */
	private Double rpeef;
	
	/** aPower:RPE (altitude corrected average power / RPE) */
	private Double rpep;
	
	/** State of the workout - ie completed, did not start, pending etc */
	private UserWorkoutState state;
	
	/** Flag for tracking whether this activity has been reviewed or has data integrity issues */
	private ResultReview review;
	
	/** Reason why a workout was not completed */
	private UserWorkoutFailedReason reason;
	
	/** Activity name */
	private String name;
	
	/** Activity description */
	private String descr;
			
	/** Display name for the event course */
	private String course;
	
	/** Event category */
	private EventTeamCategory category;
	
	/** UserWorkout.id - if this result relates to a workout */
	private Long workoutId;
	
	/** UserWorkoutFile.id - if this result relates to a file */
	private Long fileId;
	
	/** UserEvent.id - if this result relates to an event */
	private Long eventId;
	
	/** This id coupled with the ActivityResultType is a unique key for this activity */
	private Long activityId;
	
	/** This value coupled with the activityId is a unique key for this activity */
	private ActivityResultType activity;

	/** Timestamp of the result - this will match either the workout or event scheduled date or the start time of an adhoc ride */
	private Long ts;
	
	/** Timestamp of when the activity actually commenced */
	private Long startTs;
		
	/** The timezone this activity is scheduled or completed in */
	private String tz;
	
	/** Type of activity - ie ride, run etc */
	private ActivityType type;
	
	/** Equipment used in the activity (cycling) */
	private Equipment equipment;
	
	/** Type of workout - ie training, event etc */
	private WorkoutType workout;
		
	/** Lap number (if any - only set on intervals) */
	private Integer lap;
	
	/** Lap type (if any - only set on intervals) */
	private LapType lapType;
		
	/** The user's weight at the time of the activity (kg) */
	private Double weight;
			
	/** Actual movement time (seconds) */
	private Integer training;
	
	/** Elapsed time (seconds) */
	private Integer elapsed;
	
	private Double vo2max;
	
	/** Total distance */
	private Double distance;
	
	/** Power based T-Score */
	private Double tscorepwr;
	
	/** Heart rate based T-Score */
	private Double tscorehr;
	
	/** Threshold heart rate */
	private Integer atBpm;
		
	/** Intensity factor */
	private Integer intensityFactor;
	
	/** Estimated calories for the activity */
	private Integer calories;
	
	/** Estimated kj for the activity */
	private Integer kj;
	
	/** Estimated kj/hour for the activity */
	private Double kjh;
	
	/** Estimated kj/body weight (kg) for the activity */
	private Double kjkg;
	
	/** Estimated kj/h/kg for the activity */
	private Double kjhkg;
		
	/** Adjusted power for the activity */
	private Integer np;
	
	/** Variability index for the activity */
	private Double vi;
		
	/** Intensity for the activity */
	private Double iff;
	
	/** watts/kg */
	private Double wkg;
	
	/** The threshold power when this activity was completed */
	private Integer thresholdWatts;
	
	/** The estimated threshold based on this activity */
	private Integer estThresWatts;
	
	private Integer estThresWattsKg;
	
	/** The threshold type used for this activity */
	private PowerThresholdType thresholdType;
	
	/** The tscore calculation used for this activity */
	private TScoreType tscoreType;
	
	/** The threshold heart rate when this activity was completed */
	private Integer thresholdBpm;
	
	/** The threshold pace when this activity was completed */
	private Integer thresholdPace;
	
	/** The max heart rate set when this activity was completed (ie user profile maxHr, not the peak heart rate in the activity */
	private Integer maxHr;
	
	/** Total elevation gain */
	private Integer ascent;
	
	/** Total elevation loss */
	private Integer descent;
	
	/** Starting altitude */
	private Integer startAlt;
	
	/** Finishing altitude */
	private Integer endAlt;
	
	/** Min altitude */
	private Integer minAlt;
	
	/** Max altitude */
	private Integer maxAlt;
	
	/** Average altitude */
	private Integer avgAlt;
	
	/** Speed (km/h) */
	private Double avgSpeed;
	
	/** Speed (km/h) */
	private Double maxSpeed;
	
	/** Cadence (rpm) */
	private Integer avgCadence;
	
	/** Cadence (rpm) */
	private Integer maxCadence;
	
	/** Saturated Hb percent */
	private Double minSatHbP;
	/** Saturated Hb percent */
	private Double maxSatHbP;
	/** Saturated Hb percent */
	private Double avgSatHbP;

	/** TotalHemoglobinConc */
	private Double minTotHbC;
	/** TotalHemoglobinConc */
	private Double maxTotHbC;
	/** TotalHemoglobinConc */
	private Double avgTotHbC;
	
	/** Temperature (celsius) */
	private Integer minTemp;
	/** Temperature (celsius) */
	private Integer maxTemp;
	/** Temperature (celsius) */
	private Integer avgTemp;
	
	/** Heart rate (BPM) */
	private Integer minBpm;
	/** Heart rate (BPM) */
	private Integer avgBpm;
	/** Heart rate (BPM) */
	private Integer maxBpm;
	
	/** Percentage of maxHR */
	private Double avgBpmP;
	
	/** Percentage of maxHR */
	private Double maxBpmP;	
	
	/** Average power */
	private Integer avgWatts;

	/** Estimated critical power */
	private Integer cp;
	
	/** Anaerobic work capacity - Joules */
	private Integer awc;
	
	private Double tau;	
	
	/** Average power above threshold */
	private Integer avgWattsAboveCP;
	
	/** Average power below threshold */
	private Integer avgWattsBelowCP;
	
	/** Time above threshold */
	private Integer timeAboveCP;	
	
	/** Maximum power */
	private Integer maxWatts;
	
	private Integer peak3secWatts;
	private Integer peak3secWattsP;
	private Double peak3secWkg;

	private Integer peak4secWatts;
	private Integer peak4secWattsP;
	private Double peak4secWkg;
	
	private Integer peak5secWatts;
	private Integer peak5secWattsP;
	private Double peak5secWkg;
	
	private Integer peak10secWatts;
	private Integer peak10secWattsP;
	private Double peak10secWkg;
	
	private Integer peak12secWatts;
	private Integer peak12secWattsP;
	private Double peak12secWkg;
	
	private Integer peak20secWatts;
	private Integer peak20secWattsP;
	private Double peak20secWkg;
	
	private Integer peak30secWatts;
	private Integer peak30secWattsP;
	private Double peak30secWkg;
	
	private Integer peak1minWatts;
	private Integer peak1minWattsP;
	private Double peak1minWkg;
	
	private Integer peak2minWatts;
	private Integer peak2minWattsP;
	private Double peak2minWkg;
	
	private Integer peak3minWatts;
	private Integer peak3minWattsP;
	private Double peak3minWkg;
	
	private Integer peak4minWatts;
	private Integer peak4minWattsP;
	private Double peak4minWkg;
	
	private Integer peak5minWatts;
	private Integer peak5minWattsP;
	private Double peak5minWkg;
	
	private Integer peak6minWatts;
	private Integer peak6minWattsP;
	private Double peak6minWkg;
	
	private Integer peak10minWatts;
	private Integer peak10minWattsP;
	private Double peak10minWkg;
	
	private Integer peak12minWatts;
	private Integer peak12minWattsP;
	private Double peak12minWkg;

	private Integer peak15minWatts;
	private Integer peak15minWattsP;
	private Double peak15minWkg;
	
	private Integer peak16minWatts;
	private Integer peak16minWattsP;
	private Double peak16minWkg;
	
	private Integer peak20minWatts;
	private Integer peak20minWattsP;
	private Double peak20minWkg;
	
	private Integer peak24minWatts;
	private Integer peak24minWattsP;
	private Double peak24minWkg;
	
	private Integer peak30minWatts;
	private Integer peak30minWattsP;
	private Double peak30minWkg;

	private Integer peak40minWatts;
	private Integer peak40minWattsP;
	private Double peak40minWkg;
	
	private Integer peak60minWatts;
	private Integer peak60minWattsP;
	private Double peak60minWkg;
	
	private Integer peak75minWatts;
	private Integer peak75minWattsP;
	private Double peak75minWkg;
	
	private Integer peak80minWatts;
	private Integer peak80minWattsP;
	private Double peak80minWkg;
	
	private Integer peak90minWatts;
	private Integer peak90minWattsP;
	private Double peak90minWkg;
		
	private Integer peak120minWatts;
	private Integer peak120minWattsP;
	private Double peak120minWkg;
		
	private Integer peak150minWatts;
	private Integer peak150minWattsP;
	private Double peak150minWkg;
	
	private Integer peak180minWatts;
	private Integer peak180minWattsP;
	private Double peak180minWkg;
	
	private Integer peak210minWatts;
	private Integer peak210minWattsP;
	private Double peak210minWkg;
	
	private Integer peak240minWatts;
	private Integer peak240minWattsP;
	private Double peak240minWkg;
	
	private Integer peak360minWatts;
	private Integer peak360minWattsP;
	private Double peak360minWkg;
	
	private Integer peak5secBpm;
	private Integer peak5secBpmP;
	
	private Integer peak10secBpm;
	private Integer peak10secBpmP;

	private Integer peak1minBpm;
	private Integer peak1minBpmP;
	
	private Integer peak5minBpm;
	private Integer peak5minBpmP;
	
	private Integer peak10minBpm;
	private Integer peak10minBpmP;
	
	private Integer peak20minBpm;
	private Integer peak20minBpmP;
	
	private Integer peak30minBpm;
	private Integer peak30minBpmP;
	
	private Integer peak60minBpm;
	private Integer peak60minBpmP;
		
	private Integer peak120minBpm;
	private Integer peak120minBpmP;
		
	private Integer peak180minBpm;
	private Integer peak180minBpmP;
	
	/** di2 gearing */
	private String minGear;
	private String maxGear;
	private String avgGear;
	private Integer gearChangeCnt;
	
	/** gradient % */
	private Double minGrade;
	private Double maxGrade;
	private Double avgGrade;
	
	private Double bpmSampleRate;
	private Long bpmSampleCnt;

	private Double pwrSampleRate;
	private Long pwrSampleCnt;
	
	/** power meter info */
	private String pwrDisplay;
	private Double pwrBattery;
	private Integer pwrBatteryP;
	private Integer pwrOffset;
	private Integer pwrSlope;
	private String pwrManufacturer;
	private Integer pwrManufacturerId;
	private String pwrVersion;
	private String pwrSerial;
	private String pwrProduct;
	private String pwrId;
	private Integer pwrBalance;
	private Long pwrDiscardCnt;
	
	/** Time in zones */
	private Map<Integer, Integer> secsInZonePwr;
	private Map<String, Integer> secsInSurface;
	private Map<Integer, Integer> secsInZonePace;
	private Map<Integer, Integer> secsInZoneWkg;
	private Map<Integer, Integer> secsInZoneNm;
	private Map<Integer, Integer> secsInZoneBpm;
	private Map<Integer, Integer> secsInZoneMaxHr;

	private List<UserIntensityZoneRange> wkgZones;
	private List<UserIntensityZoneRange> bpmZones;
	private List<UserIntensityZoneRange> maxHrZones;
	private List<UserIntensityZoneRange> pwrZones;
	private List<UserIntensityZoneRange> nmZones;
	private List<UserIntensityZoneRange> paceZones;
	private Map<Integer, String> bpmZoneNames;

	private List<UserWorkoutResult> laps;
	
	private DataFileUploadIndex fileindex;
	
	private Map<DataFileChannel, Map<Integer, Integer>> distributions;
	
	// private List<VUserWorkoutResultSwimLap> swimLaps;
	
	/** used for multisport and brick? sub-activities */
	private List<UserWorkoutResult> children;
	private List<UserWorkoutResult> related;
	private UserWorkoutResult parent;
				
	private Map<String, Object> metadata;
	
	private List<DataAccessRequest> permissions;
		
	private UserWorkoutResultAlt aap;
	
	private UserWorkoutResultExt ext;
	
	private UserWorkoutResultExt2 ext2;
	
	private UserWorkoutResultPeakPace pace;
	
	private UserWorkoutResultPeakLss lss;
	
	private UserWorkoutResultByHour hour;
	
	private UserWorkoutResultTurbo turbo;
	private UserWorkoutResultTurboExt turboExt;
	private UserWorkoutResultBike bike;
	private UserWorkoutResultGears gears;
	
	
	private List<UserWorkoutResultChannel> channels;
		
	public UserWorkoutResult() { }
	
	public DataFileUploadIndex getFileindex() {
		return fileindex;
	}
	
	public void setFileindex(DataFileUploadIndex fileindex) {
		this.fileindex = fileindex;
	}
	
	public UserWorkoutResultGears getGears() {
		return gears;
	}
	
	public void setGears(UserWorkoutResultGears gears) {
		this.gears = gears;
	}
	
	public UserWorkoutResultBike getBike() {
		return bike;
	}
	
	public void setBike(UserWorkoutResultBike bike) {
		this.bike = bike;
	}
	
	public List<UserWorkoutResultChannel> getChannels() {
		return channels;
	}
	
	public void setChannels(List<UserWorkoutResultChannel> channels) {
		this.channels = channels;
	}
	
	public UserWorkoutResultTurbo getTurbo() {
		return turbo;
	}
	
	public void setTurbo(UserWorkoutResultTurbo turbo) {
		this.turbo = turbo;
	}

	public UserWorkoutResultTurboExt getTurboExt() {
		return turboExt;
	}
	
	public void setTurboExt(UserWorkoutResultTurboExt turboExt) {
		this.turboExt = turboExt;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getDayOfYear() {
		return dayOfYear;
	}

	public void setDayOfYear(Integer dayOfYear) {
		this.dayOfYear = dayOfYear;
	}

	public Long getModifedTime() {
		return modifedTime;
	}

	public void setModifedTime(Long modifedTime) {
		this.modifedTime = modifedTime;
	}

	public Boolean getFavorite() {
		return favorite;
	}

	public void setFavorite(Boolean favorite) {
		this.favorite = favorite;
	}

	/*
	public VUserWorkoutDetailed getScheduled() {
		return scheduled;
	}

	public void setScheduled(VUserWorkoutDetailed scheduled) {
		this.scheduled = scheduled;
	}
*/
	public ResultSource getSource() {
		return source;
	}

	public void setSource(ResultSource source) {
		this.source = source;
	}

	public String getLocality() {
		return locality;
	}

	public void setLocality(String locality) {
		this.locality = locality;
	}

	public Long getFieldOverrideMask() {
		return fieldOverrideMask;
	}

	public void setFieldOverrideMask(Long fieldOverrideMask) {
		this.fieldOverrideMask = fieldOverrideMask;
	}

	public Long getFieldOverrideMask2() {
		return fieldOverrideMask2;
	}

	public void setFieldOverrideMask2(Long fieldOverrideMask2) {
		this.fieldOverrideMask2 = fieldOverrideMask2;
	}

	public Integer getReviewMask() {
		return reviewMask;
	}

	public void setReviewMask(Integer reviewMask) {
		this.reviewMask = reviewMask;
	}

	public Integer getChannelMask() {
		return channelMask;
	}

	public void setChannelMask(Integer channelMask) {
		this.channelMask = channelMask;
	}

	public Long getFeatureMask() {
		return featureMask;
	}

	public void setFeatureMask(Long featureMask) {
		this.featureMask = featureMask;
	}

	public Integer getZoneMask() {
		return zoneMask;
	}

	public void setZoneMask(Integer zoneMask) {
		this.zoneMask = zoneMask;
	}

	public Integer getNotes() {
		return notes;
	}

	public void setNotes(Integer notes) {
		this.notes = notes;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
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

	public Long getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Long createdTime) {
		this.createdTime = createdTime;
	}

	public Double getEf() {
		return ef;
	}

	public void setEf(Double ef) {
		this.ef = ef;
	}

	public Double getVam() {
		return vam;
	}

	public void setVam(Double vam) {
		this.vam = vam;
	}

	public Double getRpe() {
		return rpe;
	}

	public void setRpe(Double rpe) {
		this.rpe = rpe;
	}

	public Double getPain() {
		return pain;
	}

	public void setPain(Double pain) {
		this.pain = pain;
	}

	public Double getTqr() {
		return tqr;
	}

	public void setTqr(Double tqr) {
		this.tqr = tqr;
	}

	public Integer getAvgNm() {
		return avgNm;
	}

	public void setAvgNm(Integer avgNm) {
		this.avgNm = avgNm;
	}

	public Integer getMaxNm() {
		return maxNm;
	}

	public void setMaxNm(Integer maxNm) {
		this.maxNm = maxNm;
	}

	public Integer getIdle() {
		return idle;
	}

	public void setIdle(Integer idle) {
		this.idle = idle;
	}

	public Integer getNoPower() {
		return noPower;
	}

	public void setNoPower(Integer noPower) {
		this.noPower = noPower;
	}

	public Integer getGscore() {
		return gscore;
	}

	public void setGscore(Integer gscore) {
		this.gscore = gscore;
	}

	public Double getRpeh() {
		return rpeh;
	}

	public void setRpeh(Double rpeh) {
		this.rpeh = rpeh;
	}

	public Double getRpeef() {
		return rpeef;
	}

	public void setRpeef(Double rpeef) {
		this.rpeef = rpeef;
	}

	public Double getRpep() {
		return rpep;
	}

	public void setRpep(Double rpep) {
		this.rpep = rpep;
	}

	public UserWorkoutState getState() {
		return state;
	}

	public void setState(UserWorkoutState state) {
		this.state = state;
	}

	public ResultReview getReview() {
		return review;
	}

	public void setReview(ResultReview review) {
		this.review = review;
	}

	public UserWorkoutFailedReason getReason() {
		return reason;
	}

	public void setReason(UserWorkoutFailedReason reason) {
		this.reason = reason;
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

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public EventTeamCategory getCategory() {
		return category;
	}

	public void setCategory(EventTeamCategory category) {
		this.category = category;
	}

	public Long getWorkoutId() {
		return workoutId;
	}

	public void setWorkoutId(Long workoutId) {
		this.workoutId = workoutId;
	}

	public Long getFileId() {
		return fileId;
	}

	public void setFileId(Long fileId) {
		this.fileId = fileId;
	}

	public Long getEventId() {
		return eventId;
	}

	public void setEventId(Long eventId) {
		this.eventId = eventId;
	}

	public Long getActivityId() {
		return activityId;
	}

	public void setActivityId(Long activityId) {
		this.activityId = activityId;
	}

	public ActivityResultType getActivity() {
		return activity;
	}

	public void setActivity(ActivityResultType activity) {
		this.activity = activity;
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public Long getStartTs() {
		return startTs;
	}

	public void setStartTs(Long startTs) {
		this.startTs = startTs;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public ActivityType getType() {
		return type;
	}

	public void setType(ActivityType type) {
		this.type = type;
	}

	public Equipment getEquipment() {
		return equipment;
	}

	public void setEquipment(Equipment equipment) {
		this.equipment = equipment;
	}

	public WorkoutType getWorkout() {
		return workout;
	}

	public void setWorkout(WorkoutType workout) {
		this.workout = workout;
	}

	public Integer getLap() {
		return lap;
	}

	public void setLap(Integer lap) {
		this.lap = lap;
	}

	public LapType getLapType() {
		return lapType;
	}

	public void setLapType(LapType lapType) {
		this.lapType = lapType;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public Integer getTraining() {
		return training;
	}

	public void setTraining(Integer training) {
		this.training = training;
	}

	public Integer getElapsed() {
		return elapsed;
	}

	public void setElapsed(Integer elapsed) {
		this.elapsed = elapsed;
	}

	public Double getVo2max() {
		return vo2max;
	}

	public void setVo2max(Double vo2max) {
		this.vo2max = vo2max;
	}

	public Double getDistance() {
		return distance;
	}

	public void setDistance(Double distance) {
		this.distance = distance;
	}

	public Double getTscorepwr() {
		return tscorepwr;
	}

	public void setTscorepwr(Double tscorepwr) {
		this.tscorepwr = tscorepwr;
	}

	public Double getTscorehr() {
		return tscorehr;
	}

	public void setTscorehr(Double tscorehr) {
		this.tscorehr = tscorehr;
	}

	public Integer getAtBpm() {
		return atBpm;
	}

	public void setAtBpm(Integer atBpm) {
		this.atBpm = atBpm;
	}

	public Integer getMaxHr() {
		return maxHr;
	}

	public void setMaxHr(Integer maxHr) {
		this.maxHr = maxHr;
	}

	public Integer getIntensityFactor() {
		return intensityFactor;
	}

	public void setIntensityFactor(Integer intensityFactor) {
		this.intensityFactor = intensityFactor;
	}

	public Integer getCalories() {
		return calories;
	}

	public void setCalories(Integer calories) {
		this.calories = calories;
	}

	public Integer getKj() {
		return kj;
	}

	public void setKj(Integer kj) {
		this.kj = kj;
	}

	public Double getKjh() {
		return kjh;
	}

	public void setKjh(Double kjh) {
		this.kjh = kjh;
	}

	public Double getKjkg() {
		return kjkg;
	}

	public void setKjkg(Double kjkg) {
		this.kjkg = kjkg;
	}

	public Double getKjhkg() {
		return kjhkg;
	}

	public void setKjhkg(Double kjhkg) {
		this.kjhkg = kjhkg;
	}

	public Integer getNp() {
		return np;
	}

	public void setNp(Integer np) {
		this.np = np;
	}

	public Double getVi() {
		return vi;
	}

	public void setVi(Double vi) {
		this.vi = vi;
	}

	public Double getIff() {
		return iff;
	}

	public void setIff(Double iff) {
		this.iff = iff;
	}

	public Double getWkg() {
		return wkg;
	}

	public void setWkg(Double wkg) {
		this.wkg = wkg;
	}

	public Integer getThresholdWatts() {
		return thresholdWatts;
	}

	public void setThresholdWatts(Integer thresholdWatts) {
		this.thresholdWatts = thresholdWatts;
	}

	public Integer getEstThresWatts() {
		return estThresWatts;
	}

	public void setEstThresWatts(Integer estThresWatts) {
		this.estThresWatts = estThresWatts;
	}

	public Integer getEstThresWattsKg() {
		return estThresWattsKg;
	}

	public void setEstThresWattsKg(Integer estThresWattsKg) {
		this.estThresWattsKg = estThresWattsKg;
	}

	public PowerThresholdType getThresholdType() {
		return thresholdType;
	}

	public void setThresholdType(PowerThresholdType thresholdType) {
		this.thresholdType = thresholdType;
	}

	public TScoreType getTscoreType() {
		return tscoreType;
	}

	public void setTscoreType(TScoreType tscoreType) {
		this.tscoreType = tscoreType;
	}

	public Integer getThresholdBpm() {
		return thresholdBpm;
	}

	public void setThresholdBpm(Integer thresholdBpm) {
		this.thresholdBpm = thresholdBpm;
	}

	public Integer getThresholdPace() {
		return thresholdPace;
	}

	public void setThresholdPace(Integer thresholdPace) {
		this.thresholdPace = thresholdPace;
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

	public Integer getStartAlt() {
		return startAlt;
	}

	public void setStartAlt(Integer startAlt) {
		this.startAlt = startAlt;
	}

	public Integer getEndAlt() {
		return endAlt;
	}

	public void setEndAlt(Integer endAlt) {
		this.endAlt = endAlt;
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

	public Double getAvgSpeed() {
		return avgSpeed;
	}

	public void setAvgSpeed(Double avgSpeed) {
		this.avgSpeed = avgSpeed;
	}

	public Double getMaxSpeed() {
		return maxSpeed;
	}

	public void setMaxSpeed(Double maxSpeed) {
		this.maxSpeed = maxSpeed;
	}

	public Integer getAvgCadence() {
		return avgCadence;
	}

	public void setAvgCadence(Integer avgCadence) {
		this.avgCadence = avgCadence;
	}

	public Integer getMaxCadence() {
		return maxCadence;
	}

	public void setMaxCadence(Integer maxCadence) {
		this.maxCadence = maxCadence;
	}

	public Double getMinSatHbP() {
		return minSatHbP;
	}

	public void setMinSatHbP(Double minSatHbP) {
		this.minSatHbP = minSatHbP;
	}

	public Double getMaxSatHbP() {
		return maxSatHbP;
	}

	public void setMaxSatHbP(Double maxSatHbP) {
		this.maxSatHbP = maxSatHbP;
	}

	public Double getAvgSatHbP() {
		return avgSatHbP;
	}

	public void setAvgSatHbP(Double avgSatHbP) {
		this.avgSatHbP = avgSatHbP;
	}

	public Double getMinTotHbC() {
		return minTotHbC;
	}

	public void setMinTotHbC(Double minTotHbC) {
		this.minTotHbC = minTotHbC;
	}

	public Double getMaxTotHbC() {
		return maxTotHbC;
	}

	public void setMaxTotHbC(Double maxTotHbC) {
		this.maxTotHbC = maxTotHbC;
	}

	public Double getAvgTotHbC() {
		return avgTotHbC;
	}

	public void setAvgTotHbC(Double avgTotHbC) {
		this.avgTotHbC = avgTotHbC;
	}

	public Integer getMinTemp() {
		return minTemp;
	}

	public void setMinTemp(Integer minTemp) {
		this.minTemp = minTemp;
	}

	public Integer getMaxTemp() {
		return maxTemp;
	}

	public void setMaxTemp(Integer maxTemp) {
		this.maxTemp = maxTemp;
	}

	public Integer getAvgTemp() {
		return avgTemp;
	}

	public void setAvgTemp(Integer avgTemp) {
		this.avgTemp = avgTemp;
	}

	public Integer getMinBpm() {
		return minBpm;
	}

	public void setMinBpm(Integer minBpm) {
		this.minBpm = minBpm;
	}

	public Integer getAvgBpm() {
		return avgBpm;
	}

	public void setAvgBpm(Integer avgBpm) {
		this.avgBpm = avgBpm;
	}

	public Integer getMaxBpm() {
		return maxBpm;
	}

	public void setMaxBpm(Integer maxBpm) {
		this.maxBpm = maxBpm;
	}

	public Double getAvgBpmP() {
		return avgBpmP;
	}

	public void setAvgBpmP(Double avgBpmP) {
		this.avgBpmP = avgBpmP;
	}

	public Double getMaxBpmP() {
		return maxBpmP;
	}

	public void setMaxBpmP(Double maxBpmP) {
		this.maxBpmP = maxBpmP;
	}

	public Integer getAvgWatts() {
		return avgWatts;
	}

	public void setAvgWatts(Integer avgWatts) {
		this.avgWatts = avgWatts;
	}

	public Integer getCp() {
		return cp;
	}

	public void setCp(Integer cp) {
		this.cp = cp;
	}

	public Integer getAwc() {
		return awc;
	}

	public void setAwc(Integer awc) {
		this.awc = awc;
	}

	public Double getTau() {
		return tau;
	}

	public void setTau(Double tau) {
		this.tau = tau;
	}

	public Integer getAvgWattsAboveCP() {
		return avgWattsAboveCP;
	}

	public void setAvgWattsAboveCP(Integer avgWattsAboveCP) {
		this.avgWattsAboveCP = avgWattsAboveCP;
	}

	public Integer getAvgWattsBelowCP() {
		return avgWattsBelowCP;
	}

	public void setAvgWattsBelowCP(Integer avgWattsBelowCP) {
		this.avgWattsBelowCP = avgWattsBelowCP;
	}

	public Integer getTimeAboveCP() {
		return timeAboveCP;
	}

	public void setTimeAboveCP(Integer timeAboveCP) {
		this.timeAboveCP = timeAboveCP;
	}

	public Integer getMaxWatts() {
		return maxWatts;
	}

	public void setMaxWatts(Integer maxWatts) {
		this.maxWatts = maxWatts;
	}

	public Integer getPeak3secWatts() {
		return peak3secWatts;
	}

	public void setPeak3secWatts(Integer peak3secWatts) {
		this.peak3secWatts = peak3secWatts;
	}

	public Integer getPeak3secWattsP() {
		return peak3secWattsP;
	}

	public void setPeak3secWattsP(Integer peak3secWattsP) {
		this.peak3secWattsP = peak3secWattsP;
	}

	public Double getPeak3secWkg() {
		return peak3secWkg;
	}

	public void setPeak3secWkg(Double peak3secWkg) {
		this.peak3secWkg = peak3secWkg;
	}

	public Integer getPeak4secWatts() {
		return peak4secWatts;
	}

	public void setPeak4secWatts(Integer peak4secWatts) {
		this.peak4secWatts = peak4secWatts;
	}

	public Integer getPeak4secWattsP() {
		return peak4secWattsP;
	}

	public void setPeak4secWattsP(Integer peak4secWattsP) {
		this.peak4secWattsP = peak4secWattsP;
	}

	public Double getPeak4secWkg() {
		return peak4secWkg;
	}

	public void setPeak4secWkg(Double peak4secWkg) {
		this.peak4secWkg = peak4secWkg;
	}

	public Integer getPeak5secWatts() {
		return peak5secWatts;
	}

	public void setPeak5secWatts(Integer peak5secWatts) {
		this.peak5secWatts = peak5secWatts;
	}

	public Integer getPeak5secWattsP() {
		return peak5secWattsP;
	}

	public void setPeak5secWattsP(Integer peak5secWattsP) {
		this.peak5secWattsP = peak5secWattsP;
	}

	public Double getPeak5secWkg() {
		return peak5secWkg;
	}

	public void setPeak5secWkg(Double peak5secWkg) {
		this.peak5secWkg = peak5secWkg;
	}

	public Integer getPeak10secWatts() {
		return peak10secWatts;
	}

	public void setPeak10secWatts(Integer peak10secWatts) {
		this.peak10secWatts = peak10secWatts;
	}

	public Integer getPeak10secWattsP() {
		return peak10secWattsP;
	}

	public void setPeak10secWattsP(Integer peak10secWattsP) {
		this.peak10secWattsP = peak10secWattsP;
	}

	public Double getPeak10secWkg() {
		return peak10secWkg;
	}

	public void setPeak10secWkg(Double peak10secWkg) {
		this.peak10secWkg = peak10secWkg;
	}

	public Integer getPeak12secWatts() {
		return peak12secWatts;
	}

	public void setPeak12secWatts(Integer peak12secWatts) {
		this.peak12secWatts = peak12secWatts;
	}

	public Integer getPeak12secWattsP() {
		return peak12secWattsP;
	}

	public void setPeak12secWattsP(Integer peak12secWattsP) {
		this.peak12secWattsP = peak12secWattsP;
	}

	public Double getPeak12secWkg() {
		return peak12secWkg;
	}

	public void setPeak12secWkg(Double peak12secWkg) {
		this.peak12secWkg = peak12secWkg;
	}

	public Integer getPeak20secWatts() {
		return peak20secWatts;
	}

	public void setPeak20secWatts(Integer peak20secWatts) {
		this.peak20secWatts = peak20secWatts;
	}

	public Integer getPeak20secWattsP() {
		return peak20secWattsP;
	}

	public void setPeak20secWattsP(Integer peak20secWattsP) {
		this.peak20secWattsP = peak20secWattsP;
	}

	public Double getPeak20secWkg() {
		return peak20secWkg;
	}

	public void setPeak20secWkg(Double peak20secWkg) {
		this.peak20secWkg = peak20secWkg;
	}

	public Integer getPeak30secWatts() {
		return peak30secWatts;
	}

	public void setPeak30secWatts(Integer peak30secWatts) {
		this.peak30secWatts = peak30secWatts;
	}

	public Integer getPeak30secWattsP() {
		return peak30secWattsP;
	}

	public void setPeak30secWattsP(Integer peak30secWattsP) {
		this.peak30secWattsP = peak30secWattsP;
	}

	public Double getPeak30secWkg() {
		return peak30secWkg;
	}

	public void setPeak30secWkg(Double peak30secWkg) {
		this.peak30secWkg = peak30secWkg;
	}

	public Integer getPeak1minWatts() {
		return peak1minWatts;
	}

	public void setPeak1minWatts(Integer peak1minWatts) {
		this.peak1minWatts = peak1minWatts;
	}

	public Integer getPeak1minWattsP() {
		return peak1minWattsP;
	}

	public void setPeak1minWattsP(Integer peak1minWattsP) {
		this.peak1minWattsP = peak1minWattsP;
	}

	public Double getPeak1minWkg() {
		return peak1minWkg;
	}

	public void setPeak1minWkg(Double peak1minWkg) {
		this.peak1minWkg = peak1minWkg;
	}

	public Integer getPeak2minWatts() {
		return peak2minWatts;
	}

	public void setPeak2minWatts(Integer peak2minWatts) {
		this.peak2minWatts = peak2minWatts;
	}

	public Integer getPeak2minWattsP() {
		return peak2minWattsP;
	}

	public void setPeak2minWattsP(Integer peak2minWattsP) {
		this.peak2minWattsP = peak2minWattsP;
	}

	public Double getPeak2minWkg() {
		return peak2minWkg;
	}

	public void setPeak2minWkg(Double peak2minWkg) {
		this.peak2minWkg = peak2minWkg;
	}

	public Integer getPeak3minWatts() {
		return peak3minWatts;
	}

	public void setPeak3minWatts(Integer peak3minWatts) {
		this.peak3minWatts = peak3minWatts;
	}

	public Integer getPeak3minWattsP() {
		return peak3minWattsP;
	}

	public void setPeak3minWattsP(Integer peak3minWattsP) {
		this.peak3minWattsP = peak3minWattsP;
	}

	public Double getPeak3minWkg() {
		return peak3minWkg;
	}

	public void setPeak3minWkg(Double peak3minWkg) {
		this.peak3minWkg = peak3minWkg;
	}

	public Integer getPeak4minWatts() {
		return peak4minWatts;
	}

	public void setPeak4minWatts(Integer peak4minWatts) {
		this.peak4minWatts = peak4minWatts;
	}

	public Integer getPeak4minWattsP() {
		return peak4minWattsP;
	}

	public void setPeak4minWattsP(Integer peak4minWattsP) {
		this.peak4minWattsP = peak4minWattsP;
	}

	public Double getPeak4minWkg() {
		return peak4minWkg;
	}

	public void setPeak4minWkg(Double peak4minWkg) {
		this.peak4minWkg = peak4minWkg;
	}

	public Integer getPeak5minWatts() {
		return peak5minWatts;
	}

	public void setPeak5minWatts(Integer peak5minWatts) {
		this.peak5minWatts = peak5minWatts;
	}

	public Integer getPeak5minWattsP() {
		return peak5minWattsP;
	}

	public void setPeak5minWattsP(Integer peak5minWattsP) {
		this.peak5minWattsP = peak5minWattsP;
	}

	public Double getPeak5minWkg() {
		return peak5minWkg;
	}

	public void setPeak5minWkg(Double peak5minWkg) {
		this.peak5minWkg = peak5minWkg;
	}

	public Integer getPeak6minWatts() {
		return peak6minWatts;
	}

	public void setPeak6minWatts(Integer peak6minWatts) {
		this.peak6minWatts = peak6minWatts;
	}

	public Integer getPeak6minWattsP() {
		return peak6minWattsP;
	}

	public void setPeak6minWattsP(Integer peak6minWattsP) {
		this.peak6minWattsP = peak6minWattsP;
	}

	public Double getPeak6minWkg() {
		return peak6minWkg;
	}

	public void setPeak6minWkg(Double peak6minWkg) {
		this.peak6minWkg = peak6minWkg;
	}

	public Integer getPeak10minWatts() {
		return peak10minWatts;
	}

	public void setPeak10minWatts(Integer peak10minWatts) {
		this.peak10minWatts = peak10minWatts;
	}

	public Integer getPeak10minWattsP() {
		return peak10minWattsP;
	}

	public void setPeak10minWattsP(Integer peak10minWattsP) {
		this.peak10minWattsP = peak10minWattsP;
	}

	public Double getPeak10minWkg() {
		return peak10minWkg;
	}

	public void setPeak10minWkg(Double peak10minWkg) {
		this.peak10minWkg = peak10minWkg;
	}

	public Integer getPeak12minWatts() {
		return peak12minWatts;
	}

	public void setPeak12minWatts(Integer peak12minWatts) {
		this.peak12minWatts = peak12minWatts;
	}

	public Integer getPeak12minWattsP() {
		return peak12minWattsP;
	}

	public void setPeak12minWattsP(Integer peak12minWattsP) {
		this.peak12minWattsP = peak12minWattsP;
	}

	public Double getPeak12minWkg() {
		return peak12minWkg;
	}

	public void setPeak12minWkg(Double peak12minWkg) {
		this.peak12minWkg = peak12minWkg;
	}

	public Integer getPeak15minWatts() {
		return peak15minWatts;
	}

	public void setPeak15minWatts(Integer peak15minWatts) {
		this.peak15minWatts = peak15minWatts;
	}

	public Integer getPeak15minWattsP() {
		return peak15minWattsP;
	}

	public void setPeak15minWattsP(Integer peak15minWattsP) {
		this.peak15minWattsP = peak15minWattsP;
	}

	public Double getPeak15minWkg() {
		return peak15minWkg;
	}

	public void setPeak15minWkg(Double peak15minWkg) {
		this.peak15minWkg = peak15minWkg;
	}

	public Integer getPeak16minWatts() {
		return peak16minWatts;
	}

	public void setPeak16minWatts(Integer peak16minWatts) {
		this.peak16minWatts = peak16minWatts;
	}

	public Integer getPeak16minWattsP() {
		return peak16minWattsP;
	}

	public void setPeak16minWattsP(Integer peak16minWattsP) {
		this.peak16minWattsP = peak16minWattsP;
	}

	public Double getPeak16minWkg() {
		return peak16minWkg;
	}

	public void setPeak16minWkg(Double peak16minWkg) {
		this.peak16minWkg = peak16minWkg;
	}

	public Integer getPeak20minWatts() {
		return peak20minWatts;
	}

	public void setPeak20minWatts(Integer peak20minWatts) {
		this.peak20minWatts = peak20minWatts;
	}

	public Integer getPeak20minWattsP() {
		return peak20minWattsP;
	}

	public void setPeak20minWattsP(Integer peak20minWattsP) {
		this.peak20minWattsP = peak20minWattsP;
	}

	public Double getPeak20minWkg() {
		return peak20minWkg;
	}

	public void setPeak20minWkg(Double peak20minWkg) {
		this.peak20minWkg = peak20minWkg;
	}

	public Integer getPeak24minWatts() {
		return peak24minWatts;
	}

	public void setPeak24minWatts(Integer peak24minWatts) {
		this.peak24minWatts = peak24minWatts;
	}

	public Integer getPeak24minWattsP() {
		return peak24minWattsP;
	}

	public void setPeak24minWattsP(Integer peak24minWattsP) {
		this.peak24minWattsP = peak24minWattsP;
	}

	public Double getPeak24minWkg() {
		return peak24minWkg;
	}

	public void setPeak24minWkg(Double peak24minWkg) {
		this.peak24minWkg = peak24minWkg;
	}

	public Integer getPeak30minWatts() {
		return peak30minWatts;
	}

	public void setPeak30minWatts(Integer peak30minWatts) {
		this.peak30minWatts = peak30minWatts;
	}

	public Integer getPeak30minWattsP() {
		return peak30minWattsP;
	}

	public void setPeak30minWattsP(Integer peak30minWattsP) {
		this.peak30minWattsP = peak30minWattsP;
	}

	public Double getPeak30minWkg() {
		return peak30minWkg;
	}

	public void setPeak30minWkg(Double peak30minWkg) {
		this.peak30minWkg = peak30minWkg;
	}

	public Integer getPeak40minWatts() {
		return peak40minWatts;
	}

	public void setPeak40minWatts(Integer peak40minWatts) {
		this.peak40minWatts = peak40minWatts;
	}

	public Integer getPeak40minWattsP() {
		return peak40minWattsP;
	}

	public void setPeak40minWattsP(Integer peak40minWattsP) {
		this.peak40minWattsP = peak40minWattsP;
	}

	public Double getPeak40minWkg() {
		return peak40minWkg;
	}

	public void setPeak40minWkg(Double peak40minWkg) {
		this.peak40minWkg = peak40minWkg;
	}

	public Integer getPeak60minWatts() {
		return peak60minWatts;
	}

	public void setPeak60minWatts(Integer peak60minWatts) {
		this.peak60minWatts = peak60minWatts;
	}

	public Integer getPeak60minWattsP() {
		return peak60minWattsP;
	}

	public void setPeak60minWattsP(Integer peak60minWattsP) {
		this.peak60minWattsP = peak60minWattsP;
	}

	public Double getPeak60minWkg() {
		return peak60minWkg;
	}

	public void setPeak60minWkg(Double peak60minWkg) {
		this.peak60minWkg = peak60minWkg;
	}

	public Integer getPeak75minWatts() {
		return peak75minWatts;
	}

	public void setPeak75minWatts(Integer peak75minWatts) {
		this.peak75minWatts = peak75minWatts;
	}

	public Integer getPeak75minWattsP() {
		return peak75minWattsP;
	}

	public void setPeak75minWattsP(Integer peak75minWattsP) {
		this.peak75minWattsP = peak75minWattsP;
	}

	public Double getPeak75minWkg() {
		return peak75minWkg;
	}

	public void setPeak75minWkg(Double peak75minWkg) {
		this.peak75minWkg = peak75minWkg;
	}

	public Integer getPeak80minWatts() {
		return peak80minWatts;
	}

	public void setPeak80minWatts(Integer peak80minWatts) {
		this.peak80minWatts = peak80minWatts;
	}

	public Integer getPeak80minWattsP() {
		return peak80minWattsP;
	}

	public void setPeak80minWattsP(Integer peak80minWattsP) {
		this.peak80minWattsP = peak80minWattsP;
	}

	public Double getPeak80minWkg() {
		return peak80minWkg;
	}

	public void setPeak80minWkg(Double peak80minWkg) {
		this.peak80minWkg = peak80minWkg;
	}

	public Integer getPeak90minWatts() {
		return peak90minWatts;
	}

	public void setPeak90minWatts(Integer peak90minWatts) {
		this.peak90minWatts = peak90minWatts;
	}

	public Integer getPeak90minWattsP() {
		return peak90minWattsP;
	}

	public void setPeak90minWattsP(Integer peak90minWattsP) {
		this.peak90minWattsP = peak90minWattsP;
	}

	public Double getPeak90minWkg() {
		return peak90minWkg;
	}

	public void setPeak90minWkg(Double peak90minWkg) {
		this.peak90minWkg = peak90minWkg;
	}

	public Integer getPeak120minWatts() {
		return peak120minWatts;
	}

	public void setPeak120minWatts(Integer peak120minWatts) {
		this.peak120minWatts = peak120minWatts;
	}

	public Integer getPeak120minWattsP() {
		return peak120minWattsP;
	}

	public void setPeak120minWattsP(Integer peak120minWattsP) {
		this.peak120minWattsP = peak120minWattsP;
	}

	public Double getPeak120minWkg() {
		return peak120minWkg;
	}

	public void setPeak120minWkg(Double peak120minWkg) {
		this.peak120minWkg = peak120minWkg;
	}

	public Integer getPeak150minWatts() {
		return peak150minWatts;
	}

	public void setPeak150minWatts(Integer peak150minWatts) {
		this.peak150minWatts = peak150minWatts;
	}

	public Integer getPeak150minWattsP() {
		return peak150minWattsP;
	}

	public void setPeak150minWattsP(Integer peak150minWattsP) {
		this.peak150minWattsP = peak150minWattsP;
	}

	public Double getPeak150minWkg() {
		return peak150minWkg;
	}

	public void setPeak150minWkg(Double peak150minWkg) {
		this.peak150minWkg = peak150minWkg;
	}

	public Integer getPeak180minWatts() {
		return peak180minWatts;
	}

	public void setPeak180minWatts(Integer peak180minWatts) {
		this.peak180minWatts = peak180minWatts;
	}

	public Integer getPeak180minWattsP() {
		return peak180minWattsP;
	}

	public void setPeak180minWattsP(Integer peak180minWattsP) {
		this.peak180minWattsP = peak180minWattsP;
	}

	public Double getPeak180minWkg() {
		return peak180minWkg;
	}

	public void setPeak180minWkg(Double peak180minWkg) {
		this.peak180minWkg = peak180minWkg;
	}

	public Integer getPeak210minWatts() {
		return peak210minWatts;
	}

	public void setPeak210minWatts(Integer peak210minWatts) {
		this.peak210minWatts = peak210minWatts;
	}

	public Integer getPeak210minWattsP() {
		return peak210minWattsP;
	}

	public void setPeak210minWattsP(Integer peak210minWattsP) {
		this.peak210minWattsP = peak210minWattsP;
	}

	public Double getPeak210minWkg() {
		return peak210minWkg;
	}

	public void setPeak210minWkg(Double peak210minWkg) {
		this.peak210minWkg = peak210minWkg;
	}

	public Integer getPeak240minWatts() {
		return peak240minWatts;
	}

	public void setPeak240minWatts(Integer peak240minWatts) {
		this.peak240minWatts = peak240minWatts;
	}

	public Integer getPeak240minWattsP() {
		return peak240minWattsP;
	}

	public void setPeak240minWattsP(Integer peak240minWattsP) {
		this.peak240minWattsP = peak240minWattsP;
	}

	public Double getPeak240minWkg() {
		return peak240minWkg;
	}

	public void setPeak240minWkg(Double peak240minWkg) {
		this.peak240minWkg = peak240minWkg;
	}

	public Integer getPeak360minWatts() {
		return peak360minWatts;
	}

	public void setPeak360minWatts(Integer peak360minWatts) {
		this.peak360minWatts = peak360minWatts;
	}

	public Integer getPeak360minWattsP() {
		return peak360minWattsP;
	}

	public void setPeak360minWattsP(Integer peak360minWattsP) {
		this.peak360minWattsP = peak360minWattsP;
	}

	public Double getPeak360minWkg() {
		return peak360minWkg;
	}

	public void setPeak360minWkg(Double peak360minWkg) {
		this.peak360minWkg = peak360minWkg;
	}

	public Integer getPeak5secBpm() {
		return peak5secBpm;
	}

	public void setPeak5secBpm(Integer peak5secBpm) {
		this.peak5secBpm = peak5secBpm;
	}

	public Integer getPeak5secBpmP() {
		return peak5secBpmP;
	}

	public void setPeak5secBpmP(Integer peak5secBpmP) {
		this.peak5secBpmP = peak5secBpmP;
	}

	public Integer getPeak10secBpm() {
		return peak10secBpm;
	}

	public void setPeak10secBpm(Integer peak10secBpm) {
		this.peak10secBpm = peak10secBpm;
	}

	public Integer getPeak10secBpmP() {
		return peak10secBpmP;
	}

	public void setPeak10secBpmP(Integer peak10secBpmP) {
		this.peak10secBpmP = peak10secBpmP;
	}

	public Integer getPeak1minBpm() {
		return peak1minBpm;
	}

	public void setPeak1minBpm(Integer peak1minBpm) {
		this.peak1minBpm = peak1minBpm;
	}

	public Integer getPeak1minBpmP() {
		return peak1minBpmP;
	}

	public void setPeak1minBpmP(Integer peak1minBpmP) {
		this.peak1minBpmP = peak1minBpmP;
	}

	public Integer getPeak5minBpm() {
		return peak5minBpm;
	}

	public void setPeak5minBpm(Integer peak5minBpm) {
		this.peak5minBpm = peak5minBpm;
	}

	public Integer getPeak5minBpmP() {
		return peak5minBpmP;
	}

	public void setPeak5minBpmP(Integer peak5minBpmP) {
		this.peak5minBpmP = peak5minBpmP;
	}

	public Integer getPeak10minBpm() {
		return peak10minBpm;
	}

	public void setPeak10minBpm(Integer peak10minBpm) {
		this.peak10minBpm = peak10minBpm;
	}

	public Integer getPeak10minBpmP() {
		return peak10minBpmP;
	}

	public void setPeak10minBpmP(Integer peak10minBpmP) {
		this.peak10minBpmP = peak10minBpmP;
	}

	public Integer getPeak20minBpm() {
		return peak20minBpm;
	}

	public void setPeak20minBpm(Integer peak20minBpm) {
		this.peak20minBpm = peak20minBpm;
	}

	public Integer getPeak20minBpmP() {
		return peak20minBpmP;
	}

	public void setPeak20minBpmP(Integer peak20minBpmP) {
		this.peak20minBpmP = peak20minBpmP;
	}

	public Integer getPeak30minBpm() {
		return peak30minBpm;
	}

	public void setPeak30minBpm(Integer peak30minBpm) {
		this.peak30minBpm = peak30minBpm;
	}

	public Integer getPeak30minBpmP() {
		return peak30minBpmP;
	}

	public void setPeak30minBpmP(Integer peak30minBpmP) {
		this.peak30minBpmP = peak30minBpmP;
	}

	public Integer getPeak60minBpm() {
		return peak60minBpm;
	}

	public void setPeak60minBpm(Integer peak60minBpm) {
		this.peak60minBpm = peak60minBpm;
	}

	public Integer getPeak60minBpmP() {
		return peak60minBpmP;
	}

	public void setPeak60minBpmP(Integer peak60minBpmP) {
		this.peak60minBpmP = peak60minBpmP;
	}

	public Integer getPeak120minBpm() {
		return peak120minBpm;
	}

	public void setPeak120minBpm(Integer peak120minBpm) {
		this.peak120minBpm = peak120minBpm;
	}

	public Integer getPeak120minBpmP() {
		return peak120minBpmP;
	}

	public void setPeak120minBpmP(Integer peak120minBpmP) {
		this.peak120minBpmP = peak120minBpmP;
	}

	public Integer getPeak180minBpm() {
		return peak180minBpm;
	}

	public void setPeak180minBpm(Integer peak180minBpm) {
		this.peak180minBpm = peak180minBpm;
	}

	public Integer getPeak180minBpmP() {
		return peak180minBpmP;
	}

	public void setPeak180minBpmP(Integer peak180minBpmP) {
		this.peak180minBpmP = peak180minBpmP;
	}

	public String getMinGear() {
		return minGear;
	}

	public void setMinGear(String minGear) {
		this.minGear = minGear;
	}

	public String getMaxGear() {
		return maxGear;
	}

	public void setMaxGear(String maxGear) {
		this.maxGear = maxGear;
	}

	public String getAvgGear() {
		return avgGear;
	}

	public void setAvgGear(String avgGear) {
		this.avgGear = avgGear;
	}

	public Integer getGearChangeCnt() {
		return gearChangeCnt;
	}

	public void setGearChangeCnt(Integer gearChangeCnt) {
		this.gearChangeCnt = gearChangeCnt;
	}

	public Double getMinGrade() {
		return minGrade;
	}

	public void setMinGrade(Double minGrade) {
		this.minGrade = minGrade;
	}

	public Double getMaxGrade() {
		return maxGrade;
	}

	public void setMaxGrade(Double maxGrade) {
		this.maxGrade = maxGrade;
	}

	public Double getAvgGrade() {
		return avgGrade;
	}

	public void setAvgGrade(Double avgGrade) {
		this.avgGrade = avgGrade;
	}

	public Double getBpmSampleRate() {
		return bpmSampleRate;
	}

	public void setBpmSampleRate(Double bpmSampleRate) {
		this.bpmSampleRate = bpmSampleRate;
	}

	public Long getBpmSampleCnt() {
		return bpmSampleCnt;
	}

	public void setBpmSampleCnt(Long bpmSampleCnt) {
		this.bpmSampleCnt = bpmSampleCnt;
	}

	public Double getPwrSampleRate() {
		return pwrSampleRate;
	}

	public void setPwrSampleRate(Double pwrSampleRate) {
		this.pwrSampleRate = pwrSampleRate;
	}

	public Long getPwrSampleCnt() {
		return pwrSampleCnt;
	}

	public void setPwrSampleCnt(Long pwrSampleCnt) {
		this.pwrSampleCnt = pwrSampleCnt;
	}

	public String getPwrDisplay() {
		return pwrDisplay;
	}

	public void setPwrDisplay(String pwrDisplay) {
		this.pwrDisplay = pwrDisplay;
	}

	public Double getPwrBattery() {
		return pwrBattery;
	}

	public void setPwrBattery(Double pwrBattery) {
		this.pwrBattery = pwrBattery;
	}

	public Integer getPwrBatteryP() {
		return pwrBatteryP;
	}

	public void setPwrBatteryP(Integer pwrBatteryP) {
		this.pwrBatteryP = pwrBatteryP;
	}

	public Integer getPwrOffset() {
		return pwrOffset;
	}

	public void setPwrOffset(Integer pwrOffset) {
		this.pwrOffset = pwrOffset;
	}

	public Integer getPwrSlope() {
		return pwrSlope;
	}

	public void setPwrSlope(Integer pwrSlope) {
		this.pwrSlope = pwrSlope;
	}

	public String getPwrManufacturer() {
		return pwrManufacturer;
	}

	public void setPwrManufacturer(String pwrManufacturer) {
		this.pwrManufacturer = pwrManufacturer;
	}

	public Integer getPwrManufacturerId() {
		return pwrManufacturerId;
	}

	public void setPwrManufacturerId(Integer pwrManufacturerId) {
		this.pwrManufacturerId = pwrManufacturerId;
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

	public String getPwrId() {
		return pwrId;
	}

	public void setPwrId(String pwrId) {
		this.pwrId = pwrId;
	}

	public Integer getPwrBalance() {
		return pwrBalance;
	}

	public void setPwrBalance(Integer pwrBalance) {
		this.pwrBalance = pwrBalance;
	}

	public Long getPwrDiscardCnt() {
		return pwrDiscardCnt;
	}

	public void setPwrDiscardCnt(Long pwrDiscardCnt) {
		this.pwrDiscardCnt = pwrDiscardCnt;
	}

	public Map<Integer, Integer> getSecsInZonePwr() {
		return secsInZonePwr;
	}

	public void setSecsInZonePwr(Map<Integer, Integer> secsInZonePwr) {
		this.secsInZonePwr = secsInZonePwr;
	}

	public Map<String, Integer> getSecsInSurface() {
		return secsInSurface;
	}

	public void setSecsInSurface(Map<String, Integer> secsInSurface) {
		this.secsInSurface = secsInSurface;
	}

	public Map<Integer, Integer> getSecsInZonePace() {
		return secsInZonePace;
	}

	public void setSecsInZonePace(Map<Integer, Integer> secsInZonePace) {
		this.secsInZonePace = secsInZonePace;
	}

	public Map<Integer, Integer> getSecsInZoneWkg() {
		return secsInZoneWkg;
	}

	public void setSecsInZoneWkg(Map<Integer, Integer> secsInZoneWkg) {
		this.secsInZoneWkg = secsInZoneWkg;
	}

	public Map<Integer, Integer> getSecsInZoneNm() {
		return secsInZoneNm;
	}

	public void setSecsInZoneNm(Map<Integer, Integer> secsInZoneNm) {
		this.secsInZoneNm = secsInZoneNm;
	}

	public Map<Integer, Integer> getSecsInZoneBpm() {
		return secsInZoneBpm;
	}

	public void setSecsInZoneBpm(Map<Integer, Integer> secsInZoneBpm) {
		this.secsInZoneBpm = secsInZoneBpm;
	}

	public Map<Integer, Integer> getSecsInZoneMaxHr() {
		return secsInZoneMaxHr;
	}

	public void setSecsInZoneMaxHr(Map<Integer, Integer> secsInZoneMaxHr) {
		this.secsInZoneMaxHr = secsInZoneMaxHr;
	}

	public List<UserIntensityZoneRange> getWkgZones() {
		return wkgZones;
	}

	public void setWkgZones(List<UserIntensityZoneRange> wkgZones) {
		this.wkgZones = wkgZones;
	}

	public List<UserIntensityZoneRange> getBpmZones() {
		return bpmZones;
	}

	public void setBpmZones(List<UserIntensityZoneRange> bpmZones) {
		this.bpmZones = bpmZones;
	}

	public List<UserIntensityZoneRange> getMaxHrZones() {
		return maxHrZones;
	}

	public void setMaxHrZones(List<UserIntensityZoneRange> maxHrZones) {
		this.maxHrZones = maxHrZones;
	}

	public List<UserIntensityZoneRange> getPwrZones() {
		return pwrZones;
	}

	public void setPwrZones(List<UserIntensityZoneRange> pwrZones) {
		this.pwrZones = pwrZones;
	}

	public List<UserIntensityZoneRange> getNmZones() {
		return nmZones;
	}

	public void setNmZones(List<UserIntensityZoneRange> nmZones) {
		this.nmZones = nmZones;
	}

	public List<UserIntensityZoneRange> getPaceZones() {
		return paceZones;
	}

	public void setPaceZones(List<UserIntensityZoneRange> paceZones) {
		this.paceZones = paceZones;
	}

	public Map<Integer, String> getBpmZoneNames() {
		return bpmZoneNames;
	}

	public void setBpmZoneNames(Map<Integer, String> bpmZoneNames) {
		this.bpmZoneNames = bpmZoneNames;
	}

	public List<UserWorkoutResult> getLaps() {
		return laps;
	}

	public void setLaps(List<UserWorkoutResult> laps) {
		this.laps = laps;
	}

	public List<UserWorkoutResult> getChildren() {
		return children;
	}

	public void setChildren(List<UserWorkoutResult> children) {
		this.children = children;
	}

	public List<UserWorkoutResult> getRelated() {
		return related;
	}

	public void setRelated(List<UserWorkoutResult> related) {
		this.related = related;
	}

	public UserWorkoutResult getParent() {
		return parent;
	}

	public void setParent(UserWorkoutResult parent) {
		this.parent = parent;
	}

	public Map<String, Object> getMetadata() {
		return metadata;
	}

	public void setMetadata(Map<String, Object> metadata) {
		this.metadata = metadata;
	}

	public List<DataAccessRequest> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<DataAccessRequest> permissions) {
		this.permissions = permissions;
	}

	public UserWorkoutResultAlt getAap() {
		return aap;
	}

	public void setAap(UserWorkoutResultAlt aap) {
		this.aap = aap;
	}

	public UserWorkoutResultExt getExt() {
		return ext;
	}

	public void setExt(UserWorkoutResultExt ext) {
		this.ext = ext;
	}

	public UserWorkoutResultPeakPace getPace() {
		return pace;
	}

	public void setPace(UserWorkoutResultPeakPace pace) {
		this.pace = pace;
	}

	public UserWorkoutResultPeakLss getLss() {
		return lss;
	}

	public void setLss(UserWorkoutResultPeakLss lss) {
		this.lss = lss;
	}

	public UserWorkoutResultByHour getHour() {
		return hour;
	}

	public void setHour(UserWorkoutResultByHour hour) {
		this.hour = hour;
	}

	public UserHeadunit getHeadunit() {
		return headunit;
	}

	public void setHeadunit(UserHeadunit headunit) {
		this.headunit = headunit;
	}

	public UserPowerMeter getPowermeter() {
		return powermeter;
	}

	public void setPowermeter(UserPowerMeter powermeter) {
		this.powermeter = powermeter;
	}

	public UserRoute getRoute() {
		return route;
	}

	public void setRoute(UserRoute route) {
		this.route = route;
	}

	public UserWorkoutResultExt2 getExt2() {
		return ext2;
	}

	public void setExt2(UserWorkoutResultExt2 ext2) {
		this.ext2 = ext2;
	}
	
	public UserWorkoutDetails getScheduled() {
		return scheduled;
	}
	
	public void setScheduled(UserWorkoutDetails scheduled) {
		this.scheduled = scheduled;
	}
	
	public Map<DataFileChannel, Map<Integer, Integer>> getDistributions() {
		return distributions;
	}
	
	public void setDistributions(Map<DataFileChannel, Map<Integer, Integer>> distributions) {
		this.distributions = distributions;
	}
	
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
	}
}
