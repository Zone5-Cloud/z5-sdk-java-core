package com.zone5ventures.common.search;

public class DateRange {

private String name;
	
	/** The low end timestamp in this range. A unix timestamp in milliseconds */
	private Long floorTs;
	
	/** The high end timestamp in this range. A unix timestamp in milliseconds */
	private Long ceilTs;
	
	private String tz;
	
	public DateRange() { }
	
	public DateRange(long floor, long ceil, String tz) {
		this.floorTs = floor;
		this.ceilTs = ceil;
		this.tz = tz;
	}
	
	public DateRange(String name, Long floorTs, Long ceilTs) {
		this.name = name;
		this.floorTs = floorTs;
		this.ceilTs = ceilTs;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getFloorTs() {
		return floorTs;
	}

	public void setFloorTs(Long floorTs) {
		this.floorTs = floorTs;
	}

	public Long getCeilTs() {
		return ceilTs;
	}

	public void setCeilTs(Long ceilTs) {
		this.ceilTs = ceilTs;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}
	
	
	
}
