import java.util.*;

public class swastik{

public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
     // write ur code here
     int hn = n / 2 + 1;
     
     for(int i = 1; i <= n; i++){
         for(int j = 1; j <= n; j++){
             
             if(i == hn || j == hn || (i == 1 && j <= hn) || (i <= hn && j == n) || (i > hn && j == 1) || (i == n && j > hn))
                System.out.print("*\t");
             else
                System.out.print("\t");
         }
         System.out.println();
     }

 }
}