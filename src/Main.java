import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

	public static void main(String[] args) {
		welcome();
		
		Player player = new Player();
		
		boolean exit = false;
		
		Scanner scanner = new Scanner(System.in);
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
			System.out.println("");
			
			myWait(300);
			
			System.out.print("Your Input: ");
			input = scanner.next();
			System.out.println("");
			
			switch(input) {
			
			case "1":
				tavern();
				break;
			}
			
			
		}
		
		
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
	
	public static void tavern() {
		System.out.println("You step into a Tavern.");
		System.out.println("The Air is filled with the smell of sweat, alcohole and blood.");
		System.out.println("The room is filled with loud music, people laughing and some brawling here and there.");
		System.out.println("At the bar you see a big man with scars, tattoos and a eyepatch.");
		System.out.println("As you approch the man he said with a welcoming voice:");
		System.out.println("'Welcome to my little Tavern, Captain. If you are looking for some diligent crew members,"
				+ " you have come to the right place'");
		
		System.out.println("");
		System.out.println("What do you want to do?");
		System.out.println("1: Hire crew");
		System.out.println("2: leave tavern");
		System.out.println("");
		System.out.println("Your Input");
		
		Scanner scanner = new Scanner(System.in);
		String input = new String();
		
		input = scanner.next();
		System.out.println("");
		
		switch(input) {1
		
		case "2":
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
