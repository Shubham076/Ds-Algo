public class minJumpsToReachTop {
    public static void main(String[] args) throws Exception {
        int[] arr = {2, 3, 1, 1, 4};
        int n = arr.length;
        Integer[] dp = new Integer[n + 1];
        dp[n] = 0;

        for (int i = n - 1; i >= 0; i--) {
            int min = Integer.MAX_VALUE;
            for (int j = 1; j <= arr[i] && i + j < dp.length; j++) {

                if (dp[i + j] != null) {
                    min = Math.min(min, dp[i + j]);
                }
            }

            if (min != Integer.MAX_VALUE) {
                dp[i] = 1 + min;
            }
        }
        for(int i = 0; i < dp.length; i++){
            System.out.print(dp[i] + " ");
        }

        // System.out.println(dp[0]);
    }

}