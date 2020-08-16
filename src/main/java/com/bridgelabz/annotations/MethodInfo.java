package com.bridgelabz.annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/*
 * @Documented - to decide whether to put annotations in Javadocs
 * @Retention - when there is a need of annotation
 * @Target? - the places where the annotation can visit.
 * @Inherited - to decide whether the subclasses get the annotations
 */

@Documented
@Target(ElementType.METHOD)
@Inherited
@Retention(RetentionPolicy.RUNTIME)

public @interface MethodInfo {
	String author() default "Tejaswini";
	String date();
	int revision() default 1;
	String comments();
}