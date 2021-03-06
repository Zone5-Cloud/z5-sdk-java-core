package com.zone5cloud.core.routes;

public enum UserRouteOutputType {
	
	// Stages L10 route format
	sro,
	// Standard GPX output
	gpx,
	// Stages L10 route files
	tiles,
	// Standard FIT output
	fit,
	// A FIT varient used for Stages Dash 2
	dashfit,
	// Protobufs version of routes
	pb,
	// Static map
	png,
	// Web UI js format for saving a route
	js,
	// A static image of the routes elevation profile
	areachart;

}
