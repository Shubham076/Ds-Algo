class ceilAndFloor{
    public static void main(String[] args) {
        int[] arr = {5, 10, 15, 22, 33, 40, 42, 55};
        int d = 25;

        // usingBinarySearch(d, arr);
        usingLinearSearch(d, arr);
    }
    
    public static void usingBinarySearch(int d , int[] arr){
        // using binary search

        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

         System.out.println("Using binary search");   
        int low = 0;
        int high = arr.length - 1;
        while(low <= high){
            int mid = low + (high - low) / 2;

            if(arr[mid] == d){
                System.out.println(arr[mid]);
                return;
            }

            else if(arr[mid] > d){
                high = mid - 1;
                ceil = arr[mid];
            }
            else{
                low = mid + 1;
                floor = arr[mid];
            }
        }

        System.out.println(ceil);
        System.out.println(floor);
    }

    public static void usingLinearSearch(int d , int[] arr){

        int ceil = Integer.MAX_VALUE;
        int floor = Integer.MIN_VALUE;

        System.out.println("Using linear search");
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > d){
                if(arr[i] < ceil){
                    ceil = arr[i];
                }
            }

               else if(arr[i] == d){
                    System.out.println(arr[i]);
                    return;
                }

                if(arr[i] < d){
                    if(arr[i] > floor){
                        floor = arr[i];
                    }
                }
            
        }

        System.out.println(floor);
        System.out.println(ceil);
    }
}