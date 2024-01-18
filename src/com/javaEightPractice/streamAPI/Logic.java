package com.javaEightPractice.streamAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Logic {

	private List<Alien> alienList = new ArrayList<>();

	public Logic(List<Alien> alienList) {

		this.alienList.addAll(alienList);

	}

	// I'll implement the important methods of streamApi

	// allMatch() checks whether all the elements match to a given predicate and returns true or false
	// If stream is empty then it return true
	public Boolean allMatch() {

		// Checks all the alien names are greater than 3
		Boolean result = alienList.stream().allMatch(alien -> alien.getAlienName().length() >= 3);
		return result;
		
	}
	
	// anyMatch() checks whether any element is present that matches with the given predicate
	public Boolean anyMatch() {
		
		Boolean result = alienList.stream().anyMatch(alien -> alien.getPlanet().equals("Mars"));
		return result;
		
	}
	
	// collect() method is used to reduce the stream into a mutable data structure such as list or set
	// filter() method filters out the element based on the given predicate
	public List<Alien> filter() {
		
		// I'll filter out the aliens based on their planet name
		// Let's take Mars for an example
		
		List<Alien> alienFilteredList = alienList.stream()
													.filter(alien -> alien.getPlanet().equals("Mars"))
													.collect(Collectors.toList());
		
		return alienFilteredList;
		
	}
	
	// reduce() method reduces the stream into a value that is held inside optional
	public Alien reduce() {
		
		// In this method I'm reducing the stream based on the length of the name
		// Output will contain the alien name of greatest length
		Optional<Alien> result = alienList.stream()
											.reduce((alienOne, alienTwo) ->
														alienOne.getAlienName().length() > alienTwo.getAlienName().length() ?
														alienOne : alienTwo);
		
		return result.get();
		
	}
	
	// map() method transforms the element based on a particular function
	public List<Integer> map() {
		
		// In this I'll map the alienList object into a list of alienId
		List<Integer> result = alienList.stream()
												.map(alien -> alien.getAlienId())
												.collect(Collectors.toList());
		
		return result;
		
	}
	
	// flatMap() is similar to map() method but it transforms the element along with flattening of the stream
	// map() is used for one-to-one mapping and flatMap() is used for many-to-many mapping
	public List<Integer> flatMap() {
		
		// I'll use another example for this as alien class does not have any requirement to use flatMap()
		List<List<Integer>> listOfLists = Arrays.asList(
				  Arrays.asList(1, 2, 3),
				  Arrays.asList(4, 5),
				  Arrays.asList(6, 7, 8)
				);

		List<Integer> result = listOfLists.stream()
												.flatMap(list -> list.stream())  // Flattening step
												.toList();
		
		return result;
		
	}

}
