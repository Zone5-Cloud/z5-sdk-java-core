package com.zone5cloud.core.enums;

public enum Roles {
	/** A normal user / subscriber */
	user,
	
	/** A system administrator */
	admin,
	
	@Deprecated
	device,
	
	/** user is an event promoter and is associated with an EventCompany */
	company,
	
	/** user is a coach - a coach is someone who has more then one coach/client delegate */
	coach,
	
	/** user has access to beta features */
	beta,
	
	/** User has a premium service */
	premium,
	
	/** Team manager */
	manager,
	
	/** Today's Plan support */
	support,
	
	/** Today's Plan power user */
	power,
	
	/** Component management */
	components,
	
	@Deprecated
	tfr,
	
	sky,
	
	doctor,
	
	director,
	
	/** Race program access */
	raceprogram,
	
	audit,

	ctm,
	
	stages,
	
	surveys,
	
	teamadmin,
	
	stagesadmin,
	
	beta2,
	
	pi,
	
	/** Can manage device serial numbers */
	deviceadmin,
	
	/** Can manage promo codes */
	promoadmin,
	
	stageslink,
	
	hrv,
	
	reports,
	
	cinch,
	
	alpha,
	
	/** Allow users to access old dashboards */
	olddash,
	
	/** Allow user to access the mobile app */
	app,
	
	routes,
	
	/** Advanced coach permission */
	beta3,
	
	/** Specialized R&D projects */
	specializedresearch,
	
	bora,
	
	quickstep,
	
	@Deprecated
	bahrain,
	
	/** has access to curation tools */
	curation,
	
	/** has access to query for users, request tokens on behalf of users etc */
	useradmin;
}