package ship;

import java.util.ArrayList;

public class Ship {
	private final static int MAX_WEIGHT_SLOOP = 200;
	private final static int MAX_CREW_SLOOP = 60;
	
	private int holes;
	private int water;
	private int maxWeight;
	private int weight;
	private int maxCrew;
	private int crew;
	private String type;
	
	public Ship() {
		
	}
	
	public Ship(int maxWeight, int maxCrew) {
		this.maxWeight = maxWeight;
		this.maxCrew = maxCrew;
		
		this.type = "Custom";
		
		this.crew = 0;
		this.weight = 0;
		this.water = 0;
		this.holes = 0;
	}
	
	
	public Ship(String type) {
		
		switch(type) {
		case "sloop":
			this.maxWeight = MAX_WEIGHT_SLOOP;
			this.maxCrew = MAX_CREW_SLOOP;
			this.type = type;
			break;
		
		default:
			this.maxWeight = -1;
			this.maxCrew = -1;
			this.type = "";
			
			
			
		}
		
		this.crew = 0;
		this.weight = 0;
		this.water = 0;
		this.holes = 0;
		
	}
	
	
	
	
	
	
}
