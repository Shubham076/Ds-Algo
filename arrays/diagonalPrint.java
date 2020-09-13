
class diagonalPrint {
    public static void main(String[] args) {

        int[][] arr = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };

        print(arr);
        System.out.println("---------");
        diagonal(arr);
    }

    public static void print(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }

    }

    public static void diagonal(int[][] arr) {

        for(int gap = 0; gap < arr.length; gap++){

            for(int i = 0,j = gap ; j < arr[0].length; j++,i++){

                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }

}