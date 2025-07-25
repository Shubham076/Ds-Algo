public class printnqueen {
	public static void main(String[] args) {
		boolean[][] board = new boolean[4][4];
		printNQueens(board, 0, "");
	}

	public static void printNQueens(boolean[][] board, int row, String str) {
		if (row == board.length) {
			System.out.println(str);
			return;
		}

		for (int col = 0; col < board[row].length; col++) {
			if (isSafe(board, row, col)) {
				board[row][col] = true;
				printNQueens(board, row + 1, str + "{" + (row + 1) + "-" + (col + 1) + "}");
				board[row][col] = false;
			}
		}

	}

	public static boolean isSafe(boolean[][] board, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (board[i][col]){
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j >= 0; i--, j--) {
			if (board[i][j]){
				return false;
			}
		}

		for (int i = row, j = col; i >= 0 && j < board.length; i--, j++) {
			if (board[i][j]){
				return false;
			}
		}

		return true;
	}

}
