package Games;

public class Board {
	private int rows;
	private int columns;
	private int mines;
	private Cell[][] boardArray;

	// default constructor
	public Board() {
		this(16, 16, 40);
	}

	// arguments constructor
	public Board(int rows, int columns, int mines) {

		// sets variables for this board object
		this.rows = rows;
		this.columns = columns;
		this.mines = mines;

		createCells();
	}

	public void createCells() {

		// Creates an array of cells and populates it with cell objects
		this.boardArray = new Cell[rows][columns];
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {

				boardArray[i][j] = new Cell();

			}
		}
	}

	public void setMines(int i, int j) {

		Integer mineCounter = 0;

		while (mineCounter < mines) {

			int x = (int) (Math.random() * rows);
			int y = (int) (Math.random() * columns);

			if (x == i - 1 && y == j - 1) {
				continue;
			} else {
				boardArray[x][y].setMine(true);
				mineCounter++;
			}
		}
		updateAdjacentMines();
		revealCell(i - 1, j - 1);
	}

	private void updateAdjacentMines() {
		// checks all in bounds adjacent cells and increases the cell's adjacent mines
		// if they're mines
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {
				if (boardArray[i][j].isMine()) {
					continue;
				}
				if ((i - 1 >= 0) && (j - 1 >= 0)) {
					if (boardArray[i - 1][j - 1].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
				if ((i - 1 >= 0)) {
					if (boardArray[i - 1][j].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
				if ((i - 1 >= 0) && (j + 1 < boardArray[i].length)) {
					if (boardArray[i - 1][j + 1].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
				if (j - 1 >= 0) {
					if (boardArray[i][j - 1].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
				if (j + 1 < boardArray[i].length) {
					if (boardArray[i][j + 1].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
				if ((i + 1 < boardArray.length) && (j - 1 >= 0)) {
					if (boardArray[i + 1][j - 1].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
				if (i + 1 < boardArray.length) {
					if (boardArray[i + 1][j].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
				if ((i + 1 < boardArray.length) && (j + 1 < boardArray[i].length)) {
					if (boardArray[i + 1][j + 1].isMine()) {
						boardArray[i][j].setAdjacentMines(1);
					}
				}
			}
		}
	}

	public void printBoard() {

		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {

				// for board testing
				// boardArray[i][j].setRevealed(true);

				if (boardArray[i][j].isRevealed()) {

					if (boardArray[i][j].isMine()) {
						System.out.print(" X");
					} else {
						System.out.print(" " + boardArray[i][j].getAdjacentMines());
					}
				} else if (boardArray[i][j].isFlagged()) {
					// if the square is flagged, print a triangle symbol (unicode \u25B7)
					System.out.print(" " + '\u25B7');
				} else {
					// if the square is flagged, print a square symbol (unicode \u25A1)
					System.out.print(" " + '\u25A1');
				}
			}
			System.out.println("");
		}
	}

	public void printDummyBoard() {
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {
				// if the square is flagged, print a square symbol (unicode \u25A1)
				System.out.print(" " + '\u25A1');
			}
			System.out.println("");
		}
	}

	public void revealCell(int i, int j) {
		if (i < 0 || i >= boardArray.length || j < 0 || j >= boardArray[i].length || boardArray[i][j].isRevealed()) {
			return; // Exit if out of bounds or already revealed
		}

		boardArray[i][j].setRevealed(true);

		if (boardArray[i][j].getAdjacentMines() == 0) {
			// Recursively check neighbors
			revealCell(i - 1, j - 1);
			revealCell(i - 1, j);
			revealCell(i - 1, j + 1);
			revealCell(i, j - 1);
			revealCell(i, j + 1);
			revealCell(i + 1, j - 1);
			revealCell(i + 1, j);
			revealCell(i + 1, j + 1);
		}
	}

	public int getRows() {
		return rows;
	}

	public int getColums() {
		return columns;
	}

	public int getMines() {
		return mines;
	}
}
