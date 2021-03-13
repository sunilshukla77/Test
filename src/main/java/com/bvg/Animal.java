package com.bvg;

public class Animal {
	
		 
		void move1(){
			System.out.println("Animals can move");
		}
	
	 
	class Dog extends Animal{
	 
		 public void move(){
			System.out.println("Dogs can walk and run");
		}
		public void bark(){
			System.out.println("Dogs can bark");
		}
	}
	 
	public class TestDog{
	 
		public void main(String args[]){
			Animal a = new Animal();// Animal reference and object
			Dog b = new Dog();// Animal reference but Dog object
	 
	      		a.move1();// runs the method in Animal class
	      		b.move1();//Runs the method in Dog class
	      		b.bark();
		}
	}


}
