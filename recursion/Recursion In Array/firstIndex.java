import java.util.Scanner;

public class firstIndex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = {1, 2, 3, 4, 5, 6};
		System.out.println(firstindex(arr, 0, 6));

	}
	public static int firstindex(int[] arr, int i, int x) {
		if (i == arr.length) return -1;
		if (arr[i] == x) return i;
		return firstindex( arr, i + 1, x);
	}
}
