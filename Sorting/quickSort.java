import java.util.Scanner;
public class quickSort {

    private static void print(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        int[] arr = {23, 17, 94, 92, 6, 83, 95};
        int n = arr.length;
        scn.close();
        quick(arr, 0, arr.length - 1);
        print(arr);
    }

    public static void quick(int[] arr, int lo, int hi) {
        if (lo > hi) {
            return;
        }

        int pivot = arr[hi];
        int pi = partioning(arr, pivot);
        quick(arr, lo, pi - 1);
        quick(arr, pi + 1, hi);
        for (int e : arr) {
            System.out.print(e + " ");
        }
        System.out.println();
    }

    public static int partioning(int[] arr, int pivot) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] > pivot) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }

        return j - 1;
    }
}
