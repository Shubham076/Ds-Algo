
import java.util.Scanner;

public class waveprint {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[][] arr = new int[4][4];
		int i, j;
		for (i = 0; i < arr.length; i++) {
			for (j = 0; j < arr[i].length; j++) { // new int[3][0] is valid but reverse is not valid;
				arr[i][j] = scn.nextInt();
			}

		}
		for (i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				for (j = 0; j < arr[i].length; j++) {
					System.out.print(arr[i][j] + " ");
				}
			} else {
				for (j = arr[i].length - 1; j >= 0; j--) {
					System.out.print(arr[i][j] + " ");
				}
			}

			System.out.println();
		}

	}

}
