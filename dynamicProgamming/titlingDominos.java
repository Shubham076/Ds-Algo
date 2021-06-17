/*
no of ways of tiling an area  2 * n with 2 * 1 tiles
m X 1
*/
import java.util.Scanner;
class titlingDominos{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		scn.close();
		//find number of ways to tile an area of 2*n where dimensions of single
		// tile is 2 X 1 
		int[] dp = new int[n + 1];

		dp[1] = 1; // for tiling area of the 2 X 1;
		dp[2] = 2; // for tiling area of the 2 X 2;

		for(int i = 3; i <= n; i++){
			dp[i] = dp[i - 1] + dp[i - 2];
		}

		System.out.println(dp[n]);
	}
}