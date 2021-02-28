import java.util.*;

public class paintWithManyColors {

    public static void main(String[] args) throws Exception {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k = s.nextInt();
        
        int[][] arr = new int[n][k];
        int[][] dp = new int[n][k];
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < k; j++){
                arr[i][j] = s.nextInt();
            }
        }
        s.close();
        int least = Integer.MAX_VALUE , sleast = Integer.MAX_VALUE;
        for(int j = 0; j < arr[0].length; j++){
             if(arr[0][j] <= least){
                sleast = least;
                least = arr[0][j];
            } else if(arr[0][j] <= sleast){
                sleast = arr[0][j];
            }
        }
        
        for(int i = 1; i < arr.length; i++){
            int nleast = Integer.MAX_VALUE,
             nsleast = Integer.MAX_VALUE;

            for(int j = 0; j < arr[0].length; j++){
                if(least == arr[i - 1][j]){
                    dp[i][j] = arr[i][j] + sleast;
                }
                else{
                    dp[i][j] = arr[i][j] + least;
                }

                if(dp[i][j] <= nleast){
                    nsleast = nleast;
                    nleast = dp[i][j];
                } 
                else if(dp[i][j] <= nsleast){
                    nsleast = dp[i][j];
                }               
            }
            
            least = nleast;
            sleast = nsleast;
        }
        
        System.out.println(least);
        

    }
}