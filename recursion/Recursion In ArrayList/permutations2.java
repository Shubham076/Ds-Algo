public class permutations2 {
    public static void main(String[] args){
        char[] arr = {'a','b','c'};
        printPermutations(arr , 0 , arr.length - 1);
    }

    public static void printPermutations(char[] arr , int l , int r){
        if(l == r){
            printArray(arr);
            return;
        }

        for(int i = l; i <= r; i++){
            swap(arr, i, l);
            printPermutations(arr, l + 1, r);
            swap(arr, i, l);
        }
    }

    public static void swap(char[] arr , int i , int j){
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void printArray(char[] arr){
        for(char i : arr){
            System.out.print(i + " ");
        }
        System.out.println();
    }
    
}
