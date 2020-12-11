import java.util.*;
  
  public class Main{
  
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int t = scn.nextInt();
      
      while(t > 0){
      int n = scn.nextInt();
      int count = 0;
       // write ur code here
       for(int i = 2 ; i * i <= n; i++){
            if(n % i == 0){
                count++;
            }     
       }
       
       if(count > 0) System.out.println("not prime");
       else System.out.println("prime");
  
   t--;
   }
  }
  }