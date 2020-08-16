package com.bridgelabz.annotations;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class AnnotationExample {

	@Override
	@MethodInfo(author = "Tejaswini", comments = "Main method",date = "August 16 2020",revision = 1)
	public String toString(){
		return "Overriden toString method";
	}

	@Deprecated
	@MethodInfo(comments = "deprecated method",date = "August 16 2020")
	public static void oldMethod(){
		System.out.println("Old method,don't use it.");
	}

	public static void main(String[] args){
		try {
			for (Method method : AnnotationExample.class.getMethods()){
				// it checks if MethodInfo annotation is present for the method
				if (method.isAnnotationPresent(MethodInfo.class)){
					try {
						//iterates all the annotations available in the method
						for (Annotation anno : method.getDeclaredAnnotations()) {
							System.out.println("Annotation in Method " + method + " : " + anno);
						}
						MethodInfo methodAnno = method.getAnnotation(MethodInfo.class);
						if (methodAnno.revision() == 1) {
							System.out.println("Method with revision no 1 = " + method);
						}
					}catch (Throwable ex) {
						ex.printStackTrace();
					}
				}
			}
		}catch (SecurityException e){
			e.printStackTrace();
		}
	}
}

