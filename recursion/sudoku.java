package recursion;

public class sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] board = { { 7, 8, 0, 4, 0, 0, 1, 2, 0 }, { 6, 0, 0, 0, 7, 5, 0, 0, 9 }, { 0, 0, 0, 6, 0, 1, 0, 7, 8 },
				{ 0, 0, 7, 0, 4, 0, 2, 6, 0 }, { 0, 0, 1, 0, 5, 0, 9, 3, 0 }, { 9, 0, 4, 0, 6, 0, 0, 0, 5 },
				{ 0, 7, 0, 3, 0, 0, 0, 1, 2 }, { 1, 2, 0, 0, 0, 7, 4, 0, 0 }, { 0, 4, 9, 2, 0, 6, 0, 0, 7 } };

		print_board(board);
		solve(board);
		System.out.println("============Solution==============");
		print_board(board);

	}

	public static void print_board(int[][] board) {

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

	public static int[] pos(int[][] board) {

		int[] res = new int[2];

		for (int i = 0; i < board.length; i++) {

			for (int j = 0; j < board[0].length; j++) {

				if (board[i][j] == 0) {
					res[0] = i;
					res[1] = j;
					return res;
				}

			}

		}
		return res;

	}

	public static boolean is_valid(int num, int[] pos, int[][] board) {

		// checkng the rows

		for (int i = 0; i < board[0].length; i++) {

			if (board[pos[0]][i] == num && pos[1] != i) {
				return false;
			}

		}

		// checking the columns

		for (int i = 0; i < board.length; i++) {

			if (board[i][pos[1]] == num && pos[0] != i) {
				return false;
			}

		}

		int box_x = pos[0] / 3;
		int box_y = pos[1] / 3;

		// checking the boxes

		for (int i = box_x *3; i < ((box_x * 3) + 3); i++) {

			for (int j = box_y*3; j < ((box_y * 3) + 3); j++) {

				if (board[i][j] == num && i != pos[0] && j != pos[1]) {
					return false;
				}

			}
		}

		return true;

	}

	public static boolean solve(int[][] board) {

		int[] pos = new int[2];

		int[] res = pos(board);

		pos[0] = res[0];
		pos[1] = res[1];

		if (pos[0] == 0 && pos[1] == 0) {

			return true;

		}

		for (int i = 1; i <= 9; i++) {
			if (is_valid(i, pos, board)) {

				board[pos[0]][pos[1]] = i;

				boolean sol = solve(board);

				if (sol) {

					return true;
				}

				board[pos[0]][pos[1]] = 0;

			}
		}

		return false;

	}

}
