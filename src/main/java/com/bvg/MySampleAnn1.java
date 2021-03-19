package com.bvg;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Retention(RetentionPolicy.RUNTIME)
public @interface MySampleAnn1 {
	String name();

	String decs();
}

class MyAnnTest1 {

	@MySampleAnn(name = "test|", decs = "testing annotations")

	public void myTestMethod() {
	}
}