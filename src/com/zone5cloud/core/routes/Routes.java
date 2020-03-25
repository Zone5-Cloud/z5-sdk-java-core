package com.zone5cloud.core.routes;

public class Routes {
	
	public static final String SEARCH = "/rest/users/route/search/{offset}/{count}";
	public static final String NEXT = "/rest/users/route/page/{offset}/{count}";

	public static final String SUMMARY = "/rest/users/route/get/{routeId}/0";
	public static final String DETAILED = "/rest/users/route/get/{routeId}/1";
	public static final String UPDATE = "/rest/users/route/set/{routeId}";
	public static final String DELETE = "/rest/users/route/rem/{routeId}";
	
	public static final String UPLOAD = "/rest/users/route/upload/v2/{format}";
	public static final String UPLOAD_UPDATE = "/rest/users/route/upload/v2/{routeId}/{format}";	
	
	public static final String DOWNLOAD_PNG = "/rest/users/route/download/v2/{routeId}/png";
	public static final String DOWNLOAD_FIT = "/rest/users/route/download/v2/{routeId}/fit";
	public static final String DOWNLOAD_GPX = "/rest/users/route/download/v2/{routeId}/gpx";
	
	public static final String DOWNLOAD_STAGES_SRO = "/rest/users/route/download/{routeId}/stages";
	public static final String DOWNLOAD_STAGES_FIT = "/rest/users/route/download/{routeId}/fit";
		
	public static final String CLONE_ACTIVITY = "/rest/users/route/clone/files/{fileId}";
	public static final String CLONE_ROUTE = "/rest/users/route/clone/route/{fileId}";
}

