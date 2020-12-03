class bubbleSort{
    private static void print(int[] arr) {
        for(int i : arr){
            System.out.print(i+" ");
        }
    }

    public static void main(String[] args) {
        int[] arr = {2,1,4,6,9,5};

        for(int i = 0; i < arr.length -1; i++){
            for(int j = 0; j < arr.length - 1- i; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        print(arr);
    }

}