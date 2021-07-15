/*
Partition a set into two subsets such that the difference of subset sums is minimum
if it is possible to divide the arr into 2 sets of equal size then this the best case for the problem and diff = 0;
how to solve this problem lets see in the number line
					sum (sum of all the elements)
               <------------------------------------------>
arr =          -------------------------------------------
				<--------------><------------------------->
					s1				  sum - s1	(s2)
as we discussed above the best possible answer is 0 i.e value of s1 = sum / 2;	case of equal subset partition
main goal of the problem is to minimize the values of  =>  s2 - s1 => sum - s1 - s1	 = sum - 2s1;
so what we do we simply find all the subsets whose sum <= sum / 2;
and iterate over the last rows of dp to find the answer; 
*/
class minimumDifferenceSubsets{
	public static void main(String[] args) {
		int[] arr = {1, 6, 11, 5};
		int n = arr.length;
		int sum = 0;
		for(int i : arr){
			sum += i;
		}
		boolean[][] dp = new boolean[n + 1][sum / 2 + 1];

		//code for target sum subset
		for(int i = 0; i < dp.length; i++){
			for(int j = 0; j < dp[0].length; j++){
				if(i == 0 && j == 0){
					dp[i][j] = true;
				}
				else if(i == 0){
					dp[i][j] = false;
				}
				else if(j == 0){
					dp[i][j] = true;
				}
				else{
					//if ith nunmber not included
					if(dp[i - 1][j]){
						dp[i][j] = true;
					}
					//when number is included
					else{
						if(j >= arr[i - 1]){
							int rem = j - arr[i - 1];
							if(dp[i - 1][rem]){
								dp[i][j] = true;
							}
						}
					}
				}
			}
		}

		//now finding the minium difference
		int i = dp.length - 1;
		int ans = Integer.MAX_VALUE;
		for(int j = 0; j < dp[0].length; j++){
			if(dp[i][j]){
				//means that the sum is possible
				int d = sum - 2 * j;
				ans = Math.min(ans, d);
			}
		}
		System.out.println(ans);
	}
}