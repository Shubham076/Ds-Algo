import java.util.*;
class PascalTriangle {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        
        // nC0 is always 1;
        // formula nCk+1 = nCk + (n - k)/ (k + 1) 

        //write your code here
        int n = scn.nextInt();
        
        for(int i = 0; i < n; i++){
            
            // intially iCj is always 1
            int val = 1;
            
            for(int j = 0; j <= i; j++){
                
                System.out.print(val + "\t");
                val = val * (i - j) / (j + 1);
                
            }
            
            System.out.println();
        }

    }
}