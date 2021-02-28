import java.util.Scanner;
class main{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        int r = scn.nextInt();
        int c = scn.nextInt();
        int[][] arr = new int[n][n];
        printKnightsTour(arr, r, c, n*n, 1);
    }

    public static void displayBoard(int[][] chess) {
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess[0].length; j++) {
                System.out.print(chess[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();
    }

    public static void printKnightsTour(int[][] chess, int r, int c , int n, int i) {
        if(r < 0 || r >= chess.length || c < 0 || c >= chess[0].length || chess[r][c] != 0){
            return;
        }

        if(i == n){
            chess[r][c] = i;
            displayBoard(chess);
            chess[r][c] = 0;
            return; 
        }

        chess[r][c] = i;

        printKnightsTour(chess , r - 2 , c + 1 , n , i + 1);
        printKnightsTour(chess , r - 1 , c + 2 , n , i + 1);
        printKnightsTour(chess , r + 1 , c + 2 , n , i + 1);
        printKnightsTour(chess , r + 2 , c + 1 , n , i + 1);
        printKnightsTour(chess , r + 2 , c - 1 , n , i + 1);
        printKnightsTour(chess , r + 1 , c - 2 , n , i + 1);
        printKnightsTour(chess , r - 1 , c - 2 , n , i + 1);
        printKnightsTour(chess , r - 2 , c - 1 , n , i + 1);


        chess[r][c] = 0;

    }

}