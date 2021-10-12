package com.zone5cloud.core.users;

import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

import com.zone5cloud.core.enums.ActivityType;
import com.zone5cloud.core.enums.UnitMeasurement;

/** Data structure for registering a new user */
public class RegisterUser {
	
	/** Required - A unique email address */
	private String email;
	
	/** Required - can not be null or empty */
	private String firstname;
	
	/** Required - can not be null or empty */
	private String lastname;
	
	/** Optional - phone number */
	private String tn;
	
	/** Optional - date of birth - UTC timestamp */
	private Long dob;
	
	/** Optional - A Java Locale ID */
	private String locale;
	
	/** Optional - A Java TimeZone ID */
	private String timezone;
	
	/** Required - can not be null or emptu */
	private String password;
	
	/** Optional - If the user has been invited, this is the invite UUID */
	private String delegate;
	
	/** Optional - Company ID you wish to join */
	private Long companyId;
	
	/** Optional - Coach ID you wish to associate with */
	private Long coachId;
	
	/** Optional - Preferred units of measurement */
	private UnitMeasurement units;
	
	/** Optional - The athlete's threshold power for by sport */
	private Map<ActivityType, UserThresholdPower> pwr;
	
	/** Optional - The athlete's threshold heart rate and max heart rate by sport */
	private Map<ActivityType, UserThresholdHeart> bpm;
	
	/** Optional - The athlete's threshold pace by sport */
	private Map<ActivityType, UserThresholdPace> pace;
		
	/** Optional - The athlete's current weight (kg) */
	private Double weight;
	
	/** Optional - Use this to request association with a specific company based on the company nic */
	private String tags;
	
	/** Allow for in-line acceptance of terms & conditions ids */
	private List<String> accept;
	
	private String billingCountry;
	
	/** Optional - Custom registration directives */
	private Map<String, String> params;
	
	public RegisterUser() {
		this.locale = Locale.getDefault().toString();
	}
	
	public RegisterUser(String email, String firstname, String lastname, double weightKg, int thresholdWatts, String nic, String invite) {
		this.email = email;
		this.firstname = firstname;
		this.lastname = lastname;
		this.weight = weightKg;
		this.pwr = new HashMap<>();
		this.pwr.put(ActivityType.ride, new UserThresholdPower(thresholdWatts));
		this.tags = nic;
		this.delegate = invite;
		this.password = invite;
		this.locale = Locale.getDefault().toString();
		this.timezone = "Europe/Lisbon";
	}

	public UnitMeasurement getUnits() {
		return units;
	}
	
	public void setUnits(UnitMeasurement units) {
		this.units = units;
	}
	
	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getTn() {
		return tn;
	}

	public void setTn(String tn) {
		this.tn = tn;
	}

	public String getLocale() {
		return locale;
	}

	public void setLocale(String locale) {
		this.locale = locale;
	}

	public String getTimezone() {
		return timezone;
	}

	public void setTimezone(String timezone) {
		this.timezone = timezone;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDelegate() {
		return delegate;
	}

	public void setDelegate(String delegate) {
		this.delegate = delegate;
	}

	public Long getCompanyId() {
		return companyId;
	}

	public void setCompanyId(Long companyId) {
		this.companyId = companyId;
	}

	public Long getCoachId() {
		return coachId;
	}

	public void setCoachId(Long coachId) {
		this.coachId = coachId;
	}

	public Map<ActivityType, UserThresholdPower> getPwr() {
		return pwr;
	}

	public void setPwr(Map<ActivityType, UserThresholdPower> pwr) {
		this.pwr = pwr;
	}

	public Map<ActivityType, UserThresholdHeart> getBpm() {
		return bpm;
	}

	public void setBpm(Map<ActivityType, UserThresholdHeart> bpm) {
		this.bpm = bpm;
	}

	public Map<ActivityType, UserThresholdPace> getPace() {
		return pace;
	}

	public void setPace(Map<ActivityType, UserThresholdPace> pace) {
		this.pace = pace;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}

	public String getTags() {
		return tags;
	}

	public void setTags(String tags) {
		this.tags = tags;
	}

	public Map<String, String> getParams() {
		return params;
	}

	public void setParams(Map<String, String> params) {
		this.params = params;
	}
	
	public Long getDob() {
		return dob;
	}
	
	public void setDob(Long dob) {
		this.dob = dob;
	}

	public List<String> getAccept() {
		return accept;
	}

	public void setAccept(List<String> accept) {
		this.accept = accept;
	}

	public String getBillingCountry() {
		return billingCountry;
	}

	public void setBillingCountry(String billingCountry) {
		this.billingCountry = billingCountry;
	}
}
