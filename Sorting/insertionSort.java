public class insertionSort {
    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,9,5};

        for(int i = 1; i < arr.length; i++){
            int j = i - 1;
            int temp = arr[i];
            while(j >= 0 && arr[j] > temp){
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = temp;
        }

        print(arr);
    }
}
