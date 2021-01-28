import java.util.*;
    
    public class printDigits{
    
    public static void main(String[] args) {
      // write your code here  
      
        Scanner scn  =new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        int temp = n;
        int count = 0;
        
        
        // means we are calculating no of digits 
        while(temp > 0){
            count ++;
            temp /= 10;
            
        }
        
        while(count > 0){
            
            // to extract first digit of a number
            int firstVal = n / (int)Math.pow(10 , count - 1);
            System.out.println(firstVal);
            
            
            // to remove the first digit from the number
            n = n % (int)Math.pow(10 , count - 1);    
            count--;
        
        
        }
        
 
        
        
        
     }
    }