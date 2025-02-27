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

		// Starts a mine counter to track mine creation
		Integer mineCounter = 0;

		// Creates an array of cells and populates it with cell objects
		this.boardArray = new Cell[rows][columns];
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {

				// Creates mines randomly until all mines are used
				// I still need to figure out how to make sure the mines are evenly distributed
				// and all the mines are used
				if (mineCounter <= mines) {
					boolean isMine = Math.random() < 0.5;
					boardArray[i][j] = new Cell(isMine);

					if (isMine) {
						mineCounter++;
					}
				} else {
					boardArray[i][j] = new Cell(false);
				}
			}
		}
		setAdjacentMines();
	}

	private void setAdjacentMines() {
		// checks all in bounds adjacent cells and increases the cell's adjacent mines
		// if they're mines
		for (int i = 0; i < boardArray.length; i++) {
			for (int j = 0; j < boardArray[i].length; j++) {
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
				if (boardArray[i][j].isRevealed()) {

					System.out.print(boardArray[i][j].getAdjacentMines());

				} else if (boardArray[i][j].isFlagged()) {
					// if the square is flagged, print a triangle symbol (unicode \u25B7)
					System.out.print('\u25B7');
				} else {
					// if the square is flagged, print a square symbol (unicode \u25A1)
					System.out.print('\u25A1');
				}
			}
			System.out.println("");
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
