package recursion;

public class mergesort {

	public static void main(String[] args) {
		int[] arr = {5, 25, 30, 15, 10, 40, 35, 8, 4, 9};
		int[] ans = mergeSort(arr, 0, 9);
		for (int val : ans) {
			System.out.print(val + " ");
		}
	}

	public static int[] merged2SortedArrays(int[] arr1, int[] arr2) {
		int[] merged = new int[arr1.length + arr2.length];
		int i = 0, j = 0, k = 0;
		while (i < arr1.length && j < arr2.length) {
			if (arr1[i] <= arr2[j]) {
				merged[k] = arr1[i];
				i++;
				k++;
			} else {
				merged[k] = arr2[j];
				j++; k++;
			}
		}

		if (i == arr1.length) {
			while (j < arr2.length) {
				merged[k] = arr2[j];
				j++; k++;
			}
		}
		if (j == arr2.length) {
			while (i < arr1.length) {
				merged[k] = arr1[i];
				i++; k++;
			}
		}
		return merged;
	}
	public static int[] mergeSort(int[] arr, int fi, int li) {
		// fi = first index,  li = last index
		if (fi == li) {
			int[] br = new int[1];
			br[0] = arr[fi];
			return br;
		}

		int mid = (fi + li) / 2;
		int[] fh = mergeSort(arr, fi, mid);
		int[] sh = mergeSort(arr, mid + 1, li);
        return merged2SortedArrays(fh, sh);
	}
}
