import java.util.*;

// test case 1 64 5 9 8 6 output 4
// test case 2 36 0 3 9 0 not reachable
// test case 16 7 1 0 2 output 3

public class practise {
    public static void main(String[] args){
        Scanner scn =  new Scanner(System.in);
        int t = scn.nextInt();


        while(t > 0){
            int tot = scn.nextInt();
            int[] dp = new int[tot + 1];
            int src = scn.nextInt();
            int des = scn.nextInt();
            int f = scn.nextInt();
            int b = scn.nextInt();
            int i = 0;

            if(src - des < 0){
                i = dp.length - 2;
                while( i >= 0){
                    int min = Integer.MAX_VALUE;
                    for(int j = 1; j <= f && i + j < dp.length; j++){
                        min = Math.min(min , dp[i + j]);
                    }

                    dp[i] = 1 + min;
                    i--;
                }

                int steps = Math.abs(dp[src] - dp[des]);

                if(steps > 0){
                    System.out.println(steps);
                }
                else
                    System.out.println("Not Reachable");
            }
            else{
                i = 1;
                while( i < dp.length){
                    int min = Integer.MAX_VALUE;
                    for(int j = 1; j <= b && i - j >= 0; j++){
                        min = Math.min(min , dp[i - j]);
                    }

                    dp[i] = 1 + min;
                    i++;
                }

                int steps = Math.abs(dp[src] - dp[des]);

                if(steps > 0){
                    System.out.println(steps);
                }
                else
                    System.out.println("Not Reachable");
            }




            t--;
        }
    }
}
