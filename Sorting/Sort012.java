import java.util.*;

class Sort012 {

// splitting areas into 4 parts
// 0 --- j - 1 => 0 area
// j -- i - 1 => 1 area
// k --- n(end of array) == 2 array
// i---- k  unknowns 
    public static void Sort012(int[] arr) {
        //write your code here
        int i = 0;
        int j = 0;
        int k = arr.length - 1;
        while(i <= k){
            if(arr[i] == 1){
                i++;
            }
            else if(arr[i] == 0){
                swap(arr , i , j);
                i++;
                j++;
            }
            else{
                swap(arr, i, k);
                k--;
            }
        }
    }

    // used for swapping ith and jth elements of array
    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void print(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        scn.close();
        Sort012(arr);
        print(arr);
    }
}