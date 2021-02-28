package recursion;

public class nqueen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean[][] board = new boolean[4][4];
		System.out.println(countnqueens(board, 0));

	}

	public static int countnqueens(boolean[][] board, int row) {
		if (row == board.length) {

			return 1;
		}

		int cnt = 0;

		for (int col = 0; col < board[row].length; col++) {
			if (issafe(board, row, col)) {
				board[row][col] = true;
				cnt = cnt + countnqueens(board, row + 1);
				board[row][col] = false;
			}
		}
		return cnt;
	}

	public static boolean issafe(boolean[][] board, int row, int col) {
		for (int i = row; i >= 0; i--) {
			if (board[i][col]{
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
