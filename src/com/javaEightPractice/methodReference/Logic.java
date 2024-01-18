package com.javaEightPractice.methodReference;

public class Logic {
	
	// Providing implementation for method referencing
	// Method should have same return type and parameter list
	// We'll use this method to use referencing for UtilityInterface in Main 
	public void someMethod(String someString) {
		 
		System.out.println("The String: " + someString);
		
	}
	
	// Using Lambda Expression
	public void usingLambdaExpression() {
		
		UtilityInterface utilityInterface = (someString) -> System.out.println("The String: " + someString);
		
		// Calling doSomething() method
		utilityInterface.doSomething("Star Platinum");
		
	}

}
