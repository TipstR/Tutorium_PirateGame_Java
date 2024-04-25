import java.util.ArrayList;

import ship.Ship;

public class Player {
	private ArrayList<Ship> Fleet;
	private int gold;
	
	public Player() {
		this.Fleet = new ArrayList<Ship>();
		this.gold = 10000;
	}
}
