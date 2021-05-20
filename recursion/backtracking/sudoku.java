public class sudoku {

	public static void main(String[] args) {

		int[][] board = { { 7, 8, 0, 4, 0, 0, 1, 2, 0 }, { 6, 0, 0, 0, 7, 5, 0, 0, 9 }, { 0, 0, 0, 6, 0, 1, 0, 7, 8 },
			{ 0, 0, 7, 0, 4, 0, 2, 6, 0 }, { 0, 0, 1, 0, 5, 0, 9, 3, 0 }, { 9, 0, 4, 0, 6, 0, 0, 0, 5 },
			{ 0, 7, 0, 3, 0, 0, 0, 1, 2 }, { 1, 2, 0, 0, 0, 7, 4, 0, 0 }, { 0, 4, 9, 2, 0, 6, 0, 0, 7 }
		};

		solve(board , 0 , 0);

	}

	public static void display(int[][] board) {
		for (int i = 0; i < board.length; i++) {
			if (i % 3 == 0 && i != 0) {
				System.out.println("-----------------------");
			}

			for (int j = 0; j < board[0].length; j++) {
				if (j % 3 == 0 && j != 0) {
					System.out.print("|");
				}
				if (j == 8) {
					System.out.println(board[i][j]);
				} else {
					System.out.print(board[i][j] + " ");
				}
			}
		}
	}

	public static boolean is_valid(int[][] board , int row , int col , int value) {
		// checkng the rows
		for (int j = 0; j < board[0].length; j++) {
			if (board[row][j] == value) {
				return false;
			}
		}

		// checking the columns
		for (int i = 0; i < board.length; i++) {
			if (board[i][col] == value) {
				return false;
			}
		}

		int box_x = row / 3 * 3;
		int box_y = col / 3 * 3;

		// checking the boxes
		for (int i = 0 ; i <  3; i++) {
			for (int j = 0; j <  3; j++) {
				if (board[box_x + i][box_y + j] == value) {
					return false;
				}
			}
		}
		return true;
	}

	// ni = next i nj = next j
	public static void solve(int[][] board , int i , int j) {
		if (i == board.length) {
			display(board);
			return;
		}

		int ni = 0;
		int nj = 0;

		if (j == board[0].length - 1) {
			ni = i + 1;
			nj = 0;
		} else {
			ni = i;
			nj = j + 1;
		}

		if (board[i][j] != 0) {
			solve(board, ni, nj);
		}

		else {
			for (int num = 1; num <= 9; num++) {
				if (is_valid(board, i, j, num)) {
					board[i][j] = num;
					solve(board, ni, nj);
					board[i][j] = 0;
				}
			}
		}
	}
}
