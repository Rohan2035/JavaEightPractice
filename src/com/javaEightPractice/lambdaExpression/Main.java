package com.javaEightPractice.lambdaExpression;

public class Main {
	
	public static void main(String[] args) {
		
		Logic logic = new Logic();
		
		System.out.println("---------------- Without using Lambda Expression: ----------------" + "\n");
		logic.withoutLambdaExpression();
		
		System.out.println("\n");
		
		System.out.println("---------------- Using Lambda Expression: ----------------" + "\n");
		logic.withLambdaExpression();
		
	}

}
