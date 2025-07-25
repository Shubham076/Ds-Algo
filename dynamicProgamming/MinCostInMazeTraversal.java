import java.util.*;

class MinCostInMazeTraversal{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int m = scn.nextInt();
        int[][] arr = new int[n][m];
        for(int i = 0; i< arr.length; i++){
            for(int j = 0; j < arr[0].length ; j++){
                arr[i][j] = scn.nextInt();
            }
        }

        int[][] dp = new int[n][m];
        int x = dp.length;
        int y =  dp[0].length;

        for(int i = x - 1; i >= 0; i--){
            for(int j = y - 1; j >= 0; j--){

                // last cell
                if(i == x  - 1 && j == y -1){
                    dp[i][j] = arr[i][j];
                }
                // last row
                else if(i == x - 1){
                    dp[i][j] = dp[i][j + 1] + arr[i][j];
                }
                // last column
                else if(j == y -1){
                    dp[i][j] = dp[i + 1][j] + arr[i][j];
                }
                else{
                    dp[i][j] = Math.min(dp[i + 1][j] , dp[i][j + 1]) + arr[i][j];
                }
            }
        }
        System.out.println(dp[0][0]);
    }
}
