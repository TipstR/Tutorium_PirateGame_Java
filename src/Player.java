import java.util.ArrayList;

import Exceptions.NotEnoughGoldException;
import Exceptions.TooFullCrewException;
import ship.Ship;

public class Player {
	private ArrayList<Ship> Fleet;	//Every Captain needs a fleet!
	private int gold;				// Every Captain needs gold!
	
	// Default Constructor
	public Player() {
	}
	
	// Constructor
	public Player(int gold) {
		this.gold = gold;
		this.Fleet = new ArrayList<Ship>();
	}

	// getter and setter
	public ArrayList<Ship> getFleet() {
		return Fleet;
	}

	public void setFleet(ArrayList<Ship> fleet) {
		Fleet = fleet;
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	// Function for adding ships to the fleet
	public void addShip(Ship ship) {
		this.Fleet.add(ship);
	}
	
	// Function for adding or subtracting gold
	public void addGold(int amount) throws NotEnoughGoldException{
		int newGold= this.gold + amount;
		
		if(newGold < 0) {
			throw new NotEnoughGoldException("Too many crew members(newGold=" + newGold +")"
					+ "A player can't have negative gold!");
		} else {
			this.gold = newGold;
		}
	}
	
	
}
