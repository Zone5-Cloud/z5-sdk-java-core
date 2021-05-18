package com.zone5cloud.core.utils;

import java.util.Date;

public class DefaultLogger implements ILogger {

	private enum Severity {
		VERBOSE, DEBUG, INFO, WARN, ERROR
	}
	
	private void writeLog(String tag, Severity s, String message) {
		if (s == null) s = Severity.DEBUG;
		
		System.out.println(String.format("%s %s %s: %s", new Date(), s.name(), (tag != null ? tag : ""), (message != null ? message : "")));
	}
	
    @Override
    public void d(String tag, String message) {
        writeLog(tag, Severity.DEBUG, message);
    }

    @Override
    public void v(String tag, String message) {
    	writeLog(tag, Severity.VERBOSE, message);
    }

    @Override
    public void i(String tag, String message) {
    	writeLog(tag, Severity.INFO, message);
    }

    @Override
    public void w(String tag, String message) {
    	writeLog(tag, Severity.WARN, message);
    }

    @Override
    public void e(String tag, String message) {
    	writeLog(tag, Severity.ERROR, message);
    }

    @Override
    public void e(String tag, String message, Exception exception) {
    	writeLog(tag, Severity.ERROR, message);
    	exception.printStackTrace();
    }

	@Override
	public void httpError(String tag, String url, int statusCode, String message) {
		e(tag, url + " failed with " + statusCode + ": " + message);
	}

	@Override
	public void refreshError(String tag, String url, int statusCode, String message) {
		httpError(tag, url, statusCode, message);
	}
}