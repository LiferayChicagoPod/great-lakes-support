package Games;

public class Main {

	// create a Scanner object
	// static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// set choice variable outside of do/while loop
		int choice = -1;

		do {

			// get user game choice (we can add more games in to the menu in the future
			System.out.println("\nSelect a Game \n\t1: Minesweeper \n\t2: Exit\n");
			System.out.print("Enter selection here: ");

			choice = Tools.getWholeNumberInput();

			if (choice == 1) {
				MinesweeperTerminal.initializeGame();
			}

			else if (choice == 2) {
				break;

			} else {
				System.out.println("Please enter a number from the menu");
			}
		} while (true);

	}

}
