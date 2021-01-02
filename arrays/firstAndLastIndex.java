import java.util.*;
public class firstAndLastIndex {

    public static void main(String[] args) throws Exception {
        // write your code here
        
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scn.nextInt();
        }

        int d = scn.nextInt();
        int low = 0;
        int high = arr.length - 1;
        int first = -1;
        int last = -1;

        // using binary search
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == d) {
                first = mid;
                high = mid - 1;
            }

            else if (arr[mid] > d) {
                high = mid - 1;
            } else {
                low = mid + 1;

            }
        }
        
        low = 0;
        high = arr.length - 1;  
        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == d) {
                last = mid;
                low = mid + 1;
            }

            else if (arr[mid] > d) {
                high = mid - 1;
            } else {
                low = mid + 1;

            }
        }
        
        System.out.println(first);
        System.out.println(last);
        

    }

}