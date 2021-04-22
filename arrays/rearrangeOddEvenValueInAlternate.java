import java.util.*;
public class rearrangeOddEvenValueInAlternate {

    public static void printArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        ArrayList<Integer> odd = new ArrayList<>();
        ArrayList<Integer> even = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr);
        for (int i : arr) {
            if (i % 2 == 0)
                even.add(i);
            else
                odd.add(i);
        }
        int idx = 0, i = 0, j = 0;
        boolean isOdd = false;
        if (arr[0] % 2 == 1) {
            isOdd = true;
        }

        while (idx < arr.length) {
            if (isOdd) {
                arr[idx] = odd.get(i);
                i++;
                idx++;
                isOdd = !isOdd;
            } else {
                arr[idx] = even.get(j);
                j++;
                idx++;
                isOdd = !isOdd;
            }
        }
        printArray(arr);
    }
}