import java.util.Scanner;

class PrintIncreasingDecreasing {
    public static void main(String[] args) {

        Scanner scn  = new Scanner(System.in);
        int n = scn.nextInt();
        scn.close();

        print(n);

        
    }

    public static void print(int n){

        if(n == 0){
            return;
        }

        System.out.println(n);
        print(n-1);

        System.out.println(n);

    }
}