import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

import Exceptions.NotEnoughGoldException;
import Exceptions.TooFullCrewException;
import ship.Ship;
import ship.Sloop;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);	// Scanner for reading Input	
		welcome();									// Print "Welcome" lines 
		Player player = new Player(10000);				// Create new Player
		boolean exit = false;						// exit for quitting game
		String input = new String();				// input for Scanner
		
		
		// Going in the Game loop untill quitting game
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
			
			// Town decisions
			switch(input) {
			
			// Go in tavern
			case "1":
				try {
					tavern(player , scanner);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			// Go in shipyard
			case "3":
				try {
					shipyard(player, scanner);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				break;
				
			// Look at player's ships	
			case "4":
				lookAtShips(player, scanner);
				break;
				
			// Quit game
			case "99":
				exit = true;
				
				System.out.println("Exiting Game...");
				myWait(2000);
				
				break;
				
			// Wrong Input handling
			default:
				System.out.println("Unknown command '" + input + "'");
				myWait(2000);
				break;				
			}		
		}
		
		scanner.close();
		return;
	}
	
	
	// A function to print out a welcome for the start of the game
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
	
	
	// Tavern 
	public static void tavern(Player player, Scanner scanner) throws IOException {
		
		
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
		
		// Tavern loop
		while(true) {
		
			System.out.println("");
			System.out.println("What do you want to do?");
			myWait(300);
			System.out.println("1: Hire crew");
			myWait(300);
			System.out.println("99: leave tavern");
			myWait(300);
			System.out.println("");
			System.out.println("Your Input");
			
			String input = new String();
			
			input = scanner.next();
			System.out.println("");
			
			// Tavern decision 
			switch(input) {
			
			// Hiring Crew
			case "1":
				System.out.println("How many crew members do you want to hire?");
				System.out.println("One man costs 20g");
				System.out.println("");
				System.out.println("Your gold: " + player.getGold());
				System.out.println("");
				System.out.print("Your Input: ");
				
				input = scanner.next();
				
				
				try {
					player.addGold(-20 * Integer.parseInt(input));

				} catch (NotEnoughGoldException e) {
					System.out.println("You don't have enough gold!");
					
					String line = "";
					line = java.time.LocalDateTime.now().toString();
					line = line + " " + e.getMessage();
					
					PrintWriter fileOut = new PrintWriter(new FileWriter("log.txt"));
					fileOut.append(line);
					fileOut.close();
					
					myWait(2000);
					break;
				}
				try {
					player.getFleet().get(0).addCrew(Integer.parseInt(input));
					} catch(TooFullCrewException e) {
						System.out.println("Your Ship cant't hold this much crew!");
						
						String line = "";
						line = java.time.LocalDateTime.now().toString();
						line = line + " " + e.getMessage();
						
						PrintWriter fileOut = new PrintWriter(new FileWriter("log.txt"));
						fileOut.append(line);
						fileOut.close();
						
						myWait(2000);
						break;
					}
				
				break;
			
			// Exit Tavern
			case "99":
				return;
				
			// Wrong Input handling
			default:
				System.out.println("Unknown command '" + input + "'");
				myWait(2000);
				break;
			}
		}
	}
	
	// Shipyard
	public static void shipyard(Player player, Scanner scanner) throws IOException {
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
		
		// Shipyard loop
		while(true) {
		
			System.out.println("");
			System.out.println("What do you want to do?");
			myWait(300);
			System.out.println("1: Buy Ships");
			myWait(300);
			System.out.println("99: leave shipyard");
			myWait(300);
			System.out.println("");
			System.out.println("Your Input");
			
			String input = new String();
			
			input = scanner.next();
			System.out.println("");
			
			// Shipyard decision
			switch(input) {
			
			// Buy new ship
			case "1":
				boolean buyShipExit = false;
				// new ship loop
				while(!buyShipExit) {
					System.out.println("");
					System.out.println("Available Ships:");
					myWait(300);
					System.out.println("1: Sloop | 5000g");
					myWait(300);
					System.out.println("99: cancel");
					myWait(300);
					System.out.println("");
					System.out.println("Your Gold: " + player.getGold() + "g");
					myWait(300);
					System.out.println("");
					System.out.println("Your Input");
					input = scanner.next();
					System.out.println("");
					
					// buy ship decision
					switch(input) {
					
					// buy sloop
					case "1":
						
						try {
							player.addGold(-5000);

						} catch (NotEnoughGoldException e) {
							System.out.println("You don't have enough gold!");
							
							String line = "";
							line = java.time.LocalDateTime.now().toString();
							line = line + " " + e.getMessage();
							
							PrintWriter fileOut = new PrintWriter(new FileWriter("log.txt"));
							fileOut.append(line);
							fileOut.close();
							
							myWait(2000);
							break;
						}
						
						Sloop sloop = new Sloop(0, 0, 0 , 20, 10);
						player.addShip(sloop);
						
						System.out.println("You Succesfully bought a new Sloop!");
						buyShipExit = true;
						break;
					
					// cancel purchase
					case "99":
						buyShipExit = true;
						break;
						
					// Wrong Input handling
					default:
						System.out.println("Unknown command '" + input + "'");
						myWait(2000);
						break;
					}
					
				}
				break;
			
			// Exit shipyard
			case "99":
				return;
				
			// Wrong Input handling	
			default:
				System.out.println("Unknown command '" + input + "'");
				myWait(2000);
				break;
			}
		}
		
	}
	
	// Look at Ships
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
		
		// Look at ships loop
		while (true) {
			System.out.println("");
			System.out.println("1: exit");
			System.out.println("");
			System.out.print("Your Input: ");
			
			String input = scanner.next();
			
			// Look at ships decision
			if(input.equals("1")) {
				return;
			} else { 	// Wrong Input handling
				System.out.println("Unknown command '" + input + "'");
				myWait(2000);
			}
		}
		
		
	}
	
	// helper function for printing text letter by letter
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
	
	// helper function for waiting
	public static void myWait(long ms) {
		try {
			TimeUnit.MILLISECONDS.sleep(ms);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
