import java.util.Arrays;
import java.util.Scanner;

public class seive_of_eratosthenes {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		int n = 20;
		long start_time = System.currentTimeMillis();
		int[] arr = new int[n];

		Arrays.fill(arr, 0);
		for (int i = 3; i <= arr.length - 1; i += 2) {
			arr[i] = 1;
		}

		for (int i = 3; i <= arr.length - 1; i += 2) {
			if (arr[i] == 1) {
				for (int j = i * i; j <= arr.length - 1; j += i) {
					arr[j] = 0;
				}
			}
		}

		arr[2] = 1;
		arr[0] = arr[1] = 0;
		for (int i = 0; i <= arr.length - 1; i++) {
			if (arr[i] == 1) {
				System.out.print(i + " ");
			}
		}

		System.out.println();
		long end_time = System.currentTimeMillis();
		System.out.println((end_time - start_time) / 1000);

	}

}
