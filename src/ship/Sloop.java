package ship;

import Exceptions.TooFullCrewException;

public class Sloop extends Ship {

	private final int MAX_CREW = 60;	// Max crew for sloops
	private final int MAX_WEIGHT = 300;	// Max weight for sloops
	private final int MAX_CANNONS = 30;	// Max cannons for sloops
	
	private int cannons;				// A Sloop has cannons
	
	// Default Constructor
	public Sloop() {
		super();
	}

	// Constructor
	public Sloop(int holes, int water, int weight, int crew, int cannons) {
		super(holes, water, weight, crew);
		this.cannons = cannons;
	}
	
	// getter and setter
	public int getCannons() {
		return this.cannons;
	}
	
	public void setCannons(int cannons) {
		this.cannons = cannons;
	}
	
	// Function for adding or subtracting cannons
	public void addCannons(int amount) {
		this.cannons += amount;
	}
	
	@Override
	public void addCrew(int amount) throws TooFullCrewException {
		int newCrew = super.getCrew() + amount;
		
		if(newCrew > this.MAX_CREW) {
			throw new TooFullCrewException("Too many crew members(newCrew=" + newCrew +
					", MAX_CREW=" + this.MAX_CREW + ")");
		} else {
			super.setCrew(newCrew);
		}
		
	}
	
	@Override
	public void addWater(int amount) {
		// TODO Auto-generated method stub
		
	}
	
	// To String for printing sloops
	@Override
	public String toString() {
		return("Sloop [Crew: " + this.getCrew() + ", Cannons: " + this.getCannons() +
				", Weight: " + this.getWeight() + "]"); 
	}



	
	
	
	
}
