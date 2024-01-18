package com.javaEightPractice.collector;

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

		System.out.println("toList: ");
		System.out.println(logic.toList());

		System.out.println("\n --------------------------------- \n");

		System.out.println("toSet: ");
		System.out.println(logic.toSet());;

		System.out.println("\n --------------------------------- \n");

		System.out.println("toMap: ");
		System.out.println(logic.toMap());

		System.out.println("\n --------------------------------- \n");

		System.out.println("counting: ");
		System.out.println(logic.counting());

		System.out.println("\n --------------------------------- \n");

		System.out.println("groupingBy: ");
		System.out.println(logic.groupingBy());

		System.out.println("\n --------------------------------- \n");

		System.out.println("joining: ");
		System.out.println(logic.joining());
	}

}
