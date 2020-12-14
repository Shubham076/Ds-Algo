
class saddlePoint {

    // saddle point is the point which is minimum in a row and max in column
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        print(arr);
        System.out.println("---------");
        findSaddlePoint(arr);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void findSaddlePoint(int[][] arr) {

        for (int i = 0; i < arr.length; i++) {
            int li = 0;
            for (int j = 1; j < arr[0].length; j++) {
                if (arr[i][j] < arr[i][li]) {
                    li = j;
                }
            }

            boolean flag = true;

            for(int k = 0; k < arr.length; k++){
                if( arr[k][li] > arr[i][li]){
                    flag = false;
                    break;
                }
            }

            if( flag == true){
                System.out.println("Saddle point is:"+arr[i][li]);
                return;
            }
        }
    }

}