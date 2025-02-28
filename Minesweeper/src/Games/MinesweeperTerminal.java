package Games;

public class MinesweeperTerminal {

	public static boolean gameWon = false; // end game variable

	public static void playMinesweeper() {
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Welcome to Minesweeper!");

		// creates the board object that references object created in createBoard() so
		// that we don't have to know which board type was created to proceed
		Board board = createBoard();
		board.printBoard();
		updateBoardState(board);
	}

	// returns a board object
	public static Board createBoard() {

		int choice = -1;
		int rows = -1;
		int columns = -1;
		int mines = -1;
		int firstrow = -1;
		int firstcolumn = -1;

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
				Board easyBoard = new Board(8, 8, 10);
				easyBoard.printDummyBoard();
				System.out.println("");
				System.out.println("Please enter the row and column for the square of your initial guess.");
				System.out.print("Row?: ");
				firstrow = Tools.getWholeNumberInput();
				System.out.print("Column?: ");
				firstcolumn = Tools.getWholeNumberInput();
				easyBoard.setMines(firstrow, firstcolumn);
				return easyBoard;
			}

			else if (choice == 2) {
				// create Medium Board (16x16, 40 mines)
				Board mediumBoard = new Board(16, 16, 40);
				mediumBoard.printDummyBoard();
				System.out.println("");
				System.out.println("Please enter the row and column for the square of your initial guess.");
				System.out.print("Row?: ");
				firstrow = Tools.getWholeNumberInput();
				System.out.print("Column?: ");
				firstcolumn = Tools.getWholeNumberInput();
				mediumBoard.setMines(firstrow, firstcolumn);
				return mediumBoard;
			}

			else if (choice == 3) {
				// create Hard Board (30x16, 99)
				Board hardBoard = new Board(30, 16, 99);
				hardBoard.printDummyBoard();
				System.out.println("");
				System.out.println("Please enter the row and column for the square of your initial guess.");
				System.out.print("Row?: ");
				firstrow = Tools.getWholeNumberInput();
				System.out.print("Column?: ");
				firstcolumn = Tools.getWholeNumberInput();
				hardBoard.setMines(firstrow, firstcolumn);
				return hardBoard;
			}

			else if (choice == 4) {
				// create Custom Board
				System.out.print("How many rows would you like to have? Enter selection here: ");
				rows = Tools.getWholeNumberInput();
				System.out.print("How many columns would you like to have? Enter selection here: ");
				columns = Tools.getWholeNumberInput();
				System.out.print("How many mines would you like to have? Enter selection here: ");
				mines = Tools.getWholeNumberInput();
				Board customBoard = new Board(rows, columns, mines);
				customBoard.printDummyBoard();
				System.out.println("");
				System.out.println("Please enter the row and column for the square of your initial guess.");
				System.out.print("Row?: ");
				firstrow = Tools.getWholeNumberInput();
				System.out.print("Column?: ");
				firstcolumn = Tools.getWholeNumberInput();
				customBoard.setMines(firstrow, firstcolumn);
				return customBoard;
			} else {
				System.out.println("Please enter a number from the menu\n");
			}

		} while (true);

	}

	public static void updateBoardState(Board board) {

	}

	/*
	 * public static void createBoard() {
	 * System.out.print("Dummy method - you started a game of Minesweeper!");
	 * 
	 * System.out.println("How many rows would you like?"); int rows =
	 * Tools.getWholeNumberInput();
	 * 
	 * System.out.println("Great! We'll make " + rows + " rows.\n");
	 * 
	 * System.out.println("How many columns would you like?"); int columns =
	 * Tools.getWholeNumberInput();
	 * 
	 * System.out.println("Great! We'll make " + columns + " columns.\n");
	 * 
	 * System.out.println("How many rows would you like?"); int mines =
	 * Tools.getWholeNumberInput();
	 * 
	 * System.out.println("Great! We'll make " + mines + " mines.\n");
	 * 
	 * System.out.println("\nThanks for playing! \nSelect another game?"); }
	 */
}
