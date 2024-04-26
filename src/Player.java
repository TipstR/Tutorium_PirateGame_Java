import java.util.ArrayList;

import ship.Ship;

public class Player {
	private ArrayList<Ship> Fleet;
	private int gold;
	
	public Player() {
		this.Fleet = new ArrayList<Ship>();
		this.gold = 10000;
	}

	public ArrayList<Ship> getFleet() {
		return Fleet;
	}

	public void setFleet(ArrayList<Ship> fleet) {
		Fleet = fleet;
	}
	
	public void addShip(Ship ship) {
		this.Fleet.add(ship);
	}

	public int getGold() {
		return gold;
	}

	public void setGold(int gold) {
		this.gold = gold;
	}
	
	public void addGold(int amount) {
		this.gold += amount;
	}
	
	
}
