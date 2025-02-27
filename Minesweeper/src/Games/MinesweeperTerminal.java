package Games;

public class MinesweeperTerminal {
	
	public static boolean gameWon = false; //end game variable

	public static void playMinesweeper(){
		System.out.println("------------------------------------------------------------");
        System.out.println("");
        System.out.println("Welcome to Minesweeper!");

        createBoard();
        //printBoard();
        //updateBoardState();
	}

	public static void createBoard(){
		

        int choice = -1;
        int rows = -1;
        int columns = -1;
        int mines = -1;

        do {
			System.out.println("What level difficulty would you like to play today?");
    	    System.out.println("1. Easy");
        	System.out.println("2. Medium");
        	System.out.println("3. Hard");
        	System.out.println("4. Custom\n");
        	System.out.print("Enter selection here: ");
			choice = Tools.getWholeNumberInput();

			if (choice == 1) {
				// create an Easy Board (8x8, 10 mines)
				//Board easyBoard = new Board(8,8,10);
				break;
			}

			else if (choice == 2) {
				// create Medium Board (16x16, 40 mines)
				//Board mediumBoard = new Board(16,16,40);
				break;
			}

			else if (choice == 3) {
				// create Hard Board (30x16, 99)
				//Board hardBoard = new Board(30,16,99);
				break;
			}

			else if (choice == 4) {
				// create Custom Board
				System.out.print("How many rows would you like to have? Enter selection here: ");
				rows = Tools.getWholeNumberInput();
				System.out.print("How many columns would you like to have? Enter selection here: ");
				columns = Tools.getWholeNumberInput();
				System.out.print("How many mines would you like to have? Enter selection here: ");
				mines = Tools.getWholeNumberInput();
				//Board customBoard = new Board(rows,columns,mines);
				break;
			}else {
				System.out.println("Please enter a number from the menu\n");
			}

		} while (true);

	}


/*
	public static void createBoard() {
		System.out.print("Dummy method - you started a game of Minesweeper!");

		System.out.println("How many rows would you like?");
		int rows = Tools.getWholeNumberInput();

		System.out.println("Great! We'll make " + rows + " rows.\n");

		System.out.println("How many columns would you like?");
		int columns = Tools.getWholeNumberInput();

		System.out.println("Great! We'll make " + columns + " columns.\n");

		System.out.println("How many rows would you like?");
		int mines = Tools.getWholeNumberInput();

		System.out.println("Great! We'll make " + mines + " mines.\n");

		System.out.println("\nThanks for playing! \nSelect another game?");
	} */
}
