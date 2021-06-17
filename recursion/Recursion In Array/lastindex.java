import java.util.Scanner;
public class lastindex {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int[] arr = {1, 2, 4, 5, 9, 8, 3, 8};
		System.out.println(lastindex(arr, 0, 8));

	}
	public static int lastindex(int[] arr, int i, int data) {
		if (i == arr.length) return -1;
		int index = lastindex(arr, i + 1, data);
		if (index == -1) {
			if (arr[i] == data) return i;
			else return -1;
		} else return index;
	}
}
