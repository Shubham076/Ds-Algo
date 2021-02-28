import java.util.Scanner;
class sortStrings{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		String[] arr = new String[n];
		for(int i = 0; i < n; i++){
			arr[i] = scn.next();
		}

		sort(arr, 0, arr.length - 1);
		for(String i : arr){
			System.out.print(i + " ");
		}
	}

	public static void sort(String[] arr , int lo , int hi){
		if(lo > hi){
			return;
		}

		String pivot = arr[hi];
		int pi = getPivotIndex(arr , pivot);
		sort(arr, lo, pi - 1);
		sort(arr, pi + 1, hi);
	}

	public static int getPivotIndex(String[] arr, String pivot){
		int i = 0;
		int j = 0;
		while(i < arr.length){
			if(arr[i].compareTo(pivot) > 0){
				i++;
			}
			else{
				swap(arr, i, j);
				i++;
				j++;
			}

		}
			return j - 1;
	}

	public static void swap(String[] arr, int i, int  j){
		String temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
}