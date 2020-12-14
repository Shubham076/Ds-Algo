public class radixSort {

    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }
    public static void main(String[] args){
        int[] arr = {24,123,486,688,914,526,201,440,666,101};
        radix_Sort(arr);
    }

    private static void radix_Sort(int[] arr) {
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
        }
        int e  = 1;
        while(e <= max){
            countSort(arr, e);
            e *= 10;
        }

        print(arr);
    }

    public static void countSort(int[] arr, int exp) {
        int[] farr = new int[10];  //1-9
        for(int i : arr){
            int idx = i;
            farr[idx / exp % 10]++;
        }

        // add prefix
        for(int i = 1; i < farr.length; i++){
            farr[i] += farr[i - 1];  
        }
        
        int[] ans = new int[arr.length];
        for(int i = arr.length - 1; i >= 0; i--){
            int idx = farr[arr[i] /exp % 10] - 1;
            ans[idx] = arr[i];
            farr[arr[i] / exp % 10]--; 
            
        }
         for(int i = 0; i < ans.length; i++){
             arr[i] = ans[i];
         }
    }
}
