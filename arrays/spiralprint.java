
public class spiralprint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] arr = { { 11, 12, 13, 14 }, { 21, 22, 23, 24 }, { 31, 32, 33, 34 }, { 41, 42, 43, 44 } };

		int top = 0, left = 0, bottom = arr.length - 1, right = arr[top].length - 1;
		int cnt = 16, dir = 1, i, j;

		/// here direction tells us the direction of printing the spiral pattern dir=1
		/// signifies printing start from left-right then dir=2 tells us printing start
		/// from top to bottom and so on;
		/// count variable is used so that it only print number of items stored in 2d
		/// array in some case the number is less but spiral continues so by using count
		/// variable we avoid printing of junk values count is equal to row * column

		while (left <= right && top <= bottom) {
			
				if (dir == 1 && cnt > 0) {
					for (i = left; i <= right; i++) {
						System.out.print(arr[top][i] + " ");
						cnt--;
					}
				}
			
			dir = 2;
			top++;

				if (dir == 2 && cnt > 0) {
					for (i = top; i <= bottom; i++) {
						System.out.print(arr[i][right] + " ");
						cnt--;
					}
				}
			
			dir = 3;
			right--;

				if (dir == 3 && cnt > 0) {
					for (i = right; i >= left; i--) {
						System.out.print(arr[bottom][i] + " ");
						cnt--;
					}
				}

			dir = 4;
			bottom--;

				if (dir == 4 && cnt > 0) {
					for (i = bottom; i >= top; i--) {
						System.out.print(arr[i][left] + " ");
						cnt--;
					}
				}
			left++;
			dir = 1;
		}
	}
}
