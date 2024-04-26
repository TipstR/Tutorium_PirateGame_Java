package ship;

public class Sloop extends Ship {

	private final int MAX_CREW = 60;
	private final int MAX_WEIGHT = 300;
	private final int MAX_CANNONS = 30;
	
	private int cannons;
	
	public Sloop() {
		super();
	}

	public Sloop(int holes, int water, int weight, int crew, int cannons) {
		super(holes, water, weight, crew);
		this.cannons = cannons;
	}
	
	public int getCannons() {
		return this.cannons;
	}
	
	public void setCannons(int cannons) {
		this.cannons = cannons;
	}
	
	public void addCannons(int amount) {
		this.cannons += amount;
	}
	
	@Override
	public String toString() {
		return("Sloop [Crew: " + this.getCrew() + ", Cannons: " + this.getCannons() +
				", Weight: " + this.getWeight() + "]"); 
	}

	
	
	
	
}
