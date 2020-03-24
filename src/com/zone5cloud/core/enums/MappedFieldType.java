package com.zone5cloud.core.enums;

public enum MappedFieldType {
	/** This field is a simple string */
	string,
	
	/** This field is a numeric value. It should be treated as an int */
	number,
	
	/** This field is a floating point / double value. UI field rules should determine precision */
	@Deprecated
	decimal,
	
	/** This field is a true/false */
	bool,
	
	/** This field is a unix timestamp (ms) - it should be shown as a date - ensure you apply the correct timezone */
	date,
	
	/** This field is a unix timestamp (ms) - it should be shown as a time - ensure you apply the correct timezone */
	time,
	
	/** This field is a unix timestamp (ms) - it should be shown as a full date + time - ensure you apply the correct timezone */
	timestamp,
	
	/** This field is a date of birth - it should be shown as a date, with UTC applied as the timezone */
	dob,
	
	/** This field is in cm - it should be shown as either cm (metric) or feet + inches (imperial) */
	height,
	
	/** This field is in kg - it should be shown as either kg (metric) or lb (imperial) */
	weight,
	
	/** This field is in km - it should be shown in either km (metric) or mi (imperial */
	distancekm,
	
	/** This field is in meters/second - it should be shown in either km/h (metric) or mi/h (imperial) */
	speedms,
	
	/** This field is in km/hour - it should be shown in either km/h (metric) or mi/h (imperial) */
	speedkmh,
	
	/** This field is in meters - it should be shown in either km (metric) or mi (imperial).  Note also this may be negative */
	distancefixedmtrtokmmi,
	
	/** This field is in meters - it should be shown in either meters (metric) or feet (imperial).  Note also this may be negative */
	distancefixedmtrtomtrfeet, // we use this for altitude
	
	/** This field is in meters - it should be shown in either km (metric) or mi (imperial).  Note also this may be negative */
	distancemtr,
	
	/** This field is in watts. It should be an int value >= 0. A sane maxiumum value would be 2000 */
	watts,
	
	/** This field is in watts/kg. It should always be shown as w/kg, regardless of metric/imperial preference */
	wattskg,
	
	/** This field is in beats per minute. It should be an int value > 0. A sane value ramge would be 30 - 220 */
	bpm,
	
	/** This field is in revolutions per minute. It should be an int value >= 0. A sane maxiumum value would be 200 */
	rpm,
	
	/** This field is a timezone string. It could be either a short Java Timezone ID or a long timezone name */
	timezone,
	
	/** This field is a locale string. It could be either a short or long Java locale name */
	locale,
	
	/** This field is a enum. The enum value (name) will be returned in this field. See other meta data about this field for the class type */
	enumm,
	
	/** This field is a text field. It should use a multi-line, formatted text input field. It may contain HTML */
	text,
	
	/** This field is a collection. See other meta data about this field for collection member class */
	collection,
	
	/** This field is a colour. It will be a hex #FFF style colour or a string based colour word. */
	colour,
	
	/** This field is in seconds. It should be formatted as a duration */
	duration,
	
	/** This field is in degrees celsius. It should be shown as C (metric) of F (imperial) */
	temperature,
	
	/** This field is in neuton meters (torque). It will be an int value */
	nm,
	
	/** This field is a percentage (0-100) and represents haemoglobin percent */
	hbp,
	
	/** This field is haemoglobin concentrate */
	hbc,
	
	/** This field represents gradient / slope. ie 7% climb */
	grade,
	
	/** This field is in grams */
	grams,
	
	/** This field is in mg */
	milligrams,
	
	/** This field is in ml */
	milliliter,
	
	/** This field is in kCal */
	calories,
	
	/** This field is either a lat or long value */
	latlon,
	
	/** This field is a URL string. It may be a full URL or a relative URL to this site */
	url,
	
	/** This field is a bitmask - see additional metadata for a reference to the enum which defines the mask offsets */
	mask,
	
	/** This field is an RPE score - 0 - 10. This may be a decimal on some systems, and integers on others */
	rpe,
	
	/** This field is an TQR score - 0 - 10. This may be a decimal on some systems, and integers on others */
	tqr,
	
	/** This field is a percentage */
	percentage,
	
	/** This field is a numeric field and should be displayed to 1 decimal place */
	decimal1,
	
	/** This field is a numeric field and should be displayed to 2 decimal place2 */
	decimal2,
	
	/** This field is in joules */
	joules,
	
	mbar,
	
	/** This field is in degrees (ie wind direction) */
	degrees,
	
	millimeter,
	
	/** This field is in kilo-joules */
	kj,
	
	/** This field is in milliseconds - it should be parsed as a duration */
	ms,
	
	volts,
	
	tscore,
	
	/** This field is vertical ascent meters (meters/second elevation gain) - it should always be shown as m/s regardless of metric/imperial */
	vam,
	
	/** This field is in minutes and should be parsed as a duration */
	durationmins,
	
	/** 1-10 (0 being unset, 1 being worst, 9 being best) */
	rating9,
	
	/** 1-5 (0 being unset, 1 being worst, 5 being best) */
	rating5,
	
	/** 1-5 - with 1/5 being bad, and 3 being best */
	rating5m,
	
	zscore,

	/** This field is in milliseconds and should be parsed as a duration */
	durationms,
	
	/** This field is in hours and should be parsed as a duration */
	durationhrs,
	
	/** This field is in days and should be parsed as a duration */
	durationdays,
	
	/** This field is a simple count. ie >=0 int */
	count,
	
	steps,
	
	/** This field is either a URL to video media, or it is a tag which can be used to play a YouTube video */
	media,
	
	/** Urine Osmolality - mOsm/kg */
	mosmg,
	
	/** 1-5 (0 being unset, 5 being worst, 1 being best) */
	rating51,
	
	/** Percentage to 1 decimal place */
	percentage1,
	
	/** blood oxygen saturation */
	spo2,
	
	/** stroke per minute */
	strokepm,
	
	/** stroke len (decimal in meters) */
	strokelen,
	
	zerooffset,
	
	slope,
	
	/** mins to complete a km or mile (running) - see PaceUtils*/
	pace,
	
	/** kN/m */
	knm,
	
	/** center meters */
	cm,
	
	/** thrust (s) */
	thrust,
	
	/** Percentage to 2 decimal place */
	percentage2,
	
	/** kN/m / kg */
	knmkg,
	
	tsb,
	
	/** g-force */
	g,
	
	/** rsscribe FootStrike */
	rsstrike,
	
	/** Respiration rate - Breaths/minute */
	respiration,
	
	/** Garmin MTB dynamics - 0-1 Smooth, 1-20 Moderate, 20+ rough */
	flow,
	
	/** Garmin MTB dynamics - 0-20 (Easy), 20-40 (moderate), Hard 40+ */
	grit,
	
	/** Sum of all grit in a ride / 1000 */
	kgrit,
	
	/** watt-hour - unit of energy equivalent to one watt (1 W) of power expended for one hour (1 h) of time. The watt-hour is not a standard unit in any formal system, but it is commonly used in electrical applications. An energy expenditure of 1 Wh represents 3600 joules (3.600 x 103 J) */
	wh;
}
