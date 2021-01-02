

import java.util.Scanner;

public class binarysearch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = { 1, 5, 8, 9, 10 };

		int j = scn.nextInt();

		int i = Binarysearch(arr, j);

		if (i == 1)
			System.out.print("Found");
		else
			System.out.print("Not Found");

	}

	public static int Binarysearch(int[] arr, int k) {
		int s = 0, end = arr.length - 1, f = 0;

		while (s <= end) {
			int mid = (s + end) / 2;
			if (arr[mid] == k) {
				f = 1;
				break;

			} else if (arr[mid] < k)
				s = mid + 1;
			else
				end = mid - 1;
		}
		return f;
	}
}
