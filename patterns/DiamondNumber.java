import java.util.*;

class DiamondNumber {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int stars = 1;
        int spaces = n/2;
        int val = 1;

        // write ur code here
        for(int i = 1; i <= n; i++){
            
            for(int j = 1; j <= spaces; j++){
                System.out.print("\t");
            }
            
            int cval = val;
            for(int j = 1; j <= stars; j++){
                System.out.print(cval + "\t");
                
                if(j <= stars / 2){
                    cval++;
                }
                else cval--;
            }
            
            if(i <= n /2){
                stars += 2;
                spaces--;
                val++;
            }
            else{
                spaces++;
                stars -= 2;
                val--;
            }
            
        
            System.out.println();
        }

    }
}