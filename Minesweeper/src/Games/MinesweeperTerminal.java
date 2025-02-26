package Games;

public class MinesweeperTerminal {

	public static void createBoard() {
		System.out.print("Dummy method - you started a game of Minesweeper!");

		System.out.println("How many rows would you like?");
		int rows = Tools.getWholeNumberInput();

		System.out.println("Great! We'll make " + rows + " rows");

		System.out.println("How many columns would you like?");
		int columns = Tools.getWholeNumberInput();

		System.out.println("Great! We'll make " + columns + " columns");

		System.out.println("How many rows would you like?");
		int mines = Tools.getWholeNumberInput();

		System.out.println("Great! We'll make " + mines + " mines");

		System.out.println("\nThanks for playing! \nSelect another game?");
	}
}
