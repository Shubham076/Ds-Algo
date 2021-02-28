import java.util.*;

public class shuffleArray{
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        shuffle(arr);
        for(int i : arr){
            System.out.println(i);
        }
    }

    public static void shuffle(int[] arr){
        Random r = new Random();
        for(int i = arr.length - 1; i >= 0; i--){
            int idx = r.nextInt(i + 1);
            swap(i, idx, arr);
        }
    }

    public static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}