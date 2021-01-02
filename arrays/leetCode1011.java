import java.util.*;

// ques same as below based on binary search 875 leetcode , 410 also
class leetCode1011{
    public static void main(String[] args) {
        int[] weights = {1,2,3,4,5,6,7,8,9,10};
        int D = 5;

        System.out.println(shipWithinDays(weights, D));
    }

    public static int shipWithinDays(int[] weights, int D) {
        int max = Arrays.stream(weights).max().getAsInt();
        int sum = Arrays.stream(weights).sum();
        
        int low = max;
        int high = sum;
        int ans = high;
        
        while(low <= high){
            int mid = low + (high - low) / 2;
            int rDays = requiredDays(D , weights , mid);  //required days
            
            if(rDays > D){
                low = mid + 1;
            }
            else{
                high = mid - 1;
                ans = mid;
            }
        }
        
        return ans;
    }
    
    public static int requiredDays(int d , int[] arr , int capacity){
        int csum = 0;
        int day = 1;
        
        for(int i : arr){
            if(csum + i > capacity){
                day++;
                csum = 0;
            }
            
            csum += i;
        }       
        return day;
    }
}