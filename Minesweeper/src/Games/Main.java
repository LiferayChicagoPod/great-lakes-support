package Games;

import java.util.Scanner;

public class Main {

	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {

		int choice = -1;

		do {
			System.out.println("Select a Game" + "\n1\t: Minesweeper" + "\n\t0: Exit");

			choice = input.nextInt();

			if (choice == 1) {
				MinesweeperTerminal.createBoard();
			}

			if (choice == 0) {
				break;
			} else {
				System.out.println("Please enter a valid number");
			}

		} while (true);
	}

}
