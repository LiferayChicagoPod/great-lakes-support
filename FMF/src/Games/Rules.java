package Games;

public class Rules {

	//method to print the Rules of the game
	public static void printRules() {
		boolean loop = true;
		int choice = -1;
		while(loop){
			System.out.println("------------------------------------------------------------");
			System.out.println("");
			System.out.println("Here are the Rules to the game.");
			System.out.println("This site explains the game pretty well: https://www.pagat.com/kt5/pengyou.html");
			System.out.println("Otherwise, ask Justin");
			System.out.println("------------------------------------------------------------");
			System.out.println("Do you want to return to the main menu?");
			System.out.println("\nSelect an Option \n\t1: Yes \n\t2: No\n");
			System.out.print("Enter selection here: ");

			choice = Tools.getWholeNumberInput();
			if (choice == 2) {
				
			}

			else if (choice == 1) {
				break;

			} else {
				System.out.println("Please enter a number from the menu");
			}
		}

	}

}
