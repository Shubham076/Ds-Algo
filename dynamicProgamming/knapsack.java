import java.util.Scanner;

public class knapsack {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] wts = new int[n];
        int[] val = new int[n];

        for(int i = 0; i < n; i++){
            val[i] = scn.nextInt();
        }

        for(int i = 0; i < n; i++){
            wts[i] = scn.nextInt();
        }

        int cap = scn.nextInt();
        scn.close();
        int[][] dp = new int[n + 1][cap + 1];

        for(int i = 1; i < dp.length; i++){
            for(int j = 1; j < dp[0].length; j++){

                if(j >= wts[i - 1]){
                    int rCap = j - wts[i - 1];

                    if(dp[i - 1][rCap] + val[i - 1] > dp[i - 1][j]){
                        dp[i][j] = dp[i - 1][rCap] + val[i - 1];
                    } else {
                        dp[i][j] = dp[i - 1][j];
                    }
                    
                } else{
                    dp[i][j] = dp[i - 1][j];
                }
            }
        }

        for(int i = 0 ; i < dp.length; i++){
            for(int j = 0; j < dp[0].length ; j++){
                System.out.print(dp[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println(dp[n][cap]);
    }
    
}
