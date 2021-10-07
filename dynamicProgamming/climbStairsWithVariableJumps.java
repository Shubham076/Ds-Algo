// meaning of a cell
// no of ways to reach destination from that cell
import java.util.*;
public class climbStairsWithVariableJumps {
    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] dp = new int[n + 1];
        int[] arr = new int[n];
        scn.close();
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        // base case as no of ways to ways to reach to n from n is 1. This is same as 2^0 = 1
        dp[n] = 1;
        for(int i = n - 1; i >= 0; i--){
            for(int j = 1; j <= arr[i] && i + j < dp.length; j++){
                dp[i] += dp[i + j]; 
            }
        }
        System.out.println(dp[0]);
    }
}