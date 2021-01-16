package recursion;

import java.util.Scanner;

public class allIndexOfANumber{

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		int[] arr = { 4, 2, 4, 5, 9, 8, 4, 8 };
		/// int[] ans=allindices(arr,0,4,0);
		int[] ans = allindices(arr, 0, 4, 0);

		for(int i : ans){
			System.out.println(i);
		}
	}

	public static int[] allindices(int[] arr, int i, int data, int cnt) {
		if (i == arr.length) {
			int[] base = new int[cnt];
			return base;
		}
	
		if (arr[i] == data){
			int[] indices = allindices(arr, i + 1, data, cnt + 1);
			indices[cnt] = i;
			return indices;
		}
		else{
			int[] indices = allindices(arr, i + 1, data, cnt);
			return indices;
		}
	}
}
