import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import ship.Ship;
import ship.Sloop;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		welcome();
		
		Player player = new Player();
		
		boolean exit = false;
		
		String input = new String();
		
		while(!exit) {
			
			
			System.out.println("You are in town in the middle of the Caribbean.");
			myWait(2000);
			System.out.println("In this town there is a TAVERN, a SHOP and a SHIPYARD.");
			System.out.println("");
			
			myWait(2000);
			
			System.out.println("Where do you want to go?");
			myWait(300);
			System.out.println("1: Tavern");
			myWait(300);
			System.out.println("2: Shop");
			myWait(300);
			System.out.println("3: Shipyard");
			myWait(300);
			System.out.println("4: Look at ships");
			System.out.println("");
			
			myWait(300);
			System.out.println("99: Quit Game");
			
			myWait(300);
			
			System.out.print("Your Input: ");
			input = scanner.next();
			System.out.println("");
			
			switch(input) {
			
			case "1":
				tavern(player , scanner);
				break;
				
			case "3":
				shipyard(player, scanner);
				break;
				
			case "4":
				lookAtShips(player, scanner);
				break;
				
			case "99":
				exit = true;
				break;
				
			}
			
			
		}
		
		scanner.close();
		return;
	}
	
	public static void welcome() {
		String pirateGame = " A PIRATE GAME";
		
		System.out.println("WELCOME TO");
		myWait(1000);
		System.out.println("_______________");
		System.out.println("");
		
		slowPrint(pirateGame, 300);
	
		
		System.out.println("");
		System.out.println("_______________");
		myWait(1000);
	}
	
	public static void tavern(Player player, Scanner scanner) {
		System.out.println("You step into a Tavern.");
		myWait(2000);
		System.out.println("The Air is filled with the smell of sweat, alcohol and blood.");
		myWait(2000);
		System.out.println("The room is filled with loud music, people laughing and some brawling here and there.");
		myWait(2000);
		System.out.println("At the bar you see a big man with scars, tattoos and a eyepatch.");
		myWait(2000);
		System.out.println("As you approch the man he said with a welcoming voice:");
		myWait(2000);
		System.out.println("'Welcome to my little Tavern, Captain. If you are looking for some diligent crew members,"
				+ " you have come to the right place!'");
		myWait(2000);
		
		System.out.println("");
		System.out.println("What do you want to do?");
		myWait(300);
		System.out.println("1: Hire crew");
		myWait(300);
		System.out.println("2: leave tavern");
		myWait(300);
		System.out.println("");
		System.out.println("Your Input");
		
		String input = new String();
		
		input = scanner.next();
		System.out.println("");
		
		switch(input) {
		
		case "1":
			System.out.println("How many crew members do you want to hire?");
			System.out.println("One man costs 20g");
			System.out.println("");
			System.out.println("Your gold: " + player.getGold());
			System.out.println("");
			System.out.print("Your Input: ");
			
			input = scanner.next();
			
			player.getFleet().get(0).addCrew(Integer.parseInt(input));
			player.addGold(-20 * Integer.parseInt(input));
			break;
		
		case "2":
			return;
		}
	}
	
	public static void shipyard(Player player, Scanner scanner) {
		System.out.println("You step into a Shipyard.");
		myWait(2000);
		System.out.println("The Air is filled with the smell of wood, iron and old clothes.");
		myWait(2000);
		System.out.println("You see tools hanging on the walls.");
		myWait(2000);
		System.out.println("At the counter you see a big man with a saw as his right hand replacement.");
		myWait(2000);
		System.out.println("As you approch the man he said with a welcoming voice:");
		myWait(2000);
		System.out.println("'Welcome to my beautiful shipyard, Captain. If you are looking for some well crafted ships,"
				+ " you have come to the right place'");
		myWait(2000);
		
		System.out.println("");
		System.out.println("What do you want to do?");
		myWait(300);
		System.out.println("1: Buy Ships");
		myWait(300);
		System.out.println("2: leave shipyard");
		myWait(300);
		System.out.println("");
		System.out.println("Your Input");
		
		String input = new String();
		
		input = scanner.next();
		System.out.println("");
		
		switch(input) {
		
		case "1":
			System.out.println("");
			System.out.println("Available Ships:");
			myWait(300);
			System.out.println("1: Sloop | 5000g");
			myWait(300);
			System.out.println("2: cancel");
			myWait(300);
			System.out.println("");
			System.out.println("Your Gold: " + player.getGold() + "g");
			myWait(300);
			System.out.println("");
			System.out.println("Your Input");
			input = scanner.next();
			System.out.println("");
			
			switch(input) {
			
			case "1":
				Sloop sloop = new Sloop(0, 0, 0 , 20, 10);
				player.addShip(sloop);
				player.addGold(-5000);
				System.out.println("You Succesfully bought a new Sloop!");
				break;
			
			case "2":
				break;
			}
			break;
		
		case "2":
			return;
		}
		
	}
	
	public static void lookAtShips(Player player, Scanner scanner) {
		ArrayList<Ship> fleet = player.getFleet();
		
		if(fleet.isEmpty()) {
			System.out.println("You don't have any ships yet!");
			return;
		}
		
		System.out.println("All ships in your fleet:");
		
		for(int i = 0; i < fleet.size(); i++) {
			System.out.println(fleet.get(i));
		}
		
		System.out.println("");
		System.out.println("1: exit");
		System.out.println("");
		System.out.print("Your Input: ");
		
		String input = scanner.next();
		
		if(input == "1") {
			return;
		}
		
		
	}
	
	public static void slowPrint(String str, long delay) {
		for (int i=0; i<str.length(); i++) {
			System.out.print(str.charAt(i));
			try {
				TimeUnit.MILLISECONDS.sleep(delay);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
	public static void myWait(long ms) {
		try {
			TimeUnit.MILLISECONDS.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
