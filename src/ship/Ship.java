package ship;

import java.util.ArrayList;

public abstract class Ship {
	private int holes;
	private int water;
	private int weight;
	private int crew;
	
	public Ship() {
		
	}
	
	
	

	public Ship(int holes, int water, int weight, int crew) {
		this.holes = holes;
		this.water = water;
		this.weight = weight;
		this.crew = crew;
	}




	public int getHoles() {
		return this.holes;
	}
	
	public void setHoles(int holes) {
		this.holes = holes;
	}
	
	public void addHoles(int amount) {
		this.holes += amount;
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
	
	public void addWeight(int amount) {
		this.weight += amount;
	}

	public int getCrew() {
		return crew;
	}

	public void setCrew(int crew) {
		this.crew = crew;
	}
	
	public void addCrew(int amount) {
		this.crew += amount;
	}
}
