package com.bvg;

interface InterfaceDemo {
    
	int add(int a, int b);
	default int sub(int a, int b) {
		return a-b;
	}

    int mul(int a, int b);
}
