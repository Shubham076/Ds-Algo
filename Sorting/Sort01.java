import java.util.Scanner;
public class Sort01 {
    public static void main(String args[])throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        sort(arr);

        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

// splitting areas into 4 parts
// 0 --- j - 1 => 0 area
// j -- i - 1 => 1 area
// i --- n(end of array) == unknown
    public static void sort(int[] arr) {
        //write your code here
        int i = 0 , j = 0;
        while (i < arr.length) {
            if (arr[i] == 1) {
                i++;
            } else {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j++;
            }
        }
    }
}

