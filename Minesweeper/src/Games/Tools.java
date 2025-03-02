package Games;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tools {

	static Scanner scanner = new Scanner(System.in);

	public static int getWholeNumberInput() {

		Integer toReturn = -1;

		while (toReturn < 1) {

			try {
				toReturn = scanner.nextInt();

				if (toReturn < 1) {
					System.out.println("Please enter a positive integer.");
				}

			} catch (InputMismatchException e) {
				System.out.print("Invalid input, please enter an integer: ");
				scanner.next(); // Clear the invalid input from the scanner
			}
		}
		return toReturn;
	}
}