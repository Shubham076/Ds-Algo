import java.util.*;

public class coinchangepermutation {

    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        
        for(int i = 0; i < n; i++){
            arr[i] = scn.nextInt();
        }
        
        int amount = scn.nextInt();
        int[] dp = new int[amount + 1];
        dp[0] = 1;
        
        for(int i = 1 ; i < dp.length ; i++){
            for(int coin : arr){
                if(coin <= i){
                    dp[i] += dp[i - coin]; 
                }
            }
        }
        
        System.out.println(dp[amount]);

    }
}