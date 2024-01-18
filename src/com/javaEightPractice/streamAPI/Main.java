package com.javaEightPractice.streamAPI;

import java.util.ArrayList;
import java.util.List;

public class Main {
	
	private static List<Alien> alienList;
	
	static {
		
		alienList = new ArrayList<>();
		alienList.add(new Alien(100, "XOXO", "Mars"));
		alienList.add(new Alien(101, "YOZX", "Knor"));
		alienList.add(new Alien(102, "ZAQR", "Mars"));
		alienList.add(new Alien(103, "XOR", "Zowr"));
		alienList.add(new Alien(104, "AQFR", "Dix"));
		alienList.add(new Alien(105, "RCGOTH", "Knor"));
		alienList.add(new Alien(106, "ZAXEH", "Zowr"));
		
	}
	
	public static void main(String[] args) {
		
		Logic logic = new Logic(alienList);
		
		System.out.println("allMatch() Method: ");
		System.out.println(logic.allMatch());
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println("anyMatch() Method: ");
		System.out.println(logic.anyMatch());
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println("filter() and collect() Method: ");
		System.out.println(logic.filter());
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println("reduce() Method: ");
		System.out.println(logic.reduce());
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println("map() Method: ");
		System.out.println(logic.map());
		
		System.out.println("\n----------------------------------------\n");
		
		System.out.println("flatMap() Method: ");
		System.out.println(logic.flatMap());
		
	}

}
