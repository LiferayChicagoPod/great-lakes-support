package Games;

public class MinesweeperTerminal {

	private static Board board = new Board();

	public static void initializeGame() {
		System.out.println("------------------------------------------------------------");
		System.out.println("");
		System.out.println("Welcome to Minesweeper!");

		// creates the board object that references object created in createBoard() so
		// that we don't have to know which board type was created to proceed
		board = createBoard();
		board.printBoard();
		playMinesweeper();
	}

	// returns a board object
	public static Board createBoard() {

		int choice = -1;
		int rows = -1;
		int columns = -1;
		int mines = -1;
		int[] firstCell;

		do {
			System.out.println("What level difficulty would you like to play today?");
			System.out.println("1. Easy: 8 by 8 game, 10 mines");
			System.out.println("2. Medium: 16 by 16 game, 40 mines");
			System.out.println("3. Hard: 30 by 16 games, 99 mines");
			System.out.println("4. Custom\n");
			System.out.print("Enter selection here: ");
			choice = Tools.getWholeNumberInput();

			if (choice == 1) {
				// create an Easy Board (8x8, 10 mines)
				board = new Board(8, 8, 10);
				board.printDummyBoard();

				firstCell = chooseCell();

				board.setMines(firstCell[0], firstCell[1]);
				return board;
			}

			else if (choice == 2) {
				// create Medium Board (16x16, 40 mines)
				board = new Board(16, 16, 40);
				board.printDummyBoard();

				firstCell = chooseCell();

				board.setMines(firstCell[0], firstCell[1]);
				return board;
			}

			else if (choice == 3) {
				// create Hard Board (30x16, 99)
				board = new Board(30, 16, 99);
				board.printDummyBoard();

				firstCell = chooseCell();

				board.setMines(firstCell[0], firstCell[1]);
				return board;
			}

			else if (choice == 4) {
				// create Custom Board
				System.out.print("How many rows would you like to have? Enter selection here: ");
				rows = Tools.getWholeNumberInput();

				System.out.print("How many columns would you like to have? Enter selection here: ");
				columns = Tools.getWholeNumberInput();

				System.out.print("How many mines would you like to have? Enter selection here: ");
				mines = Tools.getWholeNumberInput();

				board = new Board(rows, columns, mines);
				board.printDummyBoard();

				firstCell = chooseCell();

				board.setMines(firstCell[0], firstCell[1]);
				return board;
			} else {
				System.out.println("Please enter a number from the menu\n");
			}

		} while (true);

	}

	public static int[] chooseCell() {

		int row = -1;
		int column = -1;

		System.out.println("");
		System.out.println("Please enter the row and column for the square of your guess.");

		do {

			System.out.print("Row?: ");
			row = Tools.getWholeNumberInput();

			if (row > board.getRows()) {
				System.out.println("Out of bounds. Please select a row within bounds");
				continue;
			}

			break;
		} while (true);

		do {
			System.out.print("Column?: ");
			column = Tools.getWholeNumberInput();

			if (column > board.getColumns()) {
				System.out.println("Out of bounds. Please select a column within bounds");
				continue;
			}

			break;

		} while (true);

		do {
			if (board.cellIsRevealed(row, column)) {
				System.out.println("Cell revealed. Please select an unrevealed cell");
				continue;
			}

			break;

		} while (true);

		return new int[] { row, column };
	}

	public static void playMinesweeper() {

		// prompt user for a cell to update
		// validate that the cell is within bounds and not revealed
		// prompt user for update type (mark or reveal)
		// do the update to the cell
		// board.revealCell() or board.flagCell()
		// print board
		// check lose condition
		// print loss message
		// check win condition
		// print win message
		// repeat
	}

}
