import java.util.Scanner;

public class inverse {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n  = scn.nextInt();
        scn.close();
        printInverse(n);
    }

    public static void printInverse( int n){

        // op old position , ip = inverted position , same for od(old digit)
        int op = 1;
        int inv = 0;

        while(n != 0){
            int od = n % 10;
            int ip = od;
            int id = op;
            inv = inv + id * (int)Math.pow(10 , ip - 1);
            n = n / 10;
            op++;
        }

        System.out.println(inv);
    }
    
}