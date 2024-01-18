package com.javaEightPractice.collector;

public class Alien {

	private int alienId;
	private String alienName;
	private String planet;

	public Alien() {
		super();
	}

	public Alien(int alienId, String alienName, String planet) {
		super();
		this.alienId = alienId;
		this.alienName = alienName;
		this.planet = planet;
	}

	public int getAlienId() {
		return alienId;
	}

	public void setAlienId(int alienId) {
		this.alienId = alienId;
	}

	public String getAlienName() {
		return alienName;
	}

	public void setAlienName(String alienName) {
		this.alienName = alienName;
	}

	public String getPlanet() {
		return planet;
	}

	public void setPlanet(String planet) {
		this.planet = planet;
	}

	@Override
	public String toString() {
		return "\tAliens [alienId=" + alienId + ", alienName=" + alienName + ", planet=" + planet + "]" + "\n";
	}

}
