package com.java.common;

public class Itrerations1 {
	public static void main(String[] args) {
		  
		  // Iterations
		  // 1. for
		  // 2. while
		  // 3. do while
		  
		  
		  // Model: Data Representation
		  // Representing some jacket prices on eCommerce Platform
		  double jacket1Price = 45;
		  double jacket2Price = 25;
		  double jacket3Price = 55;
		  double jacket4Price = 95;
		  double jacket5Price = 105;
		  
		  // Representing Covid19 Active cases as on 22nd Nov 2020 for 5 states of India
		  int maharashtraActiveCases = 79873;
		  int karnatakaActiveCases = 24714;
		  int andhraPradeshActiveCases = 17812;
		  int tamilNaduActiveCases = 691;
		  int keralaActiveCases = 292;
		  
		  // Challenge:
		  // This is going to be a tough activity if we have to represent every single state
		  // We as developer will spend lot of time in just representing the data :(

		  // Solution:
		  // Represent Data in Multi Value Containers:)
		  // Array :)
		  //          0   1   2  3    4
		  double[] jacketPrices = {45, 25, 55, 95, 105};
		  //          0    1       2    3    4
		  int[] stateWiseActiveCases = {79873, 24714, 17812, 691, 292};
		  
		  System.out.println("jacket1Price is: "+jacket1Price);      // 45
		  System.out.println("maharashtraActiveCases is: "+maharashtraActiveCases); // 79873
		  
		  System.out.println("jacketPrices is: "+jacketPrices);      // HashCode
		  System.out.println("stateWiseActiveCases is: "+stateWiseActiveCases);  // HashCode
		  
		  System.out.println("Length of Array jacketPrices is: "+jacketPrices.length);     // 5
		  System.out.println("Length of Array stateWiseActiveCases is: "+stateWiseActiveCases.length); // 5
		  
		  // Array Indexes works from 0 to length-1
		  // 0 is the first element and length-1 is the last element
		  // if length is 5 i.e. we have 5 elements -> first is 0 and last is 4
		  
		  // Challenge:
		  // Logical part becomes more effort as developer is writing lot of statements
		  // We are sort of writing the same statement again and again :(
		  // only index is changing, rest everything is SAME
		  
		  System.out.println("JACKETS BEFORE DISCOUNT");
		  /*System.out.println(jacketPrices[0]);
		  System.out.println(jacketPrices[1]);
		  System.out.println(jacketPrices[2]);
		  System.out.println(jacketPrices[3]);
		  System.out.println(jacketPrices[4]);*/
		  
		  int idx = 0;
		  
		  /*while(idx<5) { // checks condition at entry
		   System.out.println(jacketPrices[idx]);
		   idx++;
		  }*/
		  do{ 
		   System.out.println(jacketPrices[idx]);
		   idx++;
		  }while(idx<5); // checks condition at exit
		  
		  // On JacketPrices we wish to offer a flat 50% Off
		  /*jacketPrices[0] = jacketPrices[0] - 0.5*jacketPrices[0];
		  jacketPrices[1] = jacketPrices[1] - 0.5*jacketPrices[1];
		  jacketPrices[2] = jacketPrices[2] - 0.5*jacketPrices[2];
		  jacketPrices[3] = jacketPrices[3] - 0.5*jacketPrices[3];
		  jacketPrices[4] = jacketPrices[4] - 0.5*jacketPrices[4];*/
		  
		  idx = 0;
		  /*while(idx<5) { // checks condition at entry
		   jacketPrices[idx] = jacketPrices[idx] - 0.5*jacketPrices[idx];
		   idx++;
		  }*/
		  do{ 
		   jacketPrices[idx] = jacketPrices[idx] - 0.5*jacketPrices[idx];
		   idx++;
		  }while(idx<5); // checks condition at exit
		  
		  System.out.println("JACKETS AFTER DISCOUNT");
		  /*System.out.println(jacketPrices[0]);
		  System.out.println(jacketPrices[1]);
		  System.out.println(jacketPrices[2]);
		  System.out.println(jacketPrices[3]);
		  System.out.println(jacketPrices[4]);*/
		  
		  idx = 0;
		  /*while(idx<5) { // checks condition at entry
		   System.out.println(jacketPrices[idx]);
		   idx++;
		  }*/
		  do{ 
		   System.out.println(jacketPrices[idx]);
		   idx++;
		  }while(idx<5); // checks condition at exit
		  
		  // Solution:
		  // Iterations
		  
		  // while VS doWhile
		  // while will not work for wrong condition 
		  // do while will at least work once even if the condition is not satisfied
		  
		  // infinite loop: where condition is always true :)
		  /*while(true) {
		   System.out.println("This is INFINITE :(");
		  }*/
		  
		  
		 }

}
