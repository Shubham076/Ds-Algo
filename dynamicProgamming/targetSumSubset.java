/**
 * targetSumSubset
 */
import java.util.*;
public class targetSumSubset {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++){
            arr[i] = scn.nextInt();
        }
        int target = scn.nextInt();
        boolean[][] dp = new boolean[n + 1][target + 1];

        for(int i = 0; i < dp.length; i++){
            for(int j = 0; j < dp[0].length; j++){

                if(i == 0 && j== 0){
                    dp[i][j] = true;
                }
                else if(i == 0){
                    dp[i][j] = false;
                }
                else if(j == 0){
                    dp[i][j] = true;
                }
                else{
                    // case when number is not included
                    if(dp[i - 1][j]){
                        dp[i][j] = true;
                    }

                    // when number is included
                    else{
                        int val = arr[i-1];
                        if(j >= val){
                            if(dp[i - 1][j - val]){
                                dp[i][j] = true;
                            }
                        }
                    }
               
                }
            }
        }

        System.out.println(dp[n][target]);

    }
}