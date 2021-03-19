package com.bvg;

public @interface MySampleAnn {
	String name();

	String decs();

}

class MyAnnTest {
	@MySampleAnn(name = "test|", decs = "testin annotations")
	public void myTestMethod() {
	}
}