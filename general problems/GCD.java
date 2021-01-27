import java.util.*;
    
    public class Main{
    
    public static void main(String[] args) {
      // write your code here  
      
      Scanner scn = new Scanner(System.in);
      int a = scn.nextInt();
      int b = scn.nextInt();
      scn.close();
      int divisor = a;
      int dividend = b;
      
      while(dividend % divisor != 0){
          
          int r = dividend % divisor;
          dividend = divisor;
          divisor = r;
      }
      
      int gcd  =  divisor;
      int lcm = (a * b) / gcd;
      
      System.out.println(gcd);
      System.out.println(lcm);
     }
    }