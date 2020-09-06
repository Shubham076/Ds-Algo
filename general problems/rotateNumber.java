import java.util.Scanner;

public class rotateNumber {

    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int k = scn.nextInt();
        scn.close();

        printRotate( n , k);
    }

    public static void printRotate(int n , int k){

        // nod = number of digits
        int nod = 0;
        int temp = n;
        while( temp > 0){
             temp = temp / 10;
             nod++;
        }

        // for handling very big numbers
        k = k % nod;

        // for handling negative rotation : instead of rotating negative we should convert negative to positive

        if( k < 0){
            k = k + nod;
        }

        int mul = 1;
        int div = 1 ;
        for(int i = 1; i <= nod; i++){

            if( i <= k){
                div = div * 10;
            }

            else{
                mul = mul * 10;
            }

        }

        int r = n % div;
        int q = n / div;

        int rot = (r * mul) + q;
        System.out.print(rot);

        
    }
    
}