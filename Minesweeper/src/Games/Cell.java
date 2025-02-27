package Games;

public class Cell {

	private boolean mine;
	private boolean flagged;
	private boolean revealed;
	private int adjacentMines;

	public Cell() {
		this(true);
	}

	public Cell(boolean mine) {
		this.mine = mine;
	}

	public boolean isMine() {
		return mine;
	}

	public boolean isFlagged() {
		return flagged;
	}

	public void setFlagged(boolean flagged) {
		this.flagged = flagged;
	}

	public boolean isRevealed() {
		return revealed;
	}

	public void setRevealed(boolean revealed) {
		this.revealed = revealed;
	}

	public int getNumberOfAdjacentMines() {
		return adjacentMines;
	}

	public void setAdjacentMines(int adjacentMines) {
		this.adjacentMines += adjacentMines;
	}

	public int getAdjacentMines() {
		return adjacentMines;
	}

}
