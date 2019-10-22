package com.zone5ventures.utils;

public class BitwiseUtils {

	public static boolean isAnySet(Integer mask, Enum<?> ...n) {
		if (n == null || n.length == 0)
			return false;
		
		for(Enum<?> e : n) {
			if (isSet(mask, e))
				return true;
		}
		
		return false;
	}
	
	public static boolean isAnySet(Long mask, Enum<?> ...n) {
		if (n == null || n.length == 0)
			return false;
		
		for(Enum<?> e : n) {
			if (isSet(mask, e))
				return true;
		}
		
		return false;
	}
	
	public static boolean isSet(Integer mask, Enum<?> n) {
		if (mask == null)
			return false;
		return isSet(mask, n.ordinal());
	}
	
	public static boolean isSet(Long mask, Enum<?> n) {
		if (mask == null)
			return false;
		return isSet(mask, n.ordinal());
	}
	
	public static boolean isSetAll(Long mask, Enum<?>... n) {
		if (n == null)
			return true;
		
		for(Enum<?> e : n) {
			if (!BitwiseUtils.isSet(mask, e))
				return false;
		}
		
		return true;
	}
	
	public static boolean isSet(Integer mask, int n) {
		if (mask == null)
			return false;
		return ((1 << n) & mask.intValue()) > 0;
	}
	
	public static boolean isSet(Long mask, int n) {
		if (mask == null)
			return false;
		return ((1L << n) & mask.longValue()) > 0;
	}
	
	public static int set(Integer mask, Enum<?> n) {
		if (mask == null)
			mask = 0;
		return set(mask, n.ordinal());
	}
	
	public static long set(Long mask, Enum<?> n) {
		if (mask == null)
			mask = 0L;
		return set(mask, n.ordinal());
	}
	
	public static int unset(Integer mask, Enum<?> n) {
		if (mask == null)
			mask = 0;
		return unset(mask, n.ordinal());
	}
	
	public static long unset(Long mask, Enum<?> n) {
		if (mask == null)
			mask = 0L;
		return unset(mask, n.ordinal());
	}
	
	public static int set(Integer mask, int n) {
		if (mask == null)
			mask = 0;
		return mask.intValue() | (1 << n);
	}
	
	public static long set(Long mask, int n) {
		if (mask == null)
			mask = 0L;
		return mask.longValue() | (1L << n);
	}
	
	public static int unset(Integer mask, int n) {
		if (mask == null)
			mask = 0;
		return mask & ~(1 << n);
	}
	
	public static long unset(Long mask, int n) {
		if (mask == null)
			mask = 0L;
		return mask & ~(1L << n);
	}
}