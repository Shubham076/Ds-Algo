import java.util.*;

class unBoundedKnapSack{
    public static void main(final String[] args) {
        final Scanner scn = new Scanner(System.in);
        final int n = scn.nextInt();
        final int[] wts = new int[n];
        final int[] val = new int[n];

        for (int i = 0; i < n; i++) {
            val[i] = scn.nextInt();
        }

        for (int i = 0; i < n; i++) {
            wts[i] = scn.nextInt();
        }

        final int cap = scn.nextInt();
        scn.close();
        final int[] dp = new int[cap + 1];
        dp[0] = 0;

        for (int bagc = 0; bagc <= cap; bagc++) {
            int max = 0;
            for (int i = 0; i < n; i++) {
                if (wts[i] <= bagc) {
                    int tbagc = val[i] + dp[bagc - wts[i]];

                    if(tbagc > max){
                        max = tbagc;
                    }
                }
            } 
            dp[bagc] = max;
        }

        System.out.println(dp[cap]);
    }
}