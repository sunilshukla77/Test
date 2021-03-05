package com.bvg;

interface InterfaceDemo {
    
	default int add(int a, int b) {
		return a+b;
	}
	default int sub(int a, int b) {
		return a-b;
	}

    int mul(int a, int b);
}
