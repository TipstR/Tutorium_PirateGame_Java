package ship;

import java.util.ArrayList;

import Exceptions.TooFullCrewException;

public abstract class Ship {
	private int holes;
	private int water;
	private int weight;
	private int crew;
	
	// Default Constructor
	public Ship() {
		
	}
	
	// Constructor
	public Ship(int holes, int water, int weight, int crew) {
		this.holes = holes;
		this.water = water;
		this.weight = weight;
		this.crew = crew;
	}


	// getter and setter
	public int getHoles() {
		return this.holes;
	}
	
	public void setHoles(int holes) {
		this.holes = holes;
	}
	
	public int getWater() {
		return water;
	}

	public void setWater(int water) {
		this.water = water;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}
	
	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}
	
	// Function for adding or subtracting holes
	public void addHoles(int amount)  {
		this.holes += amount;
	}
	
	// Function for adding or subtracting crew members
	public abstract void addCrew(int amount) throws TooFullCrewException;
	
	// Function for adding or subtracting water
	public abstract void addWater(int amount);
}
