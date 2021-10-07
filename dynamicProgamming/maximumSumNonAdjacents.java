/*
Maximum sum such that no two elements are adjacent
*/
import java.util.Scanner;
class maximumSumNonAdjacents {

	/*with O(N) space
	1: make an dp array of size n+1. where n is length of nums array.
	2: dp[0] will denote max profit with 0 number of elements. hence it is 0.
	3: dp[1] will be max profit with 1 element. which is num[0].
	4: now for every next element i.e. dp[2] onwards we have a choice to
	   either include the alternative element or exclude it so that we can 
	   make more profit.
	*/
	public static int solve(int[] nums) {
		int[] dp = new int[nums.length + 1];
		dp[0] = 0;
		dp[1] = nums[0];
		for (int i = 2; i < dp.length; i++) {
			dp[i] = Math.max(dp[i - 2] + nums[i - 1] , dp[i - 1]);
		}

		return dp[nums.length];
	}
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}
		scn.close();



		int inc = arr[0]; //0th number included
		int exc = 0;   //0th number not included
		for (int i = 1; i < arr.length; i++) {
			int nInc = exc + arr[i];
			int nExc = Math.max(inc , exc);

			inc = nInc;
			exc = nExc;
		}

		System.out.println(Math.max(inc , exc));
	}
}