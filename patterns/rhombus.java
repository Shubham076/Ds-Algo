import java.util.*;

class rhombus {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        // write ur code here
        int spaces = n / 2;
        int stars = 1;
        
        for(int i = 1; i <= n; i++){
            
            for(int j = 1 ; j <= spaces; j++){
                System.out.print("\t");
                
            }
            
             for(int j = 1 ; j <= stars; j++){
                if(j == 1 || j == stars)
                    System.out.print("*\t");
                else{
                    System.out.print("\t");
                }
                
            }
            
            
            if( i <= n /2){
                stars += 2;
                spaces--;
            }
            else{
                spaces++;
                stars -= 2;
            }
            
            
            
            
            
            System.out.println();
        }
        

    }
}