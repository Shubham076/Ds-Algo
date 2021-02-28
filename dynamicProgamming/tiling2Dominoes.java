import java.util.Scanner;
// it is similar to previous question but only differnce is that now the dimension of the tile is 
// m X 1 
class tiling2Dominoes{
	public static void main(String[] args){
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int m = scn.nextInt();
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