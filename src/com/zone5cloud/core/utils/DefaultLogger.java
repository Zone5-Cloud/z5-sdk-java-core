package com.zone5cloud.core.utils;

public class DefaultLogger implements ILogger {

	private void writeLog(String tag, String message) {
		System.out.println(String.format("%d DEBUG %s: %s", System.currentTimeMillis(), (tag != null ? tag : ""), (message != null ? message : "")));
	}
	
    @Override
    public void d(String tag, String message) {
        writeLog(tag, message);
    }

    @Override
    public void v(String tag, String message) {
    	writeLog(tag, message);
    }

    @Override
    public void i(String tag, String message) {
    	writeLog(tag, message);
    }

    @Override
    public void w(String tag, String message) {
    	writeLog(tag, message);
    }

    @Override
    public void e(String tag, String message) {
    	writeLog(tag, message);
    }

    @Override
    public void e(String tag, String message, Exception exception) {
    	writeLog(tag, message);
    	exception.printStackTrace();
    }
}