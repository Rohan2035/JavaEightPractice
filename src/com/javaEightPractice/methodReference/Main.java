package com.javaEightPractice.methodReference;

public class Main {
	
	public static void main(String[] args) {
		
		Logic logic = new Logic();
		
		System.out.println("------------ Using Lambda Expression ------------" + "\n");
		logic.usingLambdaExpression();
		
		System.out.println("\n" + "------------ Using Method Refrencing -----------" + "\n");
		
		// Calling doSomething() method by using methodReferencing
		UtilityInterface utilityInterface = logic::someMethod;
		utilityInterface.doSomething("The World");
		
	}

}
