import java.util.HashMap;

public class duplicatesArray {

    public static void main(String[] args) {

        int[] sorted = { 1, 1, 1, 2 };
        int[] unsorted = { 3, 5, 2, 2, 6, 7, 1, 1 };
        System.out.println("length of array is:" + sortedArray(sorted));
        System.out.println("length of array is:" + unsortedArray(unsorted));

    }

    // removing duplicates from sorted array using constant space
    public static int sortedArray(int[] arr) {

        int index = 1;

        for (int i = 0; i < arr.length - 1; i++) {

            if (arr[i] != arr[i + 1]) {

                arr[index++] = arr[i + 1];
            }
        }

        return index;

    }

    public static int unsortedArray(int[] arr) {

        HashMap<Integer, Boolean> map = new HashMap<>();

        for (int i : arr) {
            map.put(i, true);
        }

        // System.out.println(map);

        // for(int i :map.keySet()){

        // System.out.println(i);
        // }

        return map.size();
    }

}