package Interfaceandgenerics;
import java.util.Comparator;

public class generics {
	public static void main(String[] args) {
		Integer[] arri = { 1, 2, 3, 4, 5 };
		display(arri);
		String[] arr1 = { "shubham", "Dogra" };
		display(arr1);

		cars[] car = new cars[5];
		car[0] = new cars(600, "Red");
		car[1] = new cars(1000, "Green");
		car[2] = new cars(400, "Blue");
		car[3] = new cars(2000, "Yellow");
		car[4] = new cars(2500, "White");

		bubblesort(car);
		display(car);

		System.out.println("-------------");
		bubblesort(car, new comparator());
		display(car);

	}

	public static <T> void display(T[] arr) {
		for (T val : arr) {
			System.out.println(val);
		}
	}

	public static <T extends Comparable<T>> void bubblesort(T[] arr) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j].compareTo(arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}

	public static <T> void bubblesort(T[] arr, Comparator<T> comparator) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (comparator.compare(arr[j], arr[j + 1]) > 0) {
					T temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	}
}