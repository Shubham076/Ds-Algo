public class printBarChart {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5};
        printBar(arr);
    }

    public static void printBar(int[] arr){
        int max = Integer.MIN_VALUE;
        for(int i : arr){
            if(i > max){
                max = i;
            }
        }

        for(int i = max; i >= 1; i--){
            for(int j = 0; j < arr.length; j++){
                if(arr[j] >= i){
                    System.out.print("*\t");
                }
                else{
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
