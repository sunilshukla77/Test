package com.bvg;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnnotation {

	String key();

	String value();
}

public class MyAnnotationTest {

	private Object mya;

	@MyAnnotation(key = "site", value = "sun.com")
	public static void MyAnnotationTestMethod() {
		try {

			Class<? extends MyAnnotationTest> cls = new MyAnnotationTest();
			Method mth = cls.getMethod("MyAnnotationTestMethod");
			MyAnnotation myAnno = mth.getAnnotation(MyAnnotation.class);
			System.out.println("key: " + myAnno.key());
			System.out.println("value: " + myAnno.value());
		} catch (SecurityException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (NoSuchMethodException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();

		}
	}

	public static void main(String args[]) {
		
	MyAnnotationTest mat = new MyAnnotationTest();
	mat.mya;
	MyAnnotationTest;
	}
}
