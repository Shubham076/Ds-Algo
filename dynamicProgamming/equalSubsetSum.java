/*
leetcode 416
ques is can we divide subsets into 2 subsets having equal sum;
first we calculate the total sum of arr it is odd then its not possible
then we simply find if any subset exist whose sum == total/2; (this can be solved using target sum subset);
if yes then answer is yes
*/
class equalSubsetSum{
	public boolean canPartition(int[] nums) {
        int sum = 0;
        for(int i : nums){
            sum += i;
        }
        
        if((sum & 1) > 0){
            return false;
        }
        boolean[][] dp = new boolean[nums.length + 1][(sum / 2) + 1];
        
        for(int i = 0 ; i < dp.length; i++){
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
                    
                    if(dp[i - 1][j]){
                        dp[i][j] = true;
                    }
                    else{ 
                        if(j >= nums[i - 1]){
                            int rem = nums[i - 1];
                            if(dp[i - 1][j - rem]){
                                dp[i][j] = true;
                            }
                        }
                    }
                }
            }
        }
        return dp[nums.length][(sum / 2)];
    }
}