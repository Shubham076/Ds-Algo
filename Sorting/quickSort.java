public class quickSort {
    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,9,5};
        quick(arr , 0 , arr.length -1);
        print(arr);
    }

    private static void quick(int[] arr, int f, int l) {
        if(f >= l){
            return ;
        }
        int pivot = arr[(f + l) / 2];
        int left = f;
        int right = l;
        while(left <= right){

            while(arr[left] < pivot){
                left++;

            }

            while(arr[right] > pivot){
                right--;
            }

            if(left <= right){
                int temp = arr[left];
                arr[left] = arr[right];
                arr[right] = temp;
                left++;
                right--;
            }

        }

        quick(arr , f , right);
        quick(arr,  left , l);
        
    }


}
