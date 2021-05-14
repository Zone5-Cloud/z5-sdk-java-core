package com.zone5cloud.core.utils;

/** Logging interface. A concrete class implementing this interface can be added to the Interceptors. */
public interface ILogger {
    public void d(String tag, String message);
    public void v(String tag, String message);
    public void i(String tag, String message);
    public void w(String tag, String message);
    public void e(String tag, String message);
    public void e(String tag, String message, Exception exception);
}