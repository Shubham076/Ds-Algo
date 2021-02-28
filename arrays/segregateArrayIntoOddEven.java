import java.util.*;
public class segregateArrayIntoOddEven{    
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
        	arr[i] = scn.nextInt();
        }
        System.out.println("Original Array : ");
        printArray(arr);
        segregateArray(arr);

       
    }

    public static void swap(int i, int j, int[] nums){
    	int temp = nums[i];
    	nums[i] = nums[j];
    	nums[j] = temp;
    }

    public static void printArray(int[] arr){
    	for(int i : arr){
    		System.out.print(i + " ");
    	}
    	System.out.println();
    }

    public static void segregateArray(int[] nums){
    	int[] arr = new int[nums.length];
    	for(int i = 0; i < arr.length; i++){
        	arr[i] = nums[i];
        }
    	int i = 0;
        int j = 0;
        while(i < arr.length){
        	if(arr[i] % 2 == 0){
                i++;
            }
            else{
                swap(i, j, arr);
                i++;
                j++;
            }
        }
        System.out.println("Segregated Array : ");
        printArray(arr);
    }
}