package com.aspire;

public class LambdaSyntaxEx {
	public static void main(String args[]) {
		LambdaSyntaxEx tester = new LambdaSyntaxEx();
		
		//Using anonymous inner classes
		/*MathOperation addition = new MathOperation(){
			@Override
			public int operation(int a, int b){
				return a + b;
			}
		};
		
		MathOperation subtraction = new MathOperation(){
			@Override
			public int operation(int a, int b){
				return a - b;
			}
		};
		
		MathOperation multiplication = new MathOperation(){
			@Override
			public int operation(int a, int b){
				return a * b;
			}
		};
		
		MathOperation division = new MathOperation(){
			@Override
			public int operation(int a, int b){
				return a / b;
			}
		}; 
	*/
		
		//Using Lambda expressions
		// with type declaration
		MathOperation addition = (int a, int b) -> a + b;

		// with out type declaration
		MathOperation subtraction = (a, b) -> a - b;

		// with return statement along with curly braces
		MathOperation multiplication = (int a, int b) -> {
			return a * b;
		};

		// without return statement and without curly braces
		MathOperation division = (int a, int b) -> a / b;
		

		System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
		System.out.println("10 - 5 = " + tester.operate(10, 5, subtraction));
		System.out.println("10 x 5 = " + tester.operate(10, 5, multiplication));
		System.out.println("10 / 5 = " + tester.operate(10, 5, division));

		// with parenthesis
		GreetingService greetService1 = (message) -> System.out.println("Hello " + message);

		// without parenthesis
		GreetingService greetService2 = message -> System.out.println("Hello " + message);

		greetService1.sayMessage("Ramesh");
		greetService2.sayMessage("Suresh");
	}

	interface MathOperation {
		int operation(int a, int b);
	}

	interface GreetingService {
		void sayMessage(String message);
	}

	private int operate(int a, int b, MathOperation mathOperation) {
		return mathOperation.operation(a, b);
	}
}
