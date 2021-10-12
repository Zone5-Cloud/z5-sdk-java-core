package com.zone5cloud.core.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/** 
 * Tag a request interface with this to mark it as not requiring the Authorization header 
 **/
@Documented
@Target(METHOD)
@Retention(RUNTIME)
public @interface Unauthenticated {

}
