import java.util.Scanner;

//algo
// dividing into regions
// 0 to j - 1 arr[i] <= pivot
// j to i - 1 arr[i] > pivot
// i to end of array unknown

class partioning{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int[] arr = {23,17,94,92,6,83,95};
		int n = arr.length;


		int pivot = 23;

		int i = 0;
		int j = 0;
		while(i < arr.length){
			if(arr[i] > pivot){
				i++;
			}
			else{
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				i++;
				j++;
			}
		}

		for(int e : arr){
			System.out.print(e + " ");
		}
	}
}