package com.javaEightPractice.collector;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Logic {

	private List<Alien> alienList = new ArrayList<>();

	public Logic(List<Alien> alienList) {

		this.alienList.addAll(alienList);

	}

	// Here I'll implement the methods that are in Collectors class

	// toList() converts a stream into a list
	public List<Alien> toList() {

		// Here I'm converting the actual list into a stream and using collectors I'm
		// converting it back to a list
		Stream<Alien> alienStream = alienList.stream();
		List<Alien> newAlienList = alienStream.toList();

		return newAlienList;

	}

	// toSet() converts a stream into a set
	public Set<Alien> toSet() {

		Set<Alien> alienSet = alienList.stream().collect(Collectors.toSet());

		return alienSet;

	}

	// toMap() converts a stream into a map
	public Map<String, Alien> toMap() {

		Map<String, Alien> alienMap = alienList.stream()
				.collect(Collectors.toMap(alien -> alien.getPlanet(), Function.identity(), (alien1, alien2) -> alien1));

		return alienMap;

	}

	// counting() counts the number of elements
	public Long counting() {

		Long count = alienList.stream().collect(Collectors.counting());

		return count;
	}

	// groupingBy() returns a map based on the input element
	public Map<String, List<Alien>> groupingBy() {

		Map<String, List<Alien>> alienMap = alienList.stream()
				.collect(Collectors.groupingBy(alien -> alien.getPlanet()));

		return alienMap;
	}

	// joining() concatenates input element separated by a delimiter
	public String joining() {

		String result = alienList.stream().map(alien -> alien.getAlienName()).collect(Collectors.joining(","));

		return result;

	}

}
