import java.util.Scanner;

public class insertion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int[] arr = new int[10];

		System.out.print("Enter the no of elements of array:");
		int s = scn.nextInt();

		for (int i = 0; i < s; i++) {
			System.out.print("Enter the number " + (i + 1) + ":");
			arr[i] = scn.nextInt();
		}

		System.out.print("\nEnter the position at which you want to enter:");
		int pos = scn.nextInt();

		System.out.print("\nEnter the item you want to enter:");

		int item = scn.nextInt();

		insertion(arr, s, item, pos);

		System.out.println("\nThe elements of array are:");

		for (int i = 0; i <= s; i++) {
			System.out.print(arr[i] + ",");
		}
	}

	public static void insertion(int[] arr, int size, int item, int position) {
		for (int i = size - 1; i >= position - 1; i--) {
			arr[i + 1] = arr[i];
		}
		arr[position - 1] = item;
	}

}
