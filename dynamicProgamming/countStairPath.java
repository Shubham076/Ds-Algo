import java.io.*;
import java.util.*;

public class countStairPath {

    public static void main(String[] args) throws Exception {
        // write your code here
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] qb = new int[n+1];
        int paths = getAllPaths(n , qb);
        System.out.println(paths);
    }
    
    // qb = question bank
    public static int getAllPaths(int n , int[] qb){
        
        if(n == 0){
            return 1;
        }
        
        if(n < 0){
            return 0;
        }
        
        if(qb[n] > 0){
            return qb[n];
        }
        
        int one = getAllPaths(n - 1 ,qb);
        int two = getAllPaths(n - 2 ,qb);
        int three = getAllPaths(n - 3 ,qb);
        int cp = one + two + three;
        
        qb[n] = cp;
        return cp;
    
    }

}