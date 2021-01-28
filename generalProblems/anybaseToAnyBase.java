import java.util.*;
  
  public class anybaseToAnyBase{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt();
      int sb = scn.nextInt();
      int db = scn.nextInt();
      scn.close();
      int dec = getValueInDecimal(n , sb);
      int ans = getValueInDestinationBase(dec , db);
      
      System.out.println(ans);
    
         
     }
     
     public static int getValueInDecimal(int n , int b){
         int x = n;
         int dec = 0;
         int p = 1;
         
         while(x > 0){
             int r = x % 10;
             x /= 10;
             dec += r * p;
             p *= b;
             
         }
         return dec;
     }
     
     public static int getValueInDestinationBase(int no , int b){
         int ans = 0;
         int p = 1;
         
         while(no > 0){
             int r = no % b;
             no /= b;
             ans += r * p;
             p *= 10;
         }
         
         return ans;
     }
   
  }