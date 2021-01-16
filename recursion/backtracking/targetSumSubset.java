import java.util.Scanner;

class targetSumSubset {
    public static void main(String[] args){

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n  = scn.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }

        System.out.println("Enter the target sum");
        int target = scn.nextInt();

        scn.close();

        printSubsets(arr ,0, target , 0 ,  "");
    }

    public static void printSubsets(int[] arr ,int index,  int target ,int sum ,  String ans){

        if(index == arr.length){
            
            if(sum == target){
                System.out.println(ans+".");
            }
            return;
        }

        printSubsets(arr , index+1 , target , sum+arr[index] , ans+ arr[index]+",");
        printSubsets(arr , index+1 , target ,sum ,  ans);
    }


}