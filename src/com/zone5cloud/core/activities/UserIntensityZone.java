package com.zone5cloud.core.activities;

import java.util.List;

import com.zone5cloud.core.enums.IntensityZoneType;
import com.zone5cloud.core.users.User;

public class UserIntensityZone {
	
	private Long id;
	
	private IntensityZoneType type;
		
	private String name;
	
	private User user;
	
	private List<UserIntensityZoneRange> zones;
	
	public UserIntensityZone() { }

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public IntensityZoneType getType() {
		return type;
	}

	public void setType(IntensityZoneType type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<UserIntensityZoneRange> getZones() {
		return zones;
	}

	public void setZones(List<UserIntensityZoneRange> zones) {
		this.zones = zones;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
}
