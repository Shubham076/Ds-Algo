import java.util.*;
class reflectMatrix{
	public static void printMatrix(int[][] a){
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				System.out.print(a[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void relfectMain(int[][] arr){
		System.out.println("Reflect about main diagonal");
		int[][] a = new int[arr.length][arr.length];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				a[i][j] = arr[i][j];
			}
		}

		for(int i = 0; i < a.length; i++){
			for(int j = i; j < a[0].length; j++){
				int temp = a[i][j];
				a[i][j] = a[j][i];
				a[j][i] = temp;
			}
		}

		printMatrix(a);
	}

	public static void reflectSec(int[][] arr){
		System.out.println("Reflect about secondary diagonal");
		int[][] a = new int[arr.length][arr.length];
		for(int i = 0; i < a.length; i++){
			for(int j = 0; j < a[0].length; j++){
				a[i][j] = arr[i][j];
			}
		}
		int n = a[0].length;
		for(int i = 0; i < n - 1; i++){
			for(int j = 0; j < n - 1 - i; j++){
				int temp = a[i][j];
				a[i][j] = a[n - 1 - j][n - 1 - i];
				a[n - 1 - j][n - 1 - i] = temp;
			}
		}

		printMatrix(a);
	}
	public static void main(String[] args){
		int[][] arr = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
		printMatrix(arr);
		System.out.println();
		relfectMain(arr);
		System.out.println();
		reflectSec(arr);
	}
}