import java.util.*;

public class merge2SortedArraysWithoutExtraSpace{

    public static void merge(int[] arr1, int[] arr2 , int n , int m) {
        //Write your code here
        int i = n - 1;
        int j = m - 1;
        int k = m + n - 1;
        while(i >=0 && j >= 0){
            if(arr1[i] >= arr2[j]){
                arr1[k--] = arr1[i--];
            }
            else{
                arr1[k--] = arr2[j--];
            }
        }
        
        while(j >= 0){
            arr1[k--] = arr2[j--];
        }
        
        for(int p : arr1){
            System.out.print(p + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] A = new int[n + m];
        int[] B = new int[m];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        for (int i = 0; i < B.length; i++) {
            B[i] = sc.nextInt();
        }
        sc.close();
        merge(A, B , n , m);
    }

}