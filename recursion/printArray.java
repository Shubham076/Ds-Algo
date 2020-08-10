public class printArray{
    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5};

        print(arr,2);
        printReverse(arr,4);
    }

    public static void print(int[] arr , int index){

        if(index == arr.length){
            return;
        }

        System.out.println(arr[index]);
        print(arr , index+1);
    }

    public static void printReverse(int[] arr , int index){

        if( index <  0){
            return;
        }

        System.out.println(arr[index]);
        printReverse(arr , index-1);
    }
}