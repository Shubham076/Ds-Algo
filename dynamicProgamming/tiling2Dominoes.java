/*
no of ways of tiling an area of m * n with m * 1 tiles
*/
import java.util.Scanner;
class tiling2Dominoes{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int m = scn.nextInt();
		int n = scn.nextInt();
		int[] dp = new int[n + 1];
		for(int i = 0; i <= n; i++){
			if(i < m){
				dp[i] = 1;
			}
			else if(i == m){
				dp[i] = 2;
			}
			else
				dp[i] = dp[i - 1] + dp[i - m];
		}
		System.out.println(dp[n]);
	}
}