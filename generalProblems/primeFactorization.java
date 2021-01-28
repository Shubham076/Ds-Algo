import java.util.Scanner;

public class primeFactorization {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();
        
        for(int div = 2; div * div <= n; div++){  
            while(n % div == 0){
                System.out.print(div + " ");
                n = n / div;
            }
       }
       
       if( n != 1) System.out.println(n);
    }
    
}