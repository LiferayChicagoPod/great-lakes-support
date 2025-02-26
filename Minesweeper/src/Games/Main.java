package Games;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	// create a Scanner object
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		// set choice variable outside of do/while loop
		int choice = -1;

		do {
			try {
				// get user game choice (we can add more games in to the menu in the future
				System.out.println("\nSelect a Game \n\t1: Minesweeper \n\t0: Exit");
				choice = input.nextInt();

				if (choice == 1) {
					// call the MinesweeperTerminal.createBoard() method to start Minesweeper
					MinesweeperTerminal.createBoard();
				}

				else if (choice == 0) {
					break;

				} else {
					System.out.println("Please enter a valid number");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter an integer.");
				input.next(); // Clear the invalid input from the scanner
			}
		} while (true);

	}

}
