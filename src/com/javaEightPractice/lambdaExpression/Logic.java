package com.javaEightPractice.lambdaExpression;

public class Logic {

	public void withoutLambdaExpression() {

		// Providing implementation to the interface
		UtilityInterface utilityInterface = new UtilityInterface() {

			@Override
			public void doSomething(String someString) {

				System.out.println("The String: " + someString);

			}
		};

		// Calling interface method
		utilityInterface.doSomething("Star Platinum");

	}

	public void withLambdaExpression() {
		
		// Providing implementation using Lambda expression
		// Lambda expression only works with FunctionalInterface
		// FunctionalInterface: An interface that contains only single abstract method
		UtilityInterface utilityInterface = (someString) -> System.out.println("The String: " + someString);
		
		// Calling utilityInterface method
		utilityInterface.doSomething("The World");

	}

}
