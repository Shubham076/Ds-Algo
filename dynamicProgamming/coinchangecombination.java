import java.util.*;

//meaning of cell
// how many combinations we can generate for that cell if we have infinite supply of coins

public class coinchangecombination {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int amount = 10;
        int[] coins = {2, 3, 5};
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        
        for(int i = 0 ; i < coins.length; i++){
            for(int j = coins[i]; j < dp.length; j++){
                dp[j] += dp[j - coins[i]];
            }
        }
        System.out.println(dp[amount]);
    }
}