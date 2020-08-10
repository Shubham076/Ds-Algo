public class maxOfArray {

    public static void main(String[] args){
        int[] arr = {1,1,1,1,1};

        System.out.println(max(arr , 0));
    }

    public static int max(int[] arr , int index){

        if( index == arr.length){
            return 0 ;
        }

        // faith
        int maxRest = max(arr , index+1);
        
        int maximum = Math.max(arr[index] , maxRest);

        return maximum;


    }
    
}