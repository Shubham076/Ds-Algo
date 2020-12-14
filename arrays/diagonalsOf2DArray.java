public class diagonalsOf2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3,4},
                       {5,6,7,8},
                       {1,2,3,4},
                       {5,6,7,8}};

//    left diagonal
System.out.println("left diagonal");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;  j < arr[0].length; j++){
                if(i == j){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }

        System.out.println("\nright diagonal");
        for(int i = 0; i < arr.length; i++){
            for(int j = 0;  j < arr[0].length; j++){
                if(i + j == arr[0].length - 1){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
    }
}
