package com.zone5cloud.core.ride;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.TimeZone;

public class DateTime {
	
	public static final String DATE_FORMAT = "yyyy/MM/dd";

	private Long ts;
	
	private String tz;
	
	private Integer year;
	
	private Integer day;
	
	private Integer time;
	
	private String date;
	
	public DateTime() { }
	
	public DateTime(long ts, String tz) {
		Calendar c = new GregorianCalendar(TimeZone.getTimeZone(tz == null ? "UTC" : tz), Locale.ENGLISH);
		c.setTimeInMillis(ts);
		this.year = c.get(Calendar.YEAR);
		this.day  = c.get(Calendar.DAY_OF_YEAR);
		
		int hor = c.get(Calendar.HOUR_OF_DAY);
		int min = c.get(Calendar.MINUTE);
		
		this.time = hor * 100 + (min < 10 ? min * 10 : min);
		
		this.date = new SimpleDateFormat(DATE_FORMAT).format(c.getTime());
	}

	public Long getTs() {
		return ts;
	}

	public void setTs(Long ts) {
		this.ts = ts;
	}

	public String getTz() {
		return tz;
	}

	public void setTz(String tz) {
		this.tz = tz;
	}

	public Integer getYear() {
		return year;
	}

	public void setYear(Integer year) {
		this.year = year;
	}

	public Integer getDay() {
		return day;
	}

	public void setDay(Integer day) {
		this.day = day;
	}

	public Integer getTime() {
		return time;
	}

	public void setTime(Integer time) {
		this.time = time;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
}
