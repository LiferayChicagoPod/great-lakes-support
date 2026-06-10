package Games;

public class Main {

	// create a Scanner object
	// static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// set choice variable outside of do/while loop
		int choice = -1;

		do {

			// get user game choice (we can add more games in to the menu in the future
			System.out.println("------------------------------------------------------------");
			String bigArt = """
               XXXXX          XXXXX
              X . . X        X . . X
              X  O  X        X  -  X
               XXXXX          XXXXX
                 |              |
           ______|______  ______|______
          /      |      \\/     |      \\
         /       |      /\\     |       \\
        /        |      \\/     |        \\
                 |              |
                / \\           / \\
               /   \\         /   \\
              /     \\       /     \\
             /       \\     /       \\
            """;

        	System.out.println(bigArt);
			System.out.println("Welcome to Find My Friend!");
			System.out.println("\nSelect an Option \n\t1: Read Rules \n\t2: Start Game\n");
			System.out.print("Enter selection here: ");

			choice = Tools.getWholeNumberInput();

			if (choice == 1) {
				Rules.printRules();
			}

			else if (choice == 2) {
				FindMyFriend.initializeGame();

			} else {
				System.out.println("Please enter a number from the menu");
			}
		} while (true);

	}

}
